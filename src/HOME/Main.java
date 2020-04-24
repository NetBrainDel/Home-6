package HOME;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int q = 0;
            int w = 3;
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число от 1 до 10");
            System.out.println("у вас " + w + " попытки");

            for (int i = 0; i < 3; i++) {

                try {
                    int a = in.nextInt();
                System.out.println("ваше число: " + a);
                    q++;
                    w--;

                if (a > 10 || a < 1) {
                    System.out.println("оно не соответствует условию выше(ЧИСЛО от 1 до 10)...");

                    if (q == 3) {
                        System.out.println("попытки закончились");
                        System.out.println("учись читать..\n   ПОКА");
                        System.exit(3);
                    }
                    System.out.println("повторите, у вас осталось попыток: " + w);

                } else {
                    System.out.println("я рад что это число: " + "|" + a + "|" + " не нужно мне повторяться, спасибо)");
                    System.out.println("ПОКА!");
                    System.exit(0);
                }
                }catch (InputMismatchException e){
                    w--;
                    System.err.println("ввод текста не допустим, попыток осталось: "+"|"+w+"|" );


                    in.next();
                }
            }
    }
}


