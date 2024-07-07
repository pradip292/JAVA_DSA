public class decTobin {
    public static void main(String args[]){
        dectobin(5);
    }
    public static void dectobin(int dec){
        int myNum= dec;
        int power=0;
        int binNum=0;

        while (dec>0){
            int rem= dec%2;
            binNum=binNum+(rem*(int)Math.pow(10,power));
            dec=dec/2;
            power++;
        }
        System.out.println("The binary number of "+myNum+" is "+binNum);

    }
}
