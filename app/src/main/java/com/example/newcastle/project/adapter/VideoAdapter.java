package com.example.newcastle.project.adapter;


import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.provider.MediaStore;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.newcastle.project.R;
import com.example.newcastle.project.VideoPlayer;
import com.example.newcastle.project.pojo.VideoPojo;

import java.util.ArrayList;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.MyViewHolder> {

    private ArrayList<VideoPojo> urlSet;
    private Context context;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageViewIcon, thumbnailImage;
        CardView card_view;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);
            this.thumbnailImage = (ImageView) itemView.findViewById(R.id.thumbnailImage);
            this.card_view = (CardView) itemView.findViewById(R.id.card_view);
        }
    }

    public VideoAdapter(Context context, ArrayList<VideoPojo> data) {
        this.urlSet = data;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.videochildlayout, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        ImageView playImage = holder.imageViewIcon;
        ImageView thumbnailImage = holder.thumbnailImage;
        CardView card_view = holder.card_view;

        /*Bitmap bmThumbnail;

        bmThumbnail = ThumbnailUtils.createVideoThumbnail(urlSet.get(listPosition).getDrwImage(), MediaStore.Images.Thumbnails.MINI_KIND);
        thumbnailImage.setImageBitmap(bmThumbnail);*/

       thumbnailImage.setImageResource(urlSet.get(listPosition).getDrwImage());

        playImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(context, VideoPlayer.class);
                i.putExtra("videoUrl", urlSet.get(listPosition).getUrlVideo());
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return urlSet.size();
    }
}