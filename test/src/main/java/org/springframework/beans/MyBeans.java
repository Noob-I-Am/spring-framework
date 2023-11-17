package org.springframework.beans;

import org.springframework.beans.circularReference.BeanA;
import org.springframework.beans.circularReference.BeanB;
import org.springframework.beans.circularReference.Impl.BeanAImpl;
import org.springframework.beans.circularReference.Impl.BeanBImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class MyBeans {

	@Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
	public LifeCycleBean getLifeCycleBean(){
		LifeCycleBean lifeCycleBean = new LifeCycleBean();
		lifeCycleBean.setTest("yolo");
		return lifeCycleBean;
	}

//	@Bean(name = "beanA")
//	public BeanA getBeanA(){
//		return new BeanAImpl();
//	}
//
//	@Bean(name = "beanB")
//	public BeanB getBeanB(){
//		return new BeanBImpl();
//	}

}
