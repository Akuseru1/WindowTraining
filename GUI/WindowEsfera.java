package GUI;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import Figuras.Esfera;
import java.io.*;
import java.nio.file.Paths;
import java.nio.file.Path;

public class WindowEsfera {
    private JTextField fieldRadio;
    private String pathDirectory;
    
    WindowEsfera(String pathDirectory) {
        this.pathDirectory = pathDirectory;
        JFrame frame = new JFrame("Esfera");
        JPanel panelRadio = new JPanel();
        JPanel panelTitulo = new JPanel();
        JPanel panelBotones = new JPanel();
        JLabel labelRadio = new JLabel("Radio");
        JLabel labelRadioCms = new JLabel("cms");
        JLabel title = new JLabel("Datos esfera: ", JLabel.CENTER);
        fieldRadio = new JTextField(10);
        JButton calcularButton = new JButton("Calcular");
        EmptyBorder mainPanelBorder = new EmptyBorder(10, 10, 10, 10);
        EmptyBorder tituloPanelBorder = new EmptyBorder(0, 0, 10, 0);
        EmptyBorder radioPanelBorder = new EmptyBorder(0, 0, 10, 0);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
        ((JPanel) frame.getContentPane()).setBorder(mainPanelBorder);
        panelTitulo.setLayout(new BoxLayout(panelTitulo, BoxLayout.X_AXIS));
        panelTitulo.setBorder(tituloPanelBorder);
        panelTitulo.add(title);
        panelRadio.setLayout(new BoxLayout(panelRadio, BoxLayout.X_AXIS));
        panelRadio.setBorder(radioPanelBorder);
        panelRadio.add(labelRadio);
        panelRadio.add(Box.createRigidArea(new Dimension(10, 0)));
        panelRadio.add(fieldRadio);
        panelRadio.add(Box.createRigidArea(new Dimension(10, 0)));
        panelRadio.add(labelRadioCms);
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.X_AXIS));
        calcularButton.addActionListener(new OyenteCalcEsfera());
        panelBotones.add(calcularButton);
        frame.add(panelTitulo);
        frame.add(panelRadio);
        frame.add(panelBotones);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }

    class OyenteCalcEsfera implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            WindowResultado resultado;
            Esfera esfera;
            boolean error = false;
            double radio = 0;

            try {
                radio  = Double.parseDouble(fieldRadio.getText());
            } catch (Exception e){ 
                error = true;
            } finally {
                if(error) {
                    JOptionPane.showMessageDialog(null,"Campo vacio o error en formato de numero",
                        "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    esfera = new Esfera(radio);
                    resultado = new WindowResultado(esfera.getSuperficie(), esfera.getVolumen());
                    Path filePath = Paths.get(pathDirectory,"figuras.txt");
                    FileWriter escribir;
                    try {
                        escribir = new FileWriter(filePath.toString());
                        escribir.write(esfera.toString());
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