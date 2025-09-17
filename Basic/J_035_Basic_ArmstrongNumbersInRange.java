public class J_035_Basic_ArmstrongNumbersInRange {
    public static void main(String[] args) {
        for (int i=1; i<=500; i++){ 
            int originalNumber = i, originalNumber2 = i, count = 0, sumValue = 0;

            while (i > 0){ 
                int digit = i % 10; 
                count++;
                i /= 10;
            }

            while (originalNumber > 0){
                int digit = originalNumber % 10;
                sumValue += Math.pow(digit, count);
                originalNumber /= 10;
            }
            i = originalNumber2;
            if (originalNumber2 == sumValue) { System.out.print(i + " "); }
        }
    }
}
