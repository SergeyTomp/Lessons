package lesson12;

public class TstException {

    public static String getStr(String string) throws Exception{
        if (string.length() < 4){
            throw new CheckedException("слишком короткая строка");
        }
        return string;
    }
// можно так
//    public static void main (String []args)throws Exception{
//        System.out.println(getStr("hkjhkjlhlkj"));
//        System.out.println(getStr("hkjkj"));
//    }
public static void main (String []args) {
    try {
        System.out.println(getStr("hkjhkjlhlkj"));
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
//    System.out.println(getStr("hkjkj"));
}

}
