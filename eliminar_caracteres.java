/*Ejercicio:
    1. Eliminar un carácter de una cadena: Implementa una función recursiva que elimine todas las 
    apariciones de un carácter dado en una cadena. 
*/

public class eliminar_caracteres {
    public static void main (String[] args){
        String texto = """
            [10:08 a.m., 28/8/2025] Anduell Play Servicios: José Jaramillo
            301341103204
            Netflix
            15.000
            [11:31 a.m., 28/8/2025] Anduell Play Servicios: Alba Cecilia zuluaga Vera
            311310330554
            Netflix 
            15.000
            [1:20 p.m., 28/8/2025] Anduell Play Servicios: Leidy Suarez
            314989190511
            Netflix
            15.000
            """;

        String resultado = eliminarContenidoCorchetes(texto);
        System.out.println(resultado);
    }
    public static String eliminarContenidoCorchetes(String texto){
        // Usamos indexOf para buscar el indice o posición (int), devuelve la primera coincidencia de [ y ] en la cadena de texto
        int inicioEncierro = texto.indexOf('[');
        int finEncierro = texto.indexOf(']', inicioEncierro); // Se le pasa inicioEncierro [ como un checkpoint

        if (inicioEncierro == -1 || finEncierro == -1) {
            return texto;
        }
        // Usamos substring para extraer el texto antes de "[" y despues de "]"
        String nuevoTexto = texto.substring(0, inicioEncierro) + texto.substring(finEncierro + 1);
        // Entonces mientras haya [ ] va a seguir iterando
        return eliminarContenidoCorchetes(nuevoTexto);


    /* Quice implementar el codigo de esta forma, me llamo la atención lo de los caracteres, ya hacía algo más o menos 
    parecido para un codigo de mi negocio, pero con un método imperativo */

    }
}
