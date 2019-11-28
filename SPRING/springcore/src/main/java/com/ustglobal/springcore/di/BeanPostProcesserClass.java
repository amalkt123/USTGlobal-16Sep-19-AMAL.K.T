package com.ustglobal.springcore.di;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcesserClass implements BeanPostProcessor{
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean before initialization: "+beanName);
		// TODO Auto-generated method stub
		return bean;
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean after initialization :"+beanName);
		// TODO Auto-generated method stub
		return bean;
	}

}
