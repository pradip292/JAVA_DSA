package Asked2025;

public class Replace_Characters_In_A_String {
    public static void main(String[] args) {
        String str = "okay sir i am  pradip ";
        char a = 'p';
        char b = 'a';
        String res="";
        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            if(ch=='p'){
                res+='a';
            } else if (ch=='a') {
                res+='p';
            }
            else{
                res+=ch;
            }
        }
        System.out.println(res);
    }
}
