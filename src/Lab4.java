import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("반지름을 입력하시오: ");
        double radius = sc.nextDouble();
        System.out.println(radius * radius * Math.PI); //You can replace Math.PI into 3.14.
    }
}
