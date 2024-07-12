public class StringPermutations {
    public static void permu(String str, String ans){
        //base
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String str1= str.substring(0,i)+str.substring(i+1); //ignored middle character or skip
            permu(str1,ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        permu(str,"");
    }
}
