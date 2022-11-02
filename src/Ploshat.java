public class Ploshat {
    double a;
    double b;
    double c;

    void area() {
        double s = (a + b + c);
        double s1 = s / 2;
        double s2 = Math.sqrt(s1 * (s1 - a) * (s1 - b) * (s1 - c));
        System.out.println("Ploshad tri ugolnika: " + s2);
    }
}
