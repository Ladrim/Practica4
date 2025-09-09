package org.alfonso;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;

public class EjemploConsumer1
{
    public static void main(String[] args)
    {

        Consumer<String> consumer1 = string -> System.out.println(string);
        consumer1.accept("consumer1 test");


        Consumer<String> consumerOldWay = new Consumer<String>()
        {
            @Override
            public void accept(String string)
            {
                System.out.println(string);
            }
        };

        Consumer<Date> consumer2 = fecha ->
        {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumer2.accept(new Date());

        Consumer<Date> consumer3 = fecha -> fechaConFormato(fecha);
        consumer3.accept(new Date());

        Consumer<String> consumer4 = System.out::println;

        List<String> nombres = new ArrayList<>();
        nombres.add("andres");
        nombres.add("pepe");
        nombres.add("luz");
        nombres.add("paco");
        nombres.forEach(consumer4);
    }

    public static void fechaConFormato (Date fecha)
    {
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(f.format(fecha));
    }


    public static class ConsumerToConsole implements Consumer<String>
    {
        @Override
        public void accept(String s)
        {
            System.out.println(s);
        }
    }
}
