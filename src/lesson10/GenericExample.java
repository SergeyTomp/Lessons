package lesson10;

public class GenericExample {
    /*  Подход к описантю данных и алгоритмов, который позволяет их использовать
    с различными типами данных без изменения их описания

    */
    public static void main(String[] args) {
        Container container1 = new Container("SomeValue");
        Container container2 = new Container(null);
        String str = (String) container1.getItemDefault("Default value");
        Integer integer = (Integer) container2.getItemDefault(0);
//        Integer integer2 = (Integer) container2.getItemDefault("Default value"); //ошибка при выполнении

        GenericContainer<String>  qcont1 = new GenericContainer<>("SomeValue");
        GenericContainer<String>  qcont2 = new GenericContainer<>(null);
        String str1 = (String) qcont1.getItemDefault("value");
//        Integer integer1 = qcont2.getItemDefault("SomeValue");//ошибка на моменте компиляции

//// raw типы - для совместимости со старой явой, можно так - без <>, но будет подсвечивать сомнения
//        GenericContainer qcont3 = new GenericContainer("SomeValue");
//        GenericContainer  qcont4 = new GenericContainer(null);
//        String str5 = (String) qcont1.getItemDefault("value");

        Pair<String, Integer> pair = new Pair<>("key",4);

        //generic соблюдает правила полиморфизма
        GenericContainer<Number> numbCont = new GenericContainer<>(null);
        Number number = numbCont.getItemDefault(0);
        Number number1 = numbCont.getItemDefault(0.0);
    }
}

    class Container {
        private Object item;
        public Container(Object item) {
            this.item = item;}

    public Object getItemDefault(Object dflt){
        return item == null ? dflt : item;

    }
}

class GenericContainer <T>{ //в угловых скобках указывается неизвестныйтип
    private T item;
    public GenericContainer(T item){
        this.item = item;
    }
    public T getItemDefault (T dflt){
        return item == null ? dflt : item;
    }
}
/* Допускается использовать несколько generic  типов*/
class Pair <K,V>{
    private K key;
    private V value;
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;

    }

    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
}
