public class J_037_Basic_PerfectNumbersInRange {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            int sumValue = 0;
            for (int j=1; j<i; j++){
                if (i % j == 0){
                    sumValue += j;
                }
            }
            if(sumValue == i){ System.out.print(i + " "); }
        }
    }    
}
