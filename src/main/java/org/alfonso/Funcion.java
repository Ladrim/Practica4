package org.alfonso;

@FunctionalInterface
public interface Funcion<T>
{
    public T transform(T a);
}
