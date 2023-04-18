import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class calculator implements ActionListener{

    boolean isOperatorClicked=false;
    boolean isPlusOperatorClicked=false;
    boolean isMinusOperatorClicked=false;
    boolean isMulOperatorClicked=false;
    boolean isDivideOperatorClicked=false;

    String oldValue;
    String operator;

    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton divButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton mulButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton minusButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton plusButton;
    JButton clearButton;


    public calculator(){
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(500,0);

        displayLabel=new JLabel();
        displayLabel.setForeground(Color.WHITE);
        displayLabel.setBounds(30, 050, 540, 40);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(displayLabel);

        sevenButton=new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        jf.add(sevenButton);
        sevenButton.addActionListener(this);

        eightButton=new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        jf.add(eightButton);
        eightButton.addActionListener(this);

        nineButton=new JButton("9");
        nineButton.setBounds(230, 130, 80, 80);
        jf.add(nineButton);
        nineButton.addActionListener(this);

        divButton=new JButton("/");
        divButton.setBounds(330, 130, 80, 80);
        jf.add(divButton);
        divButton.addActionListener(this);

        fourButton=new JButton("4");
        fourButton.setBounds(30, 230, 80, 80);
        jf.add(fourButton);
        fourButton.addActionListener(this);

        fiveButton=new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        jf.add(fiveButton);
        fiveButton.addActionListener(this);

        sixButton=new JButton("6");
        sixButton.setBounds(230, 230, 80, 80);
        jf.add(sixButton);
        sixButton.addActionListener(this);

        mulButton=new JButton("*");
        mulButton.setBounds(330, 230, 80, 80);
        jf.add(mulButton);
        mulButton.addActionListener(this);

        oneButton=new JButton("1");
        oneButton.setBounds(30, 330, 80, 80);
        jf.add(oneButton);
        oneButton.addActionListener(this);

        twoButton=new JButton("2");
        twoButton.setBounds(130, 330, 80, 80);
        jf.add(twoButton);
        twoButton.addActionListener(this);

        threeButton=new JButton("3");
        threeButton.setBounds(230, 330, 80, 80);
        jf.add(threeButton);
        threeButton.addActionListener(this);

        minusButton=new JButton("-");
        minusButton.setBounds(330, 330, 80, 80);
        jf.add(minusButton);
        minusButton.addActionListener(this);

        dotButton=new JButton(".");
        dotButton.setBounds(30, 430, 80, 80);
        jf.add(dotButton);
        dotButton.addActionListener(this);

        zeroButton=new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80);
        jf.add(zeroButton);
        zeroButton.addActionListener(this);

        equalButton=new JButton("=");
        equalButton.setBounds(230, 430, 80, 80);
        jf.add(equalButton);
        equalButton.addActionListener(this);

        plusButton=new JButton("+");
        plusButton.setBounds(330, 430, 80, 80);
        jf.add(plusButton);
        plusButton.addActionListener(this);

        clearButton=new JButton("Clear");
        clearButton.setBounds(430, 430, 80, 80);
        jf.add(clearButton);
        clearButton.addActionListener(this);



        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new calculator();
    } 

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==sevenButton){

            if(isOperatorClicked){
                displayLabel.setText("7");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"7");
            }
        }
        else if(e.getSource()==eightButton){
            if(isOperatorClicked){
                displayLabel.setText("8");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"8");
            }
        }
        else if(e.getSource()==nineButton){
            if(isOperatorClicked){
                displayLabel.setText("9");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"9");
            }
        }
        else if(e.getSource()==fourButton){
            if(isOperatorClicked){
                displayLabel.setText("4");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"4");
            }
        }
        else if(e.getSource()==fiveButton){
            if(isOperatorClicked){
                displayLabel.setText("5");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"5");
            }
        }
        else if(e.getSource()==sixButton){
            if(isOperatorClicked){
                displayLabel.setText("6");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"6");
            }
        }
        else if(e.getSource()==oneButton){
            if(isOperatorClicked){
                displayLabel.setText("1");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"1");
            }
        }
        else if(e.getSource()==twoButton){
            if(isOperatorClicked){
                displayLabel.setText("2");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"2");
            }
        }
        else if(e.getSource()==threeButton){
            if(isOperatorClicked){
                displayLabel.setText("3");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"3");
            }
        }
        else if(e.getSource()==zeroButton){
            if(isOperatorClicked){
                displayLabel.setText("0");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"0");
            }
        }
        else if(e.getSource()==dotButton){
            if(isOperatorClicked){
                displayLabel.setText(".");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+".");
            }  
        }
        else if(e.getSource()==equalButton){

            String newValue=displayLabel.getText();
            float oldValueF=Float.parseFloat(oldValue);
            float newValueF=Float.parseFloat(newValue);
            float result=0;
            
            if(operator=="+"){
                result=oldValueF+newValueF;
            }
            else if(operator=="-"){
                result=oldValueF-newValueF;
            }
            else if(operator=="*"){
                result=oldValueF*newValueF;
            }
            else if(operator=="/"){
                result=oldValueF/newValueF;
            }

            displayLabel.setText(result+"");

            

        }
        else if(e.getSource()==plusButton){

            isOperatorClicked=true;
            operator="+";
            oldValue=displayLabel.getText();
            
        }
        else if(e.getSource()==minusButton){

            isOperatorClicked=true;
            operator="-";
            oldValue=displayLabel.getText();

        }
        else if(e.getSource()==mulButton){

            isOperatorClicked=true;
            operator="*";
            oldValue=displayLabel.getText();
            
        }
        else if(e.getSource()==divButton){

            isOperatorClicked=true;
            operator="/";
            oldValue=displayLabel.getText();
            
        }
        else if(e.getSource()==clearButton){
            displayLabel.setText("");
        }
    
    
    
    }
}
