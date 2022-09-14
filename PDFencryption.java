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
/*     */ public class PDFencryption extends JFrame {
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JButton jButton6;
/*     */   private JLabel jLabel1;
/*     */   
/*     */   public PDFencryption() {
/*  19 */     initComponents();
/*     */   } private JLabel jLabel3; private JLabel jLabel4; private JLabel jLabel5; private JTextField jTextField1; private JTextField jTextField2;
/*     */   int Encryptionkey() {
/*  22 */     int key = Integer.parseInt(this.jTextField2.getText());
/*  23 */     return key;
/*     */   }
/*     */   void EncryptPdf() {
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
/*     */   void DecryptPdf() {
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
/*     */   
/*     */   private void initComponents() {
/*  98 */     this.jLabel1 = new JLabel();
/*  99 */     this.jButton1 = new JButton();
/* 100 */     this.jButton2 = new JButton();
/* 101 */     this.jButton6 = new JButton();
/* 102 */     this.jLabel4 = new JLabel();
/* 103 */     this.jTextField2 = new JTextField();
/* 104 */     this.jLabel3 = new JLabel();
/* 105 */     this.jTextField1 = new JTextField();
/* 106 */     this.jLabel5 = new JLabel();
/*     */     
/* 108 */     setDefaultCloseOperation(2);
/* 109 */     setResizable(false);
/* 110 */     getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/* 112 */     this.jLabel1.setFont(new Font("Magneto", 1, 48));
/* 113 */     this.jLabel1.setForeground(new Color(255, 0, 0));
/* 114 */     this.jLabel1.setHorizontalAlignment(0);
/* 115 */     this.jLabel1.setText("Logan  FileS  SecuritY");
/* 116 */     this.jLabel1.setBorder(new LineBorder(new Color(255, 153, 0), 3, true));
/* 117 */     getContentPane().add(this.jLabel1, new AbsoluteConstraints(25, 11, 810, 132));
/*     */     
/* 119 */     this.jButton1.setFont(new Font("Arial", 1, 18));
/* 120 */     this.jButton1.setForeground(new Color(255, 51, 0));
/* 121 */     this.jButton1.setText("Decrypt PDF");
/* 122 */     this.jButton1.setBorder(BorderFactory.createLineBorder(new Color(204, 102, 0), 2));
/* 123 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 125 */             PDFencryption.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/* 128 */     getContentPane().add(this.jButton1, new AbsoluteConstraints(560, 340, 241, 61));
/*     */     
/* 130 */     this.jButton2.setFont(new Font("Arial", 1, 18));
/* 131 */     this.jButton2.setForeground(new Color(255, 51, 0));
/* 132 */     this.jButton2.setText("Encrypt PDF");
/* 133 */     this.jButton2.setBorder(BorderFactory.createLineBorder(new Color(204, 102, 0), 2));
/* 134 */     this.jButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 136 */             PDFencryption.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/* 139 */     getContentPane().add(this.jButton2, new AbsoluteConstraints(80, 340, 241, 61));
/*     */     
/* 141 */     this.jButton6.setFont(new Font("Arial", 1, 18));
/* 142 */     this.jButton6.setForeground(new Color(255, 51, 0));
/* 143 */     this.jButton6.setText("Back");
/* 144 */     this.jButton6.setBorder(null);
/* 145 */     this.jButton6.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 147 */             PDFencryption.this.jButton6ActionPerformed(evt);
/*     */           }
/*     */         });
/* 150 */     getContentPane().add(this.jButton6, new AbsoluteConstraints(10, 460, 50, -1));
/*     */     
/* 152 */     this.jLabel4.setFont(new Font("Arial", 1, 18));
/* 153 */     this.jLabel4.setForeground(new Color(255, 51, 51));
/* 154 */     this.jLabel4.setText("Enter the Encryption Key:");
/* 155 */     getContentPane().add(this.jLabel4, new AbsoluteConstraints(30, 180, 240, 30));
/* 156 */     getContentPane().add(this.jTextField2, new AbsoluteConstraints(280, 180, 140, 30));
/*     */     
/* 158 */     this.jLabel3.setFont(new Font("Arial", 1, 18));
/* 159 */     this.jLabel3.setForeground(new Color(255, 51, 51));
/* 160 */     this.jLabel3.setText("Enter the Decryption Key:");
/* 161 */     getContentPane().add(this.jLabel3, new AbsoluteConstraints(450, 180, 240, 30));
/* 162 */     getContentPane().add(this.jTextField1, new AbsoluteConstraints(690, 180, 140, 30));
/*     */     
/* 164 */     this.jLabel5.setIcon(new ImageIcon(getClass().getResource("/Images/zwaIWUh.jpg")));
/* 165 */     this.jLabel5.setText("jLabel5");
/* 166 */     getContentPane().add(this.jLabel5, new AbsoluteConstraints(0, 0, 880, 510));
/*     */     
/* 168 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton6ActionPerformed(ActionEvent evt) {
/* 172 */     dispose();
/* 173 */     ComputerFileEncrypyter obj = new ComputerFileEncrypyter();
/* 174 */     obj.setVisible(true);
/*     */   }
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 178 */     EncryptPdf();
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 182 */     DecryptPdf();
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
/* 195 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 196 */         if ("Nimbus".equals(info.getName())) {
/* 197 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 201 */     } catch (ClassNotFoundException ex) {
/* 202 */       Logger.getLogger(PDFencryption.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 203 */     } catch (InstantiationException ex) {
/* 204 */       Logger.getLogger(PDFencryption.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 205 */     } catch (IllegalAccessException ex) {
/* 206 */       Logger.getLogger(PDFencryption.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 207 */     } catch (UnsupportedLookAndFeelException ex) {
/* 208 */       Logger.getLogger(PDFencryption.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 213 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 215 */             (new PDFencryption()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Logan File Security\Logan_File_Security.jar!\Markendize\com\PDFencryption.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */