package org.springframework.beans.impl;

import org.springframework.beans.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.service.MyTestService;
import org.springframework.stereotype.Service;

@Service("helloAction")
public class HelloAction implements Action {

	@Qualifier("mtService")
	@Autowired
	MyTestService myTestService;

	@Override
	public void saySomething() {
		System.out.println("hello yoo!!!");
	}
}
