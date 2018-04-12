package lesson9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class Collection {


    private String name;
    private int count;

    public Collection(String name, int count) {
        this.name = name;
        this.count = count;
    }

//    по умолчанию при таком переопределении через alt+insert вместо штатного метода сравнения по равенству ссылок на объект
//      будет предложено переопределить метод с использованием сравнения по параметрам (переременным) из конструктора класса

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Collection that = (Collection) o;
        return count == that.count &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, count);
    }

    public static void main(String[] args) throws IOException {
        Collection col = new Collection("ColEx", 4);
        Collection col2 = new Collection("ColEx", 4);
        Collection col3 = new Collection("Example", 2);

        System.out.println(col.hashCode());
        System.out.println(col2.hashCode());
        System.out.println(col3.hashCode());

        System.out.println(col.equals(col2));// по умолчанию true  если ссылки равны, иначе false
        //если метод сравнения не переопределён, вернёт false, если переопределить - true
        System.out.println(col.equals(col3));
        // в любом случае вернёт false, т.к. переменные конструктора и ссылки разные

        //Collection Framework
        //interface Collection

//        int size(); //размер коллекции
//        boolean IsEmpty(); //
//        boolean contains (Object obj);
//        boolean add (elem);
//        boolean remove (Object obj);
//        containsAll (Collection<?> c); //
//        boolean addAll (Collection c);//добавит в коллекцию всё, что в аргументе
//        boolean removeAll (Collection<?> c); //удаляет все элементы из аргумепнта
//        boolean retainAll (Collection<?> c); //оставит те, что в аргумепнте
//        void clear; //удаляет всё


        //от Collection имплементированы следующие интерфейсы
//        1. interface Set
//        эта коллекция не может содержать дублирующиеся элементы, при добавлении вернёт фалсе
//        от неё имплементированы  HashSet, LinkedHashSet и TreeSet
//           HashSet - реализация на основе хеш-таблицы.
//           Это наиболее эффективная реализация,
//           но она не гарантирует сохранение порядка элементов при обходе,
        Set<String> strings = new HashSet<>();
        System.out.println(strings.add("ertytht"));
        System.out.println(strings.add("cnbcvn"));
        System.out.println(strings.add("hhhhfg"));
        System.out.println(strings.add("xcxnbc"));
        System.out.println(strings.size());

        for (String str: strings){
            System.out.println(str);
        }

        //можно вернуть объект итератора, у которого есть метод hasNext
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println("with iterator" + iterator.next());
        }

        Set<Collection> colex = new HashSet<>();
        System.out.println(colex.add(col));
        System.out.println(colex.add(col2)); //результат зависит от того, переопределён ли метод сравнения:
        // если нет, добавит, т.к. ссылки разные
        // если да, то не добавит, т.к. по содержанию объекты одинаковые

        System.out.println(colex.size());
        System.out.println(colex.contains(col2));

//            LinkedHashSet - реализация на основе хеш-таблицы,
//                но дополнительно пролинкованная связанным списком.
//                Эта реализация избавляет от хаотичного порядка элементов
//                и лишь незначительно хуже по эффективности HashSet-а.



//            TreeSet - упорядочивает элементы в соответствии с их значениями,
//        но работает значительно медленнее HashSet
//        )

//        2. interface List - упорядоченная коллекция, кот. может содержать одинаковые элнмнент
//           в этом интерфейсе добавляются:
//           доступ, удаление, добавление по индексу
//           поиск элементов
//           операции с частью списк
//          в ListIterator добавлено previous и hasPrevious
// чтобы создать объект нужно указывать класс, реализующий интерфейс, НЕ ЗАБЫВАТЬ!!!!
        List<String > arrLst = new ArrayList<>();//меньше жрёт память, но медленнее при вставке в середину
        List<String > linkedLst = new LinkedList<>(); //больше жрёт память но быстрее при вставке в середину

        arrLst.subList(1,3).clear();//удаление элементов от 1 до 2 включительно, 3 не включает
        arrLst.size();

//       3. interface Queue - однонаправленная очередь
        Queue<String> queue = new PriorityQueue<>(); //нужно указывать класс, реализующий интерфейс  НЕ ЗАБЫВАТЬ!!!!
        Queue<String> queue2 = new LinkedList<>();
        Queue<String> queue3 = new ArrayDeque<>();

        //для каждой строки
        File txt = new File("./src/lesson9/testFile");
        List lines = Files.readAllLines(txt.toPath());

        //перервести внижний регистр
        //убрать пробеля в начале и конце
        // поместить в коллекцию только непустые слова

//      element(); возврвщает, НЕ удаляет элемент из начала очереди, если элементов нет, вернёт исключение
//      peek(); возвращает, НЕ удаляет элемент из начала очереди, если элементов нет, вернёт null
//      remove(); возврвщает, И удаляет элемент из начала очереди,
//      poll(); возврвщает, И удаляет элемент из начала очереди, если элементов нет, вернёт null
//





    }
}
