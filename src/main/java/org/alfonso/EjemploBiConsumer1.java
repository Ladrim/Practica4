package org.alfonso;

import java.util.function.BiConsumer;

public class EjemploBiConsumer1
{
    public static void main(String[] args)
    {
        BiConsumer<String,Integer> consumerBi = (nombre, edad) -> System.out.println(nombre+edad);

        consumerBi.accept("pepito",18);
    }
}
