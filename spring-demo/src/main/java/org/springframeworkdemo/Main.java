package org.springframeworkdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframeworkdemo.bean.SimpleBean;

/**
 * @description: TODO
 * @author dongzhibo
 * @date 2023/9/20 16:42
 * @version 1.0
 */
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		SimpleBean bean = context.getBean(SimpleBean.class);
		bean.send();
		context.close();
	}
}