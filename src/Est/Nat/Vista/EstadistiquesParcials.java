package Est.Nat.Vista;

import Est.Nat.Dades.Club;
import Utilitats.CognomPredictiu;
import Utilitats.NomPredictiu;
import calendari.Calendari;
import javax.swing.JDialog;

/**
 *
 * @author Raul
 */
public class EstadistiquesParcials extends javax.swing.JPanel {
    private Club club;
    
    /**
     * Creates new form EstadistiquesParcials
     */
    public EstadistiquesParcials(Club club) {
        this.club = club;
        initComponents();
        this.setVisible(true);
        initGrafiques();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spaneContenedor = new javax.swing.JSplitPane();
        spaneEsquerra = new javax.swing.JSplitPane();
        tempsParcials = new Grafiques.GraficaLineal();
        acceleracio = new Grafiques.GraficaTempsLineal();
        spaneDreta = new javax.swing.JSplitPane();
        velocitat = new Grafiques.GraficaLineal();
        tarta = new Grafiques.GraficaQuesito();
        toolBar = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        nomPredictiu = new NomPredictiu(club);
        cognomPredictiu = new CognomPredictiu(club,nomPredictiu);
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jLabel2 = new javax.swing.JLabel();
        comboMetres = new javax.swing.JComboBox();
        comboEstil = new javax.swing.JComboBox();
        fieldData = new javax.swing.JTextField();

        spaneContenedor.setDividerLocation(350);
        spaneContenedor.setResizeWeight(0.5);

        spaneEsquerra.setDividerLocation(230);
        spaneEsquerra.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        spaneEsquerra.setResizeWeight(0.5);

        javax.swing.GroupLayout tempsParcialsLayout = new javax.swing.GroupLayout(tempsParcials);
        tempsParcials.setLayout(tempsParcialsLayout);
        tempsParcialsLayout.setHorizontalGroup(
            tempsParcialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );
        tempsParcialsLayout.setVerticalGroup(
            tempsParcialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );

        spaneEsquerra.setTopComponent(tempsParcials);

        javax.swing.GroupLayout acceleracioLayout = new javax.swing.GroupLayout(acceleracio);
        acceleracio.setLayout(acceleracioLayout);
        acceleracioLayout.setHorizontalGroup(
            acceleracioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );
        acceleracioLayout.setVerticalGroup(
            acceleracioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );

        spaneEsquerra.setRightComponent(acceleracio);

        spaneContenedor.setLeftComponent(spaneEsquerra);

        spaneDreta.setDividerLocation(230);
        spaneDreta.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        spaneDreta.setResizeWeight(0.5);

        javax.swing.GroupLayout velocitatLayout = new javax.swing.GroupLayout(velocitat);
        velocitat.setLayout(velocitatLayout);
        velocitatLayout.setHorizontalGroup(
            velocitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );
        velocitatLayout.setVerticalGroup(
            velocitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );

        spaneDreta.setTopComponent(velocitat);

        javax.swing.GroupLayout tartaLayout = new javax.swing.GroupLayout(tarta);
        tarta.setLayout(tartaLayout);
        tartaLayout.setHorizontalGroup(
            tartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );
        tartaLayout.setVerticalGroup(
            tartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );

        spaneDreta.setRightComponent(tarta);

        spaneContenedor.setRightComponent(spaneDreta);

        toolBar.setFloatable(false);
        toolBar.setRollover(true);

        jLabel1.setText("Nadador:");
        toolBar.add(jLabel1);

        nomPredictiu.setMaximumSize(new java.awt.Dimension(100, 20));
        nomPredictiu.setMinimumSize(new java.awt.Dimension(70, 20));
        toolBar.add(nomPredictiu);

        cognomPredictiu.setMaximumSize(new java.awt.Dimension(125, 20));
        toolBar.add(cognomPredictiu);
        toolBar.add(jSeparator1);

        jLabel2.setText("Prueba:");
        toolBar.add(jLabel2);

        comboMetres.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "50", "100", "200", "400", "800", "1500" }));
        comboMetres.setMaximumSize(new java.awt.Dimension(50, 20));
        toolBar.add(comboMetres);

        comboEstil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Espalda", "Braza", "Mariposa", "Libres", "Estilos" }));
        comboEstil.setMaximumSize(new java.awt.Dimension(70, 20));
        toolBar.add(comboEstil);

        fieldData.setText("dd/mm/aaaa");
        fieldData.setMaximumSize(new java.awt.Dimension(90, 20));
        fieldData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldDataFocusGained(evt);
            }
        });
        toolBar.add(fieldData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spaneContenedor)
            .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spaneContenedor))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fieldDataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldDataFocusGained
        this.requestFocus();
        
        calendari.Calendari calendari = new Calendari();
        JDialog dialogCalendari = new JDialog();
        dialogCalendari.setModal(true);
        dialogCalendari.add(calendari);
        dialogCalendari.setSize(300, 200);
        dialogCalendari.setLocationRelativeTo(null);
        
        dialogCalendari.setVisible(true);
        fieldData.setText(calendari.toString());
    }//GEN-LAST:event_fieldDataFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Grafiques.GraficaTempsLineal acceleracio;
    private Utilitats.CognomPredictiu cognomPredictiu;
    private javax.swing.JComboBox comboEstil;
    private javax.swing.JComboBox comboMetres;
    private javax.swing.JTextField fieldData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private Utilitats.NomPredictiu nomPredictiu;
    private javax.swing.JSplitPane spaneContenedor;
    private javax.swing.JSplitPane spaneDreta;
    private javax.swing.JSplitPane spaneEsquerra;
    private Grafiques.GraficaQuesito tarta;
    private Grafiques.GraficaLineal tempsParcials;
    private javax.swing.JToolBar toolBar;
    private Grafiques.GraficaLineal velocitat;
    // End of variables declaration//GEN-END:variables

    private void initGrafiques() {
        initGraficaTempsParcial();
    }

    private void initGraficaTempsParcial() {
        
    }
}
