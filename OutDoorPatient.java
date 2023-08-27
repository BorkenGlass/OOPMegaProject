public class OutDoorPatient extends Patient{
    
    
    
    private String specialty;
    private double consultationFee;

    // constructior
    public OutDoorPatient(String name, int age, int systolic, int diastolic,double diabetesPoint, String specialty,double consultationFee)
     {
        super(name, age, systolic, diastolic, diabetesPoint);
        this.specialty = specialty;
        this.consultationFee = consultationFee;
    }

    // getter and setter method
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }
    public double getInvoice(){
        return this.getConsultationFee();
    }

    @Override
    public String toString() {
        return "[OutDoorPatient"+super.toString()+"[specialty=" + specialty + ", consultationFee=" + consultationFee + "]";
    }
    
}
