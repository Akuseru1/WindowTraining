package GUI;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import Figuras.Cilindro;
import java.io.*;
import java.nio.file.Paths;
import java.nio.file.Path;

public class WindowCilindro {
    private JTextField fieldRadio;
    private JTextField fieldAltura;
    private String pathDirectory;

    WindowCilindro(String pathDirectory) {
        this.pathDirectory = pathDirectory;
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
        calcularButton.addActionListener(new OyenteCalcCilindro());
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

    class OyenteCalcCilindro implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            WindowResultado resultado;
            Cilindro cilindro;
            boolean error = false;
            double radio = 0;
            double altura = 0;

            try {
                radio  = Double.parseDouble(fieldRadio.getText());
                altura  = Double.parseDouble(fieldAltura.getText());
            } catch (Exception e){ 
                error = true;
            } finally {

                if(error) {
                    JOptionPane.showMessageDialog(null,"Campo vacio o error en formato de numero",
                        "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    cilindro = new Cilindro(radio,altura);
                    resultado = new WindowResultado(cilindro.getSuperficie(),cilindro.getVolumen());
                    Path filePath = Paths.get(pathDirectory,"figuras.txt");
                    FileWriter escribir;
                    try {
                        escribir = new FileWriter(filePath.toString());
                        escribir.write(cilindro.toString());
                        escribir.close();
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null,"Imposible abrir el archivo",
                        "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

        }

    }
}