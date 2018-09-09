/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacionimpresion;

import javax.swing.JDialog;

/**
 *
 * @author PC
 */
public class Imprimir extends javax.swing.JDialog {
    
    protected String cadena = "";
    /**
     * Creates new form Imprimir
     */
    public Imprimir(java.awt.Frame parent, boolean modal, String dato) {
        super(parent, modal);
        initComponents();
        this.pack();
        this.setResizable(false);
//        this.setTitle("Imprimiendo");
        this.setSize(200,130);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        jlblCadena.setText(dato);
    }
    
    // Resive la cadena del nodo que se esta eliminando
    public void setCadena(String cadena){
        if(cadena==null){
            this.dispose();
        }else{
            jlblCadena.setText(cadena);
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

        jlblimprimiendo = new javax.swing.JLabel();
        jlblCadena = new javax.swing.JLabel();
        jlbEspere = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jlblimprimiendo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlblimprimiendo.setText("Imprimiendo");

        jlbEspere.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbEspere.setText("Espere...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jlblimprimiendo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlbEspere)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlblCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblimprimiendo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jlbEspere)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlbEspere;
    private javax.swing.JLabel jlblCadena;
    private javax.swing.JLabel jlblimprimiendo;
    // End of variables declaration//GEN-END:variables
}