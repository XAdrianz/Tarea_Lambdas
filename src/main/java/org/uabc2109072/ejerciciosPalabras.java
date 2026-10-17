package org.uabc2109072;

import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class ejerciciosPalabras {

    // 2. El Filtro Selectivo
    public static void elFiltroSelectivo(ArrayList<String> cadenas, String letraInicio, int longitudMenor) {
        if (cadenas == null || letraInicio == null) return;
        String letraMinuscula = letraInicio.toLowerCase();
        cadenas.removeIf(s -> s == null ||
                s.toLowerCase().startsWith(letraMinuscula) ||
                s.length() < longitudMenor);
    }

    // 3. Conversor de Mayúsculas
    public static ArrayList<String> convertirMayusculas(List<String> cadenas) {
        if (cadenas == null) return new ArrayList<>();
        return cadenas.stream()
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // 5. Mapa de Longitudes
    public static Map<String, Integer> mapaDeLongitudes(List<String> cadenas) {
        if (cadenas == null) return new HashMap<>();
        return cadenas.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toMap(
                        p -> p,
                        String::length,
                        (longitudExistente, nueva) -> longitudExistente
                ));
    }

    // 6. Modificador de Inventario
    public static void modificadorDeInventario(Map<String, Double> inventario) {
        if (inventario == null) return;
        inventario.forEach((producto, precio) -> {
            if (precio != null) {
                double precioConDescuento = precio * 0.90;
                System.out.println("El producto es: " + producto + " Su precio original es: " + precio + " Su precio con descuento es " + precioConDescuento);
            }
        });
    }

    // 7. Contador de Frecuencias
    public static Map<String, Integer> contarFrecuencias(List<String> palabras) {
        Map<String, Integer> mapaFrecuencias = new HashMap<>();
        if (palabras == null) return mapaFrecuencias;

        for (String palabra : palabras) {
            if (palabra != null) {
                mapaFrecuencias.merge(palabra, 1, Integer::sum);
            }
        }
        return mapaFrecuencias;
    }

    // 8. Clasificador de Palabras
    public static ArrayList<String> clasificarPalabrasPorFrecuencia(Map<String, Integer> frecuencias, int frecuenciaMinima) {
        if (frecuencias == null) return new ArrayList<>();
        return frecuencias.entrySet().stream()
                .filter(entry -> entry.getKey() != null && entry.getValue() != null && entry.getValue() >= frecuenciaMinima)
                .map(Map.Entry::getKey)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // 9. Deduplicación de Palabras
    public static Set<String> deduplicacionDePalabras(String frase, int minLongitud) {
        if (frase == null || frase.trim().isEmpty()) return new HashSet<>();
        return Arrays.stream(frase.split("\\s+"))
                .map(p -> p.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚñÑ]", ""))
                .filter(p -> !p.isEmpty() && p.length() >= minLongitud)
                .map(String::toLowerCase)
                .collect(Collectors.toSet());
    }

    // 10. Limitar Frecuencias
    public static void limitarFrecuencias(Map<String, Integer> frecuencias, int maximoN) {
        if (frecuencias == null) return;
        frecuencias.replaceAll((palabra, frec) -> (frec != null && frec > maximoN) ? maximoN : frec);
    }
}
