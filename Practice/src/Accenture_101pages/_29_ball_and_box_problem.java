package Accenture_101pages;

public class _29_ball_and_box_problem {
    public static void main(String[] args) {
        int[] arr= {1,2,7,13};
        int sumofdiff=0;
        //ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int diff= Math.abs(arr[i]-((i+1)*(i+1)));
            sumofdiff+=diff;
        }
        System.out.println(sumofdiff);

    }
}
