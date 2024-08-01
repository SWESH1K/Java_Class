public class Prime_Number {
    public static void main(String[] args) {
        int end = 19;

        System.out.println("The prime numbers less than " + end + " are:");
        for(int i=2; i<=end; i++) {
            boolean isPrime = true;
            for(int j=2; j<Math.sqrt(i); j++) {
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true) {
                System.out.print(i + " ");
            }
        }
    }
}
