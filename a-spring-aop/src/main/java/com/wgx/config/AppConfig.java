package com.wgx.config;

import com.wgx.bean.Calculate;
import com.wgx.bean.WgxCalculate;
import com.wgx.bean.WgxLogAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
/**
 * @edmanwang
 * 开启aspectJ自动代理
 */
@EnableAspectJAutoProxy
public class AppConfig {

	@Bean
	public WgxLogAspect wgxLogAspect() {
		return new WgxLogAspect();
	}

	@Bean
	public Calculate calculate() {
		return new WgxCalculate();
	}
}
