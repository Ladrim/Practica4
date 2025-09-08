package org.alfonso.ejemplobiconsumer2;

import java.util.function.BiConsumer;

public class Main
    //input1, input2 -> void (BiConsumer) accept
{
    public static void main(String[] args)
    {
        Usuario usuario = new Usuario();

        BiConsumer<Usuario,String> asignarNombre = Usuario::setNombre;

        asignarNombre.accept(usuario,"pepito");

        String imprimirUsuario = usuario.toString();
        System.out.println(imprimirUsuario);
    }
}
