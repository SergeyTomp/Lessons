package lesson8;

public class DesignPatterns {
    //шаблоны проектирования - паттерны - повторимая архитектурная конструкция, представляющаа собой решение проблемы
    // проектирования в рамках некоторого часто возникающего контекста
    // три основные группы:
    // Порождающий - создают объекты по определённым сценариям
    //Singleton
    //Factory
    //Abstract Factory
    //Builder
    //Prototype

    // Структурные - определяют различные сложные структуры, которые изменяют интерфейс уже существующих объектов или
    //его реализацию (позволяют оптимизировать программу)
    //Adapter
    //Composite
    //Facade
    //Bridge
    //Decorator
    //Proxy
    //Fly Weight
    //Поведенческие определяют взаимодействие между объектами, увеличивая гибкость проекта
    //Observer
    //Visitor
    //Iterator
    //Strategy
    //Command

    public static void main(String[] args) {
        SingletonPattern singletonPattern1 = SingletonPattern.getInstance();
        SingletonPattern singletonPattern2 = SingletonPattern.getInstance();
        SingletonPattern singletonPattern3 = SingletonPattern.getInstance();
    }
}

//Singleton - у такого Singleton класса есть только один экземпляр, к нему есть глобальный доступ
// есть разница работы в многопоточной среде
class SingletonPattern {
    private SingletonPattern() {} //очень важно - закрытый конструктор

    private static final SingletonPattern INSTANCE = new SingletonPattern();

    public static SingletonPattern getInstance() {
        return INSTANCE;
    }
}

class SingletonPattern2 {
    private static SingletonPattern2 instance;
    private SingletonPattern2() {
        System.out.println("SingletonPattern2");
    }
    public static SingletonPattern2 getInstance() {
        if (instance == null) {
            instance = new SingletonPattern2();
        }
        return instance;
    }

}