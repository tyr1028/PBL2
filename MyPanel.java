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
    JTextArea textArea;
    private String[] grade = {"1학년","2학년","3학년","4학년"};
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
        
        gradeBox = new JComboBox(grade);
        gradeBox.setSelectedIndex(1);
        
        textArea = new JTextArea(10 , 25);
        
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
        
        add.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        if(add.equals(e.getSource())){
            textArea.append("이름: " + ntf.getText() + "\n");
            textArea.append("학과: " + dptf.getText() + "\n");
            textArea.append("학년: " + (String)gradeBox.getSelectedItem() + "\n");
            textArea.append("주소: " + adtf.getText() + "\n");
            textArea.append("------------------------------------------\n");
        }
        else if(clear.equals(e.getSource())){
            
        }
    }
}
