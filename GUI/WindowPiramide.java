package GUI;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;


public class WindowPiramide {
    WindowPiramide() {
        JFrame frame = new JFrame("Piramide");
        JPanel panelBase = new JPanel();
        JPanel panelAltura = new JPanel();
        JPanel panelTitulo = new JPanel();
        JPanel panelApotema = new JPanel();
        JPanel panelBotones = new JPanel();
        JLabel labelBase = new JLabel("Radio");
        JLabel labelBaseCms = new JLabel("cms");
        JLabel labelAlturaCms = new JLabel("cms");
        JLabel labelAltura = new JLabel("Altura");
        JLabel labelApotemaCms = new JLabel("cms");
        JLabel labelApotema = new JLabel("Apotema");
        JLabel title = new JLabel("Datos de la piramide: ", JLabel.CENTER);
        JTextField fieldBase = new JTextField(10);
        JTextField fieldAltura = new JTextField(10);
        JTextField fieldApotema = new JTextField(10);
        JButton calcularButton = new JButton("Calcular");
        EmptyBorder mainPanelBorder = new EmptyBorder(10, 10, 10, 10);
        EmptyBorder tituloPanelBorder = new EmptyBorder(0, 0, 10, 0);
        EmptyBorder alturaPanelBorder = new EmptyBorder(5, 0, 0, 0);
        EmptyBorder apotemaPanelBorder = new EmptyBorder(5, 0, 10, 0);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
        ((JPanel) frame.getContentPane()).setBorder(mainPanelBorder);
        panelTitulo.setLayout(new BoxLayout(panelTitulo, BoxLayout.X_AXIS));
        panelTitulo.setBorder(tituloPanelBorder);
        panelTitulo.add(title);
        panelBase.setLayout(new BoxLayout(panelBase, BoxLayout.X_AXIS));
        panelBase.add(labelBase);
        panelBase.add(Box.createRigidArea(new Dimension(10, 0)));
        panelBase.add(fieldBase);
        panelBase.add(Box.createRigidArea(new Dimension(10, 0)));
        panelBase.add(labelBaseCms);
        panelAltura.setLayout(new BoxLayout(panelAltura, BoxLayout.X_AXIS));
        panelAltura.setBorder(alturaPanelBorder);
        panelAltura.add(labelAltura);
        panelAltura.add(Box.createRigidArea(new Dimension(10, 0)));
        panelAltura.add(fieldAltura);
        panelAltura.add(Box.createRigidArea(new Dimension(10, 0)));
        panelAltura.add(labelAlturaCms);
        panelApotema.setLayout(new BoxLayout(panelApotema, BoxLayout.X_AXIS));
        panelApotema.setBorder(apotemaPanelBorder);
        panelApotema.add(labelApotema);
        panelApotema.add(Box.createRigidArea(new Dimension(10, 0)));
        panelApotema.add(fieldApotema);
        panelApotema.add(Box.createRigidArea(new Dimension(10, 0)));
        panelApotema.add(labelApotemaCms);
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.X_AXIS));
        panelBotones.add(calcularButton);
        frame.add(panelTitulo);
        frame.add(panelBase);
        frame.add(panelAltura);
        frame.add(panelApotema);
        frame.add(panelBotones);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
    
    public static void main(String args[]) {
        WindowPiramide window = new WindowPiramide();
    }
}