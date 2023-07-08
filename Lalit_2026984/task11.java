import java.io.*;
public class task11 {
    public static void main(String args[]) throws IOException{
        BufferedReader kl = new BufferedReader( new InputStreamReader(System.in));
        int arrlength = 0;
        System.out.println("Enter length of array");
        arrlength = Integer.parseInt(kl.readLine());
        int arr[] = new int[arrlength];
        boolean odd = false;
        boolean even = false;
        for (int i = 0; i< arrlength;i++){
            System.out.print("Enter number : ");
            arr[i] = Integer.parseInt(kl.readLine());
            if (arr[i]%2 == 0){
                even = true;
            } 
            else{
                odd = true;
            }
        }
        if (odd && even){
            System.out.println("Array is Mixed");
        }
        else if (odd){
            System.out.println("Array is odd array");
        }
        else{
            System.out.println("Array is even array");
        }
    }
    
}
