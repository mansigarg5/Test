enum House
{
    HOUSE1(200),HOUSE2(300),HOUSE3(400),HOUSE4(500);
    private int price;
    House(int p) {
        price=p;
    }
    int getPrice()
    {
        return price;
    }
}
public class Emun_display
{
    public static void main(String[] args)
    {
        System.out.println("All Houses prices are: ");
        for(House h:House.values())
        {
            System.out.println(h+" costs "+h.getPrice());
        }
    }
}