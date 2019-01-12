package com.example.newcastle.project;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class VideoPlayer extends AppCompatActivity {

    VideoView videoPlayer;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        videoPlayer = (VideoView) findViewById(R.id.videoview);
        b = findViewById(R.id.b);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), LastActivity.class);
                startActivity(i);
            }
        });
        Intent intent = getIntent();
        final String uri = intent.getStringExtra("videoUrl");

        /*ideoPlayer.setVideoURI(Uri.parse(uri));
        videoPlayer.start();*/

    }
}
