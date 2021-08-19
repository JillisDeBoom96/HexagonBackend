package com.projectjillis.service;

import com.projectjillis.exceptions.RecordNotFoundException;
import com.projectjillis.model.Demo;
import com.projectjillis.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService{
    private DemoRepository demoRepository;

    @Autowired
    public DemoServiceImpl(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    @Override
    public List<Demo> getDemos() {
        return demoRepository.findAll();
    }

    @Override
    public Demo getDemo(Long id) {
        var optionalDemo = demoRepository.findById(id);
        if(optionalDemo.isPresent()) {
            return optionalDemo.get();
        } else {
            throw new RecordNotFoundException();
        }
    }

    @Override
    public Demo saveDemo(Demo demo) {
        return demoRepository.save(demo);
    }

    @Override
    public Demo updateDemo(Long id, Demo demo) {
        var optionalDemo = demoRepository.findById(id);
        if(optionalDemo.isPresent()) {
            demoRepository.deleteById(id);
            demoRepository.save(demo);
            return optionalDemo.get();
        } else {
            throw new RecordNotFoundException();
        }
    }

    @Override
    public void deleteDemo(Long id) {
        demoRepository.deleteById(id);
    }
}
