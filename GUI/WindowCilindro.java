package GUI;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;


public class WindowCilindro {
    JTextField fieldRadio;
    JTextField fieldAltura;
    WindowCilindro() {
        JFrame frame = new JFrame("Cilindro");
        JPanel panelRadio = new JPanel();
        JPanel panelAltura = new JPanel();
        JPanel panelTitulo = new JPanel();
        JPanel panelBotones = new JPanel();
        JLabel labelRadio = new JLabel("Radio");
        JLabel labelRadioCms = new JLabel("cms");
        JLabel labelAlturaCms = new JLabel("cms");
        JLabel labelAltura = new JLabel("Altura");
        JLabel title = new JLabel("Datos del cilindro: ", JLabel.CENTER);
        fieldRadio = new JTextField(10);
        fieldAltura = new JTextField(10);
        JButton calcularButton = new JButton("Calcular");
        EmptyBorder mainPanelBorder = new EmptyBorder(10, 10, 10, 10);
        EmptyBorder tituloPanelBorder = new EmptyBorder(0, 0, 10, 0);
        EmptyBorder alturaPanelBorder = new EmptyBorder(5, 0, 10, 0);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
        ((JPanel) frame.getContentPane()).setBorder(mainPanelBorder);
        panelTitulo.setLayout(new BoxLayout(panelTitulo, BoxLayout.X_AXIS));
        panelTitulo.setBorder(tituloPanelBorder);
        panelTitulo.add(title);
        panelRadio.setLayout(new BoxLayout(panelRadio, BoxLayout.X_AXIS));
        panelRadio.add(labelRadio);
        panelRadio.add(Box.createRigidArea(new Dimension(10, 0)));
        panelRadio.add(fieldRadio);
        panelRadio.add(Box.createRigidArea(new Dimension(10, 0)));
        panelRadio.add(labelRadioCms);
        panelAltura.setLayout(new BoxLayout(panelAltura, BoxLayout.X_AXIS));
        panelAltura.setBorder(alturaPanelBorder);
        panelAltura.add(labelAltura);
        panelAltura.add(Box.createRigidArea(new Dimension(10, 0)));
        panelAltura.add(fieldAltura);
        panelAltura.add(Box.createRigidArea(new Dimension(10, 0)));
        panelAltura.add(labelAlturaCms);
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.X_AXIS));
        panelBotones.add(calcularButton);
        frame.add(panelTitulo);
        frame.add(panelRadio);
        frame.add(panelAltura);
        frame.add(panelBotones);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
    
    public static void main(String args[]) {
        WindowCilindro window = new WindowCilindro();
    }
}