public class Guitar {
    private String type;
    private String manufacturer;
    private String model;
    private String pickupsType = "Has no pickups";
    private double price;
    private static double priceSum = 0;

    public Guitar() {
        type = "Electric";
        manufacturer = "Fender";
        model = "American Original '60s Jaguar";
        pickupsType = "Single-coils";
        price = 2099.99;
        priceSum += price;
    }

    public Guitar(String type, String manufacturer, String model, double price) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        priceSum += price;

    }

    public Guitar(String type, String manufacturer, String model, double price, String pickupsType) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.pickupsType = pickupsType;
        this.price = price;
        priceSum += price;
    }

    public void printSum() {
        System.out.println("Total value of all guitars: " + priceSum + "$");
    }

    public static void printStaticSum() {
        System.out.println("Total value of all guitars: " + priceSum + "$");
    }

    public void printToString() {
        System.out.println("Type: " + type + ";");
        System.out.println("Manufacturer: " + manufacturer + ";");
        System.out.println("Model: " + model + ";");
        System.out.println("Type of pickups: " + pickupsType + ";");
        System.out.println("Price: " + price + "$");
        System.out.println();
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setPickupsType(String pickupsType) {
        this.pickupsType = pickupsType;
    }

    public String getPickupsType() {
        return pickupsType;
    }

    public void setPrice(double price) {
        priceSum -= price;
        this.price = price;
        priceSum += price;

    }

    public double getPrice() {
        return price;
    }

    public void resetValues(String type, String manufacturer, String model, double price, String pickupsType) {
        priceSum -= price;
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.pickupsType = pickupsType;
        this.price = price;
        priceSum += price;
    }

    public static void main(String[] args) {
        Guitar jaguar = new Guitar();
        Guitar j45 = new Guitar("Acoustic", "Epiphone", "Ltd. Ed. 1963 J-45", 370);
        Guitar lesPaul = new Guitar("Electric", "Gibson", "Les Paul Custom Axcess Stopbar", 5199.99, "Humbuckers");

        Guitar.printStaticSum();

        j45.printToString();
        jaguar.printToString();
        lesPaul.printToString();

        jaguar.printSum();

    }
}
