package Accenture_101pages;

public class PlayList_Most_Songs {
    public static void main(String[] args) {
        String str= "acdbaaaaca";
        int k=3;
        int max=0;

        for(int i=0; i<=str.length()-k; i++ ){
            String substring= str.substring(i,i+k);
            int count=0;
            for(int j=0; j<substring.length(); j++){
                char ch= substring.charAt(j);
                if(ch=='a'){
                    count++;
                }
                else{
                    count=0;
                }
                if(count>max){
                    max=count;
                }
            }
        }
        System.out.println(max);
    }
}
