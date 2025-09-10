package org.alfonso;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EjemploPredicate2
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.stream().filter( new PredicateBolichero());
    }


    public static class PredicateBolichero implements Predicate<String>
    {
        @Override
        public boolean test(String string)
        {
            return string.equals("BOLICHERO");
        }
    }
}
