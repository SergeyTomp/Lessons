
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class array_list{
    public static void main(String[] args){
        //расширяемый массив
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("First Elem");
        System.out.println(list);
        list.add(1,"Second Elem");
        list.add(1,"Second Elem");
        list.add(2,"Second Elem");
        //при вставе на занятое место остальные сдвигаются
        System.out.println(list);
        //индекс добавляемого элементаравен или меньше размера массива
        String str = list.get(1);
        System.out.println (list.indexOf("Second Elem"));
        System.out.println(list);
        list.set(1,"New Elem"); // вставка на конкретный индекс
        list.contains("New Elem"); //есть/нет - true/false
        System.out.println(list);

        //перевести в обычный массив
        String [] newArr = new String[list.size()];
        list.toArray(newArr);
        System.out.println(newArr);
//        String [] newArr = list.toArray(new String[list.size()]);

        list.remove(2);//удаление по индексу
        list.remove("New Elem");//удаление по значению
//        list.remove((list.indexOf(2)));//удаление по значению
        list.remove((Integer)1); //удаление по значению, аргумент должен быть объектом

        //связный список
        List<String> list2 = new LinkedList<>();
        list2.add("Str1");
        list2.add("Str2");
        list2.add("Str3");
        list2.add("Str4");
        System.out.println(list2);

    }
}

