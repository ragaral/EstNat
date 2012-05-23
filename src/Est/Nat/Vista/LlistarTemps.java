/*
 * LlistarTemps.java
 *
 * Created on 07-dic-2011, 11:14:40
 */
package Est.Nat.Vista;

import Est.Nat.Dades.Nadador;
import Est.Nat.Dades.Prova;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raul
 */
public class LlistarTemps extends javax.swing.JPanel {
    private Nadador nadador;

    /** Creates new form MostrarTemps */
    public LlistarTemps() {
        initComponents();
        this.setVisible(true);
    }

    public LlistarTemps(Nadador n){
        this();
        nadador=n;
        nadador.initProves();
        buscaProbes();
    }
    
    private void buscaProbes(){
        titol.setText(titol.getText()+nadador.getNom());
        Prova prova;

        //String[][] dades = new String[nadador.getNumProbes()][4];
        Object[][] dades = new Object[nadador.getNumProbes()][7];
        String[] capsalera={"Metros","Estilo","Tiempo","Fecha","Lugar","Piscina","Parciales"};

        for(int i=0; i<nadador.getNumProbes(); i++){
            prova = nadador.getProba(i);
            dades[i][0] = prova.getMetres();
            dades[i][1] = prova.getEstil();
            dades[i][2] = prova.getTemps();
            dades[i][3] = prova.getData();
            dades[i][4] = prova.getLloc();
            dades[i][5] = prova.getMetresPicina();
            dades[i][6] = "no";
            if(prova.conteParcials())
                dades[i][6] = "SI";
        }

        tabla.setModel(new DefaultTableModel(dades,capsalera){
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titol = new javax.swing.JLabel();
        scrollPanel = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        titol.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        titol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titol.setText("Tiempos de ");

        scrollPanel.setAutoscrolls(true);

        tabla.setAutoCreateRowSorter(true);
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Metros", "Estilo", "Tiempo", "Fecha", "Lugar", "Piscina", "Parciales"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        scrollPanel.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                    .addComponent(scrollPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titol, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel titol;
    // End of variables declaration//GEN-END:variables
}
