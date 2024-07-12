public class FindStringSubsets {
    public static void findsubsets(String str, String ans, int i){
        //base case
        if(i==str.length()){ // all string complete
            if(str.isEmpty()){ // if empty last cell
                System.out.println("NULL");
            }
            System.out.println(ans); //print answer
            return;
        }
        //recursion
        //yes
        findsubsets(str,ans+str.charAt(i),i+1); // if yes then add that char to ans
        //no
        findsubsets(str, ans, i+1); // if no then dont add but increament will happen
    }
    public static void main(String[] args){
        String str="abc";
        findsubsets(str,"",0); //str u r giving and pass answer string for answer and index
    }
}
