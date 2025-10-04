package LifeCycle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationsDemo {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public AnnotationsDemo() {
        super();
    }

    @Override
    public String toString() {
        return "AnnotationsDemo{" +
                "subject='" + subject + '\'' +
                '}';
    }
    @PostConstruct
    public void start(){
        System.out.println("Starting method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("ending method");
    }
}
