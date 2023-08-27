public class Patient implements Comparable<Patient> {
    private String name;
    private int age;
    private int systolic;
    private int diastolic;
    private double diabetesPoint;

    public Patient(String name, int age, int systolic, int diastolic, double diabetesPoint) {
        this.name = name;
        this.age = age;
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.diabetesPoint = diabetesPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSystolic() {
        return systolic;
    }

    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }

    public double getDiabetesPoint() {
        return diabetesPoint;
    }

    public void setDiabetesPoint(double diabetesPoint) {
        this.diabetesPoint = diabetesPoint;
    }

    @Override
    public int compareTo(Patient other) {
        
        if(this.age>other.age){
            return 1;
        }
        else
            return -1;

        
    }
    public void bloodPresure(Patient p){
        if(p.systolic>120 && p.diastolic < 80){
            System.out.println(p.toString());
        }
        
    }

    @Override
    public String toString() {
        return "name=" + name + ", age=" + age + ", systolic=" + systolic + ", diastolic=" + diastolic
                + ", diabetesPoint=" + diabetesPoint;
    }

    public double getInvoice() {
        return 0;
    }
    
    
}
