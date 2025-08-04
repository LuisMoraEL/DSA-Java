
# 💪 Práctica de Arreglos 1D y 2D – Programación

**Nombre:** LuisMoraEL  
**Fecha:** 26/07/2025

---

## ✅ Instrucciones

- Resuelve los siguientes ejercicios usando lenguaje C, Java o Python.
- No uses estructuras dinámicas (como listas o ArrayList).
- Usa arreglos 1D o 2D según se indique.
- Si puedes, acompaña tu solución con comentarios.

---

## 🔹 Arreglos Unidimensionales (1D)

### Ejercicio 1 – Suma total
Dado un arreglo de enteros, escribe una función que devuelva la suma total de sus elementos.

📌 Entrada: `int[] datos = {4, 7, 2, 9, 1};`  
✅ Salida esperada: `23`

```java
public int sumNumbers(int[] data){
    int sum = 0;
    for (int num : data)
        sum += num;
    return sum;
}
```

---

### Ejercicio 2 – Buscar número
Escribe un algoritmo que determine si un número dado se encuentra en el arreglo.

📌 Entrada: `int[] datos = {3, 5, 9, 2};` y `num = 5`  
✅ Salida: `"Encontrado"`

```java
public String findNumber(int[] data, int number) {
    String find = "No encontrado";
    for (int num : data) {
        if (num == number){
            find = "Encontrado";
            break;
        }
    }
    return find;
}
```

---

### Ejercicio 3 – Invertir arreglo
Dado un arreglo, invierte su contenido **sin usar un segundo arreglo**.

📌 Entrada: `{1, 2, 3, 4, 5}`  
✅ Salida esperada: `{5, 4, 3, 2, 1}`

```java
public int[] reverseArray(int[] data) {
    int ixd1 = 0;
    int ixd2 = data.length - 1;
    while (ixd1 < ixd2) {
        int temp = data[ixd1];
        data[ixd1] = data[ixd2];
        data[ixd2] = temp;
        ixd1++;
        ixd2--;
    }
    return data;
}
```

---

### Ejercicio 4 – Promedio
Escribe una función que calcule el promedio de los valores de un arreglo.

📌 Entrada: `{10, 20, 30}`  
✅ Salida esperada: `20`

```java
public int calculateAverage(int[] data) {
    int sum = 0;
    for (int num: data) {
        sum += num;
    }
    return sum / data.length;
}
```

---

## 🔸 Arreglos Bidimensionales (2D)

### Ejercicio 5 – Sumar todos los elementos
Suma todos los elementos de una matriz 3x3.

📌 Entrada:
```
{
  {1, 2, 3},
  {4, 5, 6},
  {7, 8, 9}
}
```  
✅ Salida esperada: `45`

```java
public int sumMatrix(int[][] data) {
    int sum = 0;
    for (int i = 0; i < data.length; i++) {
        for (int j = 0; j < data[0].length; j++) {
            sum += data[i][j];
        }
    }
    return sum;
}
```

---

### Ejercicio 6 – Sumar columna
Dado un índice de columna, suma todos los elementos de esa columna.

📌 Entrada:
```
matriz = {
  {2, 4, 6},
  {1, 3, 5},
  {7, 9, 11}
}
columna = 1
```
✅ Salida esperada: `4 + 3 + 9 = 16`
```java
public int sumColumn(int[][] data, int column) {
    int sum = 0;
    for (int i = 0; i < data.length; i++) {
        sum += data[i][column];
    }
    return sum;
}
```
---

### Ejercicio 7 – Diagonal principal
Escribe un programa que devuelva los elementos de la diagonal principal de una matriz cuadrada.

📌 Entrada:
```
{
  {1, 2, 3},
  {4, 5, 6},
  {7, 8, 9}
}
```
✅ Salida esperada: `{1, 5, 9}`

```java
public int[] getDiagonal(int[][] data) {
    int[] diagonal = new int[data.length];
    for (int i = 0; i < data.length; i++){
        diagonal[i] = data[i][i];
    }
    return diagonal;
}
```

---

### Ejercicio 8 – Transpuesta
Dada una matriz 2D, imprime su transpuesta.

📌 Entrada:
```
{
  {1, 2},
  {3, 4},
  {5, 6}
}
```
✅ Salida esperada:
```
{
  {1, 3, 5},
  {2, 4, 6}
}
```
```java
public int[][] printT(int[][] data) {
    int[][] trans = new int[data[0].length][data.length];
    
    for (int j = 0; j < data[0].length; j++) {
        for (int i = 0; i < data.length; i++) {
            trans[j][i] = data[i][j];
            System.out.println(trans[j][i]);
        }
    }
    return trans;
}
```
---

## ✍️ Fin de la práctica
Cuando termines, puedes mandarme tus respuestas para revisarlas 💻
