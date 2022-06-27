package com.spring.aplication.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ApplicationContextTest
 *
 * @author zhai_shunli
 * @date 2022/6/27
 */
public class ApplicationContextTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println(applicationContext.getBean("userService"));
	}
}
