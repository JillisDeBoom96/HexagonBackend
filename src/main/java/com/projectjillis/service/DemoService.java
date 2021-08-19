package com.projectjillis.service;

import com.projectjillis.model.Demo;

import java.util.List;

public interface DemoService {

    List<Demo> getDemos();
    Demo getDemo (Long id);
    Demo saveDemo(Demo demo);
    Demo updateDemo (Long id, Demo demo);
    void deleteDemo (Long id);
}
