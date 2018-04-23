package ua.lviv.iot;
import java.io.IOException;
public class Main {

    public static void main(String[] args) {
        StringProcessor pr = new StringProcessor();
        System.out.println("Enter your text: ");
        try {
            StringBuilder text = pr.readFromConsole();
            pr.processText(text);
            pr.writeToConsole(text);
        }
        catch (Exception e){
            System.out.println("Your text is incorrect");
            e.printStackTrace();

        }

    }
}
