import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Stack;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 09.03.2017
  * @author 
  */

public class Taschenrechner2 extends JFrame {
  // Anfang Attribute
  private JTextField jTextField1 = new JTextField();
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private JButton jButton4 = new JButton();
  private JButton jButton5 = new JButton();
  private JButton jButton6 = new JButton();
  private JButton jButton7 = new JButton();
  private JButton jButton8 = new JButton();
  String term;
  int stelleInTerm = -1;
  String cache = "";
  char character;
  int rückgabe = 0;
  Stack stack = new Stack();
  Stack stack2 = new Stack();
  // Schluss
  int ergebnis; // Ergebnis aus var1 und var2 für die Anzeige auf jTextField1
  private JButton jButton9 = new JButton();
  private JButton jButton10 = new JButton();
  private JButton jButton11 = new JButton();
  private JButton jButton12 = new JButton();
  private JButton jButton13 = new JButton();
  private JButton jButton14 = new JButton();
  private JButton jButton15 = new JButton();
  private JButton jButton16 = new JButton();
  private JButton jButton17 = new JButton();
  // Ende Attribute
  
  public Taschenrechner2() {
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 580; 
    int frameHeight = 580;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Taschenrechner_2");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jTextField1.setBounds(48, 32, 473, 161);
    jTextField1.setEditable(false);
    jTextField1.setBackground(Color.WHITE);
    jTextField1.setFont(new Font("Dialog", Font.PLAIN, 48));
    cp.add(jTextField1);
    jButton1.setBounds(208, 440, 313, 73);
    jButton1.setText("Enter");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.setEnabled(false);
    jButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    jButton1.setFont(new Font("Dialog", Font.BOLD, 36));
    cp.add(jButton1);
    jButton2.setBounds(48, 200, 73, 73);
    jButton2.setText("1");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    jButton2.setFocusPainted(false);
    jButton2.setBackground(new Color(0xC0C0C0));
    jButton2.setForeground(Color.BLACK);
    cp.add(jButton2);
    jButton3.setBounds(376, 200, 73, 113);
    jButton3.setText("*");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.setEnabled(false);
    jButton3.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
    jButton3.setBackground(Color.GRAY);
    jButton3.setFont(new Font("Dialog", Font.BOLD, 48));
    jButton3.setForeground(Color.WHITE);
    cp.add(jButton3);
    jButton4.setBounds(208, 200, 73, 73);
    jButton4.setText("3");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
      }
    });
    jButton4.setBackground(new Color(0xC0C0C0));
    jButton4.setFont(new Font("Dialog", Font.BOLD, 12));
    cp.add(jButton4);
    jButton5.setBounds(296, 200, 73, 113);
    jButton5.setText("+");
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    jButton5.setEnabled(false);
    jButton5.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton5_ActionPerformed(evt);
      }
    });
    jButton5.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jButton5.setBackground(Color.GRAY);
    jButton5.setFont(new Font("Dialog", Font.BOLD, 48));
    jButton5.setForeground(Color.WHITE);
    cp.add(jButton5);
    jButton6.setBounds(296, 320, 73, 113);
    jButton6.setText("-");
    jButton6.setMargin(new Insets(2, 2, 2, 2));
    jButton6.setEnabled(false);
    jButton6.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jButton6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton6_ActionPerformed(evt);
      }
    });
    jButton6.setBackground(Color.GRAY);
    jButton6.setFont(new Font("Dialog", Font.BOLD, 48));
    jButton6.setForeground(Color.WHITE);
    cp.add(jButton6);
    jButton7.setBounds(48, 280, 73, 73);
    jButton7.setText("4");
    jButton7.setMargin(new Insets(2, 2, 2, 2));
    jButton7.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jButton7.setForeground(Color.BLACK);
    jButton7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton7_ActionPerformed(evt);
      }
    });
    jButton7.setBackground(new Color(0xC0C0C0));
    cp.add(jButton7);
    jButton8.setBounds(128, 200, 73, 73);
    jButton8.setText("2");
    jButton8.setMargin(new Insets(2, 2, 2, 2));
    jButton8.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jButton8.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton8_ActionPerformed(evt);
      }
    });
    jButton8.setBackground(new Color(0xC0C0C0));
    jButton8.setForeground(Color.BLACK);
    cp.add(jButton8);
    jButton9.setBounds(128, 360, 73, 73);
    jButton9.setText("8");
    jButton9.setMargin(new Insets(2, 2, 2, 2));
    jButton9.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jButton9.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton9_ActionPerformed(evt);
      }
    });
    jButton9.setBackground(new Color(0xC0C0C0));
    jButton9.setForeground(Color.BLACK);
    cp.add(jButton9);
    jButton10.setBounds(48, 360, 73, 73);
    jButton10.setText("7");
    jButton10.setMargin(new Insets(2, 2, 2, 2));
    jButton10.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jButton10.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton10_ActionPerformed(evt);
      }
    });
    jButton10.setBackground(new Color(0xC0C0C0));
    jButton10.setForeground(Color.BLACK);
    cp.add(jButton10);
    jButton11.setBounds(208, 280, 73, 73);
    jButton11.setText("6");
    jButton11.setMargin(new Insets(2, 2, 2, 2));
    jButton11.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jButton11.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton11_ActionPerformed(evt);
      }
    });
    jButton11.setBackground(new Color(0xC0C0C0));
    cp.add(jButton11);
    jButton12.setBounds(128, 280, 73, 73);
    jButton12.setText("5");
    jButton12.setMargin(new Insets(2, 2, 2, 2));
    jButton12.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jButton12.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton12_ActionPerformed(evt);
      }
    });
    jButton12.setBackground(new Color(0xC0C0C0));
    jButton12.setForeground(new Color(0x404040));
    cp.add(jButton12);
    jButton13.setBounds(208, 360, 73, 73);
    jButton13.setText("9");
    jButton13.setMargin(new Insets(2, 2, 2, 2));
    jButton13.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jButton13.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton13_ActionPerformed(evt);
      }
    });
    jButton13.setBackground(new Color(0xC0C0C0));
    cp.add(jButton13);
    jButton14.setBounds(128, 440, 73, 73);
    jButton14.setText("0");
    jButton14.setMargin(new Insets(2, 2, 2, 2));
    jButton14.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jButton14.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton14_ActionPerformed(evt);
      }
    });
    jButton14.setBackground(new Color(0xC0C0C0));
    jButton14.setForeground(Color.BLACK);
    cp.add(jButton14);
    jButton15.setBounds(376, 320, 73, 113);
    jButton15.setText("/");
    jButton15.setMargin(new Insets(2, 2, 2, 2));
    jButton15.setEnabled(false);
    jButton15.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jButton15.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton15_ActionPerformed(evt);
      }
    });
    jButton15.setBackground(Color.GRAY);
    jButton15.setFont(new Font("Dialog", Font.BOLD, 48));
    jButton15.setForeground(Color.WHITE);
    cp.add(jButton15);
    jButton16.setBounds(456, 200, 65, 233);
    jButton16.setText("Zurück");
    jButton16.setMargin(new Insets(2, 2, 2, 2));
    jButton16.setEnabled(false);
    jButton16.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jButton16.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton16_ActionPerformed(evt);
      }
    });
    jButton16.setHorizontalAlignment(SwingConstants.CENTER);
    jButton16.setVerticalTextPosition(SwingConstants.CENTER);
    jButton16.setVerticalAlignment(SwingConstants.CENTER);
    jButton16.setHorizontalTextPosition(SwingConstants.RIGHT);
    jButton16.setFocusPainted(false);
    jButton16.setFont(new Font("Dialog", Font.BOLD, 14));
    cp.add(jButton16);
    
    setVisible(true);
    jButton17.setBounds(48, 440, 73, 73);
    jButton17.setText("Reset");
    jButton17.setMargin(new Insets(2, 2, 2, 2));
    jButton17.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton17_ActionPerformed(evt);
      }
    });
    jButton17.setFont(new Font("Dialog", Font.BOLD, 14));
    jButton17.setCursor(new Cursor(Cursor.HAND_CURSOR));
    cp.add(jButton17);
    jButton17.setEnabled(false);
    cp.setBackground(new Color(0x404040));
    // Ende Komponenten
  } // end of public Taschenrechner2_Stack
  
  // Anfang Methoden
  
  public int NächsteZahl () { // Methode für * und / um die nächste Zahl im Term zu identifizieren
    String cache2 ="";
    char character2 = '0';
    
    for (int i = 0; i< term.length() ; i++ ) {
      if (stelleInTerm +1 < term.length()&& 48<=(int)character2 && (int)character2 <= 57) {
        stelleInTerm++;
        //System.out.println("hier SIT" + stelleInTerm);
        character2 = term.charAt(stelleInTerm);
        //System.out.println("hier ch2   "+character2);
        cache2 = cache2 + character2;
        //System.out.println("c2   "+cache2);
        if (!(stelleInTerm +1>= term.length())) {
          character2 = term.charAt(stelleInTerm +1);
        } // end of if
      } // end of if
    } // end of for
         
    //System.out.println("Nächste Zahl funzt");
    rückgabe = Integer.parseInt(cache2);
    return rückgabe;
  
  } 
  
  public static void main(String[] args) {
    new Taschenrechner2();
  } // end of main
  // character ist die aktuelle Stelle im Term als char
  // cache ergibt sich auch character, ist ein String und mit ihm rechne ich
  // stelleInTerm gibt an, wo ich mich im Term befinde
  // stack ist mein Stack
  // Term ist alles was der Benutzer eingegeben hat
  public void jButton1_ActionPerformed(ActionEvent evt) {      // ===========
    //System.out.println(Term.length());
    jButton1.setEnabled(false);
    jButton2.setEnabled(false);
    jButton3.setEnabled(false);
    jButton4.setEnabled(false);
    jButton5.setEnabled(false);
    jButton6.setEnabled(false);
    jButton7.setEnabled(false);
    jButton8.setEnabled(false);
    jButton9.setEnabled(false);
    jButton10.setEnabled(false);
    jButton11.setEnabled(false);
    jButton12.setEnabled(false);
    jButton13.setEnabled(false);
    jButton14.setEnabled(false);
    jButton15.setEnabled(false);
    jButton16.setEnabled(false);
    
    for (int lulu = 1; lulu <= term.length() ; lulu++ ) {
      if (stelleInTerm +1< term.length()) {
        stelleInTerm++;
        character = term.charAt(stelleInTerm);
        //System.out.println( (int) character + "");
       
        if (48 <= (int) character && (int) character <= 57) { 
        
          cache = cache + character;
          if (term.length()< stelleInTerm + 2) {
            stack.push(cache);
            cache = "";
          } // end of if
      
        } // end of if
        System.out.println(stelleInTerm + "   " + cache);
        if ((int) character == 43) { //für +
          if (!(cache.equals(""))) {
            stack.push(cache);
          } // end of if
          cache = "";
          cache = character + cache;
          stack.push(cache);
          cache = "";
        } // end of if
      
        if ((int) character == 45) { //für -
          if (!(cache.equals(""))) {
            stack.push(cache);
          } // end of if
          cache = "";
          cache = character + cache;
          stack.push(cache);
          cache ="";
        } // end of if
      
        if ((int) character == 42) {
          if (!(cache.equals(""))) {
            stack.push(cache);
          } // end of if

          cache = "";
          String a;
          int b;
          int c;                                           
          String d;
          a = stack.peek() + "";
          stack.pop();
          b = NächsteZahl();
          c = Integer.parseInt(a)*b;
          d = c + "";
          stack.push(d);
        } // end of if
        if ((int) character == 47) {
          if (!(cache.equals(""))) {
            stack.push(cache);
          } // end of if
          cache = "";
          String a;
          int b;
          int c;                                           
          String d;
          a = stack.peek() + "";
          //System.out.println(a);         //unwichtig
          stack.pop();
          //System.out.println("hier Stack" + stack); //unwichtig
          b = NächsteZahl();
          //System.out.println(b);
          c = Integer.parseInt(a)/b;
          d = c + "";
          stack.push(Integer.parseInt(d));
          //System.out.println(stack);
        } // end of if
        } // end of if
      
    } // end of for
    System.out.println(stack);
    // Überführung in stack2
    while (!(stack.isEmpty())) { 
      stack2.push(stack.peek());
      stack.pop();
    } // end of while
    
    System.out.println(stack2);
    //letzte Rechnungen mit stack2
    String str1 = ""; //String als Zwischenspeicher von stack2 zu var1
    String str2 = ""; //String als Zwischenspeicher von stack2 zu var2
    int var1 = 0; //Zahl die bereits gepeekt wurde
    int var2 = 0; // Zahl die noch gepeekt werden muss
    int var3 = 0; //TEst
    
    //bedingungen fertig machen
    //möglichen fatalen Fehler beheben
    while (!(stack2.size() == 1 || stack2.size() == 0)) {
      str1 = stack2.peek() + "";    
      character = str1.charAt(0);
      
      if (48 <= (int)character && (int)character <= 57) {      // 0 - 9
        str1 = "" + stack2.peek();
        var1 = Integer.parseInt(str1);
        //System.out.println(var1);
        str1 = "";
        stack2.pop();
      } // end of if
      if ((int) character == 43) {       // +
        stack2.pop();
        str2 = "" + stack2.peek();
        var2 = Integer.parseInt(str2);
        stack2.pop();
        stack2.push(var1 + var2);
        System.out.println(stack2);
        var1 = 0;
        var2 = 0;
      } // end of if
      if ((int)character == 45) {      // -
        stack2.pop();
        str2 = "" + stack2.peek();
        var2 = Integer.parseInt(str2);
        stack2.pop();
        
        System.out.println(var1);
        
        stack2.push(var1 - var2);  

        System.out.println(stack2);
        var1 = 0;
        var2 = 0;
      } // end of if
      
    } // end of while
    
    ergebnis = Integer.parseInt(stack2.peek() + "");
    
    jTextField1.setText(jTextField1.getText() + " = " + ergebnis);
    jButton16.setEnabled(false);

  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {  // 1111111111111111
    jTextField1.setText(jTextField1.getText()+ "1");
    term = jTextField1.getText();
    jButton5.setEnabled(true);
    jButton3.setEnabled(true);
    jButton6.setEnabled(true);
    jButton15.setEnabled(true);
    jButton1.setEnabled(true);
    jButton16.setEnabled(true);
    jButton17.setEnabled(true);
  } // end of jButton2_ActionPerformed

  public void jButton3_ActionPerformed(ActionEvent evt) {  //************
    jTextField1.setText(jTextField1.getText()+ "*");
    term = jTextField1.getText();
    jButton5.setEnabled(false);
    jButton3.setEnabled(false);
    jButton6.setEnabled(false);
    jButton15.setEnabled(false);
    jButton1.setEnabled(false);
    jButton16.setEnabled(true);
    jButton17.setEnabled(true);
  } // end of jButton3_ActionPerformed

  public void jButton4_ActionPerformed(ActionEvent evt) {   //3333333333333
    jTextField1.setText(jTextField1.getText()+ "3");
    term = jTextField1.getText();
    jButton5.setEnabled(true);
    jButton3.setEnabled(true);
    jButton6.setEnabled(true);
    jButton15.setEnabled(true);
    jButton1.setEnabled(true);
    jButton17.setEnabled(true);
    jButton16.setEnabled(true);
  } // end of jButton4_ActionPerformed

  public void jButton5_ActionPerformed(ActionEvent evt) {      //++++++++++++
    jTextField1.setText(jTextField1.getText()+ "+");
    term = jTextField1.getText();
    jButton5.setEnabled(false);
    jButton3.setEnabled(false);
    jButton6.setEnabled(false);
    jButton15.setEnabled(false);
    jButton1.setEnabled(false);
    jButton17.setEnabled(true);
    jButton16.setEnabled(true);
  } // end of jButton5_ActionPerformed

  public void jButton6_ActionPerformed(ActionEvent evt) {       //-------------
    jTextField1.setText(jTextField1.getText()+ "-");
    term = jTextField1.getText();
    jButton5.setEnabled(false);
    jButton3.setEnabled(false);
    jButton6.setEnabled(false);
    jButton17.setEnabled(true);
    jButton15.setEnabled(false);
    jButton1.setEnabled(false);
    jButton16.setEnabled(true);
  } // end of jButton6_ActionPerformed

  public void jButton7_ActionPerformed(ActionEvent evt) {       //4444444444
    jTextField1.setText(jTextField1.getText()+ "4");
    term = jTextField1.getText();
    jButton5.setEnabled(true);
    jButton3.setEnabled(true);
    jButton6.setEnabled(true);
    jButton15.setEnabled(true);
    jButton17.setEnabled(true);
    jButton1.setEnabled(true);
    jButton16.setEnabled(true);
  } // end of jButton7_ActionPerformed

  public void jButton8_ActionPerformed(ActionEvent evt){        //22222222222
    jTextField1.setText(jTextField1.getText()+ "2");
    term = jTextField1.getText();
    jButton5.setEnabled(true);
    jButton3.setEnabled(true);
    jButton17.setEnabled(true);
    jButton6.setEnabled(true);
    jButton15.setEnabled(true);
    jButton1.setEnabled(true);
    jButton16.setEnabled(true);
  } // end of jButton8_ActionPerformed

  public void jButton9_ActionPerformed(ActionEvent evt) {     //88888888888888
    jTextField1.setText(jTextField1.getText()+ "8");
    term = jTextField1.getText();
    jButton5.setEnabled(true);
    jButton3.setEnabled(true);
    jButton6.setEnabled(true);
    jButton15.setEnabled(true);
    jButton17.setEnabled(true);
    jButton1.setEnabled(true);
    jButton16.setEnabled(true);
  } // end of jButton9_ActionPerformed

  public void jButton10_ActionPerformed(ActionEvent evt) {    //77777777777
    jTextField1.setText(jTextField1.getText()+ "7");
    term = jTextField1.getText();
    jButton5.setEnabled(true);
    jButton3.setEnabled(true);
    jButton6.setEnabled(true);
    jButton15.setEnabled(true);
    jButton1.setEnabled(true);
    jButton17.setEnabled(true);
    jButton16.setEnabled(true);
  } // end of jButton10_ActionPerformed

  public void jButton11_ActionPerformed(ActionEvent evt) {          //6666666666
    jTextField1.setText(jTextField1.getText()+ "6");
    term = jTextField1.getText();
    jButton5.setEnabled(true);
    jButton3.setEnabled(true);
    jButton6.setEnabled(true);
    jButton15.setEnabled(true);
    jButton1.setEnabled(true);
    jButton16.setEnabled(true);
    jButton17.setEnabled(true);
  } // end of jButton11_ActionPerformed

  public void jButton12_ActionPerformed(ActionEvent evt) {      //555555555555
    jTextField1.setText(jTextField1.getText()+ "5");
    term = jTextField1.getText();
    jButton5.setEnabled(true);
    jButton3.setEnabled(true);
    jButton6.setEnabled(true);
    jButton15.setEnabled(true);
    jButton17.setEnabled(true);
    jButton1.setEnabled(true);
    jButton16.setEnabled(true);
  } // end of jButton12_ActionPerformed

  public void jButton13_ActionPerformed(ActionEvent evt) {      //999999999999
    jTextField1.setText(jTextField1.getText()+ "9");
    term = jTextField1.getText();
    jButton5.setEnabled(true);
    jButton3.setEnabled(true);
    jButton6.setEnabled(true);
    jButton15.setEnabled(true);
    jButton1.setEnabled(true);
    jButton17.setEnabled(true);
    jButton16.setEnabled(true);
  } // end of jButton13_ActionPerformed

  public void jButton14_ActionPerformed(ActionEvent evt) {   //00000000
    jTextField1.setText(jTextField1.getText()+ "0");
    term = jTextField1.getText();
    jButton5.setEnabled(true);
    jButton3.setEnabled(true);
    jButton6.setEnabled(true);
    jButton15.setEnabled(true);
    jButton17.setEnabled(true);
    jButton1.setEnabled(true);
    jButton16.setEnabled(true);
  } // end of jButton14_ActionPerformed

  public void jButton15_ActionPerformed(ActionEvent evt) {     // /////////
    jTextField1.setText(jTextField1.getText()+ "/");
    term = jTextField1.getText();
    jButton5.setEnabled(false);
    jButton3.setEnabled(false);
    jButton6.setEnabled(false);
    jButton15.setEnabled(false);
    jButton1.setEnabled(false);
    jButton16.setEnabled(true);
    jButton17.setEnabled(true);
  } // end of jButton15_ActionPerformed

  public void jButton16_ActionPerformed(ActionEvent evt) {
    int i = (int) term.charAt(term.length()-1);
    if (!(term.isEmpty())){
      if ( i == 43 || i == 42 || i == 45 || i == 47) {
        jButton6.setEnabled(true);
        jButton5.setEnabled(true);
        jButton3.setEnabled(true);
        jButton15.setEnabled(true);
        jButton1.setEnabled(true);
      } // end of if
      jTextField1.setText(term.substring(0, term.length()-1));
      term = jTextField1.getText();}
    else {
      
    } // end of if-else

  } // end of jButton16_ActionPerformed
  public void jButton17_ActionPerformed(ActionEvent evt) {
    term = "";
    jButton2.setEnabled(true);
    jButton8.setEnabled(true);
    jButton4.setEnabled(true);
    jButton7.setEnabled(true);
    jButton11.setEnabled(true);
    jButton12.setEnabled(true);
    jButton10.setEnabled(true);
    jButton9.setEnabled(true);
    jButton13.setEnabled(true);
    jButton14.setEnabled(true);
    jTextField1.setText("");
    ergebnis = 0;
    stelleInTerm = -1;
    while (!(stack.empty())) { 
      stack.pop();
    } // end of while
    while (!(stack2.empty())) { 
      stack2.pop();
    } // end of while
    jButton17.setEnabled(false);
  } // end of jButton17_ActionPerformed
  // Ende Methoden
} // end of class Taschenrechner2_Stack