public class Bank {
    public static void main(String [] args){
        SBI s = new SBI();
        BOI b = new BOI();
        ICICI i = new ICICI();
        s.getDetails();
        b.getDetails();
        i.getDetails();
    }
}
class SBI{
    String name = "SBI";
    double rateOfInterest = 5.5;
    public void getDetails(){
        System.out.println("The rate of interest for "+this.name+" is "+this.rateOfInterest);
    }
}
class BOI{
    String name = "BOI";
    double rateOfInterest = 6.5;
    public void getDetails(){
        System.out.println("The rate of interest for "+this.name+" is "+this.rateOfInterest);
    }
}
class ICICI{
    String name = "ICICI";
    double rateOfInterest = 7.5;
    public void getDetails(){
        System.out.println("The rate of interest for "+this.name+" is "+this.rateOfInterest);
    }
}
