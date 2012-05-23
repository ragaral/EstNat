package Proves;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Raul
 */
public class SistemaMides extends javax.swing.JPanel {

    /**
     * Creates new form SistemaMides
     */
    public SistemaMides() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        salida = new javax.swing.JTextField();
        sliderSalida = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        virajes = new javax.swing.JTextField();
        sliderVirejes = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        taulaPiscinaMetres = new javax.swing.JTable();

        jLabel1.setText("Salida: ");

        salida.setText("12");

        sliderSalida.setMaximum(15);
        sliderSalida.setMinimum(1);
        sliderSalida.setValue(12);
        sliderSalida.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderSalidaStateChanged(evt);
            }
        });

        jLabel2.setText("Virajes: ");

        virajes.setText("7");

        sliderVirejes.setMaximum(15);
        sliderVirejes.setMinimum(1);
        sliderVirejes.setValue(7);
        sliderVirejes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderVirejesStateChanged(evt);
            }
        });

        taulaPiscinaMetres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Gandia",  new Integer(25)}
            },
            new String [] {
                "Piscina", "Metros"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        taulaPiscinaMetres.setName("");
        jScrollPane1.setViewportView(taulaPiscinaMetres);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(salida, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(virajes))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sliderSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sliderVirejes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sliderSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(virajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sliderVirejes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sliderSalidaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderSalidaStateChanged
        salida.setText(String.valueOf(sliderSalida.getValue())+"m");
    }//GEN-LAST:event_sliderSalidaStateChanged

    private void sliderVirejesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderVirejesStateChanged
        virajes.setText(String.valueOf(sliderVirejes.getValue())+"m");
    }//GEN-LAST:event_sliderVirejesStateChanged

    public static void main(String args[]){
        SistemaMides sm = new SistemaMides();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(350, 300);
        frame.add(sm, BorderLayout.CENTER);
        frame.setVisible(true);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField salida;
    private javax.swing.JSlider sliderSalida;
    private javax.swing.JSlider sliderVirejes;
    private javax.swing.JTable taulaPiscinaMetres;
    private javax.swing.JTextField virajes;
    // End of variables declaration//GEN-END:variables
}
