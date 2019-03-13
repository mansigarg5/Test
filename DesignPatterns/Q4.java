//Q4: Implement Builder pattern to create a student object with more than 6 fields.

package DesignPatterns;
class Student{
    private String name;
    private int id;
    private int age;
    private String grade;
    private int rank;
    private String address;
    private String phoneNumber;
    public Student(StudentBuilder studentBuilder){
        name = studentBuilder.getName();
        id = studentBuilder.getId();
        age = studentBuilder.getAge();
        grade = studentBuilder.getGrade();
        rank = studentBuilder.getRank();
        address = studentBuilder.getAddress();
        phoneNumber = studentBuilder.getPhoneNumber();
    }

    @Override
    public String toString() {
        return "Name: "+name+"\nID: "+id+"\nAge: " +age+ "\nGrade: " +grade+
                "\nRank: "+rank+"\nAddress: "+address+"\nPhoneNumber: "+phoneNumber;
    }
}

class StudentBuilder{
    private String name;
    private int id;
    private int age;
    private String grade;
    private int rank;
    private String address;
    private String phoneNumber;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }
    public String getGrade(){
        return grade;
    }
    public int getRank(){
        return rank;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public StudentBuilder withName(String name){
        this.name = name;
        return this;
    }
    public StudentBuilder withId(int id){
        this.id = id;
        return this;
    }
    public StudentBuilder withAge(int age){
        this.age = age;
        return this;
    }
    public StudentBuilder withGrade(String grade){
        this.grade = grade;
        return this;
    }
    public StudentBuilder withRank(int rank){
        this.rank = rank;
        return this;
    }
    public StudentBuilder withAddress(String address){
        this.address = address;
        return this;
    }
    public StudentBuilder withPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }
    public Student build(){
        return new Student(this);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Student student = new StudentBuilder().withName("Mansi").withId(101).withAge(22).withGrade("A")
                .withRank(1).withAddress("Meerut").withPhoneNumber("8743992757").build();
        System.out.println(student.toString());
    }
}
