package com.fiap.mob.netflixproject;

/**
 * Created by RM30917 on 17/10/2016.
 */
public class Video {

    private int cod;
    private String title;
    private int duration;

    public Video(int cod, String title, int duration) {
        this.cod = cod;
        this.title = title;
        this.duration = duration;
    }

    public Video(){} // To generate empty objects

    @Override
    public String toString() {
        return "Video{" +
                "cod=" + cod +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
