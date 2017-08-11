package com.shikong.demo_provider.serviceImpl;

import com.shikong.interfaces.interfaceX.IDemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements IDemoService{

    @Override
    public String sayHello(String name) {
        return "Hello"+name;
    }
}
