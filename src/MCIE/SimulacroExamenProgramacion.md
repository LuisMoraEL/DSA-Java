
# 🧪 Simulacro de Examen de Programación

**Nombre:** LuisMoraEL  
**Fecha:** 26/07/2025

---

## ✅ Instrucciones

- Resuelve todos los ejercicios propuestos.
- Puedes usar pseudocódigo o lenguaje como C, Java o Python.
- No se permite el uso de librerías externas ni estructuras que no sean arreglos.
- En problemas con matrices o arreglos, no uses estructuras como listas dinámicas.
- Tiempo estimado de resolución: 90 minutos.
- Al finalizar, guarda este archivo y envíalo para revisión.

---

### 🧠 Sección 1: Algoritmia

**1.** Define qué es un algoritmo y menciona dos diferencias clave entre pseudocódigo y código real.
> Un algoritmo es una especie de "maquina" compuesta de instrucciónes lógicas secuenciales que tienen como fin resolver
> un problema determinado, este recibe datos de entrada (parámetros) y devuelve o realiza una acción en base a dichos datos.
> La diferencia clave este el pseudocódigo y el código real es que el pseudocódigo no puede ser usado para dar soluciones 
> reales, ya que solo esta pensado para definir como seria un algoritmo (como una especie de borrador), mientas que el código
> real es la implementación de dicho borrador ya en el campo.

**2.** Dibuja un diagrama de flujo para calcular el promedio de 3 números.
> // datos de entrada
> int num1 = 2;
> int num1 = 4;
> int num1 = 6;
> 
> // proceso
> int n_nums = 3;
> int prom = (num1 + num2 + num3) / n_nums;
> 
> // datos de salida
> System.out.println(prom);

**3.** Realiza una prueba de escritorio del siguiente fragmento:

```c
int a = 4, b = 5, c;
c = a + b;
if (c % 2 == 0) {
    c = c * 2;
} else {
    c = c - 1;
}
```
> a=4, b=5, c=null
> c=4+5=9
> condición -> c no es multiplo de 2 -> false
> entra al else -> c = 9-1 = 8

**4.** Explica con tus palabras qué es la verificación y validación de un algoritmo, con un ejemplo.
> La verificación de un algoritmo es el proceso por el cual se comprueba que el código realiza las acciones planteadas 
> en el inicio, mientras que la validación es el proceso por el cual el algoritmo se prueba en campo y se revisa si efectamente
> cumple con su proposito (si resuelve el problema real).

---

### 💻 Sección 2: Elementos básicos del lenguaje

**5.** Escribe la estructura mínima de un programa completo en C, Java o Python que imprima "Diagnóstico completado".
```
public class Myclass {
    public static void main(String[] args) {
        System.out.println("Diagnostivo completado!");
    }
}
```

**6.** Declara variables para guardar: nombre (texto), edad (entero) y estatura (decimal). Asigna valores de ejemplo.
```
String name = "Luis Mora";
int age = 24;
float height = 1.7;
```
**7.** Evalúa la siguiente expresión y da el resultado lógico (con `a = 3, b = 6, c = 3`):

```c
(a == c) || (b < 3 && !(a > b))
// (true) or (false and not(false)) -> true
```

**8.** Escribe un programa que lea un número y diga si es par o impar.  
```
public boolean isPair(int num){
    int temp = num & 1; // operación lógica and con 1 binario
    boolean pair = (temp == 1) ? false : true; // si temp es 1 indica impar, si es 0 indica par
    return pair;
}
```

**9.** Explica la diferencia entre los tipos de datos `int`, `float` y `boolean`.
> El tipo de dato int solo guarda valores enteros, ya sean positivos o negativos.
> Float guarda valores numéricos con signo y admite valores decimales. Boolean solo guarda valores booleanos, verdadero o falso.

---

### 🧩 Sección 3: Estructuras de Datos

**10.** Dado un arreglo `int[] datos = {1, 2, 3, 4, 5};`, escribe una función que lo reciba y devuelva su suma. 
```
public int sumData(int[] datos) {
    int sum = 0;
    for (int num : datos) {
        sum += num;
    }
    return sum;
}
```

**11.** Explica con tus palabras qué es una lista ligada simple y cómo se recorre.
> Una lista ligada simple (LinkedList) es un arreglo unidimencional de valores individuales, es una estructura de datos
> que tiene un puntero al primer valor (head) y al último (tail), guarda la cantidad de elementos (longitud), y los elementos
> en si mismos guardan su valor (dependiendo del tipo de dato asociado) y un puntero asociado al siguiente elemento. Cada
> elemento es guardado una ubicación de memoria individual, de ahí la necesidad de los punteros.

