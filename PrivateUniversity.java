public class PrivateUniversity extends University {
    private boolean ugcApproved;
    private int noOfTrustyMember;
    public PrivateUniversity(String name, String address, int year, int month, int day, int noOfDept,
            boolean ugcApproved, int noOfTrustyMember) {
        super(name, address, year, month, day, noOfDept);
        this.ugcApproved = ugcApproved;
        this.noOfTrustyMember = noOfTrustyMember;
    }
    public boolean isUgcApproved() {
        return ugcApproved;
    }
    public void setUgcApproved(boolean ugcApproved) {
        this.ugcApproved = ugcApproved;
    }
    public int getNoOfTrustyMember() {
        return noOfTrustyMember;
    }
    public void setNoOfTrustyMember(int noOfTrustyMember) {
        this.noOfTrustyMember = noOfTrustyMember;
    }
    @Override
    public String toString() {
        return "\nPrivateUniversity"+super.toString()+"\nugcApproved=" + ugcApproved + "\nnoOfTrustyMember=" + noOfTrustyMember;
    }
    
}
