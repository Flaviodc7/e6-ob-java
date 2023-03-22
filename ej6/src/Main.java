public class Main {

    public static void DividePorCero(int a, int b) {
        try {
            System.out.println("El resultado es: " + a / b);
        } catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }

    public static void main(String[] args) {
        DividePorCero(4, 0);
    }
}