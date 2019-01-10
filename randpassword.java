import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class randpassword extends JFrame{
    String[] strength = {"低","中","高","中(無l.o)","高(無l.o.I.O)"};
    private Container cp;
    private JLabel lab = new JLabel("長度:");
    private JLabel lab1 = new JLabel("強度:");
    private JLabel lab2 = new JLabel("組數:");
    private JButton btn = new JButton("執行");
    private JButton btn2 = new JButton("結束");
    private JTextField tf = new JTextField();
    private JTextField tf1 = new JTextField();
    private JTextArea ta = new JTextArea();
    private JComboBox cb = new JComboBox(strength);
    private JScrollPane jsp=new JScrollPane(ta);

    public randpassword() {
        initComp();
    }

    public void initComp() {
        cp = this.getContentPane();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        cp.setLayout(null);
        this.setTitle("Rand_Password");
        this.setBounds(300, 300, 600, 380);
        lab.setBounds(20, 20, 50, 30);
        this.add(lab);
        lab1.setBounds(20, 60, 50, 30);
        this.add(lab1);
        lab2.setBounds(20, 100, 50, 30);
        this.add(lab2);
        tf.setBounds(100, 25, 150, 20);
        this.add(tf);
        cb.setBounds(100, 65, 150, 20);
        this.add(cb);
        tf1.setBounds(100, 105, 150, 20);
        this.add(tf1);
        btn.setBounds(20, 300, 75, 20);
        this.add(btn);
        btn2.setBounds(180, 300, 75, 20);
        this.add(btn2);
        jsp.setBounds(300, 20, 280, 300);
        this.add(jsp);
        ta.setBackground(Color.BLACK);
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                System.exit(0);
            }

        });

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                ta.setText("");
                String s1 = (String) cb.getSelectedItem();//強度
                int i1 = Integer.parseInt(tf.getText());//長度
                int i2 = Integer.parseInt(tf1.getText());//組數
                int num=0;
                String s4 = "";//顯示密碼
                String s5 = "";//暫存密碼
                switch(s1){
                    case "低":
                        for(int j =0;j<i2;j++){
                            if(j>0){
                                s4+="\n";
                                s5="";
                            }
                            while(s5.length()<i1){
                                num = (int) (( Math.random()*(10) ) + 48);
                                s5+=(char)num;
                            }
                            s4+=s5;
                        }
                        break;
                    case "中":
                        for(int j =0;j<i2;j++){
                            if(j>0){
                                s4+="\n";
                                s5="";
                            }
                            while(s5.length()<i1){
                                num = (int) (( Math.random()*(75) ) + 48);
                                if (num > 57 && num < 97){
                                    continue;
                                }
                                s5+=(char)num;
                            }
                            s4+=s5;
                        }
                        break;
                    case "高":
                        for(int j =0;j<i2;j++){
                            if(j>0){
                                s4+="\n";
                                s5="";
                            }
                            while(s5.length()<i1){
                                num = (int) (( Math.random()*(75) ) + 48);
                                if (num > 57 && num < 65){
                                    continue;
                                }else if (num > 90 && num < 97){
                                    continue;
                                }
                                s5+=(char)num;
                            }
                            s4+=s5;
                        }
                        break;
                    case "中(無l.o)":
                        for(int j =0;j<i2;j++){
                            if(j>0){
                                s4+="\n";
                                s5="";
                            }
                            while(s5.length()<i1){
                                num = (int) (( Math.random()*(75) ) + 48);
                                if (num > 57 && num < 97){
                                    continue;
                                } else if (num == 108 || num == 111){
                                    continue;//排除小寫l，o
                                }
                                s5+=(char)num;
                            }
                            s4+=s5;
                        }
                        break;
                    case "高(無l.o.I.O)":
                        for(int j =0;j<i2;j++){
                            if(j>0){
                                s4+="\n";
                                s5="";
                            }
                            while(s5.length()<i1){
                                num = (int) (( Math.random()*(75) ) + 48);
                                if (num > 57 && num < 65){
                                    continue;
                                }else if (num > 90 && num < 97){
                                    continue;
                                }else if (num == 73 || num == 79 || num == 108 || num == 111){
                                    continue;// 排除大寫I，O 小寫l，o
                                }
                                s5+=(char)num;
                            }
                            s4+=s5;
                        }
                        break;
                }
                ta.append(s4);
            }
        });
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try {
            // select Look and Feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            // start application
            randpassword mfrm = new randpassword();
            mfrm.setVisible(true);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
