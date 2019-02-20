public class Duplicate {
    public static void main(String [] args){
        String a = "This is a typical example of a duplicate string";
        String[] b = a.split(" ");
        for(int i=0;i<b.length;i++)
        {
            if(b[i].equals("0"))
            {
                continue;
            }
            int count = 1;
            for(int j=i+1;j<b.length;j++)
            {
                if(b[i].equals(b[j]))
                {
                    count++;
                    b[j] = "0";
                }
            }
            if(b[i]!="0" && count>1)
            {
                System.out.println("The occurrence of '"+b[i]+"' is: "+count);
            }
        }
    }
}
