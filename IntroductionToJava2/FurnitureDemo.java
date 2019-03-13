package Java2;

import java.util.Scanner;

interface Furniture {
    public void stressTest();
    public void fireTest();
}

abstract class Chair implements Furniture {
    public abstract String chairType();

}
abstract class Table implements Furniture {
    public abstract String tableType();
}

class MetalChair extends Chair {
    public void stressTest() {
        System.out.println("Passed Stress Test");
    }

    public void fireTest() {
        System.out.println("Passed Fire Test");
    }
    public String chairType() {
        String s = "This is a Metallic chair";
        return s;
    }
}

class MetalTable extends Table {
    public void stressTest() {

        System.out.println("Passed Stress Test");
    }

    public void fireTest() {
        System.out.println("Passed Fire Test");
    }

    public String tableType() {
        String s = "This is a Metallic Table";
        return s;
    }
}


class WoodenTable extends Table {
    public void stressTest() {
        System.out.println("Failed Stress Test");
    }

    public void fireTest() {
        System.out.println("Failed Fire Test");
    }

    public String tableType() {
        String s = "This is a Wooden Table";
        return s;
    }
}


class WoodenChair extends Chair {
    public void stressTest() {
        System.out.println("Failed Stress Test");
    }

    public void fireTest() {
        System.out.println("Failed Fire Test");
    }

    public String chairType() {
        String s = "This is a Wooden Chair";
        return s;
    }
}

public class FurnitureDemo {
    public static void main(String[] args){
        Table table = null;
        Chair chair=null;
        System.out.println("Enter either Metallic or Wooden");
        Scanner input =  new Scanner(System.in);
        String str = input.next();
        if(str.equalsIgnoreCase("Wooden")){
            System.out.println("Enter Chair or Table:- ");
            String entry= input.next();
            if(entry.equalsIgnoreCase("Chair")) {
                chair = new WoodenChair();
                System.out.println(chair.chairType());
                chair.stressTest();
                chair.fireTest();
            }
            else if(entry.equalsIgnoreCase("Table")){
                table = new WoodenTable();
                System.out.println(table.tableType());
                table.stressTest();
                table.fireTest();
            }
            else {
                System.out.println("Invalid input");
            }
        }
        else if(str.equalsIgnoreCase("Metallic")){
            System.out.println("Enter Chair or Table:- ");
            String entry= input.next();
            if(entry.equalsIgnoreCase("Chair")) {
                chair = new MetalChair();
                System.out.println(chair.chairType());
                chair.stressTest();
                chair.fireTest();

            }
            else if(entry.equalsIgnoreCase("Table")){
                table = new MetalTable();
                System.out.println(table.tableType());
                table.stressTest();
                table.fireTest();
            }
            else {
                System.out.println("Invalid input");
            }
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
