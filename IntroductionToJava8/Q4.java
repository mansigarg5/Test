package Java8;
@FunctionalInterface
interface Employee{
    Q4 employee(String name, Integer age, String city);
}

public class Q4 {
     String name;
     Integer age;
     String city;
    public Q4(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public static void main(String[] args) {
        Employee emp = Q4::new;
        emp.employee("Mansi",22,"Meerut");
        System.out.println(emp);
    }

}


