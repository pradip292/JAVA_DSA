package Asked2025;

public class Rhyming_String {
    public static int longestsuffix(String currstring, String str){
        int i= currstring.length()-1;
        int j= str.length()-1;
        int len=0;
        while(i>=0 && j>=0 && currstring.charAt(i)==str.charAt(j)){
            len++;
            i--;
            j--;
        }
        return len;
    }
    public static String findrhymingword(String[] s1, String str){
        String res = "";
        int maxlen =0;
        for(int i=0; i<s1.length; i++){
            int curr= longestsuffix(s1[i],str);
            if(curr>maxlen || curr==maxlen && res.length()<=str.length()){
                res=s1[i];
                maxlen=curr;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "wotter";
        String[] s1 ={"pater", "gatter", "mattser"};
        System.out.println(findrhymingword(s1,str));
    }
}

