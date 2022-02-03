public class VehicleManagement {
    public static void main(String arg[])
    {
        FourWheeler car1= new FourWheeler("MH21P2321","Audi",10,30);
        car1.getInfo();

        TwoWheeler bike1= new TwoWheeler();
        bike1.setRegNo("MH20C5421").setModel("Kawasaki Ninja").setMileage(30).setPrice(7.8).setColor("Green");
        bike1.getInfo();

        Vehicle bike2= new TwoWheeler("MH20C5421","Duke",5,18);
        bike2.getInfo();

    }
}
