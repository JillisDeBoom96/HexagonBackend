package com.projectjillis.model;


import javax.persistence.*;


@Entity
public class Demo {

    @Id
    @GeneratedValue
    Long id;

    String demoTitle;
    String demoArtist;
    String demoDate;

    @Lob
    private byte[] track;

    public Long getId() {
        return id;
    }

    public String getDemoTitle() {
        return demoTitle;
    }

    public String getDemoArtist() {
        return demoArtist;
    }

    public String getDemoDate() {
        return demoDate;
    }

    public byte[] getTrack() {
        return track;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDemoTitle(String demoTitle) {
        this.demoTitle = demoTitle;
    }

    public void setDemoArtist(String demoArtist) {
        this.demoArtist = demoArtist;
    }

    public void setDemoDate(String demoDate) {
        this.demoDate = demoDate;
    }

    public void setTrack(byte[] track) {
        this.track = track;
    }
}
