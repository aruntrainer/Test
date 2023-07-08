import java.io.*;
public class task12{
    public static int magicRowSum(int[][] matrix,int row,int dimension){
        int sum_row = 0;
        for (int i = 0;i < dimension;i++){
            sum_row += matrix[row][i];
        }
        return sum_row;
    }
    public static int magicColSum(int[][] matrix,int col,int dimension){
        int sum_col = 0;
        for(int i = 0;i<dimension;i++){
            sum_col += matrix[i][col];
        }
        return sum_col;
    }
    public static void main(String args[]) throws IOException{
        BufferedReader kl = new BufferedReader(new InputStreamReader(System.in));
        int dimension ;
        System.out.print("Enter Dimension of matrix : ");
        dimension = Integer.parseInt(kl.readLine());
        int[][] matrix = new int[dimension][dimension];
        for (int i = 0;i < dimension;i++){
            for (int j = 0; j < dimension;j++){
                System.out.print("Enter value at dimension "+i+" "+j+" : ");
                matrix[i][j] = Integer.parseInt(kl.readLine());
            }
        }
        int posDiagSum = 0;
        int negDiagSum = 0;
        int j = dimension -1 ;
        for (int i = 0;i < dimension;i++){
            posDiagSum += matrix[i][i];
            negDiagSum += matrix[i][j];
            j -= 1; 
        }
        if (posDiagSum != negDiagSum){
            System.out.println("Given Matrix is not a magic matrix");
        }
        else{
            boolean flag = false;
            for (int i = 0;i < dimension;i++){
                int row = 0;
                int col = 0;
                row = magicRowSum(matrix,i,dimension);
                col = magicColSum(matrix,i,dimension);
                if (row != posDiagSum || col != negDiagSum){
                    flag = true;
                    break;
                }
            }
            if (flag){
                System.out.println("Given Matrix is not a magic matrix");
            }
            else{
                System.out.println("Given Matrix is a magic matrix");
            }
        }
    }
    
}
