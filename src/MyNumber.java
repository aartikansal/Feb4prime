public class MyNumber {
    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public Boolean isPrime() {
        // check if a number is divisible by 2
        //add guard condition
        if (number < 2) {
            return false;

        }
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;

            }
        }

        return true;

    }

    public int sumUptoN() {
        //1+2+3 ...+number)
        int sum = 0;
        for (int i=1; i<= number; i++){
            sum= sum+i;
        }
        return sum;
    }
}
