package com.yuanxueqi.basedAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@ComponentScan
@Component
public class Groot {
  public void say() {
    System.out.println("i am groot");
  }
}
