package TalentBattle;

public class LeapYear {
    public static boolean calleapyear(int num){
        int flag=0;
        if(num%4==0)
        {
            flag=1;
            if(num%100==0)
            {
                if(num%400==0){
                    flag=1;
                }
                else{
                    flag=0;
                }
            }
        }
        else {
            return false;
        }

        if(flag==1){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int year = 1620;
        System.out.println(calleapyear(year));
    }
}
