package com.wgx.test;

import com.wgx.bean.Person;
import com.wgx.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Person person = (Person) applicationContext.getBean("person");

		System.out.println(person);
	}
}
