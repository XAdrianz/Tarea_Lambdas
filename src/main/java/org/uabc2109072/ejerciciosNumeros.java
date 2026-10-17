package org.uabc2109072;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ejerciciosNumeros {
    // 1
    public static void elMultiplicador(List<Integer> numeros, int factor) {
        if (numeros == null) return;
        numeros.replaceAll(n -> n != null ? n * factor : null);
    }

    // 4
    public static Set<Integer> cuadradosUnicos(ArrayList<Integer> numeros) {
        if (numeros == null) return new HashSet<>();
        return numeros.stream()
                .filter(Objects::nonNull) // Filtra elementos nulos en la lista
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toSet());
    }
}