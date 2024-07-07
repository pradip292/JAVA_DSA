public class Reuse {
    public static void main(String[] args){
           /*
            Reuse z= new Reuse();
            int final_result= z.add(4,5);
            System.out.println("Addition is"+final_result);
            float avgg= z.avg(5,4);
            System.out.print("Avg is"+avgg);
            */
            for(int i=0;i<6;i++){
                for(int j=0;j<6;j++){
                    System.out.println(i+"x"+j+"="+i*j);
                }
            }
    }
    int add(int x, int y){
        int result= x+y;
        return result;
    }

    float avg(int x,int y){
        float avg= add(x,y)/2;
        return avg;
    }
}
