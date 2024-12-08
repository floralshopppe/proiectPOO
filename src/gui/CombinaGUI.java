package gui;

import helper_classes.Combina;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CombinaGUI {
    public static void main(String[] args) {
        // Creare fereastră principală
        JFrame frame = new JFrame("Filtrare Combine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Panou principal cu fundal mov
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2, 10, 10));
        panel.setBackground(new Color(240, 230, 255)); // Fundal mov deschis

        // Etichete și câmpuri de text
        JLabel labelCapacitate = new JLabel("Capacitate minimă:");
        labelCapacitate.setForeground(new Color(100, 50, 200)); // Text mov închis
        JTextField textCapacitate = new JTextField();

        JLabel labelPret = new JLabel("Preț maxim:");
        labelPret.setForeground(new Color(100, 50, 200)); // Text mov închis
        JTextField textPret = new JTextField();

        // Buton pentru afișare cu design personalizat
        JButton btnAfisare = new JButton("Afișează combinele");
        btnAfisare.setBackground(new Color(150, 100, 255)); // Mov închis
        btnAfisare.setForeground(Color.WHITE); // Text alb

        // Zonă de afișare rezultate
        JTextArea textRezultate = new JTextArea();
        textRezultate.setEditable(false);
        textRezultate.setBackground(new Color(245, 240, 255)); // Fundal alb-mov
        textRezultate.setForeground(new Color(100, 50, 150)); // Text mov închis
        JScrollPane scrollPane = new JScrollPane(textRezultate);

        // Adăugare componente în panou
        panel.add(labelCapacitate);
        panel.add(textCapacitate);
        panel.add(labelPret);
        panel.add(textPret);
        panel.add(btnAfisare);

        // Adăugare panou și zonă rezultate în fereastră
        frame.add(panel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Setare ascultător pentru buton
        btnAfisare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Citire valori din GUI
                String capacitateStr = textCapacitate.getText();
                String pretStr = textPret.getText();

                int capacitateMinima = capacitateStr.isEmpty() ? 0 : Integer.parseInt(capacitateStr);
                double pretMaxim = pretStr.isEmpty() ? Double.MAX_VALUE : Double.parseDouble(pretStr);

                // Generare instanțe
                ArrayList<Combina> combine = new ArrayList<>();
                for (int i = 0; i < 5; i++) {
                    combine.add(new Combina("Combina" + i, "Model" + i, 2500.0 + i * 200,
                            200 + i * 10, 100 + i * 5, i % 2 == 0, 40 + i));
                }

                // Filtrare și afișare rezultate
                StringBuilder rezultate = new StringBuilder("Rezultate pentru combine:\n");
                for (Combina combina : combine) {
                    if (combina.capacitateFrigider >= capacitateMinima && combina.pret <= pretMaxim) {
                        rezultate.append(combina).append("\n");
                    }
                }
                textRezultate.setText(rezultate.toString());
            }
        });

        // Afișare fereastră
        frame.setVisible(true);
    }
}
