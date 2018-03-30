package animals.domasticAnimals;

public class Dog extends DomasticAnimal { //имеет все свойства DomasticAnimal и Animal
    public Dog(String  name){
        super(name);
    }
    @Override //нужно чтобы это точно обозначить как переопределение, чтобы если у родителя нет такого метода, сразу подскажет
    public  void say (){
        super.say();
        System.out.println("Гав - гав");
    }
//    public static void main (String[]args){
//        Dog dog = new Dog("Rich");
//    }
}
