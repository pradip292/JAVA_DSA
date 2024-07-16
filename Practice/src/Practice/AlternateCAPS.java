package Practice;

public class AlternateCAPS {
    public static void main(String[] args){
        String str = "Pradip";
        StringBuilder str1= new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char curr= str.charAt(i);
            if(i%2!=0){
                str1.append(str.toUpperCase().charAt(i));
            }
            else{
                str1.append(str.toLowerCase().charAt(i));
            }
        }
        System.out.print(str1);
    }
}
