package com.example.newcastle.project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.newcastle.project.adapter.VideoAdapter;
import com.example.newcastle.project.model.LogicalModel;
import com.example.newcastle.project.pojo.VideoPojo;
import com.example.newcastle.project.presenter.PresenterInterface;
import com.example.newcastle.project.view.ViewClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ViewClass {

    private ArrayList<VideoPojo> videoUrls;
    private PresenterInterface thumbnailVideoUrl;
    private VideoPojo videoPojo;

    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Github codings
        //link the model logics
        thumbnailVideoUrl = new LogicalModel(this);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        //Addinng url links
        videoUrls = new ArrayList<>();

        videoPojo = new VideoPojo("https://fast.wistia.net/embed/iframe/tgfp73n08z?autoPlay=a1", R.drawable.a);
        videoUrls.add(videoPojo);

        videoPojo = new VideoPojo("https://fast.wistia.net/embed/iframe/tgfp73n08z?autoPlay=a1", R.drawable.b);
        videoUrls.add(videoPojo);

        videoPojo = new VideoPojo("https://fast.wistia.net/embed/iframe/khvzlfk93v?autoPlay=a1", R.drawable.c);
        videoUrls.add(videoPojo);

        videoPojo = new VideoPojo("https://fast.wistia.net/embed/iframe/kgjphkrfdv?autoPlay=a1", R.drawable.d);
        videoUrls.add(videoPojo);

        videoPojo = new VideoPojo("https://fast.wistia.net/embed/iframe/1px7llgixh?autoPlay=a1", R.drawable.e);
        videoUrls.add(videoPojo);

        videoPojo = new VideoPojo("https://fast.wistia.net/embed/iframe/o0miib0h3n?autoPlay=a1?", R.drawable.f);
        videoUrls.add(videoPojo);

        videoPojo = new VideoPojo("https://fast.wistia.net/embed/iframe/xgjjr8i7sn?autoPlay=a1", R.drawable.g);
        videoUrls.add(videoPojo);

        videoPojo = new VideoPojo("https://fast.wistia.net/embed/iframe/bl4iva5kig?autoPlay=a1", R.drawable.g);
        videoUrls.add(videoPojo);


        thumbnailVideoUrl.videoInputs(videoUrls);


    }

    @Override
    public void onSuccess(ArrayList<VideoPojo> response) {

        VideoAdapter adapter = new VideoAdapter(getApplicationContext(), response);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onFailure(String response) {

    }
}
