import javax.swing.*;
/**
 * Frame
 *
 * @author (2019315007 이주열, 2019315015 김민수)
 * @version (2020.12.09)
 */
public class TextFieldFrame extends JFrame
{
    public TextFieldFrame() {
        this.setTitle("과제#3(2019315007 이주열, 2019315015 김민수)");
        this.setSize(300, 1000);
        
        MyPanel mp = new MyPanel();
        this.add(mp);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
