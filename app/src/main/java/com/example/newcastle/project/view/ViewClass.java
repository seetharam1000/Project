package com.example.newcastle.project.view;

import com.example.newcastle.project.pojo.VideoPojo;

import java.util.ArrayList;

public interface ViewClass {

    void onSuccess(ArrayList<VideoPojo> response);

    void onFailure(String response);
}
