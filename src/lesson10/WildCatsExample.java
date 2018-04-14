package lesson10;

public class WildCatsExample {
    public static void main (String [] args){
        GenericContainer <Integer> intContainer = new GenericContainer<>(null);
        getDouble(intContainer);
    }
//    public static double getDouble (GenericContainer<Number> container){
//        return container.getItemDefault(0.0).doubleValue();
//    }

    //upper bound wildcard - ограничиваем принимаем тип сверху
    //? - неизвестный тип
    // extends указывает на ограничение, в данном случае Number со всеми потомками
    // если без ?, то только Number без потомков

    public static double getDouble (GenericContainer <? extends Number> container){
        Number val = container.getItemDefault(null);
        //нельзя добавить ничего, кроме null, т.к. неизвестен конкретный тип на момент компиляции
        //но можно получить number
        return val == null ? 0.0 : val.doubleValue();
    }
    //ограничение снизу
    public static void printNum (GenericContainer<? super Number> container){
        //можем добавлять Number и всех наследников, но получить можем только Object
        Object val = container.getItemDefault(0.0);
    }
}
//можно применять для уточнения типа при описании класса
//чтобы использовать специализированные методы

class GenericNumContainer <T extends Number>{

}

//задание 1 - написать enum, который перечисляет планеты и возвращает массу планеты, её радиус и радиус орбиты
//задание 2 - написать LinkedList, Stack, Queue generic
//list.add("iuyoiuoi");
//stack.push("jkhkj");
