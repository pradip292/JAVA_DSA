package TalentBattle;

public class The_Charity_Bake_Sale {
    public static void main(String[] args) {
        int[] arr= {2,4,5,8};
        int res=1;
        boolean flag= false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%7==0){
                res*=arr[i];
                flag=true;
            }
        }
        if(flag){
            System.out.println(res);
        }
        else {
            System.out.println("0");
        }
    }
}

