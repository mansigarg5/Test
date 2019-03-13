package Java2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

interface Student {

    void studentInfo(String name, int s_id, String city);

    void batchInfo(String batch);
}

public abstract class LibraryManagementSystem implements Student {
    String name;
    int s_id;
    String city;
    String batch;

    @Override
    public void studentInfo(String n, int s, String c) {
        name = n;
        s_id = s;
        city = c;
        System.out.println("Student name is " + name +
                " \nStudent id is: " + s_id + " \nStudent belongs to: " + city);
    }

    @Override
    public void batchInfo(String b) {
        batch = b;
        System.out.println(name + " is of batch:- " + batch);
    }

    abstract public void BookDetails(int bookID, String bookName);
}

class Library extends LibraryManagementSystem {
    String book;
    int bookID;

    @Override
    public void BookDetails(int bookID, String bookName) {
        book = bookName;
        this.bookID = bookID;
        System.out.println("Book issued is:-\nBook ID- " + bookID + "\nName:- " + book);
    }

    public void issuedDate(String date2) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = formatter.parse(date2);
            System.out.println("Date of issue is: " + date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}

class Fun {

    public static void main(String[] args) {
        Library obj = new Library();
        obj.studentInfo("Mansi Garg", 1121, "Meerut");
        obj.batchInfo("B.Tech-CS-2019");
        obj.BookDetails(101, "DigitalLogic");
        obj.issuedDate("31/03/2015");


    }
}

