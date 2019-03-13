package Collections;
import java.util.Arrays;

public class Employee implements Comparable<Employee>{
    Double age;
    Double salary;
    String name;
    @Override
    public int compareTo(Employee e) {
        if(salary > e.salary)
            return 1;
        else
            return -1;
    }
    public int compare(Employee e1, Employee e2){
        return e1.salary.compareTo(e2.salary);
    }
    public Employee(Double age, Double salary, String name){
        this.age = age;
        this.salary = salary;
        this.name = name;
    }
    public static void main(String[] args) {
        Employee[] e = new Employee[4];
        e[0] = new Employee(22.0, 10000.0, "Mansi");
        e[1] = new Employee(23.0, 9000.0, "Ram");
        e[2] = new Employee(24.0, 8000.0, "Shyam");
        e[3] = new Employee(25.0, 7000.0, "Mohan");
        Arrays.sort(e);
        for(int i=0;i<4;i++)
        {
            System.out.println("Name: "+e[i].name+", Age: "+e[i].age+", Salary: "+e[i].salary);
        }
    }
}
