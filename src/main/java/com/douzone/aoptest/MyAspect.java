package com.douzone.aoptest;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	@Before("execution(ProductVo com.douzone.aoptest.ProductService.find(..))")
	public void beforeAdvice() {
		System.out.println("call [before advice]");
	}
}
