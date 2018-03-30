package animals.domasticAnimals;

import animals.Animal; //имя пакета.имя класса или * - т.е.все
//import animals.*;

public class DomasticAnimal extends Animal{ //имеет все свойства родителя Animal
        String name;
        public DomasticAnimal(String name) {
            super(name);
        }

    public void lifeWithPeople(){
        System.out.println("I am live with people");
    }

//    public static void main(String []args){
//        DomasticAnimal da = new DomasticAnimal("DomAnimal");
//        da.say();
//        da.lifeWithPeople();
//    }
}
