import java.io.*;

public class q4{
    public static void main(String args[]) throws IOException{
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String M = "";
        System.out.println("Enter a string :");
        M = buff.readLine();
        String N = "";
        int numberofStrings = 0;
        System.out.println("Enter number of strings you want to enter : ");
        numberofStrings = Integer.parseInt(buff.readLine());
        for(int i=0;i<numberofStrings;i++){
            System.out.println("Enter a string N :");
            N = buff.readLine();
            if(M.contains(N)){
                System.out.println("Y");
            }else{
                System.out.println("N");                
            }
        }
    }
}