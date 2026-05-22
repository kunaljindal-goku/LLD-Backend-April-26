public class Builder {

    private String name;
    private double psp;
    private String batch;
    private int gradYear;
    private int mobNo;
    private String email;

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setPsp(double psp) {
        this.psp = psp;
        return this;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Builder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }

    public Builder setMobNo(int mobNo) {

        this.mobNo = mobNo;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getPsp() {
        return psp;
    }

    public String getBatch() {
        return batch;
    }

    public int getGradYear() {
        return gradYear;
    }

    public int getMobNo() {
        return mobNo;
    }

    public String getEmail() {
        return email;
    }
}
