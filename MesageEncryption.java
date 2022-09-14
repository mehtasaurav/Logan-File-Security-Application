/*     */ package Markendize.com;
/*     */ import java.awt.Color;
/*     */ import java.awt.event.ActionEvent;
/*     */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
/*     */ 
/*     */ public class MesageEncryption extends JFrame {
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JButton jButton6;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private JLabel jLabel4;
/*     */   private JLabel jLabel5;
/*     */   private JLabel jLabel6;
/*     */   
/*     */   public MesageEncryption() {
/*  18 */     initComponents();
/*     */   } private JLabel jLabel7; private JScrollPane jScrollPane1; private JScrollPane jScrollPane2; private JScrollPane jScrollPane3; private JTextArea jTextArea1; private JTextArea jTextArea2; private JTextArea jTextArea3; private JTextField jTextField1; private JTextField jTextField2;
/*     */   String give() {
/*  21 */     String give = this.jTextArea1.getText();
/*  22 */     return give;
/*     */   }
/*     */   
/*     */   int EncryptionKey() {
/*  26 */     int key = Integer.parseInt(this.jTextField1.getText());
/*  27 */     return key;
/*     */   }
/*     */   int DecryptionKey() {
/*  30 */     int key = Integer.parseInt(this.jTextField2.getText());
/*  31 */     return key;
/*     */   }
/*     */   
/*     */   char[] MessageEncryptionProcess() {
/*  35 */     int key = EncryptionKey();
/*  36 */     String give = give();
/*  37 */     char[] arr = give.toCharArray();
/*  38 */     int[] arr1 = new int[arr.length];
/*  39 */     for (int j = 0; j < arr.length; j++) {
/*  40 */       arr1[j] = arr[j];
/*     */     }
/*  42 */     int[] arr2 = new int[arr1.length];
/*  43 */     for (int i = 0; i < arr1.length; i++) {
/*  44 */       arr2[i] = arr1[i] * key;
/*     */     }
/*  46 */     char[] arr3 = new char[arr2.length];
/*  47 */     for (int k = 0; k < arr2.length; k++) {
/*  48 */       arr3[k] = (char)arr2[k];
/*     */     }
/*  50 */     StringBuilder txt = new StringBuilder();
/*  51 */     for (char index : arr3) {
/*  52 */       txt.append(index);
/*  53 */       this.jTextArea3.setText(txt.toString());
/*     */     } 
/*  55 */     return arr3;
/*     */   }
/*     */   
/*     */   void MessageDecryptionProcess() {
/*  59 */     String give = give();
/*  60 */     int key = DecryptionKey();
/*  61 */     char[] arr4 = MessageEncryptionProcess();
/*  62 */     int[] arr6 = new int[arr4.length];
/*  63 */     for (int i = 0; i < arr4.length; i++) {
/*  64 */       arr6[i] = arr4[i] / key;
/*     */     }
/*  66 */     char[] arr3 = new char[arr6.length];
/*  67 */     for (int j = 0; j < arr6.length; j++) {
/*  68 */       arr3[j] = (char)arr6[j];
/*     */     }
/*     */     
/*  71 */     StringBuilder txt = new StringBuilder();
/*  72 */     for (char index : arr3) {
/*  73 */       txt.append(index);
/*  74 */       this.jTextArea2.setText(txt.toString());
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
/*  89 */     this.jLabel1 = new JLabel();
/*  90 */     this.jLabel2 = new JLabel();
/*  91 */     this.jScrollPane1 = new JScrollPane();
/*  92 */     this.jTextArea1 = new JTextArea();
/*  93 */     this.jScrollPane2 = new JScrollPane();
/*  94 */     this.jTextArea2 = new JTextArea();
/*  95 */     this.jLabel4 = new JLabel();
/*  96 */     this.jButton1 = new JButton();
/*  97 */     this.jLabel3 = new JLabel();
/*  98 */     this.jTextField1 = new JTextField();
/*  99 */     this.jLabel5 = new JLabel();
/* 100 */     this.jTextField2 = new JTextField();
/* 101 */     this.jScrollPane3 = new JScrollPane();
/* 102 */     this.jTextArea3 = new JTextArea();
/* 103 */     this.jLabel6 = new JLabel();
/* 104 */     this.jButton2 = new JButton();
/* 105 */     this.jButton6 = new JButton();
/* 106 */     this.jLabel7 = new JLabel();
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
/* 117 */     getContentPane().add(this.jLabel1, new AbsoluteConstraints(25, 11, 810, 80));
/*     */     
/* 119 */     this.jLabel2.setFont(new Font("Arial", 1, 24));
/* 120 */     this.jLabel2.setForeground(new Color(204, 0, 0));
/* 121 */     this.jLabel2.setHorizontalAlignment(0);
/* 122 */     this.jLabel2.setText("Enter Your Mesage :");
/* 123 */     this.jLabel2.setBorder(BorderFactory.createEtchedBorder());
/* 124 */     getContentPane().add(this.jLabel2, new AbsoluteConstraints(40, 130, 266, -1));
/*     */     
/* 126 */     this.jTextArea1.setColumns(20);
/* 127 */     this.jTextArea1.setRows(5);
/* 128 */     this.jScrollPane1.setViewportView(this.jTextArea1);
/*     */     
/* 130 */     getContentPane().add(this.jScrollPane1, new AbsoluteConstraints(40, 160, 707, 60));
/*     */     
/* 132 */     this.jTextArea2.setColumns(20);
/* 133 */     this.jTextArea2.setRows(5);
/* 134 */     this.jScrollPane2.setViewportView(this.jTextArea2);
/*     */     
/* 136 */     getContentPane().add(this.jScrollPane2, new AbsoluteConstraints(50, 570, 707, 68));
/*     */     
/* 138 */     this.jLabel4.setFont(new Font("Arial", 1, 24));
/* 139 */     this.jLabel4.setForeground(new Color(204, 0, 0));
/* 140 */     this.jLabel4.setHorizontalAlignment(0);
/* 141 */     this.jLabel4.setText("Your Encrypted Message :");
/* 142 */     this.jLabel4.setBorder(BorderFactory.createEtchedBorder());
/* 143 */     getContentPane().add(this.jLabel4, new AbsoluteConstraints(40, 250, 316, -1));
/*     */     
/* 145 */     this.jButton1.setFont(new Font("Arial", 1, 18));
/* 146 */     this.jButton1.setForeground(new Color(255, 0, 0));
/* 147 */     this.jButton1.setText("Decrypt The Message");
/* 148 */     this.jButton1.setBorder(new SoftBevelBorder(0));
/* 149 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 151 */             MesageEncryption.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/* 154 */     getContentPane().add(this.jButton1, new AbsoluteConstraints(290, 410, 302, 35));
/*     */     
/* 156 */     this.jLabel3.setFont(new Font("Arial", 1, 36));
/* 157 */     this.jLabel3.setForeground(new Color(255, 0, 0));
/* 158 */     this.jLabel3.setText("KEY :");
/* 159 */     this.jLabel3.setBorder(BorderFactory.createLineBorder(new Color(255, 102, 0)));
/* 160 */     getContentPane().add(this.jLabel3, new AbsoluteConstraints(470, 120, 129, 39));
/*     */     
/* 162 */     this.jTextField1.setBackground(new Color(204, 255, 153));
/* 163 */     this.jTextField1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 165 */             MesageEncryption.this.jTextField1ActionPerformed(evt);
/*     */           }
/*     */         });
/* 168 */     getContentPane().add(this.jTextField1, new AbsoluteConstraints(600, 120, 111, 40));
/*     */     
/* 170 */     this.jLabel5.setFont(new Font("Arial", 1, 18));
/* 171 */     this.jLabel5.setForeground(new Color(255, 0, 51));
/* 172 */     this.jLabel5.setText("Enter the correct Key To Decrypt the Message :");
/* 173 */     this.jLabel5.setBorder(BorderFactory.createEtchedBorder());
/* 174 */     getContentPane().add(this.jLabel5, new AbsoluteConstraints(50, 470, 440, 47));
/*     */     
/* 176 */     this.jTextField2.setBackground(new Color(153, 255, 153));
/* 177 */     getContentPane().add(this.jTextField2, new AbsoluteConstraints(510, 470, 116, 40));
/*     */     
/* 179 */     this.jTextArea3.setColumns(20);
/* 180 */     this.jTextArea3.setRows(5);
/* 181 */     this.jScrollPane3.setViewportView(this.jTextArea3);
/*     */     
/* 183 */     getContentPane().add(this.jScrollPane3, new AbsoluteConstraints(40, 280, 707, 68));
/*     */     
/* 185 */     this.jLabel6.setFont(new Font("Arial", 1, 24));
/* 186 */     this.jLabel6.setForeground(new Color(204, 0, 0));
/* 187 */     this.jLabel6.setHorizontalAlignment(0);
/* 188 */     this.jLabel6.setText("Your Original Message");
/* 189 */     this.jLabel6.setBorder(BorderFactory.createLineBorder(new Color(255, 102, 0)));
/* 190 */     getContentPane().add(this.jLabel6, new AbsoluteConstraints(260, 530, 330, -1));
/*     */     
/* 192 */     this.jButton2.setFont(new Font("Arial", 1, 18));
/* 193 */     this.jButton2.setForeground(new Color(255, 0, 0));
/* 194 */     this.jButton2.setText("Encrypt The Message");
/* 195 */     this.jButton2.setBorder(new SoftBevelBorder(0));
/* 196 */     this.jButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 198 */             MesageEncryption.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/* 201 */     getContentPane().add(this.jButton2, new AbsoluteConstraints(290, 360, 302, 35));
/*     */     
/* 203 */     this.jButton6.setFont(new Font("Arial", 1, 18));
/* 204 */     this.jButton6.setForeground(new Color(255, 51, 0));
/* 205 */     this.jButton6.setText("Back");
/* 206 */     this.jButton6.setBorder(null);
/* 207 */     this.jButton6.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 209 */             MesageEncryption.this.jButton6ActionPerformed(evt);
/*     */           }
/*     */         });
/* 212 */     getContentPane().add(this.jButton6, new AbsoluteConstraints(10, 660, 50, -1));
/*     */     
/* 214 */     this.jLabel7.setIcon(new ImageIcon(getClass().getResource("/Images/252439-most-popular-white-gradient-background-2560x1440.jpg")));
/* 215 */     this.jLabel7.setText("jLabel7");
/* 216 */     getContentPane().add(this.jLabel7, new AbsoluteConstraints(0, 0, 860, 690));
/*     */     
/* 218 */     pack();
/*     */   }
/*     */ 
/*     */   
/*     */   private void jTextField1ActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */   
/*     */   private void jButton6ActionPerformed(ActionEvent evt) {
/* 226 */     dispose();
/* 227 */     LoganSecuritySystem obj = new LoganSecuritySystem();
/* 228 */     obj.setVisible(true);
/*     */   }
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 232 */     MessageEncryptionProcess();
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 236 */     MessageDecryptionProcess();
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
/* 249 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 250 */         if ("Nimbus".equals(info.getName())) {
/* 251 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 255 */     } catch (ClassNotFoundException ex) {
/* 256 */       Logger.getLogger(MesageEncryption.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 257 */     } catch (InstantiationException ex) {
/* 258 */       Logger.getLogger(MesageEncryption.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 259 */     } catch (IllegalAccessException ex) {
/* 260 */       Logger.getLogger(MesageEncryption.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 261 */     } catch (UnsupportedLookAndFeelException ex) {
/* 262 */       Logger.getLogger(MesageEncryption.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 267 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 269 */             (new MesageEncryption()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Logan File Security\Logan_File_Security.jar!\Markendize\com\MesageEncryption.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */