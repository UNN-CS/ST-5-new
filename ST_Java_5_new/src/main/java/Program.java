public class Program {
    public static void main(String[] args){
        double val = Double.parseDouble("4.0");
        Sqrt sqrt = new Sqrt(val);
        double result = sqrt.calc();
        System.out.println("Sqrt of " + val + " = " + result);
    }
}
