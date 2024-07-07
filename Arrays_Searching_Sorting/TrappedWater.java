public class TrappedWater {
    public static int calculate(int[] a)
    {
        int n= a.length;

        //calculate left max boundary -array
        int[] leftMax = new int[n];
        leftMax[0] = a[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(a[i],leftMax[i-1]);
        }
        //calculate right max boundary -array
        int[] rightMax= new int[n];
        rightMax[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(a[i],rightMax[i+1]);
        }

        int trapped_water=0;
        for(int i=0;i<n;i++){
            int water_level=Math.min(leftMax[i],rightMax[i]);
            trapped_water+=water_level-a[i];
        }
        return trapped_water;
    }
    public static void main(String[] args){
        int[] a={4,2,0,6,3,2,5};
        System.out.print(calculate(a));
    }

}
