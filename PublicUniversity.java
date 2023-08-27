public class PublicUniversity extends University{
    private int noOfHalls;
    private boolean politicsAllowed;
    
    public PublicUniversity(String name, String address, int year, int month, int day, int noOfDept, int noOfHalls,
            boolean politicsAllowed) {
        super(name, address, year, month, day, noOfDept);
        this.noOfHalls = noOfHalls;
        this.politicsAllowed = politicsAllowed;
    }
    public int getNoOfHalls() {
        return noOfHalls;
    }
    public void setNoOfHalls(int noOfHalls) {
        this.noOfHalls = noOfHalls;
    }
    public boolean isPoliticsAllowed() {
        return politicsAllowed;
    }
    public void setPoliticsAllowed(boolean politicsAllowed) {
        this.politicsAllowed = politicsAllowed;
    }
    @Override
    public String toString() {
        return "\nPublicUniversity"+super.toString()+"\nnoOfHalls=" + noOfHalls + "\npoliticsAllowed=" + politicsAllowed;
    }
    
}
