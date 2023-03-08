package src.cts.s02.principii_clean_code.clase.readers;

import src.cts.s02.principii_clean_code.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {

       public abstract List<Aplicant> readAplicants(String fileName) throws FileNotFoundException;

        public void readAplicant(Scanner scanner, Aplicant aplicant){
                String nume = scanner.next();
                String prenume = (scanner.next()).toString();
                int varsta = Integer.valueOf(scanner.nextInt());
                int punctaj = Integer.valueOf(scanner.nextInt());
                int nr = Integer.valueOf(scanner.nextInt());
                String[] vect = new String[5];
                for (int i = 0; i < nr; i++)
                        vect[i] = scanner.next();

                aplicant.setNume(nume);
                aplicant.setPrenume(prenume);
                aplicant.setVarsta(varsta);


        }

}
