package school;

public class Calculator {

    private double num1;
    private double num2;







    public Calculator(double num1, double num2){
        this.num1=num1;
        this.num2=num2;
    }

    public void addNum() {
        System.out.println(num1 + num2);

    }

    public void subNum(){
        System.out.println(num1 - num2);
    }

    public void multNum(){
        System.out.println(num1 * num2);
    }

    public void divNum(){
        System.out.println(num1 / num2);
    }

    public void squNum(){
        System.out.println(num2 * num2);
    }

    public void rootNum (){
        System.out.println(Math.sqrt(num1));
    }

    public void expNum (){
        System.out.println(Math.pow(num2,num2));
    }
}
