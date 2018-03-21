public class IfElse
{
    public static void main (String [] args)
    {
        System.out.println("Ветвление");
        boolean condition = true;
        if (condition)
        {
            System.out.println ("condition = true");
        }
        int a = 4;
        int b = 4;
        if(a < b)
        {
            System.out.println ("a < b");
        }
        else if (a > b)
        {
            System.out.println ("a > b");
        }
        else  System.out.println ("a = b");
        // AND &&; OR ||, XOR ^ (только одно true); NO !;
        // switch case если очень много if - else
        int day = 8;
        switch (day)
        {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default: //необязательно
                System.out.println("Ой");
        }
        int num = 0;
        String type;
        if (num % 2 == 0)
        {
            type = "even";
        }
        else type = "odd";
        System.out.println(type);
        // тернарный оператор
        type = (num % 2) == 0 ? "even" : "odd";
        System.out.println(type);

        //while
        int n = 0;
        while (n < 5)
        {
            System.out.println(n);
            n++;
        }

        for (n = 10; n>0; n--)
        {
            if (n%2 != 0)
            System.out.println(n);
        }
        // do while
//        int n = 5;
//        do
//        {
//            System.out.println(n);
//            n--;
//        }
        //while (n >= 1)

        //break выход на первый верхний цикл
        //break outer выходит из всех циклов
        // в переменной хранится натуральное двузначное число , написать код для вывода суммы цифр этого числа
        int x = 33333;
        int sumdigs = 0;
        while (x != 0)
        {
            sumdigs = sumdigs + x%10;
            x = x/10;
        }
        System.out.println(sumdigs);
    }
}
