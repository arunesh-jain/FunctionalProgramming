package FuncProgramming.OCP;

public class OCPMain {
    public static void main(String[] args) throws Exception {
        Calculator cal = new Calculator();
        Addition add = new Addition(25,12);
        Subtraction sub = new Subtraction(56,26);
        Multiplication mul = new Multiplication(12,5);

        cal.calculate(add);
        double addResult=add.perform();
        System.out.println("Addition of both number is:  "+addResult);

        cal.calculate(sub);
        double subResult=sub.perform();
        System.out.println("Subtraction of both number is:  "+subResult);

        cal.calculate(mul);
        double mulResult=mul.perform();
        System.out.println("Multiplication of both number is:  "+mulResult);
    }
}
