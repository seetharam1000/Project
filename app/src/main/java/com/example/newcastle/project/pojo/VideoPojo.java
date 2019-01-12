package com.example.newcastle.project.pojo;

public class VideoPojo {
    private String urlVideo;
    private int drwImage;

    public VideoPojo() {
    }

    public VideoPojo(String urlVideo, int drwImage) {
        this.urlVideo = urlVideo;
        this.drwImage = drwImage;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public int getDrwImage() {
        return drwImage;
    }

    public void setDrwImage(int drwImage) {
        this.drwImage = drwImage;
    }
}
