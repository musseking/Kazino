import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Koliko kladionicara igra? ");
        int size = scanner.nextInt();
        Kladionicar[] nizKladionicara = new Kladionicar[size];

		String name;
		String game;
        int number;

        for(int i = 0; i < nizKladionicara.length; ++i) {
            System.out.print("Unesite ime kladionicara broj " + (i + 1) + ". ");
            name = scanner.next();

			System.out.print("Unesite igru (malim slovima) koju igra kladionicar broj " + (i + 1) + ". ");
			game = scanner.next();

			System.out.print("Unesite koliko para ima kladionicar broj " + (i + 1) + ". ");
			number = scanner.nextInt();

            Kladionicar noviKladionicar = new Kladionicar(name, game, number);
            nizKladionicara[i] = noviKladionicar;
        }

		System.out.println();
        System.out.print("Niz napravljenih kladionicara je: [");

        for(int i = 0; i < nizKladionicara.length; ++i) {
           System.out.print(nizKladionicara[i] + ", ");
           Kladionicar lastObject = nizKladionicara[size - 1];
           if (nizKladionicara[i].equals(lastObject)) {
               System.out.print("\b" + "\b");
               System.out.print("]");
           }
        }

        System.out.println();

		Kazino kazino = new Kazino(nizKladionicara);
        
		System.out.println();

		System.out.println(kazino.theMostProfitabileGame(nizKladionicara));

		scanner.close();	
	}
}

