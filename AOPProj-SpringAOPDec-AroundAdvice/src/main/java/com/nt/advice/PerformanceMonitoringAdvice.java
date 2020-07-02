package com.nt.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceMonitoringAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("PerformanceMonitoringAdvice.invoke()");
		long start = 0 , end = 0;
		Object retVal = null;
		start = System.currentTimeMillis();//pre-logic
		retVal = invocation.proceed();//invoke the method
		end = System.currentTimeMillis();//post logic
		System.out.println(invocation.getMethod().getName()+" with args "+ Arrays.toString(invocation.getArguments())+" has taken "+(start-end)+"Ms");
		
		
		return retVal;
	}

}
