package com.yuanxueqi.basedAnnotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Aspect
@Component
@EnableAspectJAutoProxy
public class MyAop {

  @Pointcut("execution(void com.yuanxueqi.basedAnnotation.Groot.say())")
  public void cut() {}

  @Before("cut()")
  public void sing() {
    System.out.println("singing~~");
  }

  @After("cut()")
  public void dance() {
    System.out.println("~~dancing");
  }
}