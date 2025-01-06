import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String str="Helougdhfhfhfhfggggggggggggggggoe";
//        HashSet<Character> hs= new HashSet<>();
//        for(int i=0; i<str.length();i++){
//            char ch= str.charAt(i);
//            if(!hs.contains(ch)){
//                hs.add(ch);
//            }
//            else{
//                System.out.println(ch);
//                break;
//            }
//        }
        int countV=0;
        int countC=0;
        HashSet<Character> hs= new HashSet<>();
        for(int i=0; i<str.length();i++){
            char ch= str.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'|| ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                hs.add(ch);


                countV++;
            }
            else{
                countC++;
            }
        }
        System.out.println(countC);
        System.out.println();
        System.out.println(hs);
        System.out.println(countV);
    }
}