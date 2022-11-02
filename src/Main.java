import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ploshat ploshat = new Ploshat();
        Scanner scanner=new Scanner(System.in);
        System.out.print("a = ");
        ploshat.a = scanner.nextInt();
        System.out.print("b = ");
        ploshat.b = scanner.nextInt();
        System.out.print("c = ");
        ploshat.c = scanner.nextInt();
        ploshat.area();
    }
}