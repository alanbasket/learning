public class Class1 {
    public static void main(String[] args) {
        drawisMonitorsCounter(12,5);
    }
    public static void drawisMonitorsCounter(int monitors, int programmers) {
        int g = monitors % programmers;
        System.out.println(g);
    }
}
