package com.wgx.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.wgx.bean"})
/**
 * @edmanwang
 * 开启aspectJ自动代理
 */
@EnableAspectJAutoProxy
public class AppConfig {
}
