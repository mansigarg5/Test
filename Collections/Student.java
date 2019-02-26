package Collections;
import java.util.Arrays;
public class Student implements Comparable<Student>{
    String name;
    Double score;
    Double age;
    public Student(String name, Double score, Double age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }
    @Override
    public int compareTo(Student s) {
       if(score>s.score){
            return 1;
        }
        else if(score<s.score){
            return -1;
        }
        else{
            return (name.compareTo(s.name));
       }
    }
    public int comapare(Student s1, Student s2){
        return s1.score.compareTo(s2.score);
    }
    public int compare1(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student("Mansi", 100.0, 22.0);
        s[1] = new Student("Ram", 80.0, 22.0);
        s[2] = new Student("Shyam", 80.0, 20.0);
        s[3] = new Student("Mohan", 80.0, 20.0);
        Arrays.sort(s);
        for(int i=0;i<4;i++) {
            System.out.println("Name: "+s[i].name+", Score: "+s[i].score+", Age: "+s[i].age);
        }
    }
}