**12.** Describe qué hace una pila (stack) y cómo se diferencian sus operaciones `push` y `pop`.
> Un Stack es una estructura de datos similar a las LinkedList pero con al diferencia que los elementos se "apilan" uno sobre
> el otro, como si fuera una torre de elementos, el método push agrega un elemento hasta arriba de la torre y el método 
> pop quita el elemento superior. Sigue la lógica LIFO.

**13.** Escribe código para una cola básica que permita insertar y eliminar elementos enteros.
```
public class Queue{
    int length = 0;
    Node first;
    Node last;
    
    public Queue(){}
    
    public void enQueue(int value) {
        Node temp = new Node(value);
        if (length == 0) {
            first = temp;
        } else {
            last.next = temp;
        }
        last = temp;
        ++length;
    }
    
    public Node deQueue(){
        if (length == 0) return null;
        Node temp = first;
        if (length == 1){
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        --length;
        return temp;
    }
}
```

**14.** Describe la propiedad que debe cumplir un árbol binario de búsqueda (BST).
> El BST jha de estar ordenado, los elementos de menor valor a la izquieda y los de mayor valor a la derecha.

**15.** Crea una matriz de adyacencia para representar un grafo no dirigido de 3 nodos donde todos están conectados entre sí.
```
     a
  //   \\
b ======== c    
```

---

### 🔧 Sección 4: Problemas prácticos (tipo examen real)

**16.** Realiza un programa que calcule el resultado de la serie:  
\[
1^3 + 2^3 + 3^3 + \dots + n^3
\]
```java
public int calSerie(int n) {
    int value = 0;
    for (int i = 0; i < n; i++) {
        value += (int) Math.pow(i+1, 3);
    }
    return value;
}
```

**17.** Escribe un programa que sume la serie:  
\[
1 + 3 + 5 + \dots + (2n - 1)
\]  
sin utilizar ciclos.

```
// 1 -> 1
// 2 -> 4
// 3 -> 9
public int sumValues(int n) {
    int value = 0;
    value = Math.pow(n, 2)
    return value;
}
```

**18.** Dado un arreglo de caracteres que termina en `'\0'`, cuenta cuántas veces aparece una `'a'` aislada (es decir, no seguida ni precedida por otra `'a'`).  
Ejemplo: `{a,d,a,a,f,a,g,r,r,a,'\0'}` → Resultado esperado: `3`
```
public int count(char[] array){
    int count = 0;
    
    char current, before, after;
    for (int i = 1; i < array.length-1; i++) {
        after = array[i+1];
        if (after == '\0'){
            break;
        }
        current = array[i];
        before = array[i-1];
        if (i == 1 && before == 'a' and current != 'a'){
            count += 1;
        }
        if (current == 'a' and before != 'a' and after != 'a'){
            count += 1;
        }
        if (i == array.length-1 and after == 'a' and current != 'a'){
            count += 1;
        }
    }
    
    return count;
}
```

**19.** Implementa una función que reciba una matriz `int[][] data` y almacene en un arreglo `result[]` la suma de sus diagonales (↘️ abajo-derecha).
```java
public int[] sumMatrix(int[][] data) {
    int[] matrix = new int[];
    return matrix;
}
```

**20.** Escribe una función que reciba un arreglo y lo invierta sin usar otro arreglo auxiliar.
```java
// 1, 2, 3, 4
public int[] invertArray(int[] data) {
    for (int i = 0; i < data.length / 2; i++) {
        int temp = data[i];
        data[i] = data[length - 1 - i];
        data[data.length - 1 - i] = temp;
    }
    return data
}
```

**21.** Dada una matriz de enteros, guarda en un arreglo todos los valores negativos o nulos y muestra su cantidad.
```java
public int[] countNums(int[][] data) {
    int count = 0;
    for (int i = 0; i < data.length; i++){ // fila
        for (int j = 0; j < data[0].length; j++) { // columna
            if (data[i][j] <= 0) {
                count += 1;
            }
        }
    }
    int[] nums = new int[count];
    count = 0;
    for (int i = 0; i < data.length; i++){ // fila
        for (int j = 0; j < data[0].length; j++) { // columna
            if (data[i][j] <= 0) {
                nums[count] = data[i][j];
                count += 1;
            }
        }
    }
    System.out.println(nums.length);
    return nums;
}
```

**22.** Explica qué hace el siguiente código y qué valor devuelve si `N = 10`:

```c
int mysterious(int N) {
    int i;
    int count = 0;
    for (i = 0; i <= N; i++) {
        if (i % 3 == 0) {
            count += i;
        }
    }
    return count;
}
```
> La función cuenta los númmeros multiplos de 3 contenidos desde 0 hasta N.
---

## ✍️ Fin del simulacro
