public class J_021_Basic_PrimeNumbersInRange{
    public static void main(String[] args) {
        int count = 0;

        for (int i=2; i<=100; i++){
            count = 0;
            for (int j=2; j<= Math.sqrt(i); j++){
                if (i % j == 0) { count++; }
            }
            if (count == 0) { System.out.print(i + " "); }
        }
    }
}
