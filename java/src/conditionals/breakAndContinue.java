package conditionals;

public class breakAndContinue {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            if(i == 3) continue; // skips 3
            if(i == 5) break;    // stops loop at 5
            System.out.println(i);
        }
    }
}
//1
//2
//4