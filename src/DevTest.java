import java.util.Scanner;

public class DevTest {
    /**
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retVal = "";

        do {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();

        } while (retVal.isEmpty());
        System.out.println("You must enter at least 1 character");

        return retVal;
    }
}