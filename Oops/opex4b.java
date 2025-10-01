package Oops;

import java.util.Scanner;

public class opex4b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        opex4a obj = new opex4a();
        System.out.println("How many hours the Worker doing his work: ");
        int hw = sc.nextInt();
        System.out.println("What is the per hour Salary:");
        double payRate = sc.nextDouble();
        obj.setData(hw,payRate);
        System.out.print("The total Salary Worker get (Bonus hour salary will be double of working hour salary):\n💰");
        System.out.println(obj.getSalary());
    }
}
