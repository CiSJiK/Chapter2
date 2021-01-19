public class Lab3 {
    //Note: I didn't read the challenge which contains about this code.
    //The challenge is "Calculate the root with var a by changing the code."

    public static void main(String[] args)
    {
        //I will give the example as
        double a=1, b=-3, c=2;

        //P.S: Math.sqrt method will not work if the double type number in parameter is negative or zero.
        //Instead, it will return NaN.
        double sqrt = ( b * b ) - ( 4 * a * c );
        double r1 = ( -b + Math.sqrt(sqrt) ) / ( 2 * a );
        double r2 = ( -b - Math.sqrt(sqrt) ) / ( 2 * a );
        System.out.println("Root is " + r1);
        System.out.println("Root is " + r2);
    }
}
