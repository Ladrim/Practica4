package org.alfonso.ejemplocustomlambda;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Calculadora
{
    private Map<TipoDeCalculo, OperacionAritmetica<?>>operations;

    public Calculadora ()
    {
        this.operations = new HashMap<>();
    }

    public Map<TipoDeCalculo, OperacionAritmetica<?>> getOperations()
    {
        return operations;
    }


    public <T> T calculadora2 (T a, T b, TipoDeCalculo tipoDeCalculo)
    {
        OperacionAritmetica<?>operacion = operations.get(tipoDeCalculo);

        if (operacion != null && operacion.tipoDeDato.isInstance(a))
        {
            OperacionAritmetica<T>operacion2 = (OperacionAritmetica<T>) operacion;
            return operacion2.funcion.operacion(a, b);
        }
        return null;
    }

    public <T> T calcular (T a, T b , Aritmetica<T> aritmetica)
    {
        return aritmetica.operacion(a,b);
    }

    public <T> T calcular2 (T a , T b, BiFunction<T,T,T> biFunction)
    {
        return biFunction.apply(a,b);
    }

    public void addOperacion (TipoDeCalculo tipoDeCalculo, OperacionAritmetica<?> aritmetica)
    {
      operations.put(tipoDeCalculo,aritmetica);
    }

    @Override
    public String toString()
    {


        String operationsAsString = operations.entrySet().stream()
            .map( it -> it.getKey().toString() )
            .collect(Collectors.joining(" "));




        return "operations=" + operationsAsString +
                '}';
    }
}

