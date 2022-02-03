public class FourWheeler extends Vehicle{
    private int noOfSeats = 4;

    public FourWheeler(){}
    public FourWheeler(String registrationNumber, String carModel,double price,int mileage) {
        super(registrationNumber, carModel,price,mileage);
    }

    public void getInfo()
    {
        System.out.println(noOfSeats + " wheeler " + getVehicleModel());
        super.getInfo();
    }

}
