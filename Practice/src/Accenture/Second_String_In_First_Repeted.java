package Accenture;

public class Second_String_In_First_Repeted {
    public static void main(String[] args) {
        String str= "ababababdfdfdab";
        String str2= "ab";
        int count= str.split(str2,-1).length-1;
        System.out.println(count);
    }
}
