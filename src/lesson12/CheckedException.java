package lesson12;

//можем создать свои классы исключений, для этого нужно наследовать какой-либо класс исключений из иерархии
// если наследуемся от Exception, то среда будет требовать обработки исключений
public class CheckedException extends Exception{

    public CheckedException(String mess){
        super (mess);
    }
    public CheckedException (String mess, Throwable cause){
        super(mess,cause);
    }
}
