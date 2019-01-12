package com.example.newcastle.project.model;

import com.example.newcastle.project.pojo.VideoPojo;
import com.example.newcastle.project.presenter.PresenterInterface;
import com.example.newcastle.project.view.ViewClass;

import java.util.ArrayList;

public class LogicalModel implements PresenterInterface {

    private ViewClass responseVideo;

    public LogicalModel(ViewClass responseVideo) {

        this.responseVideo = responseVideo;

    }

    @Override
    public void videoInputs(ArrayList<VideoPojo> videoList) {

        responseVideo.onSuccess(videoList);

    }
}
