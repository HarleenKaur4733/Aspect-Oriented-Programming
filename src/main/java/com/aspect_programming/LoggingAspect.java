package com.aspect_programming;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(public String com.aspect_programming.Employee.getEmployeeDetails())")
    public void logBeforeMethodExecution() {
        System.out.println("Executing method in Employee class");
    }

}
