import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class task3 {
    int salary,experience;
    BufferedReader buff=new BufferedReader( new InputStreamReader(System.in));
    public float totalBonus(int salary,int experience){
        float bonus = 0;
        if (experience > 10 && experience < 15){
            bonus = salary / 2;
        }
        else if (experience > 15 && experience < 20){
            bonus = (salary / 4)*3 ;
        }
        else if (experience > 20){
            bonus = (float)salary;
        }
        return bonus;
    } 
    public void employeeInput() throws IOException{
        int employee = 0;
        System.out.println("Enter Total number of employees : ");
        employee = Integer.parseInt(buff.readLine());
        for (int i = 0;i<employee;i++){
            System.out.println("Enter the Salary in Rupees");
            salary=Integer.parseInt(buff.readLine());
            System.out.println("Enter the Experience in years");
            experience=Integer.parseInt(buff.readLine());
            System.out.println("Salary of Employee Acoording to its experience is : "+(totalBonus(salary,experience)+salary));
        }
    }
    public static void main(String args[]) throws IOException{
        task3 obj = new task3();
        obj.employeeInput();
    }
    
}
