package lesson12;

public class FileExceptionBase {

    public static void tryException(){
        String str = null;
//        str.equals("string");//null point exception
//        Integer.parseInt("hjgghj"); //number format exception
//        throw new NumberFormatException("try exception");//можно самим генерить exception
        Object string = "90";
        int [] arr = new int[10];
        try {
            if(System.currentTimeMillis()%2 ==0){
                Integer integer = (Integer) string;
            }
            else {
                arr[10] = 90;
            }
        }
        catch (ClassCastException e){
            System.out.println("integer case " + e.getMessage());
        }
        //ещё один блок catch
        catch (ArrayIndexOutOfBoundsException e){
            // можно через родительский RuntimeException catch (RuntimeException e)
            // но сообщение тоже будет общим
            System.out.println("arr case: " + e.getMessage());
        }
        finally {
            // будет выполнен в любом случае!!! если от есть,
            // полезно для корректного прекращения работы при ошибке в основном коде в try
        }
        System.out.println("After try exception");
    }
    // начиная с java 7 исключения можно группировать через оператор |
    // catch (ClassCastException | ArrayIndexOutOfBoundsException e)

//    public static void ttyExp2(){
//        try {
//            throw new Exception("Exception here"); //ошибка, надо завернуть в try catch
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//можно просто предупредить разработчика, что может быть выброшено исключение, иего надо обработать
    // для этого вставляем вместо try catch throws Exception
//    public static void ttyExp2()throws Exception{
//
//            throw new Exception("Exception here"); //или
//
//    }

    public static void main (String[]args){
        tryException();
    }
}
