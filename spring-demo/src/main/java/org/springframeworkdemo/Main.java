package org.springframeworkdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframeworkdemo.bean.SimpleBean;
import org.springframeworkdemo.context.cache.CacheService;
import org.springframeworkdemo.context.cacheTest.CacheTest;

/**
 * @description: TODO
 * @author dongzhibo
 * @date 2023/9/20 16:42
 * @version 1.0
 */
public class Main {
	public static void main(String[] args) {
		//PropertySourceTest.testStandardEnvironment();
		Main.startAnnotationConfigBean();
	}

	public static void startClassPathXmlBean(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		System.out.println("bean count is " + context.getBeanDefinitionCount());
		SimpleBean bean = context.getBean(SimpleBean.class);
		bean.send();
		CacheService cacheService = context.getBean(CacheService.class);
		cacheService.getCacheList("111");
		cacheService.getCacheList("222");
		cacheService.getCacheList("111");

	}

	public static void startAnnotationConfigBean(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.springframeworkdemo");
		String[] beans = context.getBeanDefinitionNames();
		System.out.println("beans is " + beans.toString());
		CacheTest.cacheableTest(context);
	}
}