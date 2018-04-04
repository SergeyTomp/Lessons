package lesson7;

public class FinalLesson {
    public static void main (String [] args){


    }
}

class FinalExample{
    //final могут быть
    //переменные
    //методы
    //аргументы методов
    //локальные переменные методов
    //классы
    final int finalVar= 9; // при объявлении final переменной сразу присвоить значение
    //значение final переменной нельзя изменить нигде
    int someInt;
    public FinalExample(){
        this.someInt = 90;
//        finalVar = 90; //ошибка
}

// методы final
// не могут быть переопределены в наследниках
final void finalVoid(){
    System.out.println("FinalVoid");
}
final class FinalClass{
    // класс final  не может иметь наследников, все методы тоже становятся final, это можно не указывать

}


public void someVoid (final int a){
    // аргумент метода -  при вызове метода ему передаётся любое значени, но внутри метода аргумент не может быть изменён
    if (a ==9){

    }
    this.someInt = a; //так можно, т.к. а не меняется
}