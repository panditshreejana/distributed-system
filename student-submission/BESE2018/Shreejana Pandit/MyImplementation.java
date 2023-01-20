public class MyImplementation implements MyInterface{
    private double taxRate;
    public void printMsg(){
        System.out.print ("Hello Implement class");
    }
    public void calculateAreaOfcircle(double radius){
        final double PI=3.1415;
        System.out.println("The area of circle is:"+PI*radius*radius);
    }
    public void setTaxRate(double taxRate){
        this.taxRate=taxRate;
    }
    public void calculateTax(double amount){
        System.out.println("The tax amount is:"+amount*taxRate/100);
    }
    public void calculateVolumeOfRectangle(double length,double breath, double height){
        System.out.println("The volume of rectangle is:"+length*breath*height);
    }
}