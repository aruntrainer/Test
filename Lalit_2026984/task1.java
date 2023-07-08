import java.io.*;
public class task1 {
    BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
    public void countHiFi(){
        int HiFi = 0;
        int noHiFi = 0;
        for(int i = 1;i <= 100; i++){
            if (i % 5 == 0){
                System.out.println(i+" : HiFi");
                HiFi++ ;
            }
            else{
                System.out.println(i+" : No HiFi");
                noHiFi++ ;
            }
        }
        System.out.println("Total HiFi's are : "+HiFi);
        System.out.println("Total numbers that are not HiFi are : "+noHiFi);
    }
    public static void main(String args[])
    {
        task1 obj=new task1();
        obj.countHiFi();
     }
}
