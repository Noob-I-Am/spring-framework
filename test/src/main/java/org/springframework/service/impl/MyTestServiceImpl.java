package org.springframework.service.impl;


import org.springframework.service.MyTestService;

public class MyTestServiceImpl implements MyTestService {
    @Override
    public int apply() {
        return 1;
    }
}
