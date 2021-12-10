package session4.bai_tap.StopWatch;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime start = LocalTime.now();
        LocalTime end = LocalTime.now();
        StopWatch stopwatch = new StopWatch(start, end);
        System.out.println("Start: " + stopwatch.getStartTime());
        System.out.println("End: " + stopwatch.getEndTime());
        System.out.println("Time: " + stopwatch.getElapsedTime());
    }
}
