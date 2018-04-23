public class Guitar {
    private String Type;
    private String Manufacturer;
    private String Model;
    private String PickupsType = "Has no pickups";
    private double Price;
    private static double PriceSum = 0;

    public Guitar() {
        Type = "Electric";
        Manufacturer = "Fender";
        Model = "American Original '60s Jaguar";
        PickupsType = "Single-coils";
        Price = 2099.99;
        PriceSum += Price;
    }

    public Guitar(String Type, String Manufacturer, String Model, double Price) {
        this.Type = Type;
        this.Manufacturer = Manufacturer;
        this.Model = Model;
        this.Price = Price;
        PriceSum += Price;

    }

    public Guitar(String Type, String Manufacturer, String Model, double Price, String PickupsType) {
        this.Type = Type;
        this.Manufacturer = Manufacturer;
        this.Model = Model;
        this.PickupsType = PickupsType;
        this.Price = Price;
        PriceSum += Price;
    }

    public void printSum() {
        System.out.println("Total value of all guitars: " + PriceSum + "$");
    }

    public static void printStaticSum() {
        System.out.println("Total value of all guitars: " + PriceSum + "$");
    }

    public void printToString() {
        System.out.println("Type: " + Type + ";");
        System.out.println("Manufacturer: " + Manufacturer + ";");
        System.out.println("Model: " + Model + ";");
        System.out.println("Type of pickups: " + PickupsType + ";");
        System.out.println("Price: " + Price + "$");
        System.out.println();
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getType() {
        return Type;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getModel() {
        return Model;
    }

    public void setPickupsType(String PickupsType) {
        this.PickupsType = PickupsType;
    }

    public String getPickupsType() {
        return PickupsType;
    }

    public void setPrice(double Price) {
        PriceSum -= Price;
        this.Price = Price;
        PriceSum += Price;

    }

    public double getPrice() {
        return Price;
    }

    public void resetValues(String Type, String Manufacturer, String Model, double Price, String PickupsType) {
        PriceSum -= Price;
        this.Type = Type;
        this.Manufacturer = Manufacturer;
        this.Model = Model;
        this.PickupsType = PickupsType;
        this.Price = Price;
        PriceSum += Price;
    }

    public static void main(String[] args) {
        Guitar Jaguar = new Guitar();
        Guitar J45 = new Guitar("Acoustic", "Epiphone", "Ltd. Ed. 1963 J-45", 370);
        Guitar LesPaul = new Guitar("Electric", "Gibson", "Les Paul Custom Axcess Stopbar", 5199.99, "Humbuckers");

        Guitar.printStaticSum();

        J45.printToString();
        Jaguar.printToString();
        LesPaul.printToString();

        Jaguar.printSum();

    }
}
