public class Main {
    public static String reverse(char... texto) {
        StringBuilder resultado = new StringBuilder();
        for (int i = texto.length - 1; i >= 0; i--){
            resultado.append(texto[i]);
        }
        return resultado.toString();
    }
    public static void main(String[] args) {

        String text = "Hola mundo";
        char[] arr = text.toCharArray();
        String inverso = reverse(arr);
        System.out.println(inverso);
    }
}