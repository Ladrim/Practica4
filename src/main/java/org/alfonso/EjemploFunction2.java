package org.alfonso;

import java.util.ArrayList;
import java.util.List;

public class EjemploFunction2
{
    public static void main(String[] args)
    {
        Funcion<String> funcion = new Funcion<>()
        {
            @Override
            public String transform(String string)
            {
                return string.toUpperCase();
            }
        };

        Funcion<String> funcion2 = (String string) -> { return string.toUpperCase(); };
        Funcion<String> funcion3 = string -> { return string.toUpperCase(); };
        Funcion<String> funcion4 = s -> { return s.toUpperCase(); };
        Funcion<String> funcion5 = s -> s.toUpperCase();
        Funcion<String> funcion6 = String::toUpperCase;
        Funcion<String> funcion7 = s -> funcionEnElCodigo(s);

        String resultado = funcion.transform("alfonso");
        String resultado2 = funcion2.transform("holaquepasa");


        System.out.println(resultado);
        System.out.println(resultado2);


        List<String> list = new ArrayList<>();
        list.stream().filter( string -> string.equals("BOLICHERO") );

        list.stream().filter( input -> filtrarNombres(input) );
    }
    public static String funcionEnElCodigo(String string)
    {
        return string.toUpperCase();
    }
    public static Boolean filtrarNombres(String input)
    {
        return !input.equals("BOLICHERO") && input.startsWith("A") && (input.isEmpty());
    }
}
