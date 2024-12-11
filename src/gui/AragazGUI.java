package gui;

import helper_classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AragazGUI {
    public static void main(String[] args) {
        // Creare fereastră principală
        JFrame frame = new JFrame("Filtrare Aragazuri");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null); // Centrare pe ecran

        // Panou principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10)); // 4 rânduri pentru a include checkbox-ul
        panel.setBackground(new Color(200, 220, 255)); // Fundal albastru deschis

        // Etichete și câmpuri de text
        JLabel labelPret = new JLabel("Pret maxim:");
        labelPret.setForeground(new Color(50, 50, 150)); // Text albastru închis
        JTextField textPret = new JTextField();

        JLabel labelNumarArzatoare = new JLabel("Numar minim de arzatoare:");
        labelNumarArzatoare.setForeground(new Color(50, 50, 150)); // Text albastru închis
        JTextField textNumarArzatoare = new JTextField();

        // Checkbox
        JCheckBox checkAprindereElectrica = new JCheckBox("Doar cu aprindere electrica");
        checkAprindereElectrica.setBackground(new Color(200, 220, 255)); // Fundal albastru deschis
        checkAprindereElectrica.setForeground(new Color(50, 50, 150)); // Text albastru închis

        // Buton pentru afișare
        JButton btnAfisare = new JButton("Afiseaza aragazurile");
        btnAfisare.setBackground(new Color(100, 150, 255)); // Albastru
        btnAfisare.setForeground(Color.WHITE); // Text alb

        // Zonă de afișare rezultate
        JTextArea textRezultate = new JTextArea();
        textRezultate.setEditable(false);
        textRezultate.setBackground(new Color(230, 240, 255)); // Alb-albastru deschis
        textRezultate.setForeground(new Color(50, 50, 150)); // Text albastru închis
        JScrollPane scrollPane = new JScrollPane(textRezultate);

        // Adăugare componente în panou
        panel.add(labelPret);
        panel.add(textPret);
        panel.add(labelNumarArzatoare);
        panel.add(textNumarArzatoare);
        panel.add(checkAprindereElectrica);
        panel.add(new JLabel()); // Placeholder pentru layout
        panel.add(btnAfisare);

        // Adăugare panou și zonă rezultate în fereastră
        frame.add(panel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Setare ascultător pentru buton
        btnAfisare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Citire valori din GUI
                String pretStr = textPret.getText();
                String arzatoareStr = textNumarArzatoare.getText();
                boolean doarCuAprindere = checkAprindereElectrica.isSelected();

                double pretMaxim = pretStr.isEmpty() ? Double.MAX_VALUE : Double.parseDouble(pretStr);
                int numarMinimArzatoare = arzatoareStr.isEmpty() ? 0 : Integer.parseInt(arzatoareStr);

                // Generare instanțe
                ArrayList<Aragaz> aragazuri = new ArrayList<>();
                for (int i = 0; i < 5; i++) {
                    aragazuri.add(new Aragaz("MarcaAragaz" + i, "Model" + i, 1200.0 + i * 100,
                            4 + i, i % 2 == 0, "Gaz", i % 2 == 1));
                }

                // Filtrare și afișare rezultate
                StringBuilder rezultate = new StringBuilder("Rezultate pentru aragazuri:\n");
                for (Aragaz aragaz : aragazuri) {
                    if (aragaz.pret <= pretMaxim &&
                            aragaz.numarArzatoare >= numarMinimArzatoare &&
                            (!doarCuAprindere || aragaz.aprindereElectrica)) {
                        rezultate.append(aragaz).append("\n");
                    }
                }
                textRezultate.setText(rezultate.toString());
            }
        });

        // Afișare fereastră
        frame.setVisible(true);
    }
}
