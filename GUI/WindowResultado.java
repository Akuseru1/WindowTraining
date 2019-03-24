package GUI;
import javax.swing.*;
import java.awt.*;
import Figuras.Figura;

public class WindowResultado {
    WindowResultado (double superficie, double volumen) {
        JFrame frame = new JFrame("Resultado");
        JTabbedPane panelTabs = new JTabbedPane();
        JPanel panelArea = new JPanel();
        JPanel panelVolumen = new JPanel();
        JLabel resultadoSuperficie = new JLabel(String.format("%10.3f", superficie) + " cms^2", JLabel.CENTER);
        JLabel resultadoVolumen = new JLabel(String.format("%10.3f", volumen) + " cms^3", JLabel.CENTER);
        panelArea.add(resultadoSuperficie);
        panelVolumen.add(resultadoVolumen);
        panelTabs.addTab("Superficie", null, panelArea, "Click para ver la Superficie");
        panelTabs.addTab("Volumen", null, panelVolumen, "Click para ver el volumen");
        frame.getContentPane().add(panelTabs, BorderLayout.CENTER);
        frame.pack();
        frame.setSize(250, 200);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
