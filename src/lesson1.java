//Java — строго типизированный, объектно-ориентированный язык
//программирования общего назначения, основанный на принципе «write
//once, run everywhere».
//
//Релиз версии 1.0 состоялся 23 мая 1995 года, релиз последней версии —
// 21 сентября 2017 года.

//имя публичного класса! должно соответствоать имени файла, учитывая регистр
public class lesson1 {

//    main() - основной метод.
//    Это - строка, с которой начинается выполнение программы.
//    Все приложения Java должны иметь один метод main().


//    Ключевое слово public - это спецификатор доступа.
//    Когда члену класса предшествует public, то к этому члену возможен доступ из кода, внешнего по отношению к классу,
//    в котором описан данный метод.
//    В данном случае, main объявлен как public так, чтобы JVM мог обратиться к этому методу.

//    Ключевое слово static позволяет методу main() вызываться без потребности создавать объект.
//    Ключевое слово void говорит компилятору, что метод не возвращает никакого значения.
//    String args [ ] - один из параметров, который передаётся основному методу.

//    System - класс, который является предопределенным и обеспечивает доступ к системе.
//    out - выходной поток и связан с консолью.
//    Вывод строки осуществляется с помощью метода println ()

//    Примитивные типы данных
//    В Java существует 8 примитивных типов данных:
//    byte (целые числа, 1 байт)
//    short (целые числа, 2 байта)
//    int (целые числа, 4 байта)
//    long (целые числа, 8 байтов)
//    float (вещественные числа, 4 байта)
//    double (вещественные числа, 8 байтов)
//    char (символ Unicode, 2 байта)
//    boolean (значение истина/ложь, 1 байт)
//
//    Ссылочные типы данных
//    В ссылочные типы входят все классы, интерфейсы, массивы.
//    Тип String также относится к ссылочным типам.

    public static void main(String[] args) {
        System.out.println("Все, что хотите вывести на экран");

        //    Объявление переменной
//    int (тип данных) varName (имя переменной);
        int varName;
//     присвоние переменной значения
        varName = 90;
        varName = 12; // переопределение переменной

//        можно объявить сразу несколько переменных одного типа
        int a, b, c;
//        можно присвоить значения сразу нескольким переменным
        a = b = c = 20;

//    Арифметические опраторы:
//    +, -, *, /, %
//    -- декремент - уменьшение на 1
//    ++ инкремент - увеличение на 1

//    Операции сравнения - возвращают, либо true, либо false
//    < > <= >= == !=

// однострочный комметарий
        /*
         * многострочный комментарий
         * */
/**
 * оформление документации
 */

        System.out.println(a);
    }
}

