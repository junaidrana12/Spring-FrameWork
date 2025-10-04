package SpringCoreAutoWiring.Annotation;

import SpringCoreAutoWiring.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringCoreAutoWiring/Annotation.xml");
        SpringCoreAutoWiring.Employee demo = (Employee) context.getBean("emp1");
        System.out.println(demo);
    }
}

