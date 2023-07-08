import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class task4 {
    int purchaseAmount;
    BufferedReader buff=new BufferedReader( new InputStreamReader(System.in));
    public int welcomeOffer(int purchase){
        if (purchase > 5000){
            return 3000;
        }
        if (purchase > 3000){
            return 1500;
        }
        if (purchase > 1000){
            return 500;
        }
        return 100;
    }
    public void customerPurchase() throws IOException{
        int numberofCustomers = 0;
        System.out.println("Enter Total number of Customer : ");
        numberofCustomers = Integer.parseInt(buff.readLine());
        for (int i = 0;i<numberofCustomers;i++){
            System.out.println("Enter the Purchase value");
            purchaseAmount=Integer.parseInt(buff.readLine());
            System.out.println("Welcome offer provided by our company to you is : "+(welcomeOffer(purchaseAmount)));
        }
    }
    public static void main(String args[]) throws IOException{
        task4 obj = new task4();
        obj.customerPurchase();
    }
    
}

