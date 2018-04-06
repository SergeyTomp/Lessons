package lesson8;

interface ParentInterface{
    void parentClassVoid();
}
class ChildClass1 implements ParentInterface{
    @Override
    public void parentClassVoid(){

    };
}
class ChildClass2 implements ParentInterface{
    @Override
    public void parentClassVoid(){

    };
}
class FactorPattern{
    public ParentInterface getChild(String str){
        if (str.equals("A")){
            return new ChildClass1();
        }
        else{
            return new ChildClass2();
        }
    }
    public void someVoid (){
        FactorPattern factorPattern = new FactorPattern();
        ParentInterface child = factorPattern.getChild("h");
        child.parentClassVoid();
    }
}



public class FactoryMethodPattern {
//Определяет интерфейс для создания, но оставляет подклассам решение, какой класс инстанцировать
//фабричный метод позволяет классу делегировать создание подклассов
// - классу заранее неихвестно, объекты каких подклассов ему нужно создать
// - класс спроектирован так, чтобы объекты, которые он создаёт, специфицировались подклассами
// - класс делегирует свои обязанности одному из нескольких вспомогательных подклассов и планируется локализовать знание о том,
// како класс принимает на себя эти обязанности

}
