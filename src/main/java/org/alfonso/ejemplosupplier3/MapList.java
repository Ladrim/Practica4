package org.alfonso.ejemplosupplier3;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class MapList<K,V>
{
    private final Map<K, List<V>> map;
    private Supplier<List<V>> listSupplier;

    public MapList(Supplier<Map<K, List<V>>> mapSupplier, Supplier<List<V>>listSupplier)
    {
        map = mapSupplier.get();
    }

    public void add(K key, V value)
    {
        List<V>list = map.get(key);

        if (list != null)
        {
            list.add(value);
        }
        else
        {
            list = listSupplier.get();
            list.add(value);
            map.put(key, list);
        }
    }
}
