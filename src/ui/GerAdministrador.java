/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.table.DefaultTableModel;
import negocio.Disciplina;
import negocio.ExceptionElementoExiste;
import negocio.ExceptionElementoInvalido;
import negocio.FechadaAluno;
import negocio.FechadaDisciplina;
import negocio.FechadaProfessor;
import negocio.FechadaRendimentoEscolar;
import negocio.FechadaTurma;
import negocio.IFechadaAluno;
import negocio.IFechadaDisciplina;
import negocio.IFechadaProfessor;
import negocio.IFechadaRendimentoEscolar;
import negocio.IFechadaTurma;
import negocio.Turma;

/**
 *
 * @author vanessa.barros
 */
public class GerAdministrador extends javax.swing.JFrame {
    
    
        private static IFechadaAluno alun = FechadaAluno.getInstancia();
	private static IFechadaTurma trm = FechadaTurma.getInstancia();
	private static IFechadaDisciplina ds = FechadaDisciplina.getInstancia();
	private static IFechadaRendimentoEscolar rd = FechadaRendimentoEscolar.getInstancia();
	private static IFechadaProfessor iprof = FechadaProfessor.getInstancia();

    /**
     * Creates new form GerAdministrador
     */
    public GerAdministrador() {
         initComponents();
         DefaultTableModel tab1 = (DefaultTableModel) tabelaDisciplina.getModel();  
         for (Disciplina d : ds.listarDisciplina()) {
         tab1.addRow(new Object[]{d.getIdDisciplina(), d.getNomeDisciplina(), d.getEmentaDisciplina()});
         }
          DefaultTableModel tab2 = (DefaultTableModel) tabelaTurma.getModel();  
         for (Turma t : trm.listarTurma()) {
         tab2.addRow(new Object[]{t.getIdTurma(), t.getProfessorTurma(), t.getDisciplinaTurma(), t.getCapacidadeTurma()});
         }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaDisciplina = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaTurma = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        idDisciplina = new javax.swing.JTextField();
        nomeDisciplina = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ementaDisciplina = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        idTurma = new javax.swing.JTextField();
        capacidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        BtnPesquisar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        comboBoxAdministrador = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        matricula = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        retorno = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(735, 535));

        jPanel1.setMinimumSize(new java.awt.Dimension(735, 535));
        jPanel1.setPreferredSize(new java.awt.Dimension(735, 535));

        jLabel3.setText("Cadastrar Disciplina");

        tabelaDisciplina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Turma", "Nome", "Ementa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaDisciplina);

        tabelaTurma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Turma", "Professor", "Disciplina", "Capacidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaTurma);

        jLabel4.setText("Id Disciplina");

        jLabel5.setText("Nome");

        jLabel6.setText("Ementa");

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Id Turma");

        jLabel8.setText("Capacidade");

        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Identificador");

        BtnPesquisar.setText("Pesquisar");
        BtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarActionPerformed(evt);
            }
        });

        jButton4.setText("Remover");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        comboBoxAdministrador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disciplina", "Turma", "Professor", "Aluno" }));

        jButton3.setText("Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setText("Cadastrar Turma");

        retorno.setText("--");

        jButton5.setText("Atualizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBoxAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(idTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(capacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(retorno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(idDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ementaDisciplina))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(85, 85, 85)
                                        .addComponent(jLabel6)))
                                .addGap(10, 10, 10)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPesquisar)
                    .addComponent(jButton4)
                    .addComponent(jLabel9)
                    .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(retorno)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ementaDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(nomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(capacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarActionPerformed
        // TODO add your handling code here:
        int v1 = Integer.parseInt(matricula.getText());
        if (comboBoxAdministrador.getSelectedItem().equals("Disciplina")) {
            
            try {    
                 ds.buscarDisciplina(v1);
                 retorno.setText(ds.buscarDisciplina(v1).getNomeDisciplina());
            } catch (ExceptionElementoInvalido ex) {
                retorno.setText(ex.getMessage());
            }
            
        }else if (comboBoxAdministrador.getSelectedItem().equals("Turma")) {
            
            try {
                trm.buscarTurma(v1);
            } catch (ExceptionElementoInvalido ex) {
                retorno.setText(ex.getMessage());
            }
            
        }else if (comboBoxAdministrador.getSelectedItem().equals("Professor")) {
                 
            try {
                iprof.buscarProfessor(v1);
            } catch (ExceptionElementoInvalido ex) {
                retorno.setText(ex.getMessage());
            }
        
        }else if (comboBoxAdministrador.getSelectedItem().equals("Aluno")) {
                        
            try {
               alun.buscarAluno(v1);
            } catch (ExceptionElementoInvalido ex) {
                retorno.setText(ex.getMessage());
            }
          
        }
        
    }//GEN-LAST:event_BtnPesquisarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int v1 = Integer.parseInt(matricula.getText());
        if (comboBoxAdministrador.getSelectedItem().equals("Disciplina")) {
           
            try {    
                 ds.removerDisciplina(v1);
                 retorno.setText("Disciplina removida");
            } catch (ExceptionElementoInvalido ex) {
                retorno.setText(ex.getMessage());
            }
            
        }else if (comboBoxAdministrador.getSelectedItem().equals("Turma")) {
           
            try {
                 trm.removerTurma(v1);
                 retorno.setText("Turma removida");
                } catch (ExceptionElementoInvalido ex) {
                retorno.setText(ex.getMessage());
                }
            
        }else if (comboBoxAdministrador.getSelectedItem().equals("Professor")) {
                 
            try {
                iprof.removerProfessor(v1);
                retorno.setText("Professor removido");
                } catch (ExceptionElementoInvalido ex) {
                retorno.setText(ex.getMessage());
                }
            
        }else if (comboBoxAdministrador.getSelectedItem().equals("Aluno")) {
                        
            try {
               alun.removerAluno(v1);
               retorno.setText("Aluno removido");
            } catch (ExceptionElementoInvalido ex) {
               retorno.setText(ex.getMessage());
            }
          
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
            int v1 = Integer.parseInt(idDisciplina.getText());
            Disciplina disc = new Disciplina(v1, nomeDisciplina.getText(),ementaDisciplina.getText());
                try {
                    ds.inserirDisciplina(disc);   
                    this.dispose();
                    new GerAdministrador().setVisible(true);
                    retorno.setText("Cadastro realizado com sucesso");                 
                } catch (ExceptionElementoExiste ex) {
                    retorno.setText(ex.getMessage());
                }              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            int v1 = Integer.parseInt(idTurma.getText());
            int v2 = Integer.parseInt(capacidade.getText());
            Turma Tur = new Turma(v1, v2);
                try {
                    trm.inserirTurma(Tur);
                    this.dispose();
                    new GerAdministrador().setVisible(true);
                    retorno.setText("Cadastro realizado com sucesso");                
                } catch (ExceptionElementoExiste ex) {
                    retorno.setText(ex.getMessage());
                }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Login log = new Login();
         log.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(GerAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPesquisar;
    private javax.swing.JTextField capacidade;
    private javax.swing.JComboBox comboBoxAdministrador;
    private javax.swing.JTextField ementaDisciplina;
    private javax.swing.JTextField idDisciplina;
    private javax.swing.JTextField idTurma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField matricula;
    private javax.swing.JTextField nomeDisciplina;
    private javax.swing.JLabel retorno;
    private javax.swing.JTable tabelaDisciplina;
    private javax.swing.JTable tabelaTurma;
    // End of variables declaration//GEN-END:variables
}
