import java.util.HashMap;
import java.util.Map;

public class ParkingSystem {
        int s = 0;
        int m = 0;
        int l = 0;
        Map<String, String> parkingLot = new HashMap<String, String>();
        public ParkingSystem(int big, int medium, int small) {
            this.s = big;
            this.m = medium;
            this.l = small;
        }

        public boolean addCar(int carType) {
            int lenght = parkingLot.size();

            System.out.println("PARKING LOT SIZE: " + lenght);
            return false;
        }

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */

}