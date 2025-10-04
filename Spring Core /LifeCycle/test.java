package LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("LifeCycle.xml");
//      Demo s1 = (Demo) context.getBean("s1");
//        System.out.println(s1);
        // registering shutdown hook
        context.registerShutdownHook();

//        System.out.println("+++++++++++++++++++++++");
//        Demo2 p =(Demo2) context.getBean("p1");
//        System.out.println(p);

         AnnotationsDemo d3= (AnnotationsDemo) context.getBean("m1");
        System.out.println(d3);
    }
}
