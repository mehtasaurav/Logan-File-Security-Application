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
/*     */ public class LoganSecuritySystem extends JFrame {
/*     */   public LoganSecuritySystem() {
/*  18 */     initComponents();
/*     */   }
/*     */ 
/*     */   
/*     */   private JButton jButton1;
/*     */   
/*     */   private JButton jButton2;
/*     */   
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   
/*     */   private void initComponents() {
/*  30 */     this.jLabel1 = new JLabel();
/*  31 */     this.jButton1 = new JButton();
/*  32 */     this.jButton2 = new JButton();
/*  33 */     this.jLabel2 = new JLabel();
/*     */     
/*  35 */     setDefaultCloseOperation(2);
/*  36 */     setResizable(false);
/*  37 */     getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/*  39 */     this.jLabel1.setFont(new Font("Magneto", 1, 48));
/*  40 */     this.jLabel1.setForeground(new Color(255, 0, 0));
/*  41 */     this.jLabel1.setHorizontalAlignment(0);
/*  42 */     this.jLabel1.setText("Logan  FileS  SecuritY");
/*  43 */     this.jLabel1.setBorder(new LineBorder(new Color(255, 153, 0), 3, true));
/*  44 */     getContentPane().add(this.jLabel1, new AbsoluteConstraints(25, 11, 810, 132));
/*     */     
/*  46 */     this.jButton1.setFont(new Font("Arial", 1, 18));
/*  47 */     this.jButton1.setForeground(new Color(255, 51, 0));
/*  48 */     this.jButton1.setText("Personal Message Encrypt/Decrypt");
/*  49 */     this.jButton1.setBorder(BorderFactory.createBevelBorder(0, new Color(255, 51, 51), new Color(255, 51, 51), new Color(255, 0, 0), new Color(255, 0, 0)));
/*  50 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  52 */             LoganSecuritySystem.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*  55 */     getContentPane().add(this.jButton1, new AbsoluteConstraints(461, 243, 365, 135));
/*     */     
/*  57 */     this.jButton2.setFont(new Font("Arial", 1, 18));
/*  58 */     this.jButton2.setForeground(new Color(255, 51, 0));
/*  59 */     this.jButton2.setText("Computer Files Encrypt/Decrypt");
/*  60 */     this.jButton2.setBorder(BorderFactory.createBevelBorder(0, new Color(255, 51, 51), new Color(255, 51, 51), new Color(255, 0, 0), new Color(255, 0, 0)));
/*  61 */     this.jButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  63 */             LoganSecuritySystem.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/*  66 */     getContentPane().add(this.jButton2, new AbsoluteConstraints(20, 241, 365, 135));
/*     */     
/*  68 */     this.jLabel2.setIcon(new ImageIcon(getClass().getResource("/Images/zwaIWUh.jpg")));
/*  69 */     this.jLabel2.setText("jLabel2");
/*  70 */     getContentPane().add(this.jLabel2, new AbsoluteConstraints(0, 0, 860, 480));
/*     */     
/*  72 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/*  76 */     dispose();
/*  77 */     ComputerFileEncrypyter obj1 = new ComputerFileEncrypyter();
/*  78 */     obj1.setVisible(true);
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/*  82 */     dispose();
/*  83 */     MesageEncryption obj = new MesageEncryption();
/*  84 */     obj.setVisible(true);
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
/*  97 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/*  98 */         if ("Nimbus".equals(info.getName())) {
/*  99 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 103 */     } catch (ClassNotFoundException ex) {
/* 104 */       Logger.getLogger(LoganSecuritySystem.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 105 */     } catch (InstantiationException ex) {
/* 106 */       Logger.getLogger(LoganSecuritySystem.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 107 */     } catch (IllegalAccessException ex) {
/* 108 */       Logger.getLogger(LoganSecuritySystem.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 109 */     } catch (UnsupportedLookAndFeelException ex) {
/* 110 */       Logger.getLogger(LoganSecuritySystem.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 115 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 117 */             (new LoganSecuritySystem()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Logan File Security\Logan_File_Security.jar!\Markendize\com\LoganSecuritySystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */