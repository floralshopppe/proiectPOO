package gui;

import helper_classes.PlitaElectrica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PlitaElectricaGUI {
    public static void main(String[] args) {
        // Creare fereastra principala
        JFrame frame = new JFrame("Filtrare Plite Electrice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null); // Centrare pe ecran

        // Panou principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10)); // Layout simplu
        panel.setBackground(new Color(200, 220, 255)); // Fundal albastru deschis

        // Etichete si campuri de text
        JLabel labelPret = new JLabel("Pret maxim:");
        labelPret.setForeground(new Color(50, 50, 150)); // Text albastru inchis
        JTextField textPret = new JTextField();

        JLabel labelZoneIncalzire = new JLabel("Numar minim de zone incalzire:");
        labelZoneIncalzire.setForeground(new Color(50, 50, 150)); // Text albastru inchis
        JTextField textZoneIncalzire = new JTextField();

        // Checkbox
        JCheckBox checkBlocareCopii = new JCheckBox("Doar cu functie blocare copii");
        checkBlocareCopii.setBackground(new Color(200, 220, 255)); // Fundal albastru deschis
        checkBlocareCopii.setForeground(new Color(50, 50, 150)); // Text albastru inchis

        // Buton pentru afisare
        JButton btnAfisare = new JButton("Afiseaza plitele electrice");
        btnAfisare.setBackground(new Color(100, 150, 255)); // Albastru
        btnAfisare.setForeground(Color.WHITE); // Text alb

        // Zona de afisare rezultate
        JTextArea textRezultate = new JTextArea();
        textRezultate.setEditable(false);
        textRezultate.setBackground(new Color(230, 240, 255)); // Alb-albastru deschis
        textRezultate.setForeground(new Color(50, 50, 150)); // Text albastru inchis
        JScrollPane scrollPane = new JScrollPane(textRezultate);

        // Adaugare componente in panou
        panel.add(labelPret);
        panel.add(textPret);
        panel.add(labelZoneIncalzire);
        panel.add(textZoneIncalzire);
        panel.add(checkBlocareCopii);
        panel.add(new JLabel()); // Placeholder pentru layout
        panel.add(btnAfisare);

        // Adaugare panou si zona rezultate in fereastra
        frame.add(panel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Setare ascultator pentru buton
        btnAfisare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Citire valori din GUI
                String pretStr = textPret.getText();
                String zoneStr = textZoneIncalzire.getText();
                boolean doarCuBlocare = checkBlocareCopii.isSelected();

                double pretMaxim = pretStr.isEmpty() ? Double.MAX_VALUE : Double.parseDouble(pretStr);
                int zoneMinime = zoneStr.isEmpty() ? 0 : Integer.parseInt(zoneStr);

                // Generare instante
                ArrayList<PlitaElectrica> plite = new ArrayList<>();
                for (int i = 0; i < 5; i++) {
                    plite.add(new PlitaElectrica("MarcaPlita" + i, "Model" + i, 1500.0 + i * 200,
                            4 + i, "Touch", i % 2 == 0, 7000 + i * 500));
                }

                // Filtrare si afisare rezultate
                StringBuilder rezultate = new StringBuilder("Rezultate pentru plite electrice:\n");
                for (PlitaElectrica plita : plite) {
                    if (plita.pret <= pretMaxim &&
                            plita.numarZoneIncalzire >= zoneMinime &&
                            (!doarCuBlocare || plita.functieBlocareCopii)) {
                        rezultate.append(plita).append("\n");
                    }
                }
                textRezultate.setText(rezultate.toString());
            }
        });

        // Afisare fereastra
        frame.setVisible(true);
    }
}
