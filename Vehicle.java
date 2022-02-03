public class Vehicle {
    private String registrationNumber = "";
    private String model = "";
    private double mileage = 0.0;
    private double price;
    private String color="";

    public Vehicle(){}

    public Vehicle(String registrationNumber, String model,double price, double mileage) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.price = price;
        this.mileage = mileage;
    }
    public String getVehicleModel()
    {
        return model;
    }
    public Vehicle setColor(String color){
        this.color += color + " ";
        return this;
    }
    public Vehicle setModel(String model){
        this.model = model;  
        return this;  
    }
    public Vehicle setRegNo(String registrationNumber){
        this.registrationNumber = registrationNumber;  
        return this;  
    }
    public Vehicle setPrice(double price){
        this.price = price;  
        return this;  
    }
    public Vehicle setMileage(double mileage){
        this.mileage = mileage;  
        return this;  
    }
    public void getInfo()
    {
        System.out.println("Registration no: "+registrationNumber);
        System.out.println("Model no: "+model);
        System.out.println("Mileage: "+mileage);
        if(this.color != "")
            System.out.println("Colours Available: " + color);
        System.out.println("Price(lakhs): "+price);
        System.out.println();
    }
}
