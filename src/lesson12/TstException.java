package lesson12;

public class TstException {

    public static String getStr(String string) throws Exception {
        if (string.length() < 4) {
            throw new CheckedException("слишком короткая строка");
        }
        return string;
    }

    // можно так
//    public static void main (String []args)throws Exception{
//        System.out.println(getStr("hkjhkjlhlkj"));
//        System.out.println(getStr("hkjkj"));
//    }
//    public static void main (String []args) {//здесь не будет ошибки, т.к. ловим родителя и метод бросает родителя
//        try {
//            System.out.println(getStr("hk"));
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    //    System.out.println(getStr("hkjkj"));
//    }
//}
    public static void main(String[] args) {
        try {
            System.out.println(getStr("wow"));//здесь будет ошибка, т.к. ловим только потомка, а метод бросает родителя
        } catch (CheckedException e) {
            try {
                throw new CheckedException("CheckedException", e);
            } catch (CheckedException e1) {
                System.out.println("cause: " + e1.getCause());
                e1.printStackTrace();
            }
//            System.out.println(e.getMessage());
        }

//        System.out.println(getInt(7));
//        System.out.println(getInt(2));
    }
}

