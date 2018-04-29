package lesson13;

public class FinalizeExample {
    private Object obj;
    public FinalizeExample (Object obj){
        this.obj = obj;
    }
    public static void main (String[]args)throws InterruptedException{
        while (true){
            new FinalizeExample(new byte[1024]);
            Thread.sleep(1);
        }
    }
//    @Override
//    protected void finalize () throws Throwable{
//        // тут опишется всё, что должно быть выполнено перед сборкой муслра
//        System.out.println("From finalise");
//        super.finalize();
//    }
}
/* объект уничтожается, если:
1.если на него нет других ссылок
2. если объект существует в пределах метода и завершает существоание при завершении метода
3. если до объектов нельзя дойти от корневых точек
корневые точки:
    -- локальные переменные и параметры метода
    -- потоки Java
    -- статические переменные

Java 7 и 8
Serial GC и . Куча делится на зоны:
- Молодоые объекты
    --Eden
    --Survivor1
    --Survivor2
- Старшие объекты
Serial GC делает в один поток.
Parallel GC делает в несколько потоков.
Java 9
G1 GC
n = время в миилисекундах
Максимальная пауза сборки мусора XX:MaxGCPauseMillis = n;

javac ClassName.java - компиляция
java <option> ClassName - запуск с опцией

производительность - XX:GCTimeRatio = n
n - отношение времени сборки к времени работы приложения
размер кучи Xmx<n>
увеличение шага молодого поколения XX:YoungGenerationSizeIncrement = m, m - в процентах,по умолчанию 20
увеличение шага старшего поколения XX:TenuredGenerationSizeIncrement = m, m - в процентах
уменьшение шага старшего поколения XX:YoungGenerationSizeDecrementScaleFactor = n, n - в процентах
n = уведичение шага m/n
уменьшение шага старшего поколения XX:TenuredGenerationSizeDecrement = n n - в процентах
n = уведичение шага m/n

Java 9 G1 Garbage Collector (по умолчанию), не останавливает приложения
-XX:UseG1GC
- Молодое поколение
    --Eden
    --Survivor
- Старшие объекты
для Java 8:
-verbose:gc -Xloggc:gc.log file_name.log -XX:+PrintGCDetails -XX:+PrintGCTimeStamp -XX:+PrintGCApplicationStoppedTime FinalizeExample
для Java 9:
-verbose:gc -Xlog:gc:gc.log file_name.log -XX:+PrintGCDetails -XX:+PrintGCTimeStamp -XX:+PrintGCApplicationStoppedTime
 */