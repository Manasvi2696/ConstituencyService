package org.abc.constituency.exception;

import org.abc.constituency.view.impl.ConstituencyViewImpl;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GlobalExceptionHandler {
	@Autowired
	private ConstituencyViewImpl view;
	
	@AfterThrowing(pointcut = "within(org.abc.constituency.service.impl.ConstituencyServiceImpl)",throwing = "e")
	public void handleConstituencyNotFoundException(ConstituencyNotFoundException e) {
		System.out.println("In GlobalExceptionHandler");
		view.print(e);
	}
	@Before("within(org.abc.constituency.controller.ConstituencyController)")
	public void log() {
		System.out.println("In log");
	}
	

}
