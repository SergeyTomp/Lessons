public class strings {
    public  static  void main (String [] args){
        //строки - набор символов
        //объекты класса String изменить после создания нельзя

        String str = "String"; //если строки одинаковые, то объект будет создан один, ссылки поведут к нему
        String str1 = "String";

        //а если через new, то ссылки поведут к разным объектам, даже если строки одинаковые
        String str2 = new String("String2");
        String str3 = new String("String2");

        String st = String.format ("шаблон со специальными символами %d%n", 3434);
        System.out.println(st);

        // создание строковых объектов, чтобы можно было поменять строковый объект
        StringBuilder sb = new StringBuilder (); //меньше ресурсов, небезопасен в многопотчке
        //StringBuffer sf = new StringBuffer (); //больше ресурсов, безопасен в многопоточке
        sb.append("some new").append("new"); //типа конкатенация
        System.out.println(sb);

        sb.insert(3, "some new").append("new"); //вставка кусков начиная с указанного места
        System.out.println(sb);

        // если клеить строку в цикле, то можно так
        long start = System.nanoTime();
        String stFromLoop = "";
        for (int i = 0; i < 10; i++){
            stFromLoop += "number: " + i;
        }
        System.out.println(stFromLoop);
        long end = System.nanoTime();
        System.out.println("time: " + (start - end)/1000000.0 + "msc");

        // или так, это быстрее
        start = System.nanoTime();
        StringBuilder sbLoop = new StringBuilder();
        for (int i = 0; i < 10; i++){
            sbLoop.append ("number: ").append(i);
        }
        System.out.println(sbLoop);
        end = System.nanoTime();
        System.out.println("time: " + (start - end)/1000000.0 + "msc");


        //чтобы посмотреть как работает что-то после компиляции нужно пройти в каталог с фйалом *.class и набрать
        // javap file name
        // или
        // java -c file name
        //увидим скомпилированый код, и в нём видно, что этот цикл работает через stringbuilder.append

        str1.equals(str2);
        str1.compareTo(str2);
        str1.compareToIgnoreCase(str2);
        str1.startsWith("foo");
        str1.endsWith("foo");

        //0 если аргумент лексически равен
        //<0 если str2 больше  str1
        //>0 если str1 больше  str2
        //если сравнителям давать аргументом объект стрингбилдера или баффера, то сначала их надо привести через toSting
        str.length(); //длина строки
    }



}
