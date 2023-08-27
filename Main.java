import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void printBirthWise(ArrayList<Employee> employees,int Year){
        for (Employee e : employees) {
            if(e.getYear() == Year){
                System.out.println(e.toString());
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new FulltimeEmployee("Rahim", 01, 1999,6,22,23000));
        employees.add(new ParttimeEmployee("Karim", 07, 1988, 9,25,8,340));
        employees.add(new FulltimeEmployee("Jalil", 02,1986,8,8,65000));
        employees.add(new ParttimeEmployee("Abbas", 23, 1976, 2,24,7,270));
        employees.add(new ParttimeEmployee("Sahil", 21, 1998, 12,13,5,400));
        employees.add(new FulltimeEmployee("Monjim", 5,1997,8,8,50000));
        
        Collections.sort(employees);
        for (Employee e : employees) {
            System.out.println(e.toString()+"\nSalary:"+e.getSalaray());

            System.out.println();
        }
        System.out.println("Employee With birth Year: ");
        printBirthWise(employees,1999);
        


    }
}