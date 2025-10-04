package springcoreConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext temp= new ClassPathXmlApplicationContext("springcoreConstructorInjection.xml");
    Person p =  (Person)temp.getBean("cer");
        System.out.println(p);
    }
}
