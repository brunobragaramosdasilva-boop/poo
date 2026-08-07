import java.util.ArrayList;
public class ParkingApp {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("ABC-1234", "Toyota", "Corolla"));
        vehicles.add(new Motorcycle("XYZ-5678", "Honda", "CG 160"));
        vehicles.add(new Truck("KLM-9090", "Volvo", "FH 540"));
        int hours = 4;
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle v = vehicles.get(i);
            System.out.println(v.toString());
            System.out.println("Valor a pagar por 4h: R$ " + String.format("%.2f", v.calculateParkingFee(hours)));
            System.out.println();
        }
    }
}