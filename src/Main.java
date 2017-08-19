import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double summ = 0.0; /*Здесь будем суммировать данные*/
        Scanner sc = new Scanner(System.in);  /* Создаем объект Scanner по входному потоку System.in*/
        while (sc.hasNext()) { /*Цикл, пока не кончился входной поток  */
            try {
                summ += sc.nextDouble(); /*пытаемся считать double, если выходит, то складываем к sum,
                если не удастся, то выкинет исключение*/
            } catch (Exception e) { /*это исключение будет брощено, если будет неудачной попытка считывания
                        double методом nextDouble() класса Scanner */
                sc.next(); /* переходим к следующему элементу, не считывая текущий.*/
            }
        }
        System.out.printf("%.6f", summ); /*выводим форматированный результат в выходной поток ,
                                с точностью до 6 знака после запятой */

    }
}