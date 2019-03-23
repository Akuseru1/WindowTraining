package GUI;
import javax.swing.*;
import java.awt.*;

class PanelDatosAlumno extends JPanel {
 JTextField campoNombre;
 JTextField campoApellidos;
 JTextField campoAño;
 JRadioButton mañana;
 JRadioButton tarde;
 
 PanelDatosAlumno() {
     setLayout(new GridLayout(4,2));
     JLabel etiquetaNombre = new JLabel("Nombre", JLabel.RIGHT);
     campoNombre = new JTextField();
     add(etiquetaNombre);
     add(campoNombre);
     JLabel etiquetaApellidos = new JLabel("Apellidos", JLabel.RIGHT);
     campoApellidos = new JTextField();
     add(etiquetaApellidos);
     add(campoApellidos);
     JLabel etiquetaAño = new JLabel("Año nacimiento", JLabel.RIGHT);
     campoAño = new JTextField();
     add(etiquetaAño);
     add(campoAño);
     ButtonGroup grupoBotones = new ButtonGroup();
     mañana = new JRadioButton("Grupo Mañana", true);
     mañana.setMnemonic('M');
     tarde = new JRadioButton("Grupo tarde");
     mañana.setMnemonic('T');
     grupoBotones.add(mañana);
     grupoBotones.add(tarde);
     add(mañana);
     add(tarde);
    }
}