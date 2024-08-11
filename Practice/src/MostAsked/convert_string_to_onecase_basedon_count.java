package MostAsked;

public class convert_string_to_onecase_basedon_count {
    public static void main(String[] args){
        String str="MAhm";
        int countu=0;
        int countl=0;
        for(int i=0; i<str.length();i++){
            char ch= str.charAt(i);
            if(ch>='A' && ch<='Z'){
                countu++;
            }
            else{
                countl++;
            }
        }
        if(countu>countl){
            System.out.println(str.toUpperCase());
        }
        else if(countl>countu){
            System.out.println(str.toLowerCase());
        }
        else {
            System.out.println(str);
        }

    }
}
