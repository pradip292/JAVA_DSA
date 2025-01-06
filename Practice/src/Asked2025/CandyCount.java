package Asked2025;

public class CandyCount {
    public static void main(String[] args) {
        int n=6;
        int[] candy = {5,15,4,3,10}; // 5 wale candy free hai
        int count =0;
        for(int i=0; i<candy.length; i++){
            if(candy[i]%5==0){
                count++;
            }
            else if(candy[i]<= n){
                count++;
                n=n-candy[i];
            }
        }
        System.out.println(count);
    }
}
