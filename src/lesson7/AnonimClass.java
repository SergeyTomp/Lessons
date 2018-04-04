package lesson7;

public class AnonimClass {
    public void createClass (){
//анонимное создание класса на основе интерфейса, присваиваем значению интерфейсной пепеменной


        SomeInterface anonimClass = new SomeInterface(){
            @Override
            public void firstVoid(){

            };
        };

//        // на примере Runnable
//        Runnable ruunable = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };
//        ruunable.run();
//
//        //анонимно
//        new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }.run();
    }
}

interface SomeInterface {
    public void firstVoid();
}

class someClass implements SomeInterface{

    @Override
    public void firstVoid() {

    }

    new someClass();
}