import java.io.*;
public class task7 {
    public static void main(String args[]) throws IOException{
        BufferedReader kl = new BufferedReader( new InputStreamReader(System.in));
        String M = "";
        System.out.println("Enter String M : ");
        M = kl.readLine();
        String N = "";
        int numberofStrings = 0;
        System.out.println("Enter number of strings you want to enter : ");
        numberofStrings = Integer.parseInt(kl.readLine());
        for (int i = 0; i < numberofStrings;i++){
            System.out.println("Enter String N : ");
            N = kl.readLine();
            if (M.contains(N)){
                System.out.println("Y");
            }
            else{
                System.out.println("N");
            }
        }
    }
}
