public class DiagonalSum {
    public static void main(String[] args){
        int[][] matrix = { {1, 2, 3, 4,}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16} };
        System.out.print(add(matrix));
    }

    //o(n^2)
//    public static int add(int[][] matrix){
//        int sum=0;
//        int n=matrix.length;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                if(i==j){
//                    sum+=matrix[i][j];
//                }
//                else if(i+j==n-1){
//                    sum+=matrix[i][j];
//                }
//            }
//        }
//        return sum;
//    }

    //o(n)
    public static int add(int[][] matrix){
        int sum=0;
        int n= matrix.length;
        for(int i=0;i<n;i++){
            sum+=matrix[i][i];
            if(i!=n-i-1)
                sum+=matrix[i][n-i-1];
        }
        return sum;
    }
}
