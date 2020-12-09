import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class MyPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyPanel extends JPanel implements ActionListener
{
    JTextField ntf;
    JTextField dptf;
    JTextField adtf;
    JButton add;
    JButton clear;
    JComboBox gradeBox;
    JScrollPane textArea;
    public MyPanel(){
        JLabel nlabel = new JLabel("이름");
        JLabel dplabel = new JLabel("학과");
        JLabel adlabel = new JLabel("주소");
        JLabel gradelabel = new JLabel("학년");
        
        ntf = new JTextField("홍길동",20);
        dptf = new JTextField("글로벌소프트웨어학과",20);
        adtf = new JTextField("아산시...",20);
        
        add = new JButton("추가");
        clear = new JButton("Clear");
        
        gradeBox = new JComboBox();
        
        textArea = new JScrollPane(new JTextArea(8 , 22));
        
        this.add(nlabel);
        this.add(ntf);
        this.add(dplabel);
        this.add(dptf);
        this.add(adlabel);
        this.add(adtf);
        this.add(gradelabel);
        this.add(gradeBox);
        this.add(add);
        this.add(clear);
        this.add(textArea);
    }
    
    public void actionPerformed(ActionEvent e){
    
    }
}
