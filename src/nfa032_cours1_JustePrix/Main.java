package nfa032_cours1_JustePrix;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] tab = {{"MacBook Air 11 pouces 4Go de RAM", "Liseuse Kindle Paperwhite", "Drone DJl Phantom 3 Standard", "Iphone 7 Plus 32 Go", "Google Chromecast Noir", "Enceinte sans fil Bose SoundTouch 20 III", "GoPro Hero Session"}, {"999", "129", "599", "909", "35", "399", "219"}};
		int choixObjet = 0;
		String confirm = "";
		Scanner sc = new Scanner(System.in);
		
		do{
			do{
				System.out.println("Veuillez sélectionner l'objet souhaité : \n");
				System.out.println("1. MacBook Air 11 pouces 4Go de RAM");
				System.out.println("2. Liseuse Kindle Paperwhite");
				System.out.println("3. Drone DJl Phantom 3 Standard");
				System.out.println("4. Iphone 7 Plus 32 Go");
				System.out.println("5. Google Chromecast Noir");
				System.out.println("6. Enceinte sans fil Bose SoundTouch 20 III");
				System.out.println("7. GoPro Hero Session");
				
				choixObjet = sc.nextInt();
			
			System.out.println("Vous avez sélectionné : ");
			
			switch(choixObjet){
					case 1 : System.out.println("MacBook Air 11 pouces 4Go de RAM");
					break;
					case 2 : System.out.println("Liseuse Kindle Paperwhite");
					break;
					case 3 : System.out.println("Drone DJl Phantom 3 Standard");
					break;
					case 4 : System.out.println("Iphone 7 Plus 32 Go");
					break;
					case 5 : System.out.println("Google Chromecast Noir");
					break;
					case 6 : System.out.println("Enceinte sans fil Bose SoundTouch 20 III");
					break;
					case 7 : System.out.println("GoPro Hero Session");
					break;
					default:System.out.println("Nous n'avons pas compris votre choix\n");
					break;
			}
			
			}while(choixObjet<1 ||choixObjet>7);
		
		System.out.println("Etes-vous sûr ? Y/N");
		
		sc.nextLine();//vidage de ligne
		//et maintenant j'ecris n'importe quoi pour voir le commit
	//tttrty
		
		confirm = sc.nextLine().toUpperCase();
		if (!confirm.equals("Y") && !confirm.equals("N"))
			System.out.println("Nous n'avons pas compris votre choix\n");
		
		}while(confirm.equals("N"));

	}

}
