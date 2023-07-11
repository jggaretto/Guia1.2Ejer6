

package ejer6;


public class Ejer6 {

    
    public static void main(String[] args) {
       // Crear un objeto Triángulo válido
        Triangulo triangulo1 = new Triangulo(5, 5, 5);

        // Mostrar por consola que tipo de triángulo es.
        System.out.println("El triángulo es " + triangulo1.tipoTriangulo());

        // Crear un objeto Triángulo inválido
        Triangulo triangulo2 = new Triangulo(1, 2, 3);

        // Mostrar por consola que tipo de triangulo es.
        System.out.println("El triángulo es " + triangulo2.tipoTriangulo());
    }
    }
    
/*
Este programa crea una clase llamada Triangulo con los atributos lado1, lado2 
y lado3, y los métodos necesarios para inicializar y acceder a estos atributos. 
También tiene los métodos esUnTriangulo() y tipoTriangulo() que determinan si los lados 
del triángulo cumplen con la regla principal del triángulo y devuelven su tipo respectivamente.

La clase principal (Main) crea dos objetos Triangulo, uno válido (con lados iguales) 
y otro inválido (con lados que no cumplen la regla del triángulo) y utiliza los métodos 
de la clase Triangulo para determinar su tipo y mostrarlo por consola.
*/
