import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Patient> patients = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Name: ");
            String Name = input.nextLine();
            System.out.println("Age: ");
            int age = input.nextInt();
            System.out.println("Systolic Diastolic format: ");
            int systolic = input.nextInt();
            int diastolic = input.nextInt();
            System.out.println("Enter Diabetes Point: ");
            double dpoint = input.nextDouble();
            System.out.println("Adimission Date YYYY MM DD format: ");
            int Year = input.nextInt();
            int Month = input.nextInt();
            int Day = input.nextInt();
            System.out.println("Bed No: ");
            int bedNo = input.nextInt();
            System.out.println("Daily Fee: ");
            double Fee = input.nextDouble();
            input.nextLine();
            patients.add(new IndoorPatient(Name, age, systolic, diastolic, dpoint, Year, Month, Day, bedNo, Fee));
            System.out.println("OutDoor Patient: ");
            System.out.println("_________________");
            System.out.println("Name: ");
            String name = input.nextLine();
            System.out.println("Age: ");
            int Age = input.nextInt();
            System.out.println("Systolic Diastolic format: ");
            int Systolic = input.nextInt();
            int Diastolic = input.nextInt();
            System.out.println("Enter Diabetes Point: ");
            double Dpoint = input.nextDouble();
            input.nextLine();
            System.out.println("Specialty: ");
            String specialty = input.next();
            System.out.println("Daily Fee: ");
            double fee = input.nextDouble();
            patients.add(new OutDoorPatient(name, Age, Systolic, Diastolic, Dpoint, specialty, fee));
        }
        input.close();
        // patients.add(new OutDoorPatient("Alex", 50, 140, 90, 3, "Dermatology", 900));
        // patients.add(new IndoorPatient("Mendel", 43, 130, 85, 5.6, 2023,7,
        // 15,03,1400.0));
        // patients.add(new IndoorPatient("Ron", 23, 120, 85, 5.6, 2023,8,
        // 20,05,1400.0));
        // patients.add(new OutDoorPatient("Sophia", 25, 122, 78, 0, "ENT", 2400));

        // sort based on age
        Collections.sort(patients);

        for (Patient p : patients) {
            System.out.println(p.toString());
        }
        System.out.println("According to Blood Presure: ");
        for (Patient p : patients) {
            p.bloodPresure(p);

        }
        System.out.println("Bills: ");
        for (Patient p : patients) {
            System.out.println(p.toString());
            System.out.println(p.getInvoice());
        }

    }
}