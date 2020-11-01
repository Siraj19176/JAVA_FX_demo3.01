package sample;

public class Model {

    public float calculate(long number , long number2, String op){
        switch (op){
            case "+":
                return number+number2;
            case "-":
                return number-number2;
            case "*":
                System.out.print("git testing");
                return number*number2;
            default:return 0;


        }
    }
}
