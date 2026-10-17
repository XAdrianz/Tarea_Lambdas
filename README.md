# Evaluación de Lambdas, Streams y Colecciones en Java
Este proyecto implementa 10 métodos estáticos en Java estructurados en dos clases utilitarias (ejerciciosNumeros y ejerciciosPalabras). Utiliza expresiones **Lambda**, la API de **Streams** y colecciones del **Java Collections Framework** (`ArrayList`, `HashSet`, `HashMap`), manejando de forma segura casos normales, colecciones/cadenas nulas y elementos vacíos.
text
src/
└── org/
    └── uabc2109072/
        ├── ejerciciosNumeros.java
        ├── ejerciciosPalabras.java
        └── Main.java
1. El Multiplicador (ArrayList)
Escribe un método estático que dado un ArrayList<Integer>, utiliza el método replaceAll() y una expresión lambda para multiplicar cada número de la lista por un factor que recibe. 
2. El Filtro Selectivo (ArrayList)
Escribe un método estático que dado un ArrayList<String>, utiliza el método removeIf() para eliminar todas las cadenas que comiencen con una letra que recibe como parámetro o que tengan una longitud menor a N caracteres.
3. Conversor de Mayúsculas (ArrayList)
Escribe un método estático que convierte una lista de palabras a mayúsculas usando Stream y map(), y luego recolecta los resultados en un nuevo ArrayList y lo regresa.
4. Cuadrados Únicos (HashSet)
Escribe un método estático que dado un ArrayList<Integer> que contiene duplicados, crea un HashSet que contenga únicamente los cuadrados de los números pares únicos de la lista original.
Tip: Utiliza una combinación de filter(), map() y Collectors.toSet().
5. Mapa de Longitudes (HashMap)
Escribe un método estático que dado un ArrayList<String> de palabras, utiliza Collectors.toMap() para crear un HashMap<String, Integer> donde la clave sea la palabra y el valor sea su longitud.
6. Modificador de Inventario (HashMap)
Escribe un método estático que dado un HashMap<String, Double> que representa nombres de productos y sus precios. Usa el método forEach() para imprimir un catálogo donde cada precio tenga un descuento del 10% en la impresión.
Enfoque: Iterar sobre entradas de un Mapa usando lambdas de tipo Bi-Consumer.
7. Contador de Frecuencias (HashMap)
Escribe un método estático que toma un ArrayList<String> de palabras (con repeticiones). Usa merge() o compute() con una lambda para construir un mapa de frecuencias que muestre cuántas veces aparece cada palabra.

8. Clasificador de Palabras (HashMap)
Escribe un método estático que dado un HashMap<String, Integer> de palabras y sus frecuencias, usa entrySet().stream() para filtrar a las palabras con frecuencia inferior a un valor dado y guarda solo las palabras que cumplen con el criterio en un ArrayList.
9. Deduplicación de Palabras (HashSet)
Escribe un método estático que toma una frase larga, dividela en un array de palabras y usa un stream con lambdas para filtrar las palabras de menos de N letras, convertirlas a minúsculas y guardarlas en un HashSet para asegurar que no haya repetidas.
10. El Tope de Frecuencias (HashMap)
Escribe un método estático que dado un HashMap<String, Integer> de palabras y frecuencias, usa replaceAll() para limitar todas las frecuencias a un máximo de N. Si una frecuencia es mayor a N, debe fijarse exactamente en N mediante una lambda.

-------------------------------------------------
Prueba 1: El Multiplicador
-------------------------------------------------
Caso normal con elemento null - Antes:  [1, 2, 3, 4, 5, null]
Caso normal con elemento null - Después: [3, 6, 9, 12, 15, null]
Caso borde - Ejecutando
Caso borde - Completado.

-------------------------------------------------
Prueba 4: Cuadrados Unicos
-------------------------------------------------
Caso normal con duplicados y null - Original: [2, 3, 4, 2, 6, 4, 5, 8, null]
Resultado [16, 64, 4, 36]
Caso borde - Resultado: []

-------------------------------------------------
Prueba 2: El Filtro Selectivo 
-------------------------------------------------
Caso normal con nulls - Antes: [hola, java, Stream, a, sol, algoritmo, null]
Caso normal con nulls - Después: [hola, java, Stream, sol]
Caso borde - Ejecutando
Caso borde - Completado

-------------------------------------------------
Prueba 3: Conversor de Mayusculas
-------------------------------------------------
Caso normal con elemento null - Antes: [código, lambda, java, null]
Resultado [CÓDIGO, LAMBDA, JAVA]
Caso borde (Colección null) - Resultado: []

-------------------------------------------------
Prueba 5: Mapa de Longitudes 
-------------------------------------------------
Caso normal con duplicado y null - Lista: [Java, Streams, Lambda, Java, null]
Resultado : {Java=4, Lambda=6, Streams=7}
Caso borde - Resultado: {}

-------------------------------------------------
Prueba 6: Modificador de Inventario
-------------------------------------------------
Caso normal con valor null - Inventario Original: {Laptop=1200.0, Mouse=25.0, Teclado=45.0, SinPrecio=null}
Salida de modificadorDeInventario:
El producto es: Laptop Su precio original es: 1200.0 Su precio con descuento es 1080.0
El producto es: Mouse Su precio original es: 25.0 Su precio con descuento es 22.5
El producto es: Teclado Su precio original es: 45.0 Su precio con descuento es 40.5
Caso borde - Ejecutando
Caso borde - Completado

-------------------------------------------------
Prueba 7: Contador de Frecuencias
-------------------------------------------------
Caso normal con repeticiones y null - Lista: [java, python, java, c++, java, python, null]
Resultado : {c++=1, python=2, java=3}
Caso borde - Resultado: {}

-------------------------------------------------
Prueba 8: Clasificador de Palabras Por Frecuencia
-------------------------------------------------
Caso normal con clave y valor null - Antes: {null=10, rust=null, python=2, c++=1, java=5, go=4}
Resultado: [java, go]
Caso borde - Resultado: []

-------------------------------------------------
Prueba 9: Deduplicación de Palabras
-------------------------------------------------
Caso normal - Frase original: "El lenguaje Java es genial y Java permite escribir codigo Java eficiente"
Resultado: [lenguaje, genial, codigo, java, eficiente, escribir, permite]
Caso borde - Resultado: []

-------------------------------------------------
Prueba 10: Limitar Frecuencias 
-------------------------------------------------
Caso normal con valor null - Antes del tope: {spring=7, java=12, invalido=null, docker=3}
