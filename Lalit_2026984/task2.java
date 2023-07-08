import java.io.*;
public class task2
{
    BufferedReader buff=new BufferedReader( new InputStreamReader(System.in));
    public void input() throws IOException
    {
        int monday,tuesday,wednesday,thursday,friday,saturday,sunday;
        int salary = 0;
        int workingHour = 0;
        System.out.println("Enter the working hours of Monday : ");
        monday=Integer.parseInt(buff.readLine());
        workingHour += monday;
        if (monday > 8){
            salary += (monday - 8)*50;
        }
        salary += monday * 100;
        System.out.println("Enter the working hours of Tuesday : ");
        tuesday=Integer.parseInt(buff.readLine());
        workingHour += tuesday;
        if (tuesday > 8){
            salary += (tuesday - 8)*50;
        }
        salary += tuesday * 100;
        System.out.println("Enter the working hours of Wednesday : ");
        wednesday=Integer.parseInt(buff.readLine());
        workingHour += wednesday;
        if (wednesday > 8){
            salary += (wednesday - 8)*50;
        }
        salary += wednesday * 100;
        System.out.println("Enter the working hours of Thursday : ");
        thursday=Integer.parseInt(buff.readLine());
        workingHour += thursday;
        if (thursday > 8){
            salary += (thursday - 8)*50;
        }
        salary += thursday * 100;
        System.out.println("Enter the working hours of Friday : ");
        friday=Integer.parseInt(buff.readLine());
        workingHour += friday;
        if (friday > 8){
            salary += (friday - 8)*50;
        }
        if (workingHour > 40 ){
            salary += 25 * (workingHour - 40);
        }
        salary += friday * 100;
        System.out.println("Enter the working hours of Saturday : ");
        saturday=Integer.parseInt(buff.readLine());
        workingHour += saturday;
        salary += 150*saturday;
        System.out.println("Enter the working hours of Sunday : ");
        sunday=Integer.parseInt(buff.readLine());
        workingHour += sunday;
        salary += 200*sunday;
        System.out.println("Total salary of Rupa in this week is : "+salary);
    }
    public static void main(String args[]) throws IOException
    {
        task2 obj =new task2();
        obj.input();
     }
}