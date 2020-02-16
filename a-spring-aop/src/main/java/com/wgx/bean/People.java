package com.wgx.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class People implements InitializingBean,BeanNameAware,BeanFactoryAware {
	@Override
	public void afterPropertiesSet() throws Exception {

	}

	@Override
	public void setBeanName(String name) {

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

	}
}
