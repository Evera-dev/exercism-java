import java.util.Arrays;
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        birdsPerDay[6] = birdsPerDay[6]+ 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int bird : birdsPerDay){
            if (bird ==0) {
                return bird ==0;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        return Arrays.stream(birdsPerDay)
                     .limit(numberOfDays)
                     .sum();
    }


    public int getBusyDays() {
        int totalBusyDays = 0;
        for (int i = 0 ; i < birdsPerDay.length ; i++){
            if (birdsPerDay[i] >= 5){
                totalBusyDays++;
            }
        }
        return totalBusyDays;
    }
}
