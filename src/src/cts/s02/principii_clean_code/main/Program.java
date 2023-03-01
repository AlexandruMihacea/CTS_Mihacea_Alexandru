package src.cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import src.cts.s02.principii_clean_code.clase.Aplicant;
import src.cts.s02.principii_clean_code.clase.readers.AngajatReader;
import src.cts.s02.principii_clean_code.clase.readers.AplicantReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			AplicantReader aplicantReader = new AngajatReader();
			listaAngajati = aplicantReader.readAplicanti("angajati.txt");
			for(Aplicant aplicat:listaAngajati)
				System.out.println(aplicat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
