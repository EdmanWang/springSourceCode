package com.wgx.test;

import com.wgx.bean.Calculate;
import com.wgx.bean.WgxCalculate;
import com.wgx.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Calculate calculate = (Calculate) applicationContext.getBean("calculate");

		int add = calculate.add(4, 2);
		System.out.println(add);
	}
}
