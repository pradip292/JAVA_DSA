import java.util.ArrayList;
public class PairedSumInSortedAndRotatedArrayList {
    //print if the sum of the numbers is targeted sum or not
    public static boolean pairedsum(ArrayList<Integer> list, int target){
        //brute force
        for(int i=0; i<list.size(); i++){
            for( int j=0; j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }

    //2 pointers approach
    public static boolean pairedsum1(ArrayList<Integer> list, int target){
        int bp=-1;
        int n= list.size();
        for(int i=0; i<list.size();i++){
            if(list.get(i)> list.get(i+1)){
                bp=i;  // finded breaking point
                break;
            }
        }
        int left=bp+1;
        int right=bp;

        while(left!=right){
            //kaam
            if(list.get(left)+list.get(right)==target){
                return true;
            }
            //updation pointers
            if(list.get(left)+list.get(right)<target){
                left=(left+1)%n; //worked same but just to rotate to end to start same for right pointer also

            }
            else {
                right=(n+right-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(3);
        list.add(4);
        list.add(5);
        int target=7;
        System.out.println(pairedsum1(list,target));

    }
}
