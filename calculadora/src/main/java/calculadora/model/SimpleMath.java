package calculadora.model;

public class SimpleMath {
    public Double sum(Double num1, Double num2){
        return num1 + num2;
    }
    public Double sub(Double num1, Double num2){
        return num1 - num2;
    }
    public Double div(Double num1, Double num2){
        return num1 / num2;
    }
    public Double mult(Double num1, Double num2){
        return num1 * num2;
    }
    public Double mean(Double num1, Double num2){
        return (num1 + num2)/ 2;
    }
}
