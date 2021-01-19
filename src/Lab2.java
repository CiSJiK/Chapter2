public class Lab2 {

    public static final double LIGHT_SPEED_PER_SECOND = 30e4;

    //Challenge: Voyager 1, the spaceship made by the human, approximately has 60K kilo meter per hour.
    //Calculate the reach time by Voyager 1.
    public static final double VOYAGER_1_SPEED_PER_HOUR = 60e4;

    public static void main(String[] args)
    {
        double distance = 40e12;
        double result = distance/LIGHT_SPEED_PER_SECOND*60*60*24*365;
        System.out.println("걸리는 시간은 "+result+" 광년입니다.");

        //Challenge start line
        double voyager1Result = distance / VOYAGER_1_SPEED_PER_HOUR*24*365;
        System.out.println("걸리는 시간은 " + voyager1Result + "년입니다.");
    }
}
