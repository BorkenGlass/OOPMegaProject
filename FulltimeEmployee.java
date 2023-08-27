public class FulltimeEmployee extends Employee {
    private double monthlySalary;

    public FulltimeEmployee(String name, int id, int year, int month, int day, double monthlySalary) {
        super(name, id, year, month, day);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    public double getSalaray(){
        return getMonthlySalary();
    }

    @Override
    public String toString() {
        return "FulltimeEmployee:"+super.toString()+"\nmonthlySalary=" + monthlySalary;
    }
    
}
