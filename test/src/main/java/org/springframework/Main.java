package org.springframework;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.service.MyTestService;

public class Main {
	public static void main(String[] args) {
		load();
//		System.out.println("Hello world!");
	}

	static void load(){
		Resource resource = null;
//        ClassPathResource resource = new ClassPathResource("MyBeans.xml"); // <1>
//        resource = new FileSystemResource("D:\\workSpace\\idea workspace\\SSM_Test\\SSMTest\\src\\main\\resources\\MyBeans.xml");
		ResourceLoader resourceLoader = new FileSystemResourceLoader();
		resource = resourceLoader.getResource("D:\\workSpace\\idea workspace\\SSM_Test\\SSMTest\\src\\main\\resources\\MyBeans.xml");

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory(); // <2>
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory); // <3>
		reader.loadBeanDefinitions(resource); // <4>
		MyTestService mtService = factory.getBean("mtService",MyTestService.class);
		MyTestService mtAddService = factory.getBean("mtAddService",MyTestService.class);
		System.out.println();
	}


	static void start(){
		ApplicationContext context = new ClassPathXmlApplicationContext("MyBeans.xml");
		MyTestService mtService = context.getBean("mtAddService", MyTestService.class);
		int apply = mtService.apply();
		System.out.println(apply);
	}
}