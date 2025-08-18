import java.math.*;

public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double minProductPerHour = 221.0;
        if (speed >= 0 && speed <= 4) {
            return speed * minProductPerHour;
        }
        else if (speed > 4 && speed <= 8) {
            return (speed * minProductPerHour) * 0.9;
        }
        else if (speed == 9) {
            return (speed * minProductPerHour) * 0.8;
        }
        else if (speed == 10) {
            return (speed * minProductPerHour) * 0.77;
        }
        return 0.0;
    }

    public int workingItemsPerMinute(int speed) {
        return Math.floorDiv((int) productionRatePerHour(speed), 60);
    }
}
