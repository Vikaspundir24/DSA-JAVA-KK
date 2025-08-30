public class PrimeNumbers {
    public static void main(String[] args) {
        //Prime numbers less than 40
       BruteForce(40);
      // optimisedApproach(40);
    }
    static void BruteForce(int n){
        for (int i = 2; i< n; i++){
            boolean isPrime = true;
            for (int j = 2; j < i; j++){
                if (i%j == 0){
                    isPrime  = false;
                    break;
                }

            }
            if (isPrime){
                System.out.print(i + " ");
            }

        }
    }



}