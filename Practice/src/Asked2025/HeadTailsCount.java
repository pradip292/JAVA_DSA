package Asked2025;

public class HeadTailsCount {
    public static void main(String[] args) {
        String str= "TTHHHTTTT"; //ans= 4 h=+2 t= -1
        int counth=0;
        int sum=0;
        for(int i=0; i<str.length();i++){
            char ch= str.charAt(i);
            if(ch=='H'){
                sum=sum+2;
                counth++;
            }
            else if(ch=='T'){
                sum=sum-1;
            }
            if(counth==3){
                break;
            }
        }
        System.out.println(sum);
    }
}
