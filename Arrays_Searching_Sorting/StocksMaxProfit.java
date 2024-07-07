public class StocksMaxProfit {
    public static int calculate(int[] a)
    {
        int n=a.length;
        int buy_price= Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<n;i++){
            if(buy_price<a[i]){
                int profit= a[i]-buy_price;
                max_profit=Math.max(profit,max_profit);
            }
            else{
                buy_price=a[i];

            }
        }
        return max_profit;
    }
    public static void main(String[] args){
        int[] a={7,1,5,3,6,4};
        System.out.print(calculate(a));
    }
}
