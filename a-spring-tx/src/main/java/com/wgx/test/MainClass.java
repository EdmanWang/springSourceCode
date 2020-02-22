package com.wgx.test;

import com.wgx.config.MainConfig;
import com.wgx.service.PayService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author EdmanWang
 * @create 2020/2/21 17:50
 */
public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(MainConfig.class);

		PayService payService = context.getBean(PayService.class);
		payService.pay("123456789",10);
	}
}
