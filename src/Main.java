import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by IIS on 17.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        Hall[] halls = {new Hall(10, 20)};
        Seanses[] session = {new Seanses(1,"something","21:00",1)};
        Cinema My = new Cinema(halls,session);
        while(true){
            System.out.println("Бронирование места. Выберите команду:\n" +
                    "1.Поиск сеанса по названию фильма\n" +
                    "2.Бронирование мест\n" +
                    "3.Свободные места на определенном сеансе\n" +
                    "4.Поиск сеанса по ID\n" +
                    "5.\n" +
                    "6.");
            Scanner in = new Scanner(System.in);
            int task = in.nextInt();
            switch (task){
                case 1:
                    System.out.println("Введите название фильма: ");
                    String n1 = in.next();
                    ArrayList<Seanses> found = My.find(n1);
                    for (Seanses seanses : found) {
                        System.out.println(seanses);
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Введите ID фильма: ");
                    int n2 = in.nextInt();
                    Seanses foundbyID = My.findbyID(n2);
                    if (foundbyID = null)

                    System.out.println(foundbyID);
                    break;
                case 5:
                    break;
                //case 6:
                    //try {
                        //Book1.save("Book1.txt");
                        //return;
                   // } catch (IOException e) {
                        //System.out.println("Не удалось сохранить в файл, попробуйте другой путь");
                   // }

            }
        }
    }
}
