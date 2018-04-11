package lesson9;

import java.util.*;

public class MapExample {
// интерфейс Map
    // в контейнерах Map хрпнятся объекты, не примитивы. 2 объекта: ключ т значение
// ключи должны быть уникальными, значения - не обязательно
// Существуют возможность искать объекты по ключу

    //interface SortedMap - по возрастанию ключей
    //interface NavigableMap - расширяет SortedMap
    //interface Map.Entry позволяет работать с элементами Map

    //HashMap - структура данных для хранения пары: ключ и значение любого типа,
    // оба могут быть null
    //порядок элементов не по порядку добавления
    //Разрешение коллизий - методом цепочек

    //TreeMap коллекция с отсортированными ключами
    //LinkedMap - запоминается поряток добавления
    //WeekHashMap - значения могут удаляться сборщиком мусора, если не используются
    //IdentityHashMap - ключи срвниваются с помощью == вместо equals

//    interface Map<K,V>;

    //методы

//    void clear() удаляет все пары ;
//    boolean containsKey(Object key);
//    boolean containsValue(Object key);
//    boolean equals (Object key);
//    true если obj - это map, который содержит одинаковые значения
//    boolean isEmpty()
//    put (key, val)
//    putAll()
//    remove (key);
//    int size()
//    get (key)

    // интерфейс Map даёт три способа доступа к данным:
    //set из ключей getKey
    //коллекцию из значений getValues
    // set из пары  ключ - значение entrySet

//    for (Map.Entry entry: mapName.entrySet()){
//        entry.getKey
//        entry.getValue
//    }


    public static void main (String [] args){
        Map<String, String > hashMap = new HashMap<>();
        hashMap.put("key", "value");
        hashMap.put("key1", "value1");
        hashMap.put(null, "value1");
        System.out.println(hashMap.get("key1"));

        for (Map.Entry entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    // можно сделать неизменяемую мапу
        Map<Integer, String > newMap = new HashMap<>();
        newMap.put(1, "value");
        newMap.put(2, "value1");
        newMap.put(3, "value");
        newMap.put(4, "value1");
        Map<Integer, String > newMap2 = Collections.unmodifiableMap(newMap);//newMap2 изменить будет нельзя
//        newMap2.put(45, "hjgjkj"); //будет ошибка

    //TreeMap - для хранения элементов применяют дерево
    //объекты в отсортированном виде: ключи по возрастанию
    //время доступа больше, чем у HashMap, но несильно
    //null не может быть ключом

        Map<String,String>treeMap = new TreeMap<>();
        treeMap.put("333", "value1");
        treeMap.put("67", "value2");
        treeMap.put("key", "value3");
        System.out.println();
        for (Map.Entry entry: treeMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    //   конструкторы
    //   TreeMap();
    //   TreeMap(Comparator comp);
    //   TreeMap(Map m);
    //   TreeMap(SortedMap sortm);




        //так делается компараток, который передаётся в конструктор TreeMap(Comparator comp);
        class CustCorp implements Comparable{

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
    // LinkedHashMap - расширяет  HashMap, порядок элементов в порядке добавления
        Map<String,String>lnkMap = new LinkedHashMap<>();
        lnkMap.put("333", "value1");
        lnkMap.put("67", "value2");
        lnkMap.put("key", "value3");
        System.out.println();
        for (Map.Entry entry: lnkMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

}
