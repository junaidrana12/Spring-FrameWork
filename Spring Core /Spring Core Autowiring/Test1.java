package SpringCoreAutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Test1 {
    public static void main(String[] args)  {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringCoreAutoWiring.xml");
        Employee demo = (Employee) context.getBean("emp1");
        System.out.println(demo);
    }
}
