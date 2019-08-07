package com.yuanxueqi.basedXML;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


  public static void main(String[] args) {
    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myxml.xml");
    Groot groot=applicationContext.getBean(Groot.class);
    groot.say();
  }



}
