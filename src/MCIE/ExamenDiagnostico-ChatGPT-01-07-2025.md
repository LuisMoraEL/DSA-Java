
# 🧪 Examen Diagnóstico de Programación

**Nombre:** LuisMoraEL  
**Fecha:** 01/07/2025

---

## ✅ Instrucciones

- Responde **una pregunta por subtema** del temario.
- Puedes usar pseudocódigo o el lenguaje de programación de tu elección.
- No es necesario compilar, pero la lógica debe ser clara.
- Al finalizar, guarda tus respuestas y envíalas para revisión.

---

## 🧠 Unidad 1 – Algoritmia

### 1.1 Definición
1. Explica brevemente qué es un algoritmo y menciona tres características fundamentales que debe tener.
> Un algoritmo es una secuencia de instrucciones cuyo fin es satisfacer una determinada necesidad dada, este puede recibir 
> de entrada y puede o no devolver datos a la salida. Caracteristicas: finito, preciso y ordenado

### 1.2 Formulación y especificación
2. Especifica un algoritmo para calcular el área de un triángulo dados su base y altura.
> * Inicio:
> * Recibir datos de entrada: altura, base
> * Calcular el area: base por altura entre 2
> * Devolver el valor del area
> * Fin
> * Ejemplo de código
```
// Java
public int triangleArea(double base, double heigh) {
    return (base * heigh) / 2;
}
```

### 1.3 Técnicas de Especificación
3. Escribe el pseudocódigo de un algoritmo que reciba tres números e indique cuál es el mayor.

```
// Java
public int maxValue(int a, int b, int c) {
    int maxV = a;
    if (maxV < b) {
        maxV = b;
    } else if (maxV < c) {
        maxV = c;
    }
    return maxV;
}
```

### 1.4.1 Pruebas de Escritorio
4. Haz una prueba de escritorio para el siguiente código (puedes usar una tabla):

```c
int a = 3, b = 2, c;
c = a * b;
c = c + 4;
if (c > 10) {
   c = c - 1;
} else {
   c = c + 1;
}
```

1. a=3, b=2, c=null
2. c=3*2=6
3. c=6+4=10
4. c=10 > 10 -> False
5. else -> c=10+1

### 1.4.2 Verificación y validación formal
5. ¿Cuál es la diferencia entre verificación y validación en el desarrollo de algoritmos?

> Verificación: proceso por el cual se comprueba que el algoritmo se ha construido correctamente en base a los requisitos
> y especificaciones técnias dadas. ¿El producto se construyó correctamente?
> 
> Validación: proceso por el cual se asegura que el algoritmo cumple con las necesidades del usuario y si resuelve el problema
> correctamente -> ¿El producto construido es el correcto?
> 
> Ejemplo: se requiere de un algoritmo de ordenamiento de un arreglo de números, se desarrolla uno tipo QuickSort, se verifica
> si ordena los números como se espera, luego se valida si este algoritmo cumple con las necesidades reales.

---

## 💻 Unidad 2 – Elementos básicos del lenguaje

### 2.1 Estructura de un programa
6. Escribe la estructura mínima de un programa en el lenguaje de tu elección.

```
// Java
package Example

public class MyClass {
    public static void main(String[] args) {
    System.out.println("hola mundo!");
    }
}
```

### 2.2 Compilación y ejecución
7. Explica brevemente el proceso de compilación y ejecución de un programa en un lenguaje compilado.

> En lenguajes compilados, tales como C/C++, existe una herramienta llamada "Compilador" el cual convierte el código escrito
> de los archivos fuente en código ensamblador (lenguaje de bajo nivel específico para cada arquitectura), dando como salida
> un archivo con código ensamblador. Posteriormente se sigue un proceso para generar un archivo ejecutable en base al código ensamblador.
> 
> Por otra parte, la ejecución se refiere a la carga y ejecución en memoria del programa, la CPU ejecuta directamente las 
> instrucciones máquina dadas en el lenguaje original.

### 2.3 Variables
8. Declara tres variables de distinto tipo (entero, decimal y texto) y asígnales un valor.

```
// Java
int entero = 10;
double variableGrange = 100.0;
String miTexto = "Hola mundo";
```

### 2.4 Operadores aritméticos, relacionales y lógicos
9. ¿Cuál es el resultado de la siguiente expresión lógica si `a=3`, `b=4`, `c=5`?

```c
(a < b) && (b > c) || !(a == 3)
```

```
(True and False) or False -> False
```

> El resultado es False.

### 2.5 Estructuras de Control y Selección
10. Escribe un fragmento de código que imprima si un número es positivo, negativo o cero.

```
// Java
int myNumber = -67;

if (myNumber > 0) {
    System.out.println("El número es positivo!");
} else if (myNumber == 0) {
    System.out.println("El número es cero!");
} else {
    System.out.println("El número es negativo!");
}
```

### 2.6 Tipos de Datos
11. ¿Qué diferencias hay entre los tipos de datos `int`, `float` y `char`?

