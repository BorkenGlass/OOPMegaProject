import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void printByAddress(ArrayList<University>universities,String Address){
        for (University u: universities) {
            if(u.getAddress()==Address){
                System.out.println(u.getName());
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<University> universities = new ArrayList<>();

        //use for testing the code:
        universities.add(new PublicUniversity("University of Dhaka","Dhaka,Bangladesh", 1921, 03, 14, 32, 21, true));
        universities.add(new PrivateUniversity("UIU", "Satarkul,Dhaka", 2002, 01, 11, 5, true, 25));
        universities.add(new PublicUniversity("University of Chittagong","Chittagong,Bangladesh", 1988, 02, 11, 12, 18, true));
        universities.add(new PublicUniversity("University of Khulna","Khulna,Bangladesh", 1997, 9, 14,10, 13, false));
        universities.add(new PrivateUniversity("AIUB", "Kuril,Dhaka", 1998, 04, 12, 7, true, 25));
        universities.add(new PrivateUniversity("South East", "Tejgoan,Dhaka", 2004, 03, 21, 3, false, 5));
        

        Collections.sort(universities);
        for (University u : universities) {
            System.out.println(u.toString());
            if(u.isUgcApproved){
                System.out.println(u.toString());
            }
        }
        System.out.println("\nUGC Approved University List: ");
        for (University u : universities) {
            if(u.isUgcApproved()){
                System.out.println(u.getName());
            }
        }
        System.out.println("\nUniversity Without Politics: ");
        for (University u : universities) {
            if(!(u.isPoliticsAllowed())){
                System.out.println(u.getName());
            }
        }
        System.out.println("\nUniversity By Address: ");
        printByAddress(universities, "Satarkul,Dhaka");

    }
}