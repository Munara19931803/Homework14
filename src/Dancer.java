public class Dancer extends Person{
    private String groupName;
    public Dancer(){

    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }
    public void dancing(){
        System.out.println(getName()+" is dancing");
    }
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                "name='" + getName()+ '\'' +
                ", designation='" + getDesignation() + '\'' +
                '}';
    }
}
