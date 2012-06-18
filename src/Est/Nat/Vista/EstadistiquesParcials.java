package Est.Nat.Vista;

import Est.Nat.Dades.Club;
import Utilitats.CognomPredictiu;
import Utilitats.NomPredictiu;

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
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();

        spaneContenedor.setDividerLocation(340);
        spaneContenedor.setResizeWeight(0.5);

        spaneEsquerra.setDividerLocation(220);
        spaneEsquerra.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        spaneEsquerra.setResizeWeight(0.5);

        javax.swing.GroupLayout tempsParcialsLayout = new javax.swing.GroupLayout(tempsParcials);
        tempsParcials.setLayout(tempsParcialsLayout);
        tempsParcialsLayout.setHorizontalGroup(
            tempsParcialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );
        tempsParcialsLayout.setVerticalGroup(
            tempsParcialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );

        spaneEsquerra.setTopComponent(tempsParcials);

        javax.swing.GroupLayout acceleracioLayout = new javax.swing.GroupLayout(acceleracio);
        acceleracio.setLayout(acceleracioLayout);
        acceleracioLayout.setHorizontalGroup(
            acceleracioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );
        acceleracioLayout.setVerticalGroup(
            acceleracioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );

        spaneEsquerra.setRightComponent(acceleracio);

        spaneContenedor.setLeftComponent(spaneEsquerra);

        spaneDreta.setDividerLocation(220);
        spaneDreta.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        spaneDreta.setResizeWeight(0.5);

        javax.swing.GroupLayout velocitatLayout = new javax.swing.GroupLayout(velocitat);
        velocitat.setLayout(velocitatLayout);
        velocitatLayout.setHorizontalGroup(
            velocitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );
        velocitatLayout.setVerticalGroup(
            velocitatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );

        spaneDreta.setTopComponent(velocitat);

        javax.swing.GroupLayout tartaLayout = new javax.swing.GroupLayout(tarta);
        tarta.setLayout(tartaLayout);
        tartaLayout.setHorizontalGroup(
            tartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );
        tartaLayout.setVerticalGroup(
            tartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "50" }));
        jComboBox1.setMaximumSize(new java.awt.Dimension(50, 20));
        toolBar.add(jComboBox1);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Espalda" }));
        jComboBox2.setMaximumSize(new java.awt.Dimension(70, 20));
        toolBar.add(jComboBox2);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "fecha" }));
        jComboBox3.setMaximumSize(new java.awt.Dimension(70, 20));
        toolBar.add(jComboBox3);

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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Grafiques.GraficaTempsLineal acceleracio;
    private Utilitats.CognomPredictiu cognomPredictiu;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
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
