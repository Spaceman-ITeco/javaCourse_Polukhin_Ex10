package digitalexception;

import java.util.Scanner;

import static java.lang.Character.isDigit;

public class StringAnalyzer {

    public void input() {
        do {
        System.out.println("Введите любую строку. Чтобы программа завершилась в строке должны содержаться цифры.");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        char[] inputArray = string.toCharArray();
        for (int i = 0; i < inputArray.length; i++) {
            Character character = inputArray[i];
            {
                try {
                    if (isDigit(character) == true)
                        throw new DigitalException("Строка содержит цифры, поэтому программа будет завершена" , character.toString());
                } catch (DigitalException digitalException) {
                    System.out.println(digitalException.getMessage());
                    System.out.println(digitalException.getDigital());
                    System.exit(0);
                }
            }

        } } while (1==1);
    }
}
