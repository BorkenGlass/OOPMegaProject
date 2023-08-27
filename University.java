import java.time.LocalDate;

public class University implements Comparable<University>{
    private String name;
    private String address;
    private LocalDate dateEstablished;
    private int noOfDept;
    public boolean isUgcApproved;
    public boolean isPoliticsAllowed;
    public University(String name, String address, int year ,int month , int day, int noOfDept) {
        this.name = name;
        this.address = address;
        this.dateEstablished = LocalDate.of(year, month, month);
        this.noOfDept = noOfDept;
    }
    public int getYear(){
        return dateEstablished.getYear();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public LocalDate getDateEstablished() {
        return dateEstablished;
    }
    public void setDateEstablished(LocalDate dateEstablished) {
        this.dateEstablished = dateEstablished;
    }
    public int getNoOfDept() {
        return noOfDept;
    }
    public void setNoOfDept(int noOfDept) {
        this.noOfDept = noOfDept;
    }

    @Override
    public int compareTo(University other) {
        if(this.getYear() > other.getYear()){
            return 1;
        }
        else{
            return -1;
        }
    }
    @Override
    public String toString() {
        return "\nname=" + name + "\naddress=" + address + "\ndateEstablished=" + dateEstablished
                + "\nnoOfDept=" + noOfDept;
    }
    public boolean isUgcApproved() {
        return false;
    }
    public boolean isPoliticsAllowed() {
        return false;
    }
    
    
}
