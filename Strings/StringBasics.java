public class StringBasics {
    public static void printstr(String str){
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            System.out.print(ch+" ");
        }
    }

    public static boolean ispalindrome(String str){
        int n=str.length();
        for(int i=0; i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static float getshort(String str){
        int x=0,y=0;
        for(int i=0; i<str.length();i++){
            char ch= str.charAt(i);
            if(ch=='E'){
                x++;
            } else if (ch=='W') {
                x--;
            } else if (ch=='N') {
                y++;
            }
            else{
                y--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }

    public static String substring(String str, int si, int ei){
        String str1="";
        for(int i=si; i<ei;i++){
            str1=str1+str.charAt(i);
        }
        return str1;
    }

    public static void main (String[] args) {
        String str = "eyee";
        String str3 = "racecar";
        String str4="WNEENESENNN";
        String str2= new String("patil");
        //System.out.println(str2.length());
        //printstr(str);
        //System.out.print(ispalindrome(str));
        //System.out.print(getshort(str4));
        System.out.print(substring(str3,0,4));

        /*
        String[] fruits={"apple","mango","pineapple","zee"};
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest =fruits[i];
            }
        }
        System.out.print(largest);
         */


    }
}
