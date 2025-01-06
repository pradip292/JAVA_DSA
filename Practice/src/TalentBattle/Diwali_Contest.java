package TalentBattle;

public class Diwali_Contest {
    public static void main(String[] args){
        int hour= 4;
        int mins= 191;
        int res=0;
        int hoursmin= hour*60; //240
        int ptime= hoursmin-mins;
        for(int i=1; i<=hour; i++){
            if(ptime<(5*i)){
                break;
            }
            ptime= ptime- (5*i);
            res++;
        }
        System.out.println(res);
    }

}
