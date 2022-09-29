package main.java;
import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double startLatitude;
        double startLongitude;
        double endLatitude;
        double endLongitude;

        System.out.println("Enter the latitude of the starting location: ");
        startLatitude = scanner.nextDouble();
        System.out.println("Enter the longitude of the starting location: ");
        startLongitude = scanner.nextDouble();
        System.out.println("Enter the latitude of the ending location: ");
        endLatitude = scanner.nextDouble();
        System.out.println("Enter the longitude of the ending location: ");
        endLongitude = scanner.nextDouble();



        scanner.close();




    }
}
