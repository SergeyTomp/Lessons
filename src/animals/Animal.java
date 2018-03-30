package animals;

public class Animal {
// модификаторы доступа
//    public виден везде
//    protectred в рамках пакета, где находится класс и наследникам из любого
//    private только в рамках своего класса, чтобы оставался только в классе и в его объектах
//    default только в рамках своего пакета

    public String name;
    public Animal(String name){
        this.name = name;
    }
    public void say (){
        System.out.println("Ï am Animal");
    }
    private void privateVoid(){
        System.out.println("privateVoid"); //будет доступен только в объектах класса
    }
}
