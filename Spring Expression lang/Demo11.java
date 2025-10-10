package SpringExprLang.java;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo11 {
    @Value("#{22+13}")
    private  Integer x ;
    @Value("#{4+5+5}")
    private Integer y;
    @Value("#{T(java.lang.Math).sqrt(121)}")
    private Integer z;


    @Value("#{T(java.lang.Math).PI}")
    private Double d;
@Value("#{new java.lang.String('Junaid Rana')}")
    private String Name;

@Value("#{8>3 }")
 private boolean isActive;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setD(Double d) {
        this.d = d;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Demo11{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", d=" + d +
                ", Name='" + Name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
