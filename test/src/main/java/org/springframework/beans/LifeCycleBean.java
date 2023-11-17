package org.springframework.beans;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.UnsupportedEncodingException;

//InstantiationAwareBeanPostProcessor
public class LifeCycleBean implements BeanNameAware, BeanFactoryAware, BeanClassLoaderAware, BeanPostProcessor, InitializingBean
, DisposableBean {

	public LifeCycleBean(){
		System.out.println("构造函数被调用");
	}

	private String test;

	public String getTest(){
		return test;
	}

	public void display(){
		System.out.println(getTest());
	}

	public void setTest(String test) {
		System.out.println("属性注入..");
		this.test = test;
	}

	@PostConstruct
	public void start(){
		System.out.println("PostConstruct!!!");
	}

	@PreDestroy
	public void end(){
		System.out.println("PreDestroy!!!!");
	}


	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
			System.out.println("BeanClassLoaderAware#setBeanClassLoader被调用");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryAware#setBeanFactory被调用");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("BeanNameAware#setBeanName被调用");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy被调用");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean#afterPropertiesSet被调用");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization被调用");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization被调用");
		return bean;
	}

	public void initMethod(){
			System.out.println("init-method 被调用");
	}

	public void destroyMethod(){
		System.out.println("destory-method 被调用");
	}

}
