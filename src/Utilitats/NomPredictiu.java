package Utilitats;

import Est.Nat.Dades.Club;
import javax.swing.JFrame;

/**
 *
 * @author Raul
 */
public class NomPredictiu extends javax.swing.JComboBox {
    private Club club;
    
    /**
     * Creates new form NomPredictiu
     */
    public NomPredictiu() {
        super();
        initComponents();
    }
    public NomPredictiu(Club club) {
        this();
        this.club = club;
        initElements();
    }
    
    public void addClub(Club club){
        this.club = club;
        initElements();
    }
    
    private void initElements(){
        addItem("");
        for(int i = 0; i < club.getNumNadadors(); i++)
            addItem(club.getNadador(i).getNom());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setEditable(true);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        System.out.println("Focus gained! show popup");
        setPopupVisible(true);
        showPopup();
    }//GEN-LAST:event_formFocusGained

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        System.out.println("key presed");
        String txt = this.getSelectedItem().toString();
        this.selectWithKeyChar(txt.charAt(txt.length()-1));
    }//GEN-LAST:event_formKeyPressed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        System.out.println("key typed");
        String txt = this.getSelectedItem().toString();
        this.selectWithKeyChar(txt.charAt(txt.length()-1));
    }//GEN-LAST:event_formKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    
    public static void main(String args[]){
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 100);
        f.setLocationRelativeTo(null);
        
        NomPredictiu np = new NomPredictiu(new Club("Natacio i Esports Gandia"));
        np.setSize(70, 20);
        f.add(np);
        
        f.setVisible(true);
    }
    
}