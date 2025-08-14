public class JedliksToyCar {
    int distanceDriven = 0;
    int percentage = 100;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        return percentage > 0 ? "Battery at " + percentage + "%" : "Battery empty";
    }

    public void drive() {
        if (percentage > 0) {
            distanceDriven += 20;
            percentage -= 1;
        }
    }
}
