package TalentBattle;

public class Pattern_Practice {
    public static void main(String[] args) {
        String ans="";
        int count =2;
        ans+=(char)('A'+ count);
        System.out.println(ans);

        /*
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i+j==n+1 || i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

         */
        /*
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

         */
    }
}
