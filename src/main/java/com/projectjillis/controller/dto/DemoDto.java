package com.projectjillis.controller.dto;

import com.projectjillis.model.Demo;

public class DemoDto {
    Long id;

    String demoTitle;
    String demoArtist;
    String demoDate;

    public static DemoDto fromDemo(Demo demo){
        var dto = new DemoDto();
        dto.id = demo.getId();
        dto.demoTitle = demo.getDemoTitle();
        dto.demoArtist = demo.getDemoArtist();
        dto.demoDate = demo.getDemoDate();
        return dto;

    }
}
