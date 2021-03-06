/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 *
 * @author clavi
 */
public class VentProceso extends javax.swing.JFrame {

    /**
     * Creates new form VentProceso
     */
    public VentProceso() {
        initComponents();
        setTitle("Añadir Nuevo Proceso");
        setLocationRelativeTo(null);
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
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldNom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTam = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldHilos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSliderRec = new javax.swing.JSlider();
        jCheckBoxHilo = new javax.swing.JCheckBox();
        jButtonTerm = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID: ");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Tamaño(kB): ");

        jLabel4.setText("Hilos: ");

        jLabel5.setText("Recurso: ");

        jSliderRec.setMajorTickSpacing(1);
        jSliderRec.setMaximum(6);
        jSliderRec.setMinimum(1);
        jSliderRec.setPaintLabels(true);
        jSliderRec.setPaintTicks(true);
        jSliderRec.setValue(1);

        jCheckBoxHilo.setText("SIn Recurso");

        jButtonTerm.setText("Aceptar");

        jButtonNuevo.setText("Nuevo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonTerm)
                        .addGap(55, 55, 55)
                        .addComponent(jButtonNuevo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldHilos, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldTam, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBoxHilo)
                                .addComponent(jSliderRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldTam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldHilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSliderRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxHilo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTerm)
                    .addComponent(jButtonNuevo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public JButton getjButtonNuevo() {
        return jButtonNuevo;
    }
    
    public void setjButtonNuevo(JButton jButtonNuevo) {
        this.jButtonNuevo = jButtonNuevo;
    }
    
    public JButton getjButtonTerm() {
        return jButtonTerm;
    }
    
    public void setjButtonTerm(JButton jButtonTerm) {
        this.jButtonTerm = jButtonTerm;
    }
    
    public JCheckBox getjCheckBoxHilo() {
        return jCheckBoxHilo;
    }
    
    public void setjCheckBoxHilo(JCheckBox jCheckBoxHilo) {
        this.jCheckBoxHilo = jCheckBoxHilo;
    }
    
    public JSlider getjSliderRec() {
        return jSliderRec;
    }
    
    public void setjSliderRec(JSlider jSliderRec) {
        this.jSliderRec = jSliderRec;
    }
    
    public JTextField getjTextFieldHilos() {
        return jTextFieldHilos;
    }
    
    public void setjTextFieldHilos(JTextField jTextFieldHilos) {
        this.jTextFieldHilos = jTextFieldHilos;
    }
    
    public JTextField getjTextFieldId() {
        return jTextFieldId;
    }
    
    public void setjTextFieldId(JTextField jTextFieldId) {
        this.jTextFieldId = jTextFieldId;
    }
    
    public JTextField getjTextFieldNom() {
        return jTextFieldNom;
    }
    
    public void setjTextFieldNom(JTextField jTextFieldNom) {
        this.jTextFieldNom = jTextFieldNom;
    }
    
    public JTextField getjTextFieldTam() {
        return jTextFieldTam;
    }
    
    public void setjTextFieldTam(JTextField jTextFieldTam) {
        this.jTextFieldTam = jTextFieldTam;
    }
    
    public void limpiar() {
        jTextFieldId.setText("");
        jTextFieldNom.setText("");
        jTextFieldTam.setText("");
        jTextFieldHilos.setText("");
        jCheckBoxHilo.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonTerm;
    private javax.swing.JCheckBox jCheckBoxHilo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSlider jSliderRec;
    private javax.swing.JTextField jTextFieldHilos;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldTam;
    // End of variables declaration//GEN-END:variables
}
