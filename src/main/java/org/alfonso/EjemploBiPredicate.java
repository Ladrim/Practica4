package org.alfonso;

import org.alfonso.ejemplobiconsumer2.Usuario;

import java.util.function.BiPredicate;

public class EjemploBiPredicate
{
    public static void main(String[] args)
    {
        BiPredicate<Integer,Integer> comprobador = (a, b) -> a>10 && b>5;
        boolean resultado = comprobador.test(9,6);
        System.out.println(resultado);

        BiPredicate<String,String> comprobador2 = String::equalsIgnoreCase; //a.equalsIgnoreCase(b) Es lo mismo
        System.out.println(comprobador2.test("hola","HOLA"));

        Usuario a = new Usuario();
        Usuario b = new Usuario();

        a = b;

        a.setNombre("perico");
        b.setNombre("palotes");

        BiPredicate<Usuario,Usuario> comprobador3 = (usuario1,usuario2) -> usuario1.equals(usuario2);
        BiPredicate<Usuario,Usuario> comprobador4 = (usuario1,usuario2) -> usuario1.getNombre().equals(usuario2.getNombre());
        System.out.println(comprobador3.test(a,b));
        System.out.println(comprobador4.test(a,b));


    }
}
