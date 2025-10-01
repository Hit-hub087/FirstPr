package Oops;

import java.util.Scanner;

public class opex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no.");
        int r = sc.nextInt();
        System.out.println("Name is :");
        sc.nextLine();
        String n = sc.nextLine();
        System.out.println("Percentage gain :");
        double p = sc.nextDouble();
        opex1 os = new opex1();
        os.student(r,n,p);
    }
}
