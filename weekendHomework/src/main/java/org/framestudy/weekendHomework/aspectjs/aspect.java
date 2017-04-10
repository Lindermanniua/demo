package org.framestudy.weekendHomework.aspectjs;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class aspect {
	@Before(value="execution(* org.framestudy.weekendHomework.dao.impl.*.*(..))")
	public void before(JoinPoint jp){
		Object obj = jp.getTarget();
		Class<?> cls = obj.getClass();
	}
}