> La diferencia entre ellos es la siguiente: 
> int -> tipo de dado primitivo (de los más simples y básicos) que guarda valores enteros con signo, el rango de valores
> que puede guardar varia entre cada lenguaje, pudiendo llegar a valores de hasta más de +-65,000.
> 
> float -> tipo de dato primitivo que guarda valores números con signo y punto decimal, igualmente la resolución o cantidad
> de cifras que puede guardar varia entre cada lenguaje.
> 
> char -> tipo de dato primitivo que almacena caracteres, normalmente se asigna un valor a este tipo de dato con comillas 
> simples 'a' aunque en realidad las almacena en su valor del código ASCII, es la base para los Strings, los cuales en lenguajes
> como Java son tipo de dato avanzado que se define con su propia clase.

---

## 🧩 Unidad 3 – Estructuras de Datos

### 3.1 Arreglos – Vectores y Matrices
12. Escribe una función que reciba un arreglo de enteros y devuelva la suma de sus elementos.

```
// Java
public int sumValues(int[] data) {
    int sum = 0;
    for (int num : data) {
        sum += num;
    }
    return sum;
}
```

### 3.2 Listas – Ligadas simples y dobles
13. Describe con tus palabras cómo funciona una lista ligada simple y menciona una ventaja sobre un arreglo.

> Una LinkedList no es más que una lista que guarda los siguientes elementos: head, tail, length, y el propio listado de elementos,
> cada elemento guarda su propio valor (cualquier tipo de dato realmente, incluyendo objetos) y una referencia al siguiente
> elemento con el que se encuentra relacionado. Los elementos son guardados en memoria de manera individual y la referencia 
> permite acceder a cada uno de manera ordenada. Ejemplo: 1->2->3->4

### 3.3 Pilas
14. ¿Cuál es la operación principal de una pila? Escribe código o pseudocódigo para `push` y `pop`.

> La operación principal de una pila es agrear o obtener elementos que se encuentran hasta "Arriba" del listado

```
// Java
public void push(int value) {
    Node newNode = new Node(value);
    if (height == 0) {
        top = newNode;
    } else {
        newNode.next = top;
        top = newNode;
    } 
    ++height;
}

public Node pop() {
    if (height == 0) return null;
    Node temp = top;
    top = top.next;
    temp.next = null;
    --height;
    return temp;
}
```

### 3.4 Colas
15. Explica la diferencia entre una cola y una pila en cuanto al orden de acceso a los elementos.

> Una cola (Queue) es un listado tipo FIFO (First In First Out) el cual ordena elementos tal cual como en una fila, el primer
> elemento en ser agregado es el primero en salir.
> 
> Una pila (Stack) es un listado tipo LIFO (Last In First Out) en el cual el primer elemento en ser agregado es el primero en 
> salir.

### 3.5 Árboles
16. ¿Qué es un árbol binario de búsqueda (BST)? ¿Qué propiedad debe cumplir?

> Un BST es una estructura de datos jerárquica y dinámica que organiza eficientemente datos para que sea posible realizar
> operaciones de busqueda, inserción y eliminación. Para que un árbol binario sea considerado un BST debe de cumplir la
> siguiente condición
> 
> - Todos los nodos del subárbol izquierdo del nodo N tienen valores menores que N.
> - Todos los nodos del subárbol derecho de N tienen valores mayores que N.
> 
> Ejemplo
```
8
/ \
3   10
/ \    \
1   6    14
/ \   /
4   7 13 
```
> - Los BST mantienen los datos ordenados, lo cual permite realizar busqueda binaria y recorridos ordenados.
> - Cada nodo tiene como máximo dos hijos, izquierdo y derecho. La forma del árbol depende del orden de inserción.
> - Las operaciones básicas permitidas son: busqueda, inserción y eliminación.

### 3.6 Grafos
17. Representa un grafo no dirigido con 4 nodos usando una matriz de adyacencia.

> Un grafo es una estructura de datos no lineal que modela relaciones entre objetos. Está compuesto por Vértices (nodos)
> los cuales representan entidades, y por aristas (arcos) que representan conexiones o relaciones entre vértices.
> 
> Sus componentes básicos son los vértices (nodos), aristas (conexiones entre vértices) y pesos (valor asignado a una arista).
> 
> Sus aplicaciones clave son en los algoritmos de rutas más cortas, redes para el análisis de tráfico, recomendaciones
> usuario - producto e IA.
> 
> Ejemplo del grafo:

```
# Python
# Nodos: A (0), B (1), C (2), D (3)

matriz_adyacencia = [
    #A  B  C  D
    [0, 1, 1, 0],  # A: conectado a B y C
    [1, 0, 1, 1],  # B: conectado a A, C y D
    [1, 1, 0, 0],  # C: conectado a A y B
    [0, 1, 0, 0]   # D: conectado solo a B
]
```
> Visualización del gráfo
```
      A
     / \
    B — C
     \
      D
```
---

## ✍️ Fin del examen
