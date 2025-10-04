package SpringCoreAutoWiring.Annotation;

//import SpringCoreAutoWiring.Address;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

    @Autowired
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee() {
        super();
    }

    public Employee(Address address) {
        super();
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
