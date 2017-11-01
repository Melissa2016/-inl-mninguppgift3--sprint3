package inlämninguppgift3;

import java.awt.Button;
import java.awt.Color;
import javax.swing.JButton;

public class Ebutton extends JButton {

    protected int Value1;

    public Ebutton() {
    }

    public Ebutton(String s) {
        super(s);
    }

    public Ebutton(String s, int Value) {//value =position 
        super(s);
        this.Value1 = Value;
    }

  
    public int getValue() {
        return Value1;
    }

    public void setValue(int värde) {
        this.Value1 = värde;
    }

    public boolean ärbredvid(int value) {
      //  System.out.println("Är bredvid "+ value);
        if (value == 5 || value == 9 || value == 13) {
            if (this.getValue() == (value + 1)
                    || this.getValue() == (value + 4)
                    || this.getValue() == (value - 4)) {
                return true;
            }
        } else if (value == 4 || value == 8 || value == 12) {
            if (this.getValue() == (value - 1)
                    || this.getValue() == (value + 4)
                    || this.getValue() == (value - 4)) {
                return true;
            }
        } else {
           // System.out.println("ärbredvid value: "+value+" this.value(): "+this.getValue() );

            if (this.getValue() == (value + 1)
                    || this.getValue() == (value - 1)
                    || this.getValue() == (value + 4)
                    || this.getValue() == (value - 4)) {
                return true;
            }
        }
        return false;
    }
}
