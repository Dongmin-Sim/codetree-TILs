public class Main {
    private final static double FEET_TO_CENTIMETER = 30.48;
    private final static double MILE__TO_CENTIMETER = 160934;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        double a = 9.2;
        double b = 1.3;
        System.out.printf("%.1fft = %.1fcm\n", a, (a*FEET_TO_CENTIMETER));
        System.out.printf("%.1fmi = %.1fcm\n", b, (b*MILE__TO_CENTIMETER));
        
    }
}