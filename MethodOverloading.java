package finalKargo;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author ecbak
 */
public class MethodOverloading {

   int fiyat(int x)
    {
        x=x*x;
        Component frame = null;
        
        JOptionPane.showMessageDialog(frame, "Fiyat :" + x);
        return x;
    }
    double fiyat(double x)  
    {
        x=x*x;
        Component frame = null;
        JOptionPane.showMessageDialog(frame, "FiyatD :" + x);
        
        return x;
    }
}
