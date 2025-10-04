package LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Demo2 implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Demo2{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //init
        System.out.println("Taking papsi :init");
    }

    @Override
    public void destroy() throws Exception {
        //destroy
        System.out.println("Going to put bottle back to shop");
    }
}
