
import Est.Nat.Vista.Login;

/**
 *
 * @author Raul
 */
public class Main {
    
    public static void main(String args[]){
        /* Set look and feel */
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        Login login = new Login();
        login.setVisible(true);
    }
}
