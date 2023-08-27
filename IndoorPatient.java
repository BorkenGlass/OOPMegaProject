import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class IndoorPatient extends Patient {
    private LocalDate admissionDate;
    private int bedNo;
    private double dailyFee;
    public IndoorPatient(String name, int age, int systolic, int diastolic, double diabetesPoint,int year,int month,int day, int bedNo, double dailyFee) {
        super(name, age, systolic, diastolic, diabetesPoint);
        this.admissionDate = LocalDate.of(year,month,day);
        this.bedNo = bedNo;
        this.dailyFee = dailyFee;
    }
    public long dayDifference(){
        LocalDate dischargDate = LocalDate.now();
        return ChronoUnit.DAYS.between(admissionDate, dischargDate);
    }
    public int getBedNo() {
        return bedNo;
    }
    public void setBedNo(int bedNo) {
        this.bedNo = bedNo;
    }
    public double getDailyFee() {
        return dailyFee;
    }
    public void setDailyFee(double dailyFee) {
        this.dailyFee = dailyFee;
    }
    
    public double getInvoice(){
        return this.getDailyFee()*dayDifference();
    }
    @Override
    public String toString() {
        return "[IndoorPatient"+super.toString()+" admissionDate=" + admissionDate + ", bedNo=" + bedNo + ", dailyFee=" + dailyFee + "]";
    }
    
}
