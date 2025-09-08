package org.alfonso.ejemplocustomlambda;

@FunctionalInterface
public interface Aritmetica<T>
{
    public T operacion(T a, T b);
}
