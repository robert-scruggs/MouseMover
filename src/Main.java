import java.awt.*;
import java.util.Random;

public class Main{
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot mouseMover = new Robot();
        Random random = new Random();
        int counter = 0;
        while (counter < 25){
            int randomNumber1 = random.nextInt(1000);
            int randomNumber2 = random.nextInt(1000);
            mouseMover.mouseMove(randomNumber1,randomNumber2);
            Thread.sleep(1000);
            counter++;
        }
    }


}
