/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;


import com.mycompany.model.bean.Aluno;
import com.mycompany.model.dao.AlunoDAO;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo de Souza
 */
public class TelaCadastro extends javax.swing.JFrame {
    
    Aluno usuario =  new Aluno();
    private Dashboard dashboard;
    private int rowEditar;
    private boolean isOnEdit = false;
    /**
     * Creates new form TelaCadastro
     * @param dashboard
     */
    public TelaCadastro(Dashboard dashboard) {
        initComponents();
        this.dashboard = dashboard;
        jLabel1.setText("Adicionar Aluno");
    }
    public TelaCadastro(Dashboard dashboard, int row, boolean isOnEdit) {
        initComponents();
        this.dashboard = dashboard;
        this.rowEditar = row;
        this.isOnEdit = isOnEdit;
        jLabel1.setText("Editar Aluno");

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        btnEnviar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Add novo aluno");

        txtFirstName.setForeground(new java.awt.Color(0, 0, 0));
        txtFirstName.setText("First Name");
        txtFirstName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(234, 234, 234))); // NOI18N

        txtLastName.setForeground(new java.awt.Color(0, 0, 0));
        txtLastName.setText("Last Name");
        txtLastName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(234, 234, 234))); // NOI18N

        txtUserName.setForeground(new java.awt.Color(0, 0, 0));
        txtUserName.setText("User Name");
        txtUserName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(234, 234, 234))); // NOI18N

        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setText("Email");
        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(234, 234, 234))); // NOI18N

        txtTelefone.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefone.setText("Telefone");
        txtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(234, 234, 234))); // NOI18N

        txtMatricula.setForeground(new java.awt.Color(0, 0, 0));
        txtMatricula.setText("Matricula");
        txtMatricula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(234, 234, 234))); // NOI18N

        btnEnviar.setBackground(new java.awt.Color(57, 196, 220));
        btnEnviar.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.setBorder(null);
        btnEnviar.setBorderPainted(false);
        btnEnviar.setFocusPainted(false);
        btnEnviar.setFocusable(false);
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnEnviar1.setBackground(new java.awt.Color(57, 196, 220));
        btnEnviar1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        btnEnviar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar1.setText("Gerar Pessoa");
        btnEnviar1.setBorder(null);
        btnEnviar1.setBorderPainted(false);
        btnEnviar1.setFocusPainted(false);
        btnEnviar1.setFocusable(false);
        btnEnviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEnviar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEnviar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
            
               

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        AlunoDAO dao = new AlunoDAO();
        usuario = new Aluno(txtMatricula.getText(),  txtUserName.getText(), txtFirstName.getText(), txtLastName.getText(), txtEmail.getText(), txtTelefone.getText());
       //Verificar se vai adicionar
        if(verificarExistenciaDeDados() && isOnEdit == false){
                usuario = dao.save(usuario);
                inserirDadosJtable(txtMatricula.getText());
        }else{
            System.out.println("Não pode cadastra com dados faltando");
        }
        
        //Verificar se vai editar
        if(isOnEdit){
            int col = dashboard.getjTable1().getColumn("ID").getModelIndex();
            long id = (Long) dashboard.getjTable1().getValueAt(rowEditar, col);
            
            System.out.println("ID:"+id);
            usuario.setId(id);
            modificarTabela(usuario);
            
            usuario = dao.save(usuario);  
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    public void modificarTabela(Aluno usuario){
         dashboard.getjTable1().setValueAt(usuario.getUserName(), rowEditar, 2);
         dashboard.getjTable1().setValueAt(usuario.getFirstName(), rowEditar, 3);
         dashboard.getjTable1().setValueAt(usuario.getLastName(), rowEditar, 4);
         dashboard.getjTable1().setValueAt(usuario.getEmail(), rowEditar, 5);
         dashboard.getjTable1().setValueAt(usuario.getPhone(), rowEditar, 6);
         dashboard.getjTable1().setValueAt(usuario.getMatricula(), rowEditar, 7);
    }
//    Botão para gerar pessoas aleatórias -> para teste
    private void btnEnviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviar1ActionPerformed
        //Criando uma váriavel a para receber a pessoa gerada aleatóriamente
        Aluno a = Aluno.gerarPessoa();
        txtMatricula.setText(a.getMatricula());
        txtUserName.setText(a.getUserName());
        txtFirstName.setText(a.getFirstName());
        txtLastName.setText(a.getLastName());
        txtEmail.setText(a.getEmail());
        txtTelefone.setText(a.getPhone());
    }//GEN-LAST:event_btnEnviar1ActionPerformed

    public void inserirDadosJtable(String matricula){
        //Criando um Object com os dados do usuário de cadastro
        Object[] usuarios = { "foto" ,usuario.getId(),usuario.getUserName(),  usuario.getFirstName(), usuario.getLastName(),  usuario.getEmail(), usuario.getPhone(), matricula }; 
        // adiciona o array de usuários à JTable
        DefaultTableModel dtmUsuarios = (DefaultTableModel) dashboard.getjTable1().getModel();
        dtmUsuarios.addRow(usuarios);
    }
    //verificar se todos os jlabel estão com dados
    public boolean verificarExistenciaDeDados(){
        return txtEmail.getText() != null && txtFirstName != null && txtLastName != null && txtMatricula != null && txtTelefone != null && txtUserName!= null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnEnviar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
