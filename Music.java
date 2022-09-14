/*     */ package Markendize.com;
/*     */ import java.awt.Color;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFileChooser;
/*     */ import javax.swing.JLabel;
/*     */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
/*     */ 
/*     */ public class Music extends JFrame {
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JButton jButton6;
/*     */   private JLabel jLabel1;
/*     */   
/*     */   public Music() {
/*  19 */     initComponents();
/*     */   } private JLabel jLabel3; private JLabel jLabel4; private JLabel jLabel5; private JTextField jTextField1; private JTextField jTextField2;
/*     */   int Encryptionkey() {
/*  22 */     int key = Integer.parseInt(this.jTextField2.getText());
/*  23 */     return key;
/*     */   }
/*     */   void EncryptAudio() {
/*  26 */     int key = Encryptionkey();
/*  27 */     JFileChooser obj = new JFileChooser();
/*  28 */     obj.showOpenDialog(null);
/*  29 */     File file = obj.getSelectedFile();
/*     */     
/*     */     try {
/*  32 */       FileInputStream obj1 = new FileInputStream(file);
/*  33 */       byte[] data = new byte[obj1.available()];
/*  34 */       obj1.read(data);
/*  35 */       int i = 0;
/*  36 */       for (byte b : data) {
/*  37 */         data[i] = (byte)(b ^ key);
/*  38 */         i++;
/*     */       } 
/*  40 */       FileOutputStream obj2 = new FileOutputStream(file);
/*  41 */       obj2.write(data);
/*  42 */       obj2.close();
/*  43 */       obj1.close();
/*  44 */       JOptionPane.showMessageDialog(null, "Congratulations The file has been safely Encrypted");
/*     */     
/*     */     }
/*  47 */     catch (Exception e) {
/*     */       
/*  49 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   int Decryptionkey() {
/*  55 */     int key = Integer.parseInt(this.jTextField1.getText());
/*  56 */     return key;
/*     */   }
/*     */   void DecryptAudio() {
/*  59 */     int key = Decryptionkey();
/*  60 */     JFileChooser obj = new JFileChooser();
/*  61 */     obj.showOpenDialog(null);
/*  62 */     File file = obj.getSelectedFile();
/*     */     
/*     */     try {
/*  65 */       FileInputStream obj1 = new FileInputStream(file);
/*  66 */       byte[] data = new byte[obj1.available()];
/*  67 */       obj1.read(data);
/*  68 */       int i = 0;
/*  69 */       for (byte b : data) {
/*  70 */         data[i] = (byte)(b ^ key);
/*  71 */         i++;
/*     */       } 
/*  73 */       FileOutputStream obj2 = new FileOutputStream(file);
/*  74 */       obj2.write(data);
/*  75 */       obj2.close();
/*  76 */       obj1.close();
/*  77 */       JOptionPane.showMessageDialog(null, "Congratulations The file has been safely Decrypted");
/*     */     
/*     */     }
/*  80 */     catch (Exception e) {
/*     */       
/*  82 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void initComponents() {
/*  97 */     this.jLabel1 = new JLabel();
/*  98 */     this.jButton1 = new JButton();
/*  99 */     this.jButton2 = new JButton();
/* 100 */     this.jButton6 = new JButton();
/* 101 */     this.jLabel4 = new JLabel();
/* 102 */     this.jTextField2 = new JTextField();
/* 103 */     this.jLabel3 = new JLabel();
/* 104 */     this.jTextField1 = new JTextField();
/* 105 */     this.jLabel5 = new JLabel();
/*     */     
/* 107 */     setDefaultCloseOperation(2);
/* 108 */     setResizable(false);
/* 109 */     getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/* 111 */     this.jLabel1.setFont(new Font("Magneto", 1, 48));
/* 112 */     this.jLabel1.setForeground(new Color(255, 0, 0));
/* 113 */     this.jLabel1.setHorizontalAlignment(0);
/* 114 */     this.jLabel1.setText("Logan  FileS  SecuritY");
/* 115 */     this.jLabel1.setBorder(new LineBorder(new Color(255, 153, 0), 3, true));
/* 116 */     getContentPane().add(this.jLabel1, new AbsoluteConstraints(10, 10, 820, 132));
/*     */     
/* 118 */     this.jButton1.setFont(new Font("Arial", 1, 18));
/* 119 */     this.jButton1.setForeground(new Color(255, 51, 0));
/* 120 */     this.jButton1.setText("Decrypt an Audio");
/* 121 */     this.jButton1.setBorder(BorderFactory.createLineBorder(new Color(204, 102, 0), 2));
/* 122 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 124 */             Music.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/* 127 */     getContentPane().add(this.jButton1, new AbsoluteConstraints(550, 330, 241, 61));
/*     */     
/* 129 */     this.jButton2.setFont(new Font("Arial", 1, 18));
/* 130 */     this.jButton2.setForeground(new Color(255, 51, 0));
/* 131 */     this.jButton2.setText("Encrypt an Audio");
/* 132 */     this.jButton2.setBorder(BorderFactory.createLineBorder(new Color(204, 102, 0), 2));
/* 133 */     this.jButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 135 */             Music.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/* 138 */     getContentPane().add(this.jButton2, new AbsoluteConstraints(60, 340, 241, 61));
/*     */     
/* 140 */     this.jButton6.setFont(new Font("Arial", 1, 18));
/* 141 */     this.jButton6.setForeground(new Color(255, 51, 0));
/* 142 */     this.jButton6.setText("Back");
/* 143 */     this.jButton6.setBorder(null);
/* 144 */     this.jButton6.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 146 */             Music.this.jButton6ActionPerformed(evt);
/*     */           }
/*     */         });
/* 149 */     getContentPane().add(this.jButton6, new AbsoluteConstraints(10, 480, 50, -1));
/*     */     
/* 151 */     this.jLabel4.setFont(new Font("Arial", 1, 18));
/* 152 */     this.jLabel4.setForeground(new Color(255, 102, 51));
/* 153 */     this.jLabel4.setText("Enter the Encryption Key:");
/* 154 */     getContentPane().add(this.jLabel4, new AbsoluteConstraints(30, 180, 240, 30));
/* 155 */     getContentPane().add(this.jTextField2, new AbsoluteConstraints(280, 180, 140, 30));
/*     */     
/* 157 */     this.jLabel3.setFont(new Font("Arial", 1, 18));
/* 158 */     this.jLabel3.setForeground(new Color(255, 102, 51));
/* 159 */     this.jLabel3.setText("Enter the Decryption Key:");
/* 160 */     getContentPane().add(this.jLabel3, new AbsoluteConstraints(450, 180, 240, 30));
/* 161 */     getContentPane().add(this.jTextField1, new AbsoluteConstraints(690, 180, 140, 30));
/*     */     
/* 163 */     this.jLabel5.setIcon(new ImageIcon(getClass().getResource("/Images/zwaIWUh.jpg")));
/* 164 */     this.jLabel5.setText("jLabel5");
/* 165 */     getContentPane().add(this.jLabel5, new AbsoluteConstraints(0, 0, 860, 520));
/*     */     
/* 167 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton6ActionPerformed(ActionEvent evt) {
/* 171 */     dispose();
/* 172 */     ComputerFileEncrypyter obj = new ComputerFileEncrypyter();
/* 173 */     obj.setVisible(true);
/*     */   }
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 177 */     EncryptAudio();
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 181 */     DecryptAudio();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/*     */     try {
/* 194 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 195 */         if ("Nimbus".equals(info.getName())) {
/* 196 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 200 */     } catch (ClassNotFoundException ex) {
/* 201 */       Logger.getLogger(Music.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 202 */     } catch (InstantiationException ex) {
/* 203 */       Logger.getLogger(Music.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 204 */     } catch (IllegalAccessException ex) {
/* 205 */       Logger.getLogger(Music.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 206 */     } catch (UnsupportedLookAndFeelException ex) {
/* 207 */       Logger.getLogger(Music.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 212 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 214 */             (new Music()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Logan File Security\Logan_File_Security.jar!\Markendize\com\Music.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */