package org.alfonso;

import java.util.function.Predicate;

public class EjemploPredicate1
{
    public static void main(String[] args)
    {
        Predicate<Integer> ejemplo = a -> a>0;
        System.out.println(ejemplo.test(4));

        Predicate<String> ejemplo2 = a -> a.equals("a");
        System.out.println(ejemplo2.test("b"));


    }
}
