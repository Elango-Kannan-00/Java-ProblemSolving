public class J_012_Basic_NumbersDivisibleByFive {
    public static void main(String[] args) {
       int divisor = 5;

       for (int i=1; i<=100; i++){
        if (i % divisor == 0){
            System.out.print(i + " ");
        }
       }
    }
}
