import java.util.Random;

public class busquedanumero {
    System.out.print("\nIngrese un número a buscar (1-100): ");
    int numeroBuscado = scanner.nextInt();
    boolean encontrado = false;
    
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            if (matriz[i][j] == numeroBuscado) {
                System.out.println("Número encontrado en posición [" + i + "][" + j + "]");
                encontrado = true;
            }
        }
    }
    
    if (!encontrado) {
        System.out.println("El número no existe en la matriz.");
    }
}
