package GUI;
import java.awt.GridLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.event.*;

public class Menu  {
    public Menu() {
        JFrame frame = new JFrame("Menu");
        JPanel contenidoPanel = (JPanel) frame.getContentPane();
        JPanel panel = new JPanel();
        JPanel rowPanel = new JPanel();
        JLabel title = new JLabel("Elija una figura: ", JLabel.CENTER);

        EmptyBorder border1 = new EmptyBorder(10, 10, 10, 10);
        String[] imagesPath = {
                "../img/cilinder.png",
                "../img/esfera.png",
                "../img/piramide.png"
            };
        JButton[] buttons = new JButton[3];

        rowPanel.setLayout(new GridLayout(2, 1));
        panel.setLayout(new GridLayout(1, 3));
        contenidoPanel.setBorder(border1);
        contenidoPanel.setLayout(new GridLayout(3, 1));
        rowPanel.add(title);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            try {
                buttons[i].setIcon(new ImageIcon(getClass().getResource(imagesPath[i])));
                buttons[i].setPreferredSize(new Dimension(32, 32));
            } catch (Exception ex) {
                System.out.println(ex);
            }
            panel.add(buttons[i]);
        }
        buttons[0].addActionListener(new OyenteCilindro());
        buttons[1].addActionListener(new OyenteEsfera());
        buttons[2].addActionListener(new OyentePiramide());

        contenidoPanel.add(rowPanel);
        contenidoPanel.add(panel);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(300,500);
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    Menu gui = new Menu();
                }
            });
    }

    class OyenteCilindro implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            boolean error = false;
            WindowCilindro panel = new WindowCilindro();

            double radio = Double.parseDouble(panel.fieldRadio.getText());
            double altura = Double.parseDouble(panel.fieldAltura.getText());
            // int año = 0;
            try {
                //año = Integer.parseInt(panel.campoAño.getText());
            }
            catch (Exception e) {
                error = true;   
            }
            finally {
                // error = error || (nombre.length() == 0) || (apellidos.length() == 0);
                if(error)
                    JOptionPane.showMessageDialog(null,"Campo vacio o error en formato de numero",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            char turno;
            //  if(panel.mañana.isSelected())
            //turno = 'M';
            //else
            //turno = 'T';
            if(!error) {
                /* Alumno alumno = new Alumno(nombre,apellidos,año,turno);
                aplicacion.añadir(alumno); */
            }

            else {
                JOptionPane.showMessageDialog(null,"Operacion no realizada",
                    "Aviso",JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    class OyenteEsfera implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            boolean error = false;
            WindowEsfera panel = new WindowEsfera();
            double radio = Double.parseDouble(panel.fieldRadio.getText());

            // int año = 0;
            try {
                //año = Integer.parseInt(panel.campoAño.getText());
            }
            catch (Exception e) {
                error = true;   
            }
            finally {
                // error = error || (nombre.length() == 0) || (apellidos.length() == 0);
                if(error)
                    JOptionPane.showMessageDialog(null,"Campo vacio o error en formato de numero",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            char turno;
            //if(panel.mañana.isSelected())
            //turno = 'M';
            //else
            //turno = 'T';
            if(!error) {
                /* Alumno alumno = new Alumno(nombre,apellidos,año,turno);
                aplicacion.añadir(alumno); */
            }

            else {
                JOptionPane.showMessageDialog(null,"Operacion no realizada",
                    "Aviso",JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    class OyentePiramide implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            boolean error = false;
            WindowPiramide panel = new WindowPiramide();

            // String nombre = panel.campoNombre.getText();
            // String apellidos = panel.campoApellidos.getText();
            // int año = 0;
            try {
                //año = Integer.parseInt(panel.campoAño.getText());
            }
            catch (Exception e) {
                error = true;   
            }
            finally {
                // error = error || (nombre.length() == 0) || (apellidos.length() == 0);
                if(error)
                    JOptionPane.showMessageDialog(null,"Campo vacio o error en formato de numero",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            char turno;
            //   if(panel.mañana.isSelected())
            //turno = 'M';
            //else
            //turno = 'T';
            if(!error) {
                /* Alumno alumno = new Alumno(nombre,apellidos,año,turno);
                aplicacion.añadir(alumno); */
            }

            else {
                JOptionPane.showMessageDialog(null,"Operacion no realizada",
                    "Aviso",JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}