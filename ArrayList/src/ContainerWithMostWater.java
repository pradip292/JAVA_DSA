import java.util.ArrayList;

public class ContainerWithMostWater {

    //brute force checking all cases 0(n^2)
    public static int mostwater(ArrayList<Integer> list){
        int Maxsum=0;
        for(int i=0; i<list.size();i++){
            for(int j=i+1; j<list.size();j++){
                int ht = Math.min(list.get(i),list.get(j));
                int width= j-i;
                int sum= ht*width;
                Maxsum= Math.max(Maxsum,sum);
            }
        }
        return Maxsum;
    }

    //Two Pointers Approach o(n)
    public static int mostwaterp(ArrayList<Integer> list){
        int sum=0;
        int left=0;
        int right=list.size()-1;
        while (left<right){
            //calculator
            int ht= Math.min(list.get(left),list.get(right));
            int width= right-left;
            int currsum= ht*width;
            sum= Math.max(currsum,sum);

            //updations
            if(list.get(left)< list.get(right)){
                left++;
            }
            else {
                right--;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(mostwaterp(list));
    }
}
