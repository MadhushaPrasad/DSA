public class Factorial {

    public static void main(String[] args) {

        System.out.println(funcFactorial(4));

    }


    public static int funcFactorial(int n){
        if(n==0) {
            return 1;
        } else{
            return (n * funcFactorial(n-1));
        }
    }
}
