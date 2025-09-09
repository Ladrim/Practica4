package org.alfonso;

import java.util.function.BiFunction;

public class EjemploBiFunction
{
    public static void main(String[] args)
    {
        BiFunction<String,String,String> f1 = (pamametro1, parametro2) -> {return pamametro1.toUpperCase()+parametro2.toUpperCase();};
        System.out.println(f1.apply("Hola ","Que pasa"));

        BiFunction<String,String,String> f2 = (parametro1,parametro2) -> parametro1.toUpperCase().concat(parametro2.toUpperCase());
        System.out.println(f2.apply("Hola2 ","Que pasa2"));

        BiFunction<String, String, Integer> f3 = (a,b) -> a.compareTo(b); //compareTo devuelve un entero
        System.out.println(f3.apply("perico","perico"));

        BiFunction<String, String, String> f4 = (a,b) -> a.concat(b);
        System.out.println(f4.apply("perico","perico"));
    }
}
