package Java2;

public class Sort {
    public void sort(String s){
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(ch[i]>ch[j])
                {
                    char t = ch[i];
                    ch[i] = ch[j];
                    ch[j] = t;
                }
            }
        }
        String str = new String(ch);
        System.out.println("The sorted string is: "+str);
    }
    public static void main(String [] args){
        String s = "mansi";
        Sort so = new Sort();
        System.out.println("The original string is: "+s);
        so.sort(s);
    }
}
