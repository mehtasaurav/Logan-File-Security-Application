/*     */ package Markendize.com;
/*     */ import java.awt.Color;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.UnsupportedLookAndFeelException;
/*     */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
/*     */ 
/*     */ public class ComputerFileEncrypyter extends JFrame {
/*     */   public ComputerFileEncrypyter() {
/*  18 */     initComponents();
/*     */   }
/*     */   
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JButton jButton3;
/*     */   private JButton jButton4;
/*     */   private JButton jButton5;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   
/*     */   private void initComponents() {
/*  30 */     this.jLabel1 = new JLabel();
/*  31 */     this.jButton1 = new JButton();
/*  32 */     this.jButton2 = new JButton();
/*  33 */     this.jButton3 = new JButton();
/*  34 */     this.jButton4 = new JButton();
/*  35 */     this.jButton5 = new JButton();
/*  36 */     this.jLabel2 = new JLabel();
/*     */     
/*  38 */     setDefaultCloseOperation(2);
/*  39 */     setResizable(false);
/*  40 */     getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/*  42 */     this.jLabel1.setFont(new Font("Magneto", 1, 48));
/*  43 */     this.jLabel1.setForeground(new Color(255, 0, 0));
/*  44 */     this.jLabel1.setHorizontalAlignment(0);
/*  45 */     this.jLabel1.setText("Logan  FileS  SecuritY");
/*  46 */     this.jLabel1.setBorder(new LineBorder(new Color(255, 153, 0), 3, true));
/*  47 */     getContentPane().add(this.jLabel1, new AbsoluteConstraints(10, 10, 820, 132));
/*     */     
/*  49 */     this.jButton1.setFont(new Font("Arial", 1, 18));
/*  50 */     this.jButton1.setForeground(new Color(153, 0, 51));
/*  51 */     this.jButton1.setText("Image Encryption");
/*  52 */     this.jButton1.setBorder(BorderFactory.createLineBorder(new Color(255, 102, 0), 2));
/*  53 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  55 */             ComputerFileEncrypyter.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*  58 */     getContentPane().add(this.jButton1, new AbsoluteConstraints(42, 175, 288, 81));
/*     */     
/*  60 */     this.jButton2.setFont(new Font("Arial", 1, 18));
/*  61 */     this.jButton2.setForeground(new Color(153, 0, 51));
/*  62 */     this.jButton2.setText("Video Encryption");
/*  63 */     this.jButton2.setBorder(BorderFactory.createLineBorder(new Color(255, 102, 0), 2));
/*  64 */     this.jButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  66 */             ComputerFileEncrypyter.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/*  69 */     getContentPane().add(this.jButton2, new AbsoluteConstraints(514, 175, 288, 81));
/*     */     
/*  71 */     this.jButton3.setFont(new Font("Arial", 1, 18));
/*  72 */     this.jButton3.setForeground(new Color(153, 0, 51));
/*  73 */     this.jButton3.setText("Audio Encryption");
/*  74 */     this.jButton3.setBorder(BorderFactory.createLineBorder(new Color(255, 102, 0), 2));
/*  75 */     this.jButton3.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  77 */             ComputerFileEncrypyter.this.jButton3ActionPerformed(evt);
/*     */           }
/*     */         });
/*  80 */     getContentPane().add(this.jButton3, new AbsoluteConstraints(514, 356, 288, 81));
/*     */     
/*  82 */     this.jButton4.setFont(new Font("Arial", 1, 18));
/*  83 */     this.jButton4.setForeground(new Color(153, 0, 51));
/*  84 */     this.jButton4.setText("PDF/Document  Encryption");
/*  85 */     this.jButton4.setBorder(BorderFactory.createLineBorder(new Color(255, 102, 0), 2));
/*  86 */     this.jButton4.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  88 */             ComputerFileEncrypyter.this.jButton4ActionPerformed(evt);
/*     */           }
/*     */         });
/*  91 */     getContentPane().add(this.jButton4, new AbsoluteConstraints(42, 356, 288, 81));
/*     */     
/*  93 */     this.jButton5.setFont(new Font("Arial", 1, 18));
/*  94 */     this.jButton5.setForeground(new Color(255, 51, 0));
/*  95 */     this.jButton5.setText("Back");
/*  96 */     this.jButton5.setBorder(null);
/*  97 */     this.jButton5.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  99 */             ComputerFileEncrypyter.this.jButton5ActionPerformed(evt);
/*     */           }
/*     */         });
/* 102 */     getContentPane().add(this.jButton5, new AbsoluteConstraints(10, 490, 50, -1));
/*     */     
/* 104 */     this.jLabel2.setIcon(new ImageIcon(getClass().getResource("/Images/zwaIWUh.jpg")));
/* 105 */     this.jLabel2.setText("jLabel2");
/* 106 */     getContentPane().add(this.jLabel2, new AbsoluteConstraints(0, 0, 840, 520));
/*     */     
/* 108 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton5ActionPerformed(ActionEvent evt) {
/* 112 */     dispose();
/* 113 */     LoganSecuritySystem obj = new LoganSecuritySystem();
/* 114 */     obj.setVisible(true);
/*     */   }
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 119 */     dispose();
/* 120 */     ImageEncrypter obj = new ImageEncrypter();
/* 121 */     obj.setVisible(true);
/*     */   }
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 125 */     dispose();
/* 126 */     VideoEncryption obj = new VideoEncryption();
/* 127 */     obj.setVisible(true);
/*     */   }
/*     */   
/*     */   private void jButton4ActionPerformed(ActionEvent evt) {
/* 131 */     dispose();
/* 132 */     PDFencryption obj = new PDFencryption();
/* 133 */     obj.setVisible(true);
/*     */   }
/*     */   
/*     */   private void jButton3ActionPerformed(ActionEvent evt) {
/* 137 */     dispose();
/* 138 */     Music obj = new Music();
/* 139 */     obj.setVisible(true);
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
/* 152 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 153 */         if ("Nimbus".equals(info.getName())) {
/* 154 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 158 */     } catch (ClassNotFoundException ex) {
/* 159 */       Logger.getLogger(ComputerFileEncrypyter.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 160 */     } catch (InstantiationException ex) {
/* 161 */       Logger.getLogger(ComputerFileEncrypyter.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 162 */     } catch (IllegalAccessException ex) {
/* 163 */       Logger.getLogger(ComputerFileEncrypyter.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 164 */     } catch (UnsupportedLookAndFeelException ex) {
/* 165 */       Logger.getLogger(ComputerFileEncrypyter.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 170 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 172 */             (new ComputerFileEncrypyter()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Logan File Security\Logan_File_Security.jar!\Markendize\com\ComputerFileEncrypyter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */