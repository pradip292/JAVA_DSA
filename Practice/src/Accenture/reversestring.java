package Accenture;
//direct print and using stringbuilder
public class reversestring {
    public static void main(String[] args){
        String str ="Hello";
        //StringBuilder str1= new StringBuilder();
        for(int i=str.length()-1; i>=0;i--){
            char ch = str.charAt(i);
            System.out.print(ch);
            //str1.append(ch);
        }
        //System.out.println(str1);
    }
}
