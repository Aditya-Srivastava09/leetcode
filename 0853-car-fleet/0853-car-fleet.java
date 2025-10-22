import java.util.*;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if (n == 0) return 0;

        double[][] cars = new double[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }

        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        int fleets = 0;
        double currTime = 0.0;

        for (int i = 0; i < n; i++) {
            double time = cars[i][1];
            if (time > currTime) {
                fleets++;
                currTime = time;
            }
        }

        return fleets;
    }
}
