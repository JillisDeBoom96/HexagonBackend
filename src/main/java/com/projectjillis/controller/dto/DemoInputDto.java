package com.projectjillis.controller.dto;

import com.projectjillis.model.Demo;

public class DemoInputDto {
    Long id;

    String demoTitle;
    String demoArtist;
    String demoDate;

    public Demo toDemo(){
        var demo = new Demo();
        demo.setId(id);
        demo.setDemoTitle(demoTitle);
        demo.setDemoArtist(demoArtist);
        demo.setDemoDate(demoDate);
        return demo;
    }
}
