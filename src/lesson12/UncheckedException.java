package lesson12;

//можем создать свои классы исключений, для этого нужно наследовать какой-либо класс исключений из иерархии
// если наследуемся от RuntimeException, то среда не будет требовать обработки исключений
public class UncheckedException extends RuntimeException{
    public UncheckedException(String mess){
        super (mess);
    }
    public UncheckedException (String mess, Throwable cause){
        super(mess,cause);
    }
}
