package org.alfonso.ejemplocustomlambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main
{
    public static void main(String[] args)
    {
        BiFunction<Integer, Integer, Integer> sumaBiFunction = (a, b) -> a + b; // Test
        BiFunction<Double, Double, Double> restaBiFunctionDouble = (a, b) -> a - b; // Test

        Aritmetica<Integer> suma = (a, b) ->  a + b;
        Aritmetica<Integer> resta = (a, b) -> a - b;
        Aritmetica<Integer> multiplicacion = (a, b) -> a * b;

        Aritmetica<Double> sumaDouble = (a, b) -> a+b;
        Aritmetica<Double> multiplicacionDouble = (a, b) -> a * b;

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.calcular(1,2,suma));
        System.out.println(calculadora.calcular(1,2,(a,b) -> a +b));
        System.out.println(calculadora.calcular(2,4,resta));
        System.out.println(calculadora.calcular(5,6,multiplicacion));
        System.out.println(calculadora.calcular(5d,6d,sumaDouble));

        System.out.println(calculadora.calcular2(1,2,sumaBiFunction));
        System.out.println(calculadora.calcular2(3.4d,5.2d, restaBiFunctionDouble));
        System.out.println(calculadora.calcular2(2d,5d,(a,b) -> a * b));
        System.out.println(calculadora.calcular2("hola","hola",(a,b)-> a + " " + b)); // test
        System.out.println(calculadora.calcular(1,2,(a,b)->a-b));

        OperacionAritmetica<Integer>suma2 = new OperacionAritmetica<>();
        suma2.tipoDeDato = Integer.class;
        suma2.funcion = (a, b) -> a + b;

        calculadora.addOperacion(TipoDeCalculo.SUMA, suma2);

        System.out.println(calculadora.calculadora2(2, 3, TipoDeCalculo.SUMA));

        System.out.println(calculadora.toString());




    }
}
