public class MyNumberRunner {
    public static void main(String[] args) {
 MyNumber number = new MyNumber(6);
 Boolean isPrime = number.isPrime();
 System.out.println("isPrime " + isPrime);

 int sum = number.sumUptoN();
 System.out.println("sum"  + sum);

    }
}
