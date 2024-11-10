package TalentBattle;

public class Car_Speed {
    public static void main(String[] args) {
        int input=12;
        int res=0;
        for(int i=1; i<=input; i++){
            if(input%i==0){
                res+=i;
            }
        }
        System.out.println(res);
    }
}
