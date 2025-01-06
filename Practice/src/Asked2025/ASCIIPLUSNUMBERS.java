package Asked2025;

import static java.lang.Character.isDigit;

public class ASCIIPLUSNUMBERS {
    public static int maxi(int num){
        int max=0;
        while(num!=0){
             int lastDigit = num%10;
             max =Math.max(max,lastDigit);
             num /= 10;
        }
        return max;
    }
    public static void main(String[] args){
        String str1= "12ab";
        String str="CD#34";
        int price=0;
        for(int i=0; i<str.length();i++){
            char curr= str.charAt(i);
            if(isDigit(curr)){
                price+= (curr- 48);
            }
            else{
                price+= maxi(curr);
            }
        }
        System.out.print(price);
    }
}

