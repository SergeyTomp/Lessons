import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        //массив непрерывная область памяти, однотипные переменные, индексы с 0, длина массива не меняется, динамики нет
        //есть контроль выходаь за границу массива
        int arr1[]; //здесь память не выделяется
        String[] arr2;

        // а тут выделяем память, по умолчанию ссылочные заполнены null, булевы false, числовые нулями
        arr1 = new int[4];
        arr2 = new String[3];

        //массив при выводе нужно перевести в строку через toString
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        // заполняем
        int a = 3;
        int[] arr3 = {a, 4, 6, 8, -23, 67};

        //обращение к элементам массива
        int arr3Elem = arr3[3];

        //наполняем массив
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = "elem" + i;
        }
        //вывод всего массива по индексу
        System.out.println(Arrays.toString(arr2));

        //другой способ вывода
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("#" + i + ": " + arr3[i]);
        }

        // вывод по коллекции
        for (int arr_val : arr3) {
            System.out.println("val " + +arr_val);
        }
        System.out.println(Arrays.toString(arr3));

        // если надо сделать копию массива
        // способ 1
        int[] newArr3 = arr3.clone();
        //System.arraycopy (массив источник, позиция - начало нового массива, массив назначения,начальная поз.целевого массива,кол-во копируемых элем-в);

        //способ 2
        int[] newArr4 = new int[3];
        System.arraycopy(arr3, 2, newArr4, 0, 2);
        System.out.println(Arrays.toString(newArr4));

        //способ 3
        int[] newArr5 = Arrays.copyOf(arr3, 2);

        //способ 4
        //Arrays.copyOfRange(arr3, start_index, end);
        int[] newArr6 = Arrays.copyOfRange(arr3, 2, 4);
        System.out.println(Arrays.toString(newArr6));

        //сравнение массивов - вызов метода класса Arrays
        //Arrays.equals(arr1, arr2);

        //заполнение массива (какой и чем заполнить
        Arrays.fill(arr1, 2);

        //поиск по массиву - метод двоичного поиска
        //Arrays.binarySearch(array, key)
        //Arrays.binarySearch(array, start pos, end pos, key)
        //массив должен быть отсортирован
        //просто соортировка Arrays.sort(arr3);
        //параллельная сортировка работает быстрее Arrays.parallelSort(arr3);
        Arrays.parallelSort(arr3); //сортируем
        System.out.println(Arrays.toString(arr3));
        int c = Arrays.binarySearch(arr3, -23); //ищем число 1
        System.out.println(c);

        //многомерные массивы
        int[][] arr2D;
        int[][][] arr4D;
        int[][] arr2d = new int[10][];
        for (int i = 0; i < arr2d.length; i++) {
            arr2d[i] = new int[i];
            System.out.println(Arrays.deepToString(arr2d));
        }


    }
}