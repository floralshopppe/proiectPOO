package gui;

import helper_classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

public class AragazGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Filtrare Aragaze");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));
        panel.setBackground(new Color(200, 220, 255));

        JLabel labelPret = new JLabel("Pret maxim:");
        JTextField textPret = new JTextField();

        JLabel labelNumarArzatoare = new JLabel("Numar minim de arzatoare:");
        JTextField textNumarArzatoare = new JTextField();

        JCheckBox checkAprindereElectrica = new JCheckBox("Doar cu aprindere electrica");
        checkAprindereElectrica.setBackground(new Color(200, 220, 255));

        JButton btnAfisare = new JButton("Afiseaza aragazurile");

        JTextArea textRezultate = new JTextArea();
        textRezultate.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textRezultate);

        panel.add(labelPret);
        panel.add(textPret);
        panel.add(labelNumarArzatoare);
        panel.add(textNumarArzatoare);
        panel.add(checkAprindereElectrica);
        panel.add(btnAfisare);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        btnAfisare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String pretStr = textPret.getText();
                    String arzatoareStr = textNumarArzatoare.getText();
                    boolean doarCuAprindere = checkAprindereElectrica.isSelected();

                    double pretMaxim = pretStr.isEmpty() ? Double.MAX_VALUE : Double.parseDouble(pretStr);
                    int numarMinimArzatoare = arzatoareStr.isEmpty() ? 0 : Integer.parseInt(arzatoareStr);

                    // Citire din fisier
                    List<Aragaz> aragazuri = FisierArzatorPrelucrare.citesteAragazuriDinFisier("FisierArzator.txt");

                    // Filtrare
                    StringBuilder rezultate = new StringBuilder("Rezultate pentru aragazuri:\n");
                    for (Aragaz aragaz : aragazuri) {
                        if (aragaz.pret <= pretMaxim &&
                                aragaz.numarArzatoare >= numarMinimArzatoare &&
                                (!doarCuAprindere || aragaz.aprindereElectrica)) {
                            rezultate.append(aragaz).append("\n");
                        }
                    }
                    textRezultate.setText(rezultate.toString());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Eroare la citirea din fisier!", "Eroare", JOptionPane.ERROR_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Introdu valori numerice valide!", "Eroare", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}
