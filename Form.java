//class declaration
public class Form {
    //non-static members
    public String name;
    public String location;
    public double tenthpercent;
    public double interpercent;
    public double btechpercent;
    public double mtechpercent;
    //first constructor
    public Form(String name, String location, double tenthpercent) {
        this.name = name;
        this.location = location;
        this.tenthpercent = tenthpercent;
    }
    //second constructor
    public Form(String name, String location, double tenthpercent, double interpercent) {
        this(name, location, tenthpercent);
        this.interpercent = interpercent;
    }
    //third constructor
    public Form(String name, String location, double tenthpercent, double interpercent, double btechpercent) {
        this(name, location, tenthpercent, interpercent);
        this.btechpercent = btechpercent;
    }
    //fourth constructor
    public Form(String name, String location, double tenthpercent, double interpercent, double btechpercent, double mtechpercent) {
        this(name, location, tenthpercent, interpercent, btechpercent);
        this.mtechpercent = mtechpercent;
    }
    //display method
    public void DisplayDetails() {
        System.out.println(name, location, tenthpercent);
        System.out.println(name, location, tenthpercent, interpercent);
        System.out.println(name, location, tenthpercent, interpercent, btechpercent);
        System.out.println(name, location, tenthpercent, interpercent, btechpercent, mtechpercent);
    }
    //main method
    public static void main(String[] args) {
        Form form = new Form("jess", "hyd", 10.0, 9.0, 8.0, 7.0);
        form.DisplayDetails();
    }
}
