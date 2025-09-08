package org.alfonso.ejemplobiconsumer2;

public class Usuario
    //input1, input2 -> void (BiConsumer) accept
{
   private String nombre;

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    @Override
    public String toString()
    {
        return "nombre= " + nombre;
    }
}
