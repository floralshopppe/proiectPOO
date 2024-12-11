package gui;

import helper_classes.Frigider;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FrigiderGUI {
    public static void main(String[] args) {
        //fereastra principala
        JFrame frame = new JFrame("Filtrare Frigidere");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Panou principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));
        panel.setBackground(new Color(255, 230, 240)); 

        // Etichete și campuri 
        JLabel labelCapacitate = new JLabel("Capacitate minimă:");
        labelCapacitate.setForeground(new Color(200, 50, 100));
        JTextField textCapacitate = new JTextField();

        JLabel labelPret = new JLabel("Preț maxim:");
        labelPret.setForeground(new Color(200, 50, 100)); 
        JTextField textPret = new JTextField();

        JLabel labelSistemNoFrost = new JLabel("Doar cu No Frost?");
        labelSistemNoFrost.setForeground(new Color(200, 50, 100)); 
        JCheckBox checkNoFrost = new JCheckBox();

       
        JButton btnAfisare = new JButton("Afișează frigiderele");
        btnAfisare.setBackground(new Color(255, 100, 150)); 
        btnAfisare.setForeground(Color.WHITE);

        // Zona de afișare rezultate
        JTextArea textRezultate = new JTextArea();
        textRezultate.setEditable(false);
        textRezultate.setBackground(new Color(255, 240, 245)); 
        textRezultate.setForeground(new Color(150, 50, 100)); 
        JScrollPane scrollPane = new JScrollPane(textRezultate);

        
        panel.add(labelCapacitate);
        panel.add(textCapacitate);
        panel.add(labelPret);
        panel.add(textPret);
        panel.add(labelSistemNoFrost);
        panel.add(checkNoFrost);
        panel.add(btnAfisare);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // ascultator
        btnAfisare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String capacitateStr = textCapacitate.getText();
                String pretStr = textPret.getText();
                boolean doarNoFrost = checkNoFrost.isSelected();

                int capacitateMinima = capacitateStr.isEmpty() ? 0 : Integer.parseInt(capacitateStr);
                double pretMaxim = pretStr.isEmpty() ? Double.MAX_VALUE : Double.parseDouble(pretStr);

             
                ArrayList<Frigider> frigidere = new ArrayList<>();
                for (int i = 0; i < 5; i++) {
                    frigidere.add(new Frigider("Frigider" + i, "Model" + i, 1500.0 + i * 100,
                            "Alb", "Plastic", 300 + i * 10, i % 2 == 0));
                }

             
                StringBuilder rezultate = new StringBuilder("Rezultate pentru frigidere:\n");
                for (Frigider frigider : frigidere) {
                    if (frigider.capacitateLitri >= capacitateMinima &&
                            frigider.pret <= pretMaxim &&
                            (!doarNoFrost || frigider.sistemNoFrost)) {
                        rezultate.append(frigider).append("\n");
                    }
                }
                textRezultate.setText(rezultate.toString());
            }
        });

        
        frame.setVisible(true);
    }
}
