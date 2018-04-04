package lesson7;

public class InnerLesson {
    public static void main(String []args){
        OuterClass outerClass = new OuterClass;
        //объект внутреннего класса создаётся через внешний
        OuterClass.InnerStatic innerStatic = new OuterClass.InnerStatic();
        //после создания объекта доступ напрямую
        innerStatic.someVoid();

        Object obj = outerClass.voidWithClass();
//        obj.localVoid();
        //анонимное создание
        OuterClass.InnerClass innerClass = outerClass.new InnerClass(); //создание через объект
    }
}
class OuterClass{
    //статик
    private int notStaicInt = 1;
    private static int staticInt = 2;

    public OuterClass(){
        //при создании объекта внутреннего класса доступ полный ко всему стаффу внутреннего класаа
        InnerStatic innerStatic = new InnerStatic();
        System.out.println(innerStatic.innerInt);
        innerStatic.someVoid();

        InnerClass innerClass = new InnerClass();
        innerClass.innerVoid();
    }

    static class InnerStatic{
       private int innerInt = 1;
       public void someVoid (){
            //нет доступа к нестатическим методам и переменным внешнего класса
            staticInt++;
//            notStaticInt; //ошибка
       }
    }
    //member inner class
    class InnerClass {
        // если внутренний класс нестатический, ему доступны все методы и свойства внешнего класаа
        // но сам он не может содержать статических методов
        public void innerVoid(){
            System.out.println(notStaicInt);
            System.out.println(staticInt);
        }

    }

    public Object voidWithClass(){
        class LocalClass{
            public void localVoid(){
                System.out.println(staticInt);
                System.out.println(notStaicInt);

            }
        }
        LocalClass localClass = new LocalClass();
        return localClass;
    }

}

