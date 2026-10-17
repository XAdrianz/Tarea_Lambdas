package org.uabc2109072;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println(" DEMOSTRACIÓN DE MÉTODOS ESTÁTICOS CON LAMBDAS ");
        System.out.println("=================================================\n");

        // -------------------------------------------------
        // MÉTODOS DE NÚMEROS (ejerciciosNumeros)
        // -------------------------------------------------

        // 1. El Multiplicador
        imprimirEncabezado(1, "El Multiplicador (ejerciciosNumeros)");
        List<Integer> num1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, null));
        System.out.println("Caso normal con elemento null - Antes:  " + num1);
        ejerciciosNumeros.elMultiplicador(num1, 3);
        System.out.println("Caso normal con elemento null - Después (Factor 3): " + num1);

        List<Integer> num1Null = null;
        System.out.println("Caso borde (Colección null) - Ejecutando...");
        ejerciciosNumeros.elMultiplicador(num1Null, 5);
        System.out.println("Caso borde (Colección null) - Completado sin errores.");


        // 4. Cuadrados Únicos
        imprimirEncabezado(4, "Cuadrados Únicos (ejerciciosNumeros)");
        ArrayList<Integer> num4 = new ArrayList<>(Arrays.asList(2, 3, 4, 2, 6, 4, 5, 8, null));
        System.out.println("Caso normal con duplicados y null - Original: " + num4);
        Set<Integer> cuadrados = ejerciciosNumeros.cuadradosUnicos(num4);
        System.out.println("Resultado (HashSet de cuadrados de pares únicos): " + cuadrados);

        ArrayList<Integer> num4Null = null;
        System.out.println("Caso borde (Colección null) - Resultado: " + ejerciciosNumeros.cuadradosUnicos(num4Null));


        // -------------------------------------------------
        // MÉTODOS DE CADENAS (ejerciciosPalabras)
        // -------------------------------------------------

        // 2. El Filtro Selectivo
        imprimirEncabezado(2, "El Filtro Selectivo (ejerciciosPalabras)");
        ArrayList<String> cadenas2 = new ArrayList<>(Arrays.asList("hola", "java", "Stream", "a", "sol", "algoritmo", null));
        System.out.println("Caso normal con nulls - Antes: " + cadenas2);
        ejerciciosPalabras.elFiltroSelectivo(cadenas2, "a", 3);
        System.out.println("Caso normal con nulls - Después (elimina 'a', <3 caracteres o null): " + cadenas2);

        ArrayList<String> cadenas2Null = null;
        System.out.println("Caso borde (Colección null) - Ejecutando...");
        ejerciciosPalabras.elFiltroSelectivo(cadenas2Null, "x", 4);
        System.out.println("Caso borde (Colección null) - Completado sin errores.");


        // 3. Conversor de Mayúsculas
        imprimirEncabezado(3, "Conversor de Mayúsculas (ejerciciosPalabras)");
        List<String> cadenas3 = Arrays.asList("código", "lambda", "java", null);
        System.out.println("Caso normal con elemento null - Antes: " + cadenas3);
        ArrayList<String> mayusculas = ejerciciosPalabras.convertirMayusculas(cadenas3);
        System.out.println("Resultado (omite nulos): " + mayusculas);

        List<String> cadenas3Null = null;
        System.out.println("Caso borde (Colección null) - Resultado: " + ejerciciosPalabras.convertirMayusculas(cadenas3Null));


        // 5. Mapa de Longitudes
        imprimirEncabezado(5, "Mapa de Longitudes (ejerciciosPalabras)");
        List<String> cadenas5 = Arrays.asList("Java", "Streams", "Lambda", "Java", null);
        System.out.println("Caso normal con duplicado y null - Lista: " + cadenas5);
        Map<String, Integer> mapaLongitudes = ejerciciosPalabras.mapaDeLongitudes(cadenas5);
        System.out.println("Resultado (Palabra -> Longitud): " + mapaLongitudes);

        List<String> cadenas5Null = null;
        System.out.println("Caso borde (Colección null) - Resultado: " + ejerciciosPalabras.mapaDeLongitudes(cadenas5Null));


        // 6. Modificador de Inventario
        imprimirEncabezado(6, "Modificador de Inventario (ejerciciosPalabras)");
        Map<String, Double> inventario = new HashMap<>();
        inventario.put("Laptop", 1200.0);
        inventario.put("Mouse", 25.0);
        inventario.put("Teclado", 45.0);
        inventario.put("SinPrecio", null);
        System.out.println("Caso normal con valor null - Inventario Original: " + inventario);
        System.out.println("Salida de modificadorDeInventario:");
        ejerciciosPalabras.modificadorDeInventario(inventario);

        Map<String, Double> inventarioNull = null;
        System.out.println("Caso borde (Mapa null) - Ejecutando...");
        ejerciciosPalabras.modificadorDeInventario(inventarioNull);
        System.out.println("Caso borde (Mapa null) - Completado sin errores.");


        // 7. Contador de Frecuencias
        imprimirEncabezado(7, "Contador de Frecuencias (ejerciciosPalabras)");
        List<String> palabras7 = Arrays.asList("java", "python", "java", "c++", "java", "python", null);
        System.out.println("Caso normal con repeticiones y null - Lista: " + palabras7);
        Map<String, Integer> frecuencias = ejerciciosPalabras.contarFrecuencias(palabras7);
        System.out.println("Resultado (Mapa de Frecuencias): " + frecuencias);

        List<String> palabras7Null = null;
        System.out.println("Caso borde (Colección null) - Resultado: " + ejerciciosPalabras.contarFrecuencias(palabras7Null));


        // 8. Clasificador de Palabras Por Frecuencia
        imprimirEncabezado(8, "Clasificador de Palabras Por Frecuencia (ejerciciosPalabras)");
        Map<String, Integer> mapaFrec8 = new HashMap<>();
        mapaFrec8.put("java", 5);
        mapaFrec8.put("python", 2);
        mapaFrec8.put("c++", 1);
        mapaFrec8.put("go", 4);
        mapaFrec8.put(null, 10);
        mapaFrec8.put("rust", null);
        System.out.println("Caso normal con clave y valor null - Antes: " + mapaFrec8);
        ArrayList<String> clasificadas = ejerciciosPalabras.clasificarPalabrasPorFrecuencia(mapaFrec8, 3);
        System.out.println("Resultado (Palabras con frecuencia >= 3): " + clasificadas);

        Map<String, Integer> mapaFrec8Null = null;
        System.out.println("Caso borde (Mapa null) - Resultado: " + ejerciciosPalabras.clasificarPalabrasPorFrecuencia(mapaFrec8Null, 3));


        // 9. Deduplicación de Palabras
        imprimirEncabezado(9, "Deduplicación de Palabras (ejerciciosPalabras)");
        String frase = "El lenguaje Java es genial y Java permite escribir código Java eficiente";
        System.out.println("Caso normal - Frase original: \"" + frase + "\"");
        Set<String> deduplicadas = ejerciciosPalabras.deduplicacionDePalabras(frase, 4);
        System.out.println("Resultado (HashSet deduplicado, minúsculas, longitud >= 4): " + deduplicadas);

        String fraseNull = null;
        System.out.println("Caso borde (Frase null) - Resultado: " + ejerciciosPalabras.deduplicacionDePalabras(fraseNull, 3));


        // 10. Limitar Frecuencias
        imprimirEncabezado(10, "Limitar Frecuencias (ejerciciosPalabras)");
        Map<String, Integer> frecs10 = new HashMap<>();
        frecs10.put("java", 12);
        frecs10.put("spring", 7);
        frecs10.put("docker", 3);
        frecs10.put("invalido", null);
        System.out.println("Caso normal con valor null - Antes del tope: " + frecs10);
        ejerciciosPalabras.limitarFrecuencias(frecs10, 5);
        System.out.println("Caso normal con valor null - Después de limitar a máximo 5: " + frecs10);

        Map<String, Integer> frecs10Null = null;
        System.out.println("Caso borde (Mapa null) - Ejecutando...");
        ejerciciosPalabras.limitarFrecuencias(frecs10Null, 5);
        System.out.println("Caso borde (Mapa null) - Completado sin errores.");
    }

    private static void imprimirEncabezado(int num, String titulo) {
        System.out.println("\n-------------------------------------------------");
        System.out.println("Prueba " + num + ": " + titulo);
        System.out.println("-------------------------------------------------");
    }
}