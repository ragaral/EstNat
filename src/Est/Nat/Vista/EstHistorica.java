package Est.Nat.Vista;

import Est.Nat.Dades.Temps;
import Est.Nat.Dades.Club;
import Est.Nat.Dades.Nadador;
import Est.Nat.Dades.Data;
import Est.Nat.Dades.Prova;
import Grafiques.GraficaTempsLineal;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author Raul
 */
public class EstHistorica extends javax.swing.JPanel {
    private Club club;
    private Nadador nadador;
    
    /** Constructor */
    public EstHistorica(){
        initComponents();
    }
    /** Constructor */
    public EstHistorica(Club club) {
        this();
        this.club=club;
    }
    /** Constructor */
    public EstHistorica(Nadador nadador) {
        this();
        this.club = null;
        this.nadador = nadador;
        numFitxFed.setText(nadador.getNumFitxFed());
        nom.setText(nadador.getNom());
        nom.setEditable(false);
        cognom.setText(nadador.getCognom());
        cognom.setEditable(false);
        metres.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titol = new javax.swing.JLabel();
        numFitxFed = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        cognom = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        metres = new javax.swing.JTextField();
        estil = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        llistaAnys = new javax.swing.JComboBox();
        botoCrear = new javax.swing.JButton();

        titol.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
        titol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titol.setText("Estadistica Historica");

        numFitxFed.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        nom.setText("Nombre");
        nom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                borranom(evt);
            }
        });

        cognom.setText("Apellidos");
        cognom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cognombuscaFitxa(evt);
            }
        });

        jLabel4.setText("Prueba:");

        estil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Espalda", "Braza", "Mariposa", "Libres", "Estilos" }));
        estil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                estilbuscaAnys(evt);
            }
        });

        jLabel3.setText("Temporada:");

        botoCrear.setText("Crear");
        botoCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoCrearcreaGarfic(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(metres, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(estil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(botoCrear)
                                    .addComponent(llistaAnys, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(numFitxFed, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(cognom, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titol)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cognom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(numFitxFed, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(metres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(llistaAnys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botoCrear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void borranom(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_borranom
        nom.setText("");
        cognom.setText("");
    }//GEN-LAST:event_borranom

    private void cognombuscaFitxa(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cognombuscaFitxa
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

//        eixidaErr.setText("");

        nadador = club.buscaNadador(nom.getText(), cognom.getText());

        if (nadador != null) {
            numFitxFed.setText(nadador.getNumFitxFed());
            //buscaFetxes();
        } else {
            numFitxFed.setText("");
//            eixidaErr.setText("Nadador no encontrado!");
            nom.requestFocus();
        }

        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_cognombuscaFitxa

    private void estilbuscaAnys(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_estilbuscaAnys
        buscaFetxes();
    }//GEN-LAST:event_estilbuscaAnys

    private void buscaFetxes(){
        llistaAnys.removeAllItems();
        Runnable miRunnable = new Runnable()
        {
            @Override
            public void run()
            {
                Prova prova;
                int numProbes = nadador.getNumProbes();
                ArrayList dates = new ArrayList();
                String m = metres.getText(), e = String.valueOf(estil.getSelectedItem());
                int cont = 0;
                for(int i = 0; i < numProbes; i++){
                    prova = nadador.getProba(i);
                    if(prova.getEstil().equals(e) && 
                       prova.getMetres() == Integer.valueOf(m) &&
                       !dates.contains(String.valueOf( prova.getData().getAny())+"/"+String.valueOf(prova.getData().getAny()+1) )){
                            dates.add(String.valueOf(prova.getData().getAny())+"/"+String.valueOf(prova.getData().getAny()+1));
                            llistaAnys.insertItemAt(dates.get(cont), cont);
                            cont++;
                    }
                }
            }
        };

        Thread hilo = new Thread (miRunnable);
        if(!hilo.isAlive()){
            hilo.start();
        }
    }
    
    private void botoCrearcreaGarfic(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoCrearcreaGarfic
//        progressBar.setValue(0);
        Runnable miRunnable = new Runnable() {

            @Override
            public void run() {
                Prova prova;
                int met = Integer.valueOf(metres.getText());
                String est = String.valueOf(estil.getSelectedItem());
                int anyIni = Integer.valueOf(String.valueOf(llistaAnys.getSelectedItem()).substring(0, 4));
                int anyFi = Integer.valueOf(String.valueOf(llistaAnys.getSelectedItem()).substring(5));

                ArrayList<Temps> temps = new ArrayList<>();
                ArrayList<Data> data = new ArrayList<>();
                String metresEstil = met + " " + est;
                Data auxD;
                Temps auxT;

                for (int i = 0; i < nadador.getNumProbes(); i++) {
                    prova = nadador.getProba(i);
                    if (prova.getData().compareTo(new Data(1, 9, anyIni)) > 0
                            && prova.getData().compareTo(new Data(30, 8, anyFi)) < 0
                            && prova.getEstil().equals(est)
                            && prova.getMetres() == met) {
                        temps.add(prova.getTemps());
                        data.add(prova.getData());
                    }
                }

                for (int i = 0; i < data.size(); i++) {
                    auxD = data.get(i);
                    //System.out.println(i+" "+auxD);//***********************
                    for (int j = i + 1; j < temps.size(); j++) {
                        if (auxD.equals(data.get(j))) {
                            //System.out.print("  "+auxD+" ");//*************************
                            auxT = temps.get(i);
                            if (auxT.compareTo(temps.get(j)) > 0) {
                                //System.out.println("borre a "+temps.get(i));//*************************
                                temps.remove(i);
                                data.remove(i);
                                j--;
                            } else {
                                //System.out.println("borre a "+temps.get(j));//*************************
                                temps.remove(j);
                                data.remove(j);
                                j--;
                            }
                        }
                    }
                }
                /*
                 * System.out.println(); for(int i = 0; i < fetxa.size(); i++){
                 * System.out.println(i+"- "+fetxa.get(i)+" - "+temps.get(i));
                }
                 */

                GraficaTempsLineal g = new GraficaTempsLineal();
                g.setData(temps, data, metresEstil);
                g.createChart(met + " " + est + " (" + anyIni + "/" + anyFi + ")", nadador.getNom() + " " + nadador.getCognom(), "Fecha", "Tiempo(seg)");

                JFrame frame = new JFrame();
                frame.setContentPane(g);
                frame.setVisible(true);
                frame.setSize(500, 400);
                RefineryUtilities.centerFrameOnScreen(frame);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        };

        Thread hilo = new Thread(miRunnable);
        if (!hilo.isAlive()) {
            hilo.start();
        }
    }//GEN-LAST:event_botoCrearcreaGarfic

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoCrear;
    private javax.swing.JTextField cognom;
    private javax.swing.JComboBox estil;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox llistaAnys;
    private javax.swing.JTextField metres;
    private javax.swing.JTextField nom;
    private javax.swing.JLabel numFitxFed;
    private javax.swing.JLabel titol;
    // End of variables declaration//GEN-END:variables
}
