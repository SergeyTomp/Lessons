public class DataTypes
{
    public static void main(String[] args)
    {
        System.out.println("Data Types");
        // short 2 бита, -32768 - 32768, вычисдения как с int, поэтому нужно приведение типа нужно
        short a = 2;
        short b = 3;
        short c = (short)(a + b);
        // int ~ 32 бит
        int a1 = 9;
        int b1 = 4;
        int c1 = a1/b1; //отбрасывается остаток
        System.out.println(c1);
        // long 64 бит
        //float если не нужна особая точность вычислений, лучше ставить f после числа с точкой, чтобы не требовал double
        float a2 = 0.2f;
        float b2 = 0.3f;
        float c2 = a2 * b2;
        System.out.println(c2);
        //double двойная точность
        double a3 = 0.2;
        double b3 = 0.3;
        double c3 = a2 * b2;
        System.out.println(c3);
        //прочитать ро двоичную точность
        //char 0 - 65536
        char char1 = 74;
        char char2 = 'a';
        char chsr3 = 118;
        char char4 = 97;
        System.out.println("Char: " + char1 + char2 + chsr3 + char4);//склеивает символы по указанным кодам - Java
        char char5 = '\u0054';
        System.out.println(char5);

        byte x1 = Byte.parseByte("100");
        int x2 = Integer.parseInt("100");
        short x3 = Short.parseShort("100");
        long x4 = Long.parseLong("100");
        double x5 = Double.parseDouble("100");
        float x6 = Float.parseFloat("100");
        System.out.println(x1);

        String str1 = "STRING";
        String str2 = "STRING";
        String str3 = new String("STRING");
        String str4 = new String("STRING");
        System.out.println (str1 == str2); //true
        System.out.println (str3 == str4); //false
        System.out.println (str3.equals(str4)); //true
    }
}
