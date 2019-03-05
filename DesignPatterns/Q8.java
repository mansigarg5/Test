//Q8: Implement proxy design for accessing Record of a student and allow the access only to Admin.

package DesignPatterns;

class Student1{
    String name;
    Integer age;
    Integer className;

    public Student1(String name, Integer age, Integer className) {
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getClassName() {
        return className;
    }

    public void setClassName(Integer className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", className=" + className +
                '}';
    }
}

interface ValidRecord{
    void CheckValidity();
}

class CheckingData implements ValidRecord{
    protected Student1 student;

    public CheckingData(Student1 student) {
        this.student = student;
    }

    @Override
    public void CheckValidity() {
        System.out.println("Checking the validity of records...");
    }
}

class Admin extends CheckingData{
    public Admin(Student1 student) {
        super(student);
    }

    @Override
    public void CheckValidity() {
        if(student.getAge()>20||student.getClassName()>12)
            System.out.println("Invalid record found.");
        else
        {
            super.CheckValidity();
            System.out.println("Valid student data.");
        }
    }
}
public class Q8 {
    public static void main(String[] args) {
        Student1 student1= new Student1("Mansi",18,11);
        System.out.println(student1);
        ValidRecord data= new Admin(student1);
        data.CheckValidity();

        Student1 student2= new Student1("Pooja",21,14);
        System.out.println(student2);
        ValidRecord data2= new Admin(student2);
        data2.CheckValidity();
    }
}
