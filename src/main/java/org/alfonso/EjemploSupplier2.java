package org.alfonso;

import org.alfonso.ejemplobiconsumer2.Usuario;

import java.util.function.Supplier;

public class EjemploSupplier2
{
    Supplier<Usuario> creaUsuario = Usuario::new;

    Usuario usuario = creaUsuario.get();
}
