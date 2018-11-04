

import java.io.IOException;

public class UkupnaKnjizevnaDjela {

	public static void main(String[] args) throws IOException {

		java.io.File file = new java.io.File("C:\\Users\\Seka\\Desktop\\OOP\\Projekat3\\Djela3\\PisciIDjela.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}

		try (

				java.io.PrintWriter output = new java.io.PrintWriter(file);) {

			output.println("PISCI: ");

			output.println();
			output.print(
					"1.Mesa Selimovic: Dervis i smrt., Tisine, 1961., Uvrijedeni covjek, 1947., Magla i mjesecina, 1965., Ostrvo,1975., Tvrdava, 1970., Sjecanja., Krug, 1983.");

			output.println();
			output.print(
					"2.Ivo Andric: Lica, 1960., Prokleta avlija, 1954., Zena na kamenu 1962., Gospodica, 1945., Znakovi pored puta.");

			output.println();
			output.print("3.Marin Drzic: Dundo Maroje, Skup, Arkulin, Dundo Maroje, Dundo Maroje. ");

			output.println();
			output.print("4.Charles Bukowski: Post Office (1971)., Factotum (1975)., Reach for the Sun: (1999).");

			output.println();
			output.print(
					"5.HermannHesse: Stepski vuk,  Demian,  Igra staklenim biserima, Siddhartha, Narcis i Zlatousti, Knulp. ");

		}

	}

}
