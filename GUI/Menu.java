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
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.Box;
import java.io.File;
import java.awt.event.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Menu {
    private JTextField folderPathField;
    private JButton[] buttons;

    public Menu() {
        JFrame frame = new JFrame("Menu");
        JPanel contenidoPanel = (JPanel) frame.getContentPane();
        JPanel panel = new JPanel();
        JPanel rowPanel = new JPanel();
        JPanel folderPanel = new JPanel();
        JPanel titleFolderPanel = new JPanel();
        JLabel title = new JLabel("Elija una figura: ", JLabel.CENTER);
        EmptyBorder border1 = new EmptyBorder(10, 10, 10, 10);
        String[] imagesPath = {
            "../img/cilinder.png",
            "../img/esfera.png",
            "../img/piramide.png"
        };
        buttons = new JButton[3];
        JButton folderChooseButton = new JButton("Examinar");
        folderPathField = new JTextField(10);
        EmptyBorder titleFolderPanelBorder = new EmptyBorder(0, 0, 10, 0);
        folderPathField.setEditable(false);
        rowPanel.setLayout(new GridLayout(2, 1));
        panel.setLayout(new GridLayout(1, 3));
        titleFolderPanel.setLayout(new BoxLayout(titleFolderPanel, BoxLayout.PAGE_AXIS));
        titleFolderPanel.add(new JLabel("Elija el directorio: "));
        titleFolderPanel.add(folderPathField);
        titleFolderPanel.setBorder(titleFolderPanelBorder);
        folderPanel.setLayout(new BoxLayout(folderPanel, BoxLayout.PAGE_AXIS));
        folderPanel.add(titleFolderPanel);
        folderPanel.add(Box.createRigidArea(new Dimension(105, 0)));
        folderPanel.add(folderChooseButton);
        contenidoPanel.setBorder(border1);
        contenidoPanel.setLayout(new GridLayout(0, 1));
        rowPanel.add(title);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            try {
                buttons[i].setIcon(new ImageIcon(getClass().getResource(imagesPath[i])));
                buttons[i].setPreferredSize(new Dimension(32, 32));
                buttons[i].setEnabled(false);
            } catch (Exception ex) {
                System.out.println(ex);
            }
            panel.add(buttons[i]);
        }

        buttons[0].addActionListener(new OyenteCilindro());
        buttons[1].addActionListener(new OyenteEsfera());
        buttons[2].addActionListener(new OyentePiramide());
        folderChooseButton.addActionListener(new OyenteSelectFolder());
        contenidoPanel.add(folderPanel);
        contenidoPanel.add(rowPanel);
        contenidoPanel.add(panel);

        frame.pack();
        frame.setResizable(false);
        frame.setSize(300, 260);
        frame.setVisible(true);
    }

    class OyenteCilindro implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            WindowCilindro panel = new WindowCilindro(folderPathField.getText());
        }
    }

    class OyenteEsfera implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            WindowEsfera panel = new WindowEsfera(folderPathField.getText());
        }
    }

    class OyentePiramide implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            WindowPiramide panel = new WindowPiramide(folderPathField.getText());
        }
    }

    class OyenteSelectFolder implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JFileChooser selDirectory;
            String pathDirectory;
            selDirectory = new JFileChooser();
            selDirectory.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            selDirectory.showOpenDialog(null);
            pathDirectory = selDirectory.getSelectedFile().toString();
            folderPathField.setText(pathDirectory);
            
            if (Files.isDirectory(Paths.get(pathDirectory))) {
                for (int i = 0; i < buttons.length; i++) {
                    buttons[i].setEnabled(true);
                }
            } else {
                for (int i = 0; i < buttons.length; i++) {
                    buttons[i].setEnabled(false);
                }
                JOptionPane.showMessageDialog(null,"El directorio no existe, elija un directorio valido para hacer el calculo",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }
}