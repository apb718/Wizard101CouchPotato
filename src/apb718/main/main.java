package apb718.main;

import java.awt.event.InputEvent;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;

public class main {

    private static final int X1 = 0;
    private static MyClicker clicker1 = new MyClicker(2500,100);
    private static Robot r;
    public static void main(String[] args){
        while(true){
            clicker1.clickMouse(InputEvent.BUTTON1_DOWN_MASK,840,480);
            clicker1.clickMouse(InputEvent.BUTTON1_DOWN_MASK,760,490);

            try {
                r = new Robot();
            } catch(AWTException e) {
                e.printStackTrace();
            }
            r.keyPress(KeyEvent.VK_W);
            r.keyRelease(KeyEvent.VK_W);
            try {
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }

            r.keyPress(KeyEvent.VK_S);
            r.keyRelease(KeyEvent.VK_S);
            try {
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            clicker1.clickMouse(InputEvent.BUTTON1_DOWN_MASK,840,480);
            clicker1.clickMouse(InputEvent.BUTTON1_DOWN_MASK,760,490);
            clicker1.clickMouse(InputEvent.BUTTON1_DOWN_MASK,550,590);

        }
    }

}
