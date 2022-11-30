package FibonacciAssignment;

public class Fibonacci {

    public static int recursivoCalc(int n) {
        if (n <= 1) {
            return n;
        } else
            return recursivoCalc(n - 1) + recursivoCalc(n - 2);
    }

    public static int iterativoCalc(int n) {
        int secondNum = 1;
        int firstNum = 1;


        if (n <= 1) {
            return n;
        }

        for (int i = 2; i < n; i++) {
            int tempNum = secondNum;
            secondNum += firstNum;
            firstNum = tempNum;
        }
        return secondNum;

    }

    public static void main(String[] args) {

        long TempoInicial = System.nanoTime();
        long TempoFinal = System.nanoTime();
        double total = 0;

        System.out.println("Para o codigo Recursivo : ");

        for(int i = 0; i < 20; i++) {
            TempoInicial = System.nanoTime();
            int result = Fibonacci.recursivoCalc(i);
            TempoFinal = System.nanoTime();
            total = total + (TempoFinal - TempoInicial);
            System.out.println(result + " levou " + (TempoFinal - TempoInicial ) + " nanosegundos");


        }
        System.out.println("==========================================");
        System.out.println( "O tempo total foi : " +  total + " nanosegundos");
        System.out.println("==========================================");

        System.out.println();
        System.out.println("Para o codigo iterativo levaram : ");

        double total1 = 0;

        for(int i = 0; i < 20; i++) {
            TempoInicial = System.nanoTime();
            int result = Fibonacci.iterativoCalc(i);
            TempoFinal = System.nanoTime();
            total1 = total1 + (TempoFinal - TempoInicial);
            System.out.println(result + " levou " + (TempoFinal - TempoInicial)  + " nanosegundos");

        }
        System.out.println("========================================");
        System.out.println("O tempo total foi : " + total1 + " nanosegundos");
        System.out.println("========================================");
    }

}