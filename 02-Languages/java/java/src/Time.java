public class Time {
    private int hour, minute, second;

    public Time(int hour, int minute, int second) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59)
            throw new IllegalArgumentException("Invalid time values");
        this.hour = hour; this.minute = minute; this.second = second;
    }

    public void incrementSecond() {
        if (++second == 60 && (second = 0) == 0 && ++minute == 60 && (minute = 0) == 0 && ++hour == 24)
            hour = 0;
    }

    @Override
    public String toString() {
        return String.format("%03d:%03d:%03d", hour, minute, second);
    }

    public static void main(String[] args) {

        Time time = new Time(23, 59, 59);
        //System.out.println(time.toString());
        System.out.println("Initial time: " + time);
        time.incrementSecond();
        System.out.println("Time after incrementing one second: " + time);
    }
}