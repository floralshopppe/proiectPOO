package helper_classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FisierArzatorPrelucrare {

    public static List<Aragaz> citesteAragazuriDinFisier(String filePath) throws IOException {
        List<Aragaz> aragazuri = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                Aragaz aragaz = new Aragaz(
                        parts[0], // marca
                        parts[1], // model
                        Double.parseDouble(parts[2]), // pret
                        Integer.parseInt(parts[3]), // numarArzatoare
                        Boolean.parseBoolean(parts[4]), // aprindereElectrica
                        parts[5], // tipCombustibil
                        Boolean.parseBoolean(parts[6]) // cuptorInclus
                );
                aragazuri.add(aragaz);
            }
        }
        return aragazuri;
    }
}
