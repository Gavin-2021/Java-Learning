public class Average {
    public static void main(String[] args) {
        double a = 5.5;
        double b = 10.5;
        double avg = average(a,b);
        System.out.println(avg);
    }

    public static double average(double a, double b) {
        return (a + b) / 2;
    }
}
