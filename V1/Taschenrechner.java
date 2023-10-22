import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Hashtable;
import java.awt.font.TextAttribute;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 20.02.2017
  * @author 
  */

public class Taschenrechner extends JFrame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  private JTextField jTextField1 = new JTextField();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private JButton jButton4 = new JButton();
  private JButton jButton5 = new JButton();
  private JButton jButton6 = new JButton();
  private JButton jButton7 = new JButton();
  private JButton jButton8 = new JButton();
  
  int varA = 0;
  int zeiA = 0;
  int erg = 0;
  //int[] zahl = new zahl[varA];
  //int[] zeichen = new zeichen[zeiA];
  int zeichen =0;
  int runde = 1;
  int TextfeldInt;
  int emptyInt;
  long emptyLong;
  char[] hexTabelle = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

  
  
  
  
  private JButton jButton9 = new JButton();
  private JButton jButton10 = new JButton();
  private JButton jButton11 = new JButton();
  private JButton jButton12 = new JButton();
  private JButton jButton13 = new JButton();
  private JButton jButton14 = new JButton();
  private JButton jButton15 = new JButton();
  private JButton jButton16 = new JButton();
  
  private JTextField jTextField2 = new JTextField();
  private JButton jButton17 = new JButton();
  private JButton jButton18 = new JButton();
  private JTextField jTextField4 = new JTextField();
  private JTextField jTextField5 = new JTextField();
  private JTextField jTextField6 = new JTextField();
  private JTextArea jTextArea1 = new JTextArea("");
    private JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);
  private JTextField jTextField3 = new JTextField();
  private JTextField jTextField7 = new JTextField();
  private JTextField jTextField8 = new JTextField();
  private JTextField jTextField10 = new JTextField();
  private JButton jButton19 = new JButton();
  private JTextField jTextField9 = new JTextField();
  private JTextField jTextField11 = new JTextField();
  private JTextField jTextField12 = new JTextField();
  private JTextField jTextField13 = new JTextField();
  private JTextField jTextField14 = new JTextField();
  private JButton jButton20 = new JButton();
  private JTextField jTextField15 = new JTextField();
  private JTextField jTextField16 = new JTextField();
  private JButton jButton21 = new JButton();
  // Ende Attribute
  
  public Taschenrechner() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 960; 
    int frameHeight = 394;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Taschenrechner");
    setResizable(true);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(288, 344, 177, 76);
    jButton1.setText("=");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jTextField1.setBounds(16, 16, 449, 65);

    jTextField1.setEditable(false);
    jTextField1.setFont(new Font("Dialog", Font.PLAIN, 28));
    cp.add(jTextField1);
    jButton2.setBounds(16, 96, 49, 49);
    jButton2.setText("1");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jButton3.setBounds(80, 96, 49, 49);
    jButton3.setText("2");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
    cp.add(jButton3);
    jButton4.setBounds(144, 96, 49, 49);
    jButton4.setText("3");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
      }
    });
    cp.add(jButton4);
    jButton5.setBounds(416, 96, 49, 105);
    jButton5.setText("-");
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton5_ActionPerformed(evt);
      }
    });
    cp.add(jButton5);
    jButton6.setBounds(352, 96, 49, 105);
    jButton6.setText("+");
    jButton6.setMargin(new Insets(2, 2, 2, 2));
    jButton6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton6_ActionPerformed(evt);
      }
    });
    cp.add(jButton6);
    jButton7.setBounds(416, 216, 49, 105);
    jButton7.setText("/");
    jButton7.setMargin(new Insets(2, 2, 2, 2));
    jButton7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton7_ActionPerformed(evt);
      }
    });
    cp.add(jButton7);
    jButton8.setBounds(352, 216, 49, 105);
    jButton8.setText("*");
    jButton8.setMargin(new Insets(2, 2, 2, 2));
    jButton8.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton8_ActionPerformed(evt);
      }
    });
    cp.add(jButton8);
    jButton9.setBounds(16, 352, 177, 68);
    jButton9.setText("Reset");
    jButton9.setMargin(new Insets(2, 2, 2, 2));
    jButton9.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton9_ActionPerformed(evt);
      }
    });
    cp.add(jButton9);
    jButton10.setBounds(16, 160, 49, 49);
    jButton10.setText("4");
    jButton10.setMargin(new Insets(2, 2, 2, 2));
    jButton10.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton10_ActionPerformed(evt);
      }
    });
    cp.add(jButton10);
    jButton11.setBounds(80, 160, 49, 49);
    jButton11.setText("5");
    jButton11.setMargin(new Insets(2, 2, 2, 2));
    jButton11.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton11_ActionPerformed(evt);
      }
    });
    cp.add(jButton11);
    jButton12.setBounds(144, 160, 49, 49);
    jButton12.setText("6");
    jButton12.setMargin(new Insets(2, 2, 2, 2));
    jButton12.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton12_ActionPerformed(evt);
      }
    });
    cp.add(jButton12);
    jButton13.setBounds(16, 224, 49, 49);
    jButton13.setText("7");
    jButton13.setMargin(new Insets(2, 2, 2, 2));
    jButton13.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton13_ActionPerformed(evt);
      }
    });
    cp.add(jButton13);
    jButton14.setBounds(80, 224, 49, 49);
    jButton14.setText("8");
    jButton14.setMargin(new Insets(2, 2, 2, 2));
    jButton14.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton14_ActionPerformed(evt);
      }
    });
    cp.add(jButton14);
    jButton15.setBounds(144, 224, 49, 49);
    jButton15.setText("9");
    jButton15.setMargin(new Insets(2, 2, 2, 2));
    jButton15.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton15_ActionPerformed(evt);
      }
    });
    cp.add(jButton15);
    jButton16.setBounds(80, 288, 49, 49);
    jButton16.setText("0");
    jButton16.setMargin(new Insets(2, 2, 2, 2));
    jButton16.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton16_ActionPerformed(evt);
      }
    });
    cp.add(jButton16);
    jTextField2.setBounds(480, 96, 433, 25);
    jTextField2.setText("Fakultät berechnen");
    jTextField2.setEditable(false);
    jTextField2.setFont(new Font("Dialog", Font.PLAIN, 20));
    jTextField2.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField2.setBackground(new Color(0xC0C0C0));
    cp.add(jTextField2);
    jButton17.setBounds(632, 128, 73, 17);
    jButton17.setText("=>");
    jButton17.setMargin(new Insets(2, 2, 2, 2));
    jButton17.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton17_ActionPerformed(evt);
      }
    });
    cp.add(jButton17);
    jButton18.setBounds(632, 152, 73, 17);
    jButton18.setText("<=");
    jButton18.setMargin(new Insets(2, 2, 2, 2));
    jButton18.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton18_ActionPerformed(evt);
      }
    });
    cp.add(jButton18);
    jTextField4.setBounds(480, 16, 433, 17);
    jTextField4.setText("Statusmeldungen");
    Hashtable<TextAttribute, Object> jTextField4_map = new Hashtable<TextAttribute, Object>();
    jTextField4_map.put(TextAttribute.FAMILY, "Dialog");
    jTextField4_map.put(TextAttribute.SIZE, 12);
    jTextField4_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    jTextField4.setFont(new Font(jTextField4_map));
    jTextField4.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField4.setEditable(false);
    jTextField4.setBackground(new Color(0xC0C0C0));
    cp.add(jTextField4);
    jTextField5.setBounds(480, 128, 145, 41);
    cp.add(jTextField5);
    jTextField6.setBounds(712, 128, 201, 41);
    cp.add(jTextField6);
    jTextArea1ScrollPane.setBounds(480, 40, 433, 49);
    jTextArea1.setEditable(false);
    jTextArea1ScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    jTextArea1.setWrapStyleWord(false);
    cp.add(jTextArea1ScrollPane);
    jTextField3.setBounds(480, 184, 433, 25);
    jTextField3.setEditable(false);
    jTextField3.setFont(new Font("Dialog", Font.PLAIN, 20));
    jTextField3.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField3.setText("Potenz berechnen");
    jTextField3.setBackground(new Color(0xC0C0C0));
    cp.add(jTextField3);
    jTextField7.setBounds(480, 344, 433, 25);
    jTextField7.setEditable(false);
    jTextField7.setFont(new Font("Dialog", Font.PLAIN, 20));
    jTextField7.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField7.setText("Hexadezimalzahl berechnen");
    jTextField7.setBackground(new Color(0xC0C0C0));
    cp.add(jTextField7);
    jTextField8.setBounds(480, 264, 433, 25);
    jTextField8.setEditable(false);
    jTextField8.setFont(new Font("Dialog", Font.PLAIN, 20));
    jTextField8.setHorizontalAlignment(SwingConstants.CENTER);
    jTextField8.setText("Binärzahl berechnen");
    jTextField8.setBackground(new Color(0xC0C0C0));
    cp.add(jTextField8);
    jTextField10.setBounds(776, 216, 137, 41);
    jTextField10.setEditable(false);
    cp.add(jTextField10);
    jButton19.setBounds(704, 224, 65, 25);
    jButton19.setText("=>");
    jButton19.setMargin(new Insets(2, 2, 2, 2));
    jButton19.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton19_ActionPerformed(evt);
      }
    });
    cp.add(jButton19);
    jTextField9.setBounds(480, 216, 73, 41);
    cp.add(jTextField9);
    jTextField11.setBounds(624, 216, 73, 41);
    cp.add(jTextField11);
    jTextField12.setBounds(560, 224, 57, 25);
    jTextField12.setEditable(false);
    jTextField12.setText("hoch");
    jTextField12.setFont(new Font("Dialog", Font.PLAIN, 14));
    jTextField12.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(jTextField12);
    jTextField13.setBounds(480, 296, 169, 41);
    cp.add(jTextField13);
    jTextField14.setBounds(728, 296, 185, 41);
    jTextField14.setEditable(false);
    cp.add(jTextField14);
    jButton20.setBounds(656, 296, 65, 17);
    jButton20.setText("=>");
    jButton20.setMargin(new Insets(2, 2, 2, 2));
    jButton20.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton20_ActionPerformed(evt);
      }
    });
    cp.add(jButton20);
    jTextField15.setBounds(480, 376, 169, 41);
    cp.add(jTextField15);
    jTextField16.setBounds(728, 376, 185, 41);
    jTextField16.setEditable(false);
    cp.add(jTextField16);
    jButton21.setBounds(656, 376, 65, 17);
    jButton21.setText("=>");
    jButton21.setMargin(new Insets(2, 2, 2, 2));
    jButton21.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton21_ActionPerformed(evt);
      }
    });
    cp.add(jButton21);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Taschenrechner
  
  // Anfang Methoden
  public void Rechnen(){
    if (runde == 1) {
      erg = Integer.parseInt(jTextField1.getText());
      runde++;
      jTextField1.setText("");
      System.out.println(erg+"Runde 1");
    } // end of if
    else {
      if (zeichen == 1) {
        erg = erg + Integer.parseInt(jTextField1.getText());
        jTextField1.setText("");
        System.out.println(erg+" Addition");
      } // end of if
      else {
        if (zeichen == 2) {
          erg = erg - Integer.parseInt(jTextField1.getText());
          jTextField1.setText("");
          System.out.println(erg+" Subtraktion");  
        } // end of if
        else {
          if (zeichen == 3) {
            erg = erg * Integer.parseInt(jTextField1.getText());
            jTextField1.setText("");
            System.out.println(erg+" Multiplikation");
          } // end of if
          else {
            if (zeichen == 4) {
              erg = erg / Integer.parseInt(jTextField1.getText());
              jTextField1.setText("");
              System.out.println(erg+" Division");
            } // end of if
          } // end of if-else
        } // end of if-else
      } // end of if-else
    } // end of if-else  
  }
  
  public static void main(String[] args) {
    new Taschenrechner();
  } // end of main
  //Ist Gleich
  public void jButton1_ActionPerformed(ActionEvent evt) { // Methode für " = "
    if (zeichen == 1) {
      erg = erg + Integer.parseInt(jTextField1.getText());
      zeichen = 0;
    } // end of if
    if (zeichen == 2) {
      TextfeldInt = Integer.parseInt(jTextField1.getText());
      erg = erg - TextfeldInt;
      zeichen = 0;
    } // end of if
    if (zeichen == 3) {
      erg = erg * Integer.parseInt(jTextField1.getText());
      zeichen = 0;
    } // end of if
    if (zeichen == 4) {
       erg = erg / Integer.parseInt(jTextField1.getText());
    } // end of if
    
    
    jTextField1.setText(Integer.toString(erg));
    erg = 0;
    
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {  // Zahl 1
    String Textfeld = jTextField1.getText();
    this.jTextField1.setText(Textfeld+"1");
    
  } // end of jButton2_ActionPerformed

  public void jButton3_ActionPerformed(ActionEvent evt) {  // Zahl 2
    String Textfeld = jTextField1.getText();
    this.jTextField1.setText(Textfeld+"2");
    
  } // end of jButton3_ActionPerformed

  public void jButton4_ActionPerformed(ActionEvent evt) {  // Zahl 3
    String Textfeld = jTextField1.getText();
    this.jTextField1.setText(Textfeld+"3");
    
  } // end of jButton4_ActionPerformed

  public void jButton5_ActionPerformed(ActionEvent evt) {    // Operator " - "
    Rechnen();
    zeichen = 2;
  } // end of jButton5_ActionPerformed

  public void jButton6_ActionPerformed(ActionEvent evt) {    // Operator " + "
    Rechnen();
    zeichen = 1;
  } // end of jButton6_ActionPerformed

  public void jButton7_ActionPerformed(ActionEvent evt) {    // Operator " / "
    Rechnen();
    zeichen = 4;
  } // end of jButton7_ActionPerformed

  public void jButton8_ActionPerformed(ActionEvent evt) {   // Operator " * "
    Rechnen();
    zeichen = 3;
  } // end of jButton8_ActionPerformed

  public void jButton9_ActionPerformed(ActionEvent evt) {      // Reset Button
    jTextField1.setText("");
    erg = 0;
    zeichen = 0;
    runde = 1;
  } // end of jButton9_ActionPerformed

  public void jButton10_ActionPerformed(ActionEvent evt) {   // Zahl 4
    String Textfeld = jTextField1.getText();
    this.jTextField1.setText(Textfeld+"4");
  } // end of jButton10_ActionPerformed

  public void jButton11_ActionPerformed(ActionEvent evt) {    // Zahl 5
    String Textfeld = jTextField1.getText();
    this.jTextField1.setText(Textfeld+"5");
  } // end of jButton11_ActionPerformed

  public void jButton12_ActionPerformed(ActionEvent evt) {   // Zahl 6
    String Textfeld = jTextField1.getText();
    this.jTextField1.setText(Textfeld+"6");
  } // end of jButton12_ActionPerformed

  public void jButton13_ActionPerformed(ActionEvent evt) {    // Zahl 7
    String Textfeld = jTextField1.getText();
    this.jTextField1.setText(Textfeld+"7");
  } // end of jButton13_ActionPerformed

  public void jButton14_ActionPerformed(ActionEvent evt) {   // Zahl 8
    String Textfeld = jTextField1.getText();
    this.jTextField1.setText(Textfeld+"8");
  } // end of jButton14_ActionPerformed

  public void jButton15_ActionPerformed(ActionEvent evt) {   // Zahl 9
    String Textfeld = jTextField1.getText();
    this.jTextField1.setText(Textfeld+"9");
  } // end of jButton15_ActionPerformed

  public void jButton16_ActionPerformed(ActionEvent evt) {     // Zahl 0
    String Textfeld = jTextField1.getText();
    this.jTextField1.setText(Textfeld+"0");
  } // end of jButton16_ActionPerformed
  
  //Fakultät berechnen
  public void jButton17_ActionPerformed(ActionEvent evt) {
    jTextField6.setText("");
    if (jTextField5.getText().isEmpty()) {
      jTextArea1.setText("Bitte geben sie zuerst die Zahl ein, von der Sie die Fakultät berechnen möchten.");
    } // end of if
    else {
      long zahlF = Integer.parseInt(jTextField5.getText()) + 1;
      long ergF = 1;
      for (long rundeF = 1;rundeF<zahlF;rundeF++ ) {
        ergF = (zahlF - rundeF)*ergF;
      } // end of for
      jTextField6.setText(ergF+"");
    } // end of if-else
    
  } // end of jButton17_ActionPerformed
  
  //Fakultät zurückrechnen
  public void jButton18_ActionPerformed(ActionEvent evt) {
    jTextField5.setText("");
    long fakultätZ = Integer.parseInt(jTextField6.getText());
    double fakultätZDouble = fakultätZ;
    int i = 1;
    do {
      i++;
      fakultätZDouble = fakultätZDouble / i;
    } while (fakultätZDouble > 1); // end of do-while
    if (fakultätZDouble == 1.0) {
      jTextField5.setText(i+"");
    } // end of if
    else {
      jTextField5.setText("-1");
      jTextArea1.setText("Die Zahl ist keine Fakultät!");
    } // end of if-else
  } // end of jButton18_ActionPerformed
  
  // Potenz berechnen
  public void jButton19_ActionPerformed(ActionEvent evt) {
    //Statusmeldungen
    if (jTextField9.getText().isEmpty()&&jTextField11.getText().isEmpty()) {
      jTextArea1.setText("Bitte geben sie zuerst Basis und Exponent an.");
    } // end of if
    else {
      if (jTextField9.getText().isEmpty()){
         jTextArea1.setText("Bitte Basis angeben.");
      } //end of if
        if (jTextField11.getText().isEmpty()) {
           jTextArea1.setText("Ohne Exponent gehört diese Aufgabe in den normalen Rechner.");
        } // end of if
    } // end of if-else
    //Ende der Statusmeldungen
    if (!(jTextField9.getText().isEmpty()&&jTextField9.getText().isEmpty())) {
       long basis = Integer.parseInt(jTextField9.getText());
       long exponent = Integer.parseInt(jTextField11.getText())-1;
      for (;exponent>0;exponent-- ) {
          basis = basis * basis;  
      } // end of for
      jTextField10.setText(basis+"");
    } // end of if
  } // end of jButton19_ActionPerformed

  // Binärzahl berechnen
  public void jButton20_ActionPerformed(ActionEvent evt) {
    //if für Statusmeldungen
    // Reset
    jTextField14.setText("");
    if (jTextField13.getText().isEmpty()) {
      jTextArea1.setText("111101 I feel a bit off.");   
    } // end of if
    else {
      double zahlB = Integer.parseInt(jTextField13.getText());
      while (!(zahlB == 1 || zahlB == 0)) { 
        if (zahlB / 2 == Math.round(zahlB / 2)) {
          zahlB = zahlB / 2;
          jTextField14.setText(0 + jTextField14.getText());
        } // end of if
        else {
          zahlB = Math.round(zahlB / 2) - 1;
          jTextField14.setText(1 + jTextField14.getText());       
        } // end of if-else
      } // end of while
      if (zahlB == 1) {
        jTextField14.setText(1 + jTextField14.getText());
      } // end of if
      /*else {
        jTextField14.setText(jTextField14.getText()+0);
      } // end of if-else*/
    } // end of if-else
  } // end of jButton20_ActionPerformed

  // Hexadezimalzahl berechnen
  public void jButton21_ActionPerformed(ActionEvent evt) {
    // Ich benutze bewusst nicht Integer.toHexString()
    // Reset
    jTextField16.setText("");
    if (jTextField15.getText().isEmpty()) {
      jTextArea1.setText("Grade F");
    } // end of if
    else {
      int zahlH = Integer.parseInt(jTextField15.getText());
      while (!(zahlH == 0)) {
        int aBOderF = zahlH%16; 
        jTextField16.setText(hexTabelle[aBOderF] + jTextField16.getText());
        zahlH = zahlH / 16;
      } // end of while
    } // end of if-else
  } // end of jButton21_ActionPerformed
  
  /*Aufgaben:
            Binär zu Dezimal
            Hexadezimal zu Dezimal
  */

  // Ende Methoden
} // end of class Taschenrechner
