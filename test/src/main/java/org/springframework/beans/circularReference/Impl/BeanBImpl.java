package org.springframework.beans.circularReference.Impl;


import org.springframework.beans.circularReference.BeanB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("beanB")
public class BeanBImpl implements BeanB {

	@Autowired
	BeanB beanA;

	@Override
	public void helloBeanA() {
		System.out.println("hello beanA: "+beanA.toString());
	}

	public void setBeanA(BeanAImpl beanA) {
	}
}
