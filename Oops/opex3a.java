package Oops;

public class opex3a {
    private double radius;
    public void setRadius(double r){
        radius = r;
    }
    public void area(){
        double area = Math.PI*Math.pow(radius,2);
        System.out.println(area);
    }
    public void para(){
        double para = 2*Math.PI*radius;
        System.out.println(para);
    }
}
