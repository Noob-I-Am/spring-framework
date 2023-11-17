package org.springframework.beans.circularReference.Impl;

import org.springframework.beans.circularReference.BeanA;
import org.springframework.beans.circularReference.BeanB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("beanA")
public class BeanAImpl implements BeanA {

	@Autowired
	BeanB beanB;

	@Override
	public void helloBeanB() {
		System.out.println("hello beanB: "+beanB.toString());
	}

	public void setBeanB(BeanAImpl beanB) {
	}
}
