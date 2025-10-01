package Oops;

import java.util.Scanner;

public class opex3b {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("What is the radius :");
        double r = kb.nextDouble();
        opex3a obj = new opex3a();
        obj.setRadius(r);
        System.out.println("What you want to calculate (Area/Circumference):");
        kb.nextLine();
        String desire = kb.next();
        if(desire.equalsIgnoreCase("Area")){
            obj.area();
        } else if (desire.equalsIgnoreCase("Circumference")) {
            obj.para();
        }else {
            System.out.println("Wrong");
        }
    }
}
