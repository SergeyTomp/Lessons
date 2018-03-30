package animals.domasticAnimals;

import animals.Animal;

public class Cat extends DomasticAnimal { //имеет все свойства DomasticAnimal и Animal
    public Cat(String  name){
        super(name);
    }
    @Override //нужно чтобы это точно обозначить как переопределение, чтобы если у родителя нет такого метода, сразу подскажет
    public  void say (){
        super.say(); //можем использовать метод родителя
        System.out.println("Мяу - мяу");//скажет обе фразы
    }
    public void say (String text){
        System.out.println("cat cay" + text);
    }



    public static void main (String[]args){
        Cat cat = new Cat("Cat");
        cat.say();
        //перегрузка метода на разные типы аргументов
        //вызовразных методов в зависимости от набора аггументов
        cat.say ("мяааау");
        Dog dog  = new Dog ("Rich");
        dog.say ();
        dog.lifeWithPeople();

        //полиморфизм наследования, пока непонятно
        Animal animal1 = new Cat("animal - Cat");
        animal1.say();
//        animal1.lifeWithPeople(); //ошибка, так нельзя, класс Animal не имеет метода lifeWithPeople и не наследует его ниоткуда
        Animal animal2  = new Dog ("animal - dog");
        animal2.say ();


    }

}
