package telas;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno

*/
import estruturas.Persistencia;
import estruturas.Arte;
import java.util.*;
import java.io.*;


public class PainelPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PainelPrincipal
     */
    public PainelPrincipal() {
       
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jTelaPrincipal = new javax.swing.JDesktopPane();
        jMenuBarra = new javax.swing.JMenuBar();
        jMenuOpcoes = new javax.swing.JMenu();
        jMenuItemCadastrar = new javax.swing.JMenuItem();
        jMenuItemPesquisar = new javax.swing.JMenuItem();
        jMenuItemEditar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout jTelaPrincipalLayout = new javax.swing.GroupLayout(jTelaPrincipal);
        jTelaPrincipal.setLayout(jTelaPrincipalLayout);
        jTelaPrincipalLayout.setHorizontalGroup(
            jTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        jTelaPrincipalLayout.setVerticalGroup(
            jTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTelaPrincipal)
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTelaPrincipal)
                .addContainerGap())
        );

        jMenuOpcoes.setText("Opções");
        jMenuOpcoes.setToolTipText("");

        jMenuItemCadastrar.setText("Cadastrar Novas Obras");
        jMenuItemCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemCadastrar);

        jMenuItemPesquisar.setText("Pesquisar Registros");
        jMenuItemPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesquisarActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemPesquisar);

        jMenuItemEditar.setText("Modificar Dados");
        jMenuOpcoes.add(jMenuItemEditar);

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItem1);

        jMenuBarra.add(jMenuOpcoes);

        setJMenuBar(jMenuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /** Botão de Cadastrar Obras de Arte
     *   Abre uma janela que serve para registrar uma obra de arte no acervo
     *   pertencente ao museu.
     */
    private void jMenuItemCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarActionPerformed
        PainelDeCadastro PainelC = new PainelDeCadastro();
        jTelaPrincipal.add(PainelC);
        PainelC.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastrarActionPerformed

    /** Botão de Pesquisar Obras de Arte
     *   Abre uma janela que serve para buscar uma obra de arte no acervo
     *   daquelas que já foram cadastradas.
     */
    private void jMenuItemPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesquisarActionPerformed
        PainelDePesquisa PainelP = new PainelDePesquisa();
        jTelaPrincipal.add(PainelP);
        PainelP.setVisible(true);
        
        
        
    }//GEN-LAST:event_jMenuItemPesquisarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      
        
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
       
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBarra;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemCadastrar;
    private javax.swing.JMenuItem jMenuItemEditar;
    private javax.swing.JMenuItem jMenuItemPesquisar;
    private javax.swing.JMenu jMenuOpcoes;
    private javax.swing.JPanel jPanelPrincipal;
    protected static javax.swing.JDesktopPane jTelaPrincipal;
    // End of variables declaration//GEN-END:variables

private static LinkedList<Arte> cad = new LinkedList<Arte>();
private static Persistencia p = new Persistencia();


}
