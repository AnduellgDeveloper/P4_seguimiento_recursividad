/*Ejercicio:
    2. Imprimir un triángulo de caracteres: Escribe una función recursiva que imprima un triángulo de 
    caracteres con altura N.
*/

public class crear_triangulo {
    public static void main(String[] args) {
        int n = 10; // Altura del triángulo
        imprimir_triangulo(n, 1);
    }

    public static void imprimir_triangulo(int n, int fila) {
        // Caso base (cuando la fila sea mayor que n se para) 
        if (fila > n) {
            return;
        }

        // Imprime la fila actual con  repetidos
        for (int i = 0; i < fila; i++) {
            System.out.print("°");
        }
        // Salto de linea
        System.out.println(); 
        imprimir_triangulo(n, fila + 1);
    }
}
