package HOME;

import java.util.InputMismatchException;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
             //СЧЕТ ПОПЫТОК
            int w = 3; //СЧЕТ ПОПЫТОК
            int a = 0; //ЧИСЛО ВВОДА
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число от 1 до 10");
            System.out.println("у вас " +"|"+ w +"|"+ " попытки");

            for (int i = 0; i < 3; i++) {

//__________________________________________ПРОВЕРКА ОШИБКИ(ТЕКСТ)___________________________________________________\\
                try {
                    a = in.nextInt();
                    w--;
                    System.out.println("ваше число: " +"|"+ a +"|");
                }catch (InputMismatchException e){      //InputMismatchException\\---ОШИБКА ВВОДА ТЕКСТА.
                    w--;
                    //System.err.println(); //выделить красным\\
                    System.out.println("ввод текста не допустим" );
                    in.next();
                }
//___________________________________________________________________________________________________________________\\
//____________________________ПРОВЕРКА УСЛОВИЙ(ДИАПОЗОН ОТ 1 ДО 10(ВКЛЮЧИТЕЛЬНО),(3 ПОПЫТКИ))________________________\\
                if (a > 10 || a < 1) {
                    System.out.println("оно не соответствует условию выше(ЧИСЛО от 1 до 10)...");

                    if (w == 0) {
                        System.out.println("попытки закончились");
                        System.out.println("учись читать..\n   ПОКА");
                        System.exit(3);
                    }
                    System.out.println("повторите, у вас осталось попыток: " +"|"+ w+"|");

                } else {
                    System.out.println("я рад, что это число: " + "|" + a + "|" + " не нужно мне повторяться, спасибо)");
                    System.out.println("ПОКА!");
                    System.exit(0);
                }
//___________________________________________________________________________________________________________________\\
            }
        }
    }


