import java.util.Scanner.*;
class q2{
    public int password,password1=0;
    public static void generatePassword(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new password :");
        password = sc.nextInt();
        System.out.println("Confirm password :");
        password1 = sc.nextInt();
    }
    public static void main(String args[]){
        generatePassword();
        if(password==password1){
        System.out.println("Your password is reset successfully!");
        }else{
            generatePassword();
        }
    }
}