public class Programmer extends Person {
    private String companyName;

    public void coding() {
        System.out.println(getName()+ " is coding");
    }

    public Programmer() {

    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                "name='" + getName()+ '\'' +
                ", designation='" + getDesignation() + '\'' +
                '}';
    }
}
