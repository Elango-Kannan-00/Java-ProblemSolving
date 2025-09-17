public class J_095_Basic_NumbersDivisibleBy7 {
    public static void main(String[] args){
        for (int i=1; i<=500; i++) { if (i % 7 == 0) { System.out.print(i + " "); } }
    }

    // Another optimized version knowing that numbers were only the member of 7th table.
    // for (int i = 7; i <= 500; i += 7) {
    //         System.out.print(i + " ");
    //     }
}
