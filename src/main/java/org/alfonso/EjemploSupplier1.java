package org.alfonso;

import java.util.function.Supplier;

public class EjemploSupplier1
{
    public static void main(String[] args)
    {

        Supplier<String> proveedor = () -> {return "Hola lambda supplier";};
        System.out.println(proveedor.get());

    }
}
