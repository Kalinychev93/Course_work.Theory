import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Курсовая работа. Задача из теоретической части.");
        /*Задача:
        Дан массив пар названий книг и авторов,
        необходимо привести каждую пару в строку вида:
        «Название книги» И.О.Автора.*/

//      Инициализируем массив формата {Книга 1, Автор 1, Книга 2, Автор 2}
        String[] books = {"Война и мир", "Лев Толстой", "Белый Клык", "Джек Лондон"};

//      Метод,позволяющий преобразовать массив в строку - НО необходимо получить строки в формате (Автор, книга)
        String s = Arrays.toString(new String[]{books[0]});
//        System.out.println(s);//проверка корректности

//      Вроде правильное решение задачи
        for (int i = 0; i < books.length; i++) {
            if (i % 2 == 0) {
                String book = Arrays.toString(new String[]{books[i], books[i+1]});
                System.out.println(book);//проверка корректности
            }
        }

//      Кривой метод, но выводящий в консоль пару "Книга + автор"
        for (int i = 0; i < books.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Книга: " + books[i] + ", автор - " + books[i+1]);
            }
        }
    }
}