package SpringCoreReference;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Reference {
    public static void main(String[] args) {
        ApplicationContext text1 = new ClassPathXmlApplicationContext("refConfig.xml");

        A temp = (A) text1.getBean("aref");
        System.out.println(temp.getX());
        System.out.println(temp.getOb().getY());
        System.out.println(temp);
    }
}
