package Accenture;

public class Magical_Number {
    public static void main(String[] args){
        int n=10;
        int count =0;
        for(int i=1; i<n;i++) {
            String binaryString= Integer.toBinaryString(i);
            String transformedString = transformBinaryString(binaryString);
            // Calculate the sum of digits in the transformed string
            int sum = calculateSum(transformedString);

            // Check if the sum is odd
            if (sum % 2 != 0) {
                System.out.println(i + " is a magical number.");
            }
        }
    }
    public static String transformBinaryString(String str){
        StringBuilder str1= new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch=='0'){
                str1.append("1");
            }
            else if(ch=='1'){
                str1.append("2");
            }
        }
        return str1.toString();
    }
    public static int calculateSum(String str){
        int sum=0;
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            sum+=ch-'0';
        }
        return sum;
    }
}
