public class binTodec {
    public static void main(String args[]){
        bintodec(101);
    }
    public static void bintodec(int bin){
        int myNum= bin;
        int power=0;
        int decNum=0;

        while (bin>0){
            int lastDigit= bin%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2,power));
            bin=bin/10;
            power++;
        }
        System.out.println("The decimal number of "+myNum+" is "+decNum);

    }
}
