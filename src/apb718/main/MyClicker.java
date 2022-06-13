package apb718.main;
import java.awt.AWTException;
import java.awt.Robot;

public class MyClicker {
    private Robot robot;
    private int clickDelay;
    private int releaseDelay;

    public MyClicker(int clickDelay, int releaseDelay){
        this.clickDelay = clickDelay;
        this.releaseDelay = releaseDelay;
        try {
            robot = new Robot();
        }
        catch(AWTException e) {
            e.printStackTrace();
        }
    }
    public void clickMouse(int button, int x, int y){
        robot.mouseMove(x,y);
        robot.mousePress(button);
        robot.delay(releaseDelay);
        robot.mouseRelease(button);
        robot.delay(clickDelay);
    }
}
