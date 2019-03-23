package GUI;
import javax.swing.*;
import java.awt.*;

public class WindowResultado {
    WindowResultado () {
        JFrame frame = new JFrame("Resultado");
        JTabbedPane panelTabs = new JTabbedPane();
        JPanel panelArea = new JPanel();
        JPanel panelVolumen = new JPanel();
        panelTabs.addTab("Area", null, panelArea, "Click para ver el area");
        panelTabs.addTab("Volumen", null, panelVolumen, "Click para ver el volumen");
        frame.getContentPane().add(panelTabs, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String args[]) {
        WindowResultado window = new WindowResultado();
    }
}
