public class MyNumber {
    private int number;
    public MyNumber(int number) {
        this.number = number;
    }

    public Boolean isPrime() {
        // check if a number is divisible by 2
        for(int i = 2; i<= number -1; i++){
            if (number % i == 0){
                return false;

            }
        }

        return true;

    }
}
