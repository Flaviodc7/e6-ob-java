public class Main {
    public static void main(String[] args) {
        int[][] arrayInt = new int[][]{ {1, 2, 3}, {4, 5} };
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++){
                System.out.println("Posicion x=" + i + " Posicion y=" + j + " numero: " + arrayInt[i][j]);
            }
        }
    }
}