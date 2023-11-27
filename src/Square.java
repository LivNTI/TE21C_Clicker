import javax.swing.*;
import java.awt.*;

public class Square extends JPanel {

    public Square(){
        this.setBounds(50,50,100,100);
        //canvas.setBackground(Color.red);
        this.setBackground(new Color(250,17,188));
        this.setBorder(BorderFactory.createLineBorder(Color.black));
    }

}
