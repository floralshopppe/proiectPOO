import java.util.ArrayList;

import helper_classes.*;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Congelator> arrayCongelatoare = new ArrayList<Congelator>();

        for (int index = 0; index < 10; index++) {
            arrayCongelatoare.add(new Congelator("test", index, index, index, index, "rosu", index, false));
        }
        for (int index = 0; index < arrayCongelatoare.size(); index++) {
            System.out.println("#" + index + " " + arrayCongelatoare.get(index).toString());
        }
    }
}
