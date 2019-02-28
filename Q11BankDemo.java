class Bank{
    public String name = "Bank";
    public Double rateOfInterest = 4.5;
    public void getDetails(){
        System.out.println("The rate of interest for "+this.name+" is "+this.rateOfInterest);
    }
}
class SBI extends Bank{
    SBI(String name, Double rateOfInterest){
        this.name = name;
        this.rateOfInterest = rateOfInterest;
    }
    public void getDetails(){
        System.out.println("The rate of interest for "+this.name+" is "+this.rateOfInterest);
    }
}
class BOI extends Bank{
    BOI(String name, Double rateOfInterest){
        this.name = name;
        this.rateOfInterest = rateOfInterest;
    }
    public void getDetails(){
        System.out.println("The rate of interest for "+this.name+" is "+this.rateOfInterest);
    }
}
class ICICI extends Bank{
    ICICI(String name, Double rateOfInterest){
        this.name = name;
        this.rateOfInterest = rateOfInterest;
    }
    public void getDetails(){
        System.out.println("The rate of interest for "+this.name+" is "+this.rateOfInterest);
    }
}
public class Q11BankDemo {
    public static void main(String [] args){
        Bank bank = new Bank();
        Bank bank1 = new SBI("SBI",5.5);
        Bank bank2 = new BOI("BOI",6.5);
        Bank bank3 = new ICICI("ICICI",7.5);
        bank.getDetails();
        bank1.getDetails();
        bank2.getDetails();
        bank3.getDetails();
    }
}
