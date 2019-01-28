package projekt1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddCustomer {

    public static void main(String[] args) {

            while (true) {
                System.out.println("1. Skriv namn med stor förts bokstav");
                System.out.println("2. Skriv adress");
                System.out.println("3. Välj product");
                System.out.println("4. Avsluta");

                switch (readANumber()) {
                    case 4:
                        return;
                    case 1:
                        printName();
                        break;
                    case 2:
                        printAdress();
                        break;
                    case 3:
                        printProduct();
                        break;
                    default:
                        System.out.println("Ej giltigt val");
                }
            }
        }


        public static void printName() {
            int secretNumber = (int) (Math.random() * 50) + 1 ;
            int yourGuess = 0;

            //for( int i = 1; yourGuess != secretNumber; i++) {
            int i = 0;
            while (yourGuess != secretNumber) {
                System.out.println("Välj ett tal mellan 1-50");
                yourGuess = readANumber();

                if (yourGuess == secretNumber)
                    System.out.println("Grattis, du gissade rätt på " + i + " försök!");
                else if (yourGuess < secretNumber)
                    System.out.println("För litet");
                else
                    System.out.println("För stort");
                i++;
            }
        }

        public static void printAdress() {
            //Skriver ut: 10 20 30 40 50 60 70 80 90 100
            for (int r = 1; r < 11; r++) {
                System.out.println(r * 10);
            }
            //Skriver ut baklänges: 10 9 8 ... 0
            for (int r = 10; r >= 0; r--) {
                System.out.println(r);
            }

            //Skriver ut alfabetet a till z med små bokstäver
            char c = 'a';
            while (c < 'z' + 1) {
                System.out.print(c);
                c+=1;
            }
            System.out.println("");
        }

        public static int printProduct() {
            Scanner sc = new Scanner(System.in);
            int temp = 0;
            boolean validinput = false;
            do {
                try {
                    temp = sc.nextInt();
                    validinput = true;
                } catch (InputMismatchException e) {
                    //Hantera eventuellt fel här
                    System.out.println("Det där var ingen siffra! Försök igen!");
                    sc.next();
                }
            } while (!validinput);
            return temp;
        }


        private static void manyNumbers() {

            System.out.println("Hur många siffror vill du läsa in?");
            int numberCount = readANumber();

            int[] numbers = new int[numberCount];

            for (int i = 0; i < numberCount; i++) {
                System.out.println("Skriv en siffra:");
                numbers[i] = readANumber();
            }

            float summa = 0;
            int max = Integer.MIN_VALUE;
            int nextmax = Integer.MIN_VALUE;

            //int max = Integer.MIN_VALUE;
            int min = numbers[0];

            for (int i = 0; i < numberCount; i++) {
                summa = summa + numbers[i]; //summa +=numbers[i]; fungerar också som kortare version.
                if (numbers[i] > max) {
                    nextmax = max;
                    max = numbers[i];
                } else if (numbers[i] > nextmax) {
                    nextmax = numbers[i];
                }

                if (numbers[i] < min)
                    min = numbers[i];
            }

            System.out.println("Medelvärde: " + summa / numberCount);
            System.out.println("Max: " + max);
            System.out.println("Näst störst: " + nextmax);
            System.out.println("Min: " + min);
        }
    }
}
