public class TwoWheeler extends Vehicle{
    private int noOfSeats = 2;

    public TwoWheeler(){}
    
    public TwoWheeler(String registrationNumber, String carModel,double price,int mileage) {
        super(registrationNumber, carModel,price,mileage);
    }

    public void getInfo()
    {
        System.out.println(noOfSeats + " wheeler " + getVehicleModel() + " Details");
        super.getInfo();
    }
}
