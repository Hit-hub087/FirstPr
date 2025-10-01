package Oops;

public class opex4a {
    private int hw;
    private double payRate;
    public void setData(int hw , double payRate){
        this.hw = hw;
        this.payRate = payRate;
    }
    public double getSalary(){
        double Salary;
        if (hw<= 40){
        Salary = (double) hw * payRate;
        }else {
            int exhw = hw - 40;
           Salary = ((double)exhw * payRate *2)+(40*payRate);
        }
        return Salary;
    }
}
