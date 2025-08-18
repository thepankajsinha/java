package methods;

public class varArgs {
    static int sum(int... numbers) {
        int total = 0;
        for(int n : numbers){
            total = total + n;
        };
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2,3));         // 6
        System.out.println(sum(10,20,30,40));   // 100
    }
}
