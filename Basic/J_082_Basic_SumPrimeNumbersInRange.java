public class J_082_Basic_SumPrimeNumbersInRange {
    public static void main(String[] args) {
        int count = 0, sumValue = 0;

        for (int i=2; i<=1000; i++){
            count = 0;
            for (int j=2; j<= Math.sqrt(i); j++){
                if (i % j == 0) { count++; }
            }
            if (count == 0) { sumValue += i; }
        }
        System.out.println(sumValue);
    }
}
