public class Singer extends Person{
    private String  bandName;
    public void singing(){
        System.out.println("Singer is singing");
    }
    public void playGuitar(){
        System.out.println("Singer is playGuitar ");
    }
    public Singer(){

    }

    public Singer(String bandName) {
        this.bandName = bandName;
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                "name='" + getName()+ '\'' +
                ", designation='" + getDesignation() + '\'' +
                '}';
    }
}
