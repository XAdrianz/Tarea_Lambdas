package org.uabc2109072;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 1
        imprimirEncabezado(1, "El Multiplicador");
        List<Integer> num1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, null));
        System.out.println("Caso normal con elemento null - Antes:  " + num1);
        ejerciciosNumeros.elMultiplicador(num1, 3);
        System.out.println("Caso normal con elemento null - Después: " + num1);

        List<Integer> num1Null = null;
        System.out.println("Caso borde - Ejecutando");
        ejerciciosNumeros.elMultiplicador(num1Null, 5);
        System.out.println("Caso borde - Completado.");


        // 4
        imprimirEncabezado(4, "Cuadrados Unicos");
        ArrayList<Integer> num4 = new ArrayList<>(Arrays.asList(2, 3, 4, 2, 6, 4, 5, 8, null));
        System.out.println("Caso normal con duplicados y null - Original: " + num4);
        Set<Integer> cuadrados = ejerciciosNumeros.cuadradosUnicos(num4);
        System.out.println("Resultado " + cuadrados);

        ArrayList<Integer> num4Null = null;
        System.out.println("Caso borde - Resultado: " + ejerciciosNumeros.cuadradosUnicos(num4Null));

        // 2
        imprimirEncabezado(2, "El Filtro Selectivo ");
        ArrayList<String> cadenas2 = new ArrayList<>(Arrays.asList("hola", "java", "Stream", "a", "sol", "algoritmo", null));
        System.out.println("Caso normal con nulls - Antes: " + cadenas2);
        ejerciciosPalabras.elFiltroSelectivo(cadenas2, "a", 3);
        System.out.println("Caso normal con nulls - Después: " + cadenas2);

        ArrayList<String> cadenas2Null = null;
        System.out.println("Caso borde - Ejecutando");
        ejerciciosPalabras.elFiltroSelectivo(cadenas2Null, "x", 4);
        System.out.println("Caso borde - Completado");


        // 3
        imprimirEncabezado(3, "Conversor de Mayusculas");
        List<String> cadenas3 = Arrays.asList("código", "lambda", "java", null);
        System.out.println("Caso normal con elemento null - Antes: " + cadenas3);
        ArrayList<String> mayusculas = ejerciciosPalabras.convertirMayusculas(cadenas3);
        System.out.println("Resultado " + mayusculas);

        List<String> cadenas3Null = null;
        System.out.println("Caso borde (Colección null) - Resultado: " + ejerciciosPalabras.convertirMayusculas(cadenas3Null));


        // 5
        imprimirEncabezado(5, "Mapa de Longitudes ");
        List<String> cadenas5 = Arrays.asList("Java", "Streams", "Lambda", "Java", null);
        System.out.println("Caso normal con duplicado y null - Lista: " + cadenas5);
        Map<String, Integer> mapaLongitudes = ejerciciosPalabras.mapaDeLongitudes(cadenas5);
        System.out.println("Resultado : " + mapaLongitudes);

        List<String> cadenas5Null = null;
        System.out.println("Caso borde - Resultado: " + ejerciciosPalabras.mapaDeLongitudes(cadenas5Null));


        // 6
        imprimirEncabezado(6, "Modificador de Inventario");
        Map<String, Double> inventario = new HashMap<>();
        inventario.put("Laptop", 1200.0);
        inventario.put("Mouse", 25.0);
        inventario.put("Teclado", 45.0);
        inventario.put("SinPrecio", null);
        System.out.println("Caso normal con valor null - Inventario Original: " + inventario);
        System.out.println("Salida de modificadorDeInventario:");
        ejerciciosPalabras.modificadorDeInventario(inventario);

        Map<String, Double> inventarioNull = null;
        System.out.println("Caso borde - Ejecutando");
        ejerciciosPalabras.modificadorDeInventario(inventarioNull);
        System.out.println("Caso borde - Completado");


        // 7
        imprimirEncabezado(7, "Contador de Frecuencias");
        List<String> palabras7 = Arrays.asList("java", "python", "java", "c++", "java", "python", null);
        System.out.println("Caso normal con repeticiones y null - Lista: " + palabras7);
        Map<String, Integer> frecuencias = ejerciciosPalabras.contarFrecuencias(palabras7);
        System.out.println("Resultado : " + frecuencias);

        List<String> palabras7Null = null;
        System.out.println("Caso borde - Resultado: " + ejerciciosPalabras.contarFrecuencias(palabras7Null));


        // 8
        imprimirEncabezado(8, "Clasificador de Palabras Por Frecuencia");
        Map<String, Integer> mapaFrec8 = new HashMap<>();
        mapaFrec8.put("java", 5);
        mapaFrec8.put("python", 2);
        mapaFrec8.put("c++", 1);
        mapaFrec8.put("go", 4);
        mapaFrec8.put(null, 10);
        mapaFrec8.put("rust", null);
        System.out.println("Caso normal con clave y valor null - Antes: " + mapaFrec8);
        ArrayList<String> clasificadas = ejerciciosPalabras.clasificarPalabrasPorFrecuencia(mapaFrec8, 3);
        System.out.println("Resultado: " + clasificadas);

        Map<String, Integer> mapaFrec8Null = null;
        System.out.println("Caso borde - Resultado: " + ejerciciosPalabras.clasificarPalabrasPorFrecuencia(mapaFrec8Null, 3));


        // 9
        imprimirEncabezado(9, "Deduplicación de Palabras");
        String frase = "El lenguaje Java es genial y Java permite escribir codigo Java eficiente";
        System.out.println("Caso normal - Frase original: \"" + frase + "\"");
        Set<String> deduplicadas = ejerciciosPalabras.deduplicacionDePalabras(frase, 4);
        System.out.println("Resultado: " + deduplicadas);

        String fraseNull = null;
        System.out.println("Caso borde - Resultado: " + ejerciciosPalabras.deduplicacionDePalabras(fraseNull, 3));


        // 10
        imprimirEncabezado(10, "Limitar Frecuencias ");
        Map<String, Integer> frecs10 = new HashMap<>();
        frecs10.put("java", 12);
        frecs10.put("spring", 7);
        frecs10.put("docker", 3);
        frecs10.put("invalido", null);
        System.out.println("Caso normal con valor null - Antes del tope: " + frecs10);
        ejerciciosPalabras.limitarFrecuencias(frecs10, 5);
        System.out.println("Caso normal con valor null - Después de limitar a máximo 5: " + frecs10);

        Map<String, Integer> frecs10Null = null;
        System.out.println("Caso borde - Ejecutando");
        ejerciciosPalabras.limitarFrecuencias(frecs10Null, 5);
        System.out.println("Caso borde - Completado.");
    }

    private static void imprimirEncabezado(int num, String titulo) {
        System.out.println("\n-------------------------------------------------");
        System.out.println("Prueba " + num + ": " + titulo);
        System.out.println("-------------------------------------------------");
    }
}