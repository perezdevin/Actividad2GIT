import java.util.Random;

public class MatrizApp {
    public static void main(String[] args) {
        
        int[][] matriz = new int[5][5];
        Random random = new Random();
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }
        
        
        System.out.println("Matriz 5x5 de números aleatorios:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}