import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
    private String name;
    private int id;
    private LocalDate dateOfBirth;
    
    public Employee(String name, int id,int year,int month,int day) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = LocalDate.of(year, month, month);
    }
    public int getYear(){
        return dateOfBirth.getYear();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSalaray(){
        return 0;
    }
    @Override
    public String toString() {
        return "\nname=" + name + "\nid=" + id + "\ndateOfBirth=" + dateOfBirth;
    }
    @Override
    public int compareTo(Employee other) {
        if(this.getSalaray() < other.getSalaray()){
            return 1;
        }
        else{
            return -1;
        }
    }
    
    
}
