package interfaces;

public interface Human {

    void setName (String name);
    String getName();
    //все методы public, не указывать доступ
    //нельзя создать экземпляр интерфейса
    //при реализации в классе описывать обязательно все методы
    //один интерфейс может наследоваться от другого,
    //можно реализовать в классе больше одного интерфейса
    // начиная с ява 8 появилась возможность в интерфейсах иметь дефолтные методы,
    // их можно не описывать при реализации, это функциональные интерфейсы
    //
    interface  Teacher extends Human {
        void teach (Pupil pupil);

    }
    interface Pupil extends Human {
        void study();
    }

    class FirstYearPupil implements Pupil,Teacher{ //условно, чтобы показать необходимоть переопределени всех методоа всех тнтерфейсов
        @Override
        public void setName (String name){

        }
        @Override
        public String getName(){
            return  null;
        }
        @Override
        public void study(){

        }
        @Override
        public void teach (Pupil pupil){

        }
        public  static void main (String [] args){
            Pupil pupil = new FirstYearPupil();

        }


    }
}
//абстрактный класс описывает базовый функционал наследников
// при наследовании описать все абстрактные методы
abstract class DomesticAnimal {
    public String getName(){
        return "DomasticAnimal";
    }
    abstract void eat ();
}
class Dog extends DomesticAnimal{
    @Override
    void eat (){

    }
}
class  Cat extends DomesticAnimal{
    @Override
    void eat (){

    }
}
//переменной интерфейса можно присвоить значением ссылку на объект класса, реализующий в том числе этот интерфейс
//тогда через эту переменную будут доступны только методы, описанные в этом интерфейсе, но будут недоступны методы, добавленные в классе.
