public class Unique {
    public static void main(String [] args){
        int[] a = {1,1,2,2,4,3,3,5,5};
        int b = 0;
        for(int i=0;i<a.length;i++)
        {
            b = b^a[i];
        }
        System.out.println("The unique element is: "+b);
    }
}
