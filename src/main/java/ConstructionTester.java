package main.java;
import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        double taxRate;
        double grandTotal;
        double totalPrice;
        int numBoards;
        int numWindows;

        System.out.println("Enter the sales tax rate: ");
        taxRate = scanner.nextDouble();
        System.out.println("How many boards do you need? ");
        numBoards = scanner.nextInt();
        System.out.println("How many windows do you need? ");
        numWindows = scanner.nextInt();

        Construction bghsPR3 = new Construction(8,11,taxRate);
        totalPrice = bghsPR3.lumberCost(numBoards) + bghsPR3.windowCost(numWindows);
        grandTotal = bghsPR3.grandTotal(totalPrice);
        System.out.println("Total: " + totalPrice);
        System.out.println("Total: " + grandTotal);

        scanner.close();


    }
}
