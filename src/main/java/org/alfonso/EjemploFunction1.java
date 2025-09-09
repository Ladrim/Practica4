package org.alfonso;

import java.util.function.Function;

public class EjemploFunction1
{
    public static void main(String[] args)
    {
        Function<String,String> f1 = input -> {return "Hola que tal " + input;};
        System.out.println(f1.apply("Perico"));


        Function<String,String> f2 = String::toUpperCase; //parametro -> parametro.toUpperCase(); //Es lo mismo
        System.out.println(f2.apply("convertir texto a mayúsculas"));


    }
}
