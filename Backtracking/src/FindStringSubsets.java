public class FindStringSubsets {
    public static void findsubsets(String str, String ans, int i){
        //base case
        if(i==str.length()){
            if(str.isEmpty()){
                System.out.println("NULL");
            }
            System.out.println(ans);
            return;
        }
        //recursion
        //yes
        findsubsets(str,ans+str.charAt(i),i+1);
        //no
        findsubsets(str, ans, i+1);
    }
    public static void main(String[] args){
        String str="abc";
        findsubsets(str,"",0);
    }
}
