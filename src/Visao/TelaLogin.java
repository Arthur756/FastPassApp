
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

/**
 *
 * @author Arthur
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     
    public TelaLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    

        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelAcessarName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jButtonAcessar = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelBlankspace = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextFieldUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(160, 260, 130, 20);

        jLabelAcessarName.setFont(new java.awt.Font("Russo One", 0, 16)); // NOI18N
        jLabelAcessarName.setText("ENTRAR");
        getContentPane().add(jLabelAcessarName);
        jLabelAcessarName.setBounds(170, 390, 70, 30);

        jLabel3.setFont(new java.awt.Font("Russo One", 0, 14)); // NOI18N
        jLabel3.setText("Senha");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 300, 50, 20);

        jLabelUsuario.setFont(new java.awt.Font("Russo One", 0, 14)); // NOI18N
        jLabelUsuario.setText("Usuário");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(90, 260, 60, 20);

        jButtonAcessar.setAction(tela.setVisible(true););
        jButtonAcessar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAcessar.setFont(new java.awt.Font("Russo One", 0, 14)); // NOI18N
        jButtonAcessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ButtonAcessar.png"))); // NOI18N
        jButtonAcessar.setBorder(null);
        jButtonAcessar.setBorderPainted(false);
        jButtonAcessar.setContentAreaFilled(false);
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(130, 380, 150, 50);

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(160, 300, 130, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOGO ANO 1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 40, 160, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ICON USER ANO 1.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 170, 60, 60);

        jLabelBlankspace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Blank Space.png"))); // NOI18N
        jLabelBlankspace.setText("jLabel2");
        getContentPane().add(jLabelBlankspace);
        jLabelBlankspace.setBounds(70, 160, 250, 190);

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/APRESENTAÇÃO UNICEUB CARD WALLPAPER MINImalist p3.png"))); // NOI18N
        jLabelBackground.setText("jLabel1");
        getContentPane().add(jLabelBackground);
        jLabelBackground.setBounds(-60, 0, 649, 633);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 520, 34, 14);

        setBounds(0, 0, 416, 672);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed
        if(jTextFieldUsuario.getText().equals("admin")&&jPasswordFieldSenha.getText().equals("1234")){
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        }else{
            JoptionPane.showMessageDialog(rootPane, "Senha ou Usuário inválidos" 

    }//GEN-LAST:event_jButtonAcessarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAcessarName;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelBlankspace;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
