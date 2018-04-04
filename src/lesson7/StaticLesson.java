package lesson7;

public class StaticLesson{
    public static void main (String[]args){

        System.out.println(StaticExample.staticVar);
        //доступ к статическим методам через имя класса, без создания объекта
        StaticExample staticExample = new StaticExample();
        StaticExample staticExample2 = new StaticExample();
        StaticExample staticExample3 = new StaticExample();

        System.out.println(staticExample.getNotStaticVar());
        System.out.println(staticExample.getStaticVar());

        System.out.println(staticExample2.getNotStaticVar());
        System.out.println(staticExample2.getStaticVar());

        System.out.println(staticExample3.getNotStaticVar());
        System.out.println(staticExample3.getStaticVar());
    }

}


class StaticExample{
    //статическими могут быть
    //переменные
    //методы
    //вложенные классы
    static int staticVar = 0;
    int notStaticVar = 0;

    public StaticExample(){
        staticVar ++;
        notStaticVar = 0;
    }
    public int getStaticVar() {
        return staticVar;
    }

    public int getNotStaticVar(){
        return notStaticVar;
    }
    static void StaticVoid(){
        //могут вызывать только другие статические методы
        //могут напрямую работать только со статическими переменными, с остальными только опосредованно
        //в них не используются this, super
        System.out.println(staticVar);
//        System.out.println (this.notStaticVar);//ошибка - this нельзя
    }
     interface StaticInterface{
        // сттические методы доступны внутри интерфейса
         //обращение через имя интерфейса
        //c java 8 в интерфейсах можно делать описанные статические методы, но их нельзя переопределять при реализации
        static void staticVoid (){
            System.out.println("staticVoid StaticExample");
        }
     }
}