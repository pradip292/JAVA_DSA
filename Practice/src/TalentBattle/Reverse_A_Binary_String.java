package TalentBattle;

public class Reverse_A_Binary_String {
    public static void main(String[] args) {
        int num= 547;
        String str= String.valueOf(num);
        String str2= Integer.toString(num);
        System.out.println(str);
        System.out.println(str2);

        String rev="";
        for(int i=str2.length()-1; i>=0; i--){
            rev+=str2.charAt(i);
        }
        System.out.println(rev);

        int revnum= Integer.parseInt(rev);
        System.out.println(revnum);

    }
}
