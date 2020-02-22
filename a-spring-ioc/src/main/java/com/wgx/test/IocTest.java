package com.wgx.test;

import com.wgx.bean.Cat;
import com.wgx.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);
		Cat cat = (Cat) applicationContext.getBean("cat");
		System.out.println(cat);
	}
}
