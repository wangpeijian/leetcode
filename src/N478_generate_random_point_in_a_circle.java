import java.util.Random;

/**
 * @author wangpejian
 * @date 19-8-2 上午9:28
 */
public class N478_generate_random_point_in_a_circle {

    public static void main(String[] args) {

        Solution s = new Solution(10, 0, 0);
        s.randPoint();

    }

    static class Solution {

        private double radius;
        private double rr;
        private double x_center;
        private double y_center;

        private Random ran = new Random();

        public Solution(double radius, double x_center, double y_center) {
            this.radius = radius;
            this.rr = radius * radius;
            this.x_center = x_center;
            this.y_center = y_center;
        }

        public double[] randPoint() {

            while (true) {
                double x = ran.nextDouble() * this.radius * (ran.nextDouble() > 0.5 ? -1 : 1);
                double y = ran.nextDouble() * this.radius * (ran.nextDouble() > 0.5 ? -1 : 1);

                if (y * y + x * x <= rr) {
                    return new double[]{this.x_center + x, this.y_center + y};
                }
            }
        }
    }
}


