package com.projectjillis.controller;

import com.projectjillis.controller.dto.DemoDto;
import com.projectjillis.controller.dto.DemoInputDto;
import com.projectjillis.model.Demo;
import com.projectjillis.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/demos")
public class DemoController {
    private final DemoService demoService;


    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }



    @GetMapping
    public List<DemoDto> getDemos(){
        var dtos = new ArrayList<DemoDto>();
        var demoList = demoService.getDemos();
        for (Demo demo: demoList){
            dtos.add(DemoDto.fromDemo(demo));
        }
        return dtos;
    }

    @GetMapping("/{id}")
    public DemoDto getDemo(@PathVariable("id") Long id){

        var demo = demoService.getDemo(id);

        return DemoDto.fromDemo(demo);
    }

    @PostMapping
    public DemoDto saveDemo(@RequestBody DemoInputDto dto) {
        var demo = demoService.saveDemo(dto.toDemo());
        return DemoDto.fromDemo(demo);
    }
    //Werkt anders dan de Post/Get/Delete mappings (annotaties)
    @PutMapping("/{id}")
    public DemoDto updateDemo(@PathVariable("id") Long id, @RequestBody Demo demo){
        demoService.updateDemo(id, demo);
        return DemoDto.fromDemo(demo);
    }

    @DeleteMapping("/{id}")
    public void deleteDemo(@PathVariable("id") Long id) {
        demoService.deleteDemo(id);
    }

}

