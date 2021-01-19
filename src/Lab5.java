import java.util.Scanner;

public class Lab5 {
    /*
    Challenges
    1. If class name change into Rectangle, what will happen?
    Answer: Not compilable cause of File name and public class name is not matched.
    2. Edit the code to call println() once to print the area and perimeter at same time.
    3. Experiment the difference between println() and print().
    Answer: println() means "print line". So it will print those parameters and print "\n" in end of the parameter.
    print() means "print", just print those parameters and done.
    Thus, the difference between println() and print() is adding "\n" in end of the parameter.
    */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type width of rectangle: ");
        double width = sc.nextDouble();
        System.out.print("Type height of rectangle: ");
        double height = sc.nextDouble();

        System.out.println("The area of rectangle is " + width * height);
        System.out.println("The perimeter of rectangle is " + 2 * (width + height));
        /*
        *** Same result / Answer of number 2 ***
        System.out.println("The area of rectangle is " + (width * height) +
        "\nThe perimeter of rectangle is " + (2 * (width+height)) );
        */

    }
}
