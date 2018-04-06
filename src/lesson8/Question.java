package lesson8;

public class Question {
  /* Принципы ООП
    1. Инкапсуляци
    2. Абстракция
    3. Полиморфизм
    4. Наследование
    5. Слабая связь
    6. Посыл сообщений

    Класс: сущность, свойства объекта, отвечает только за свой набор средств

   */

//метод с переменным количеством аргументов
public void someVoid (){
    someVoid("1", "2");
    someVoid("1");
    someVoid("1", "2", "3");
}
  public void someVoid (String ... strings){
    for (String str : strings){

    }
    String [] someStr = new String[strings.length];
    for (int i = 0; i < strings.length; i++){
        someStr [i] = strings[i];
    }
}

