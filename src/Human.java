public class Human {

    boolean walking;
    String name;
    int age;
    Animal animal;

    //конструктор
    public  Human(String name, int age){
        this.name = name;
    }
// можно задать альтернативный метод
//    public  Human(){
//    }

    public void walk() {
        walking = true;
        System.out.println("walking...");
    }
//    public void stop(){
//        System.out.println("stop...");
//    }
    public String getName() {
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
    public  int getAge(){
        return age;
    }
    public void addPet(Animal animal){
        this.animal = animal;
    }
    public void stop (){
        if (walking){
            walking = false;
            System.out.println("stop...");
        }
        else {
            System.out.println("lay...");
        }
    }
    public static void main (String[]args){
        Human ivan = new Human ("Ivan", 25);
//        Human human2 = new Human ();
//        Human human3 = human2;//сылка на один и тот же объект, как и со строками, принцип тот же
        //human - ссылка на объект, а new Human () - объект
//        ivan.walk();
        Animal cat = new Animal("Имя кошки","серый");
        ivan.addPet(cat);
        ivan.stop();

//        ivan.setName ("Ivan");
        System.out.println(ivan.getName());

        Human masha = new Human ("Masha", 20);
        masha.walk();
        //masha.setName ("Masha");
        System.out.println(masha.getName());
    }
}

class  Animal {
    String name;
    String color;
    int  age;
    public Animal(String name, String color){
        this.name = name;
        this.color = color;
    }

}
