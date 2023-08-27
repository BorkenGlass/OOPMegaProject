public class ParttimeEmployee extends Employee{
    private int hours;
    private double hoursRate;
    
    
    public ParttimeEmployee(String name, int id, int year, int month, int day, int hours, double hoursRate) {
        super(name, id, year, month, day);
        this.hours = hours;
        this.hoursRate = hoursRate;
    }
    
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public double getHoursRate() {
        return hoursRate;
    }
    public void setHoursRate(double hoursRate) {
        this.hoursRate = hoursRate;
    }
    public double getSalaray(){
        return getHours()*getHoursRate();
    }

    @Override
    public String toString() {
        return "ParttimeEmployee:"+super.toString()+"\nhours=" + hours + "\nhoursRate=" + hoursRate;
    }
    
}
