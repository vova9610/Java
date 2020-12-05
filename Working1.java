package Lesson1;

public class Working1 {
    public static void main (String[] args) {
        int a = 101;
        int b = 194;
        int c = 14;
        int d = 59;
        System.out.println(work1 (a, b, c, d));
    }
    public static float work1 (float a, float b, float c, float d) {
        return a * (b + (c / d));

    }
}
