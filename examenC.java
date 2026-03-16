

/**
 * Clase principal del programa.
 *
 * <p>Esta clase contiene el método {@code main}, que es el punto de entrada
 * de cualquier aplicación Java ejecutable. El programa demuestra el uso
 * básico de diferentes estructuras de datos en Java:</p>
 *
 * <ul>
 *     <li>Arrays unidimensionales</li>
 *     <li>Arrays bidimensionales</li>
 *     <li>Recorrido de arrays mediante bucles</li>
 *     <li>Uso de {@link ArrayList}</li>
 *     <li>Uso de utilidades de {@link Arrays}</li>
 * </ul>
 *
 * <p>El objetivo del código es mostrar diferentes formas de crear,
 * modificar, recorrer e imprimir colecciones de datos.</p>
 *
 * @author Estudiante
 * @version 1.0
 */
public class Main {

    /**
     * Método principal del programa.
     *
     * <p>Este método es el punto de inicio de ejecución de la aplicación.
     * La JVM invoca automáticamente este método cuando se ejecuta el programa.</p>
     *
     * <p>Dentro de este método se muestran ejemplos de:</p>
     * <ul>
     *     <li>Creación de arrays</li>
     *     <li>Asignación de valores a arrays</li>
     *     <li>Obtención de la longitud de un array</li>
     *     <li>Iteración mediante for-each y for clásico</li>
     *     <li>Uso de {@link ArrayList}</li>
     *     <li>Uso de arrays bidimensionales</li>
     * </ul>
     *
     * @param args argumentos de línea de comandos (no utilizados en este programa)
     */
    public static void main(String[] args) {

        /**
         * Creación de un array de enteros con tamaño fijo de 10 posiciones.
         *
         * <p>Todos los valores de un array de tipo {@code int} se inicializan
         * automáticamente a {@code 0} por defecto.</p>
         */
        int[] anArray = new int[10];

        /**
         * Imprime el contenido del array utilizando el método
         * {@link Arrays#toString(int[])} para convertir el array en
         * una representación de texto legible.
         */
        System.out.println(Arrays.toString(anArray));

        /**
         * Asignación de un valor a una posición específica del array.
         *
         * <p>En este caso se asigna el valor 100 al índice 4.</p>
         * <p>Recordatorio: los arrays en Java comienzan en índice 0.</p>
         */
        anArray[4] = 100;

        /**
         * Se vuelve a imprimir el array para mostrar el cambio realizado.
         */
        System.out.println(Arrays.toString(anArray));

        /**
         * Acceso directo a un elemento específico del array.
         */
        System.out.println("Element at index 4: " + anArray[4]);

        /**
         * Obtención de la longitud del array mediante la propiedad {@code length}.
         */
        System.out.println("Length: " + anArray.length);

        /**
         * Creación de un array utilizando inicialización directa.
         *
         * <p>En este caso el array contiene 5 elementos.</p>
         */
        int[] b = {1, 2, 3, 4, 5};

        /**
         * Impresión del contenido del array.
         */
        System.out.println(Arrays.toString(b));

        /**
         * Recorrido del array utilizando un bucle for-each.
         *
         * <p>Este tipo de bucle es útil cuando solo se necesita leer
         * los valores del array y no se requiere el índice.</p>
         */
        for (int number : b) {
            System.out.println(number);
        }

        /**
         * Recorrido del array utilizando un bucle for tradicional.
         *
         * <p>Este método permite acceder al índice de cada elemento.</p>
         */
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        /**
         * Creación de un {@link ArrayList} que almacenará objetos {@link Integer}.
         *
         * <p>Un ArrayList es una estructura dinámica, lo que significa que
         * puede crecer o reducir su tamaño automáticamente.</p>
         */
        ArrayList<Integer> arrayList = new ArrayList<>();

        /**
         * Inserción de elementos en el ArrayList utilizando el método {@code add()}.
         */
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        /**
         * Impresión del contenido del ArrayList.
         */
        System.out.println(arrayList);

        /**
         * Declaración e inicialización de un array bidimensional (matriz).
         *
         * <p>Este array contiene 3 filas y 3 columnas.</p>
         */
        int[][] twoDArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        /**
         * Recorrido de un array bidimensional utilizando un bucle for-each.
         *
         * <p>Cada iteración obtiene una fila completa del array.</p>
         */
        for (int[] row : twoDArray) {
            System.out.println(Arrays.toString(row));
        }

    }
}