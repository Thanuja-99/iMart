import java.util.*;
class BillPrintingSystem2{
	public static void main(String args[]){
		System.out.println("================================================================================================================================");
		System.out.println(" ");
		System.out.println("__          __  _                             _           _ __  __            _");
		System.out.println("\\ \\        / / | |                           | |         (_)  \\/  |          | |");
		System.out.println(" \\ \\  /\\  / /__| | ___ ___   _ __ ___  ___   | |_ ___     _| \\  / | __ _ _ __| |_");
		System.out.println("  \\ \\/  \\/ / _ \\ |/ __/_ \\| '_`  _  \\/ _ \\  | __/ _ \\   | | |\\/| |/ _` | '__| __|");
		System.out.println("   \\  /\\  /  __/ | (_| (_) | | | | | |  __/  | || (_) |  | | |  | | (_| | |  | |_");
		System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__ \\___/   |_|_|  |_|\\__,_|_|   \\__|");
		System.out.println(" ");
		System.out.println("================================================================================================================================");
  
      		System.out.println(" ");
		System.out.println(" ");


                Scanner Input=new Scanner(System.in);

			System.out.print("Enter Customer Phone Number - ");
			String phoneNumber =Input.nextLine();

		System.out.println(" ");
			
			System.out.print("Enter Customer Name - ");
			String name =Input.nextLine();
		
		
			

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("================================================================================================================================");
		System.out.println(" ");
		System.out.println(" ");
			
			System.out.print("Basmathi Qty(Kg) -");
			Integer Basmathi=Input.nextInt();
			System.out.println(" ");

			System.out.print("Dhal Qty(Kg) -");
			Integer Dhal=Input.nextInt();
			System.out.println(" ");

			System.out.print("Suger Qty(Kg) -");
			Integer Suger=Input.nextInt();
			System.out.println(" ");

			System.out.print("Higland Qty -");
			Integer Higland=Input.nextInt();
			System.out.println(" ");

			System.out.print("Yoghurt Qty -");
			Integer Yoghurt=Input.nextInt();
			System.out.println(" ");


			System.out.print("Flour Qty(Kg) -");
			Integer Flour=Input.nextInt();
			System.out.println(" ");
			
			System.out.print("Soap Qty -");
			Integer Soap=Input.nextInt();
			System.out.println(" ");

		System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
		System.out.println("|                                             _   __  __          _____ __________                                             |");
		System.out.println("|                                            (_) |  \\/  |   /\\   |  __  \\___   ___|                                            |");
		System.out.println("|                                             _  | \\  / |  /  \\  | |__)  |  | |                                                |");
		System.out.println("|                                            | | | |\\/| | / /\\ \\ |  _   /   | |                                                |");
		System.out.println("|                                            | | | |  | |/ ____ \\| | \\  \\   | |                                                |");
		System.out.println("|                                            |_| |_|  |_|_/    \\_\\_|   \\_\\  |_|                                                |");
		System.out.println("|                                                  225,Galle Road,Panadura.                                                    |");
		System.out.println("|                                                                                                                              |");
		System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
		System.out.print  ("|                                                     # Tel  : "+ phoneNumber);
		System.out.println("                                                      |");                                                    
		System.out.print("|                                                     # Name : "+  name);   
		System.out.println("                                                           |");                                                                   
		
		System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");		
		System.out.print("|                        |");
		System.out.print("        Qty            |");
		System.out.print("      unit price                   |");
		System.out.println("              Price                      |");
		System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");

///////////////////////////////////////////////////////////////////////////////////////
		System.out.print("|    # Basmathi         ");
		System.out.print(" |         "+ Basmathi);
		System.out.print("            |        250                        ");

		int basmathi= 250*Basmathi;

		System.out.print("|               " + String.format("%.2f", (double) basmathi));
		System.out.println("                   |");

/////////////////////////////////////////////////////////////////////////////////////

		System.out.print("|    # Dhal             ");
		System.out.print(" |         "+ Dhal);
		System.out.print("             |        180                        ");

		int dhal= 180*Dhal;

		System.out.print("|               " + String.format("%.2f", (double) dhal));
		System.out.println("                    |");

/////////////////////////////////////////////////////////////////////////////////////////


		System.out.print("|    # Suger            ");
		System.out.print(" |         "+ Suger);
		System.out.print("             |        150                        ");

		int suger= 150*Suger;

		System.out.print("|               " + String.format("%.2f", (double) suger));
		System.out.println("                    |");

////////////////////////////////////////////////////////////////////////////////////////


		System.out.print("|    # Higland         ");
		System.out.print("  |         "+ Higland);
		System.out.print("             |        1200                       ");

		int highland= 1200*Higland;

		System.out.print("|               " + String.format("%.2f", (double) highland));
		System.out.println("                   |");

/////////////////////////////////////////////////////////////////////////////////////


		System.out.print("|    # Youghurt         ");
		System.out.print(" |         "+ Yoghurt);
		System.out.print("             |        50                         ");

		int youghurt= 50*Yoghurt;

		System.out.print("|               " + String.format("%.2f", (double) youghurt));
		System.out.println("                    |");


///////////////////////////////////////////////////////////////////////////////////


		System.out.print("|    # flour            ");
		System.out.print(" |         "+ Flour);
		System.out.print("             |        120                       ");

		int flour= 120*Flour;

		System.out.print(" |               " + String.format("%.2f", (double) flour));
		System.out.println("                    |");


//////////////////////////////////////////////////////////////////////////////////


		System.out.print("|    # Soap            ");
		System.out.print("  |         "+ Soap);
		System.out.print("             |        160                        ");

		int soap= 160*Soap;

		System.out.print("|               " + String.format("%.2f", (double) soap));
		System.out.println("                    |");

/////////////////////////////////////////////////////////////////////////////////


		System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
		



		System.out.print("|                   ");
		System.out.print("                             ");
	
		System.out.print("|    Total                          ");

		int total=(basmathi+dhal+suger+highland+youghurt+flour+soap);


		System.out.printf("|%15s", "");
		System.out.printf("%1$-26s|\n", String.format("%.2f", (double) total));

	        System.out.println("|                                                +-----------------------------------------------------------------------------+");

//////////////////////////////////////////////////////////////////////////////////////


		System.out.print("|                   ");
		System.out.print("                             ");
	
		System.out.print("|    discount(10%)                  ");

		int Discount=(total*10)/100;


		System.out.printf("|%15s", "");
		System.out.printf("%1$-26s|\n", String.format("%.2f", (double) Discount));





		System.out.println("|                                                +-----------------------------------------------------------------------------+");



/////////////////////////////////////////////////////////////////////////////////////


		System.out.print("|                   ");
		System.out.print("                             ");
	
		System.out.print("|    Price                          ");

		int price=(total-Discount);


		System.out.printf("|%15s", "");
		System.out.printf("%1$-26s|\n", String.format("%.2f", (double) price));


		System.out.println("+------------------------------------------------+-----------------------------------------------------------------------------+");










////////////////////////////////////////////////////////////////////////////////
		System.out.println(" ");
		System.out.println(" ");

		System.out.print("Enter Customer Given Amount : ");
		int Amount=Input.nextInt(); 


		int change=(Amount-price);
		


		System.out.println(" ");
		System.out.println(" ");

System.out.println("+----------------------+----------------------+"); 
System.out.print("|   Net Amount         ");
System.out.printf("|%6s", "");
System.out.printf("%1$-16s|\n", String.format("%.2f", (double) price));

System.out.println("+----------------------+----------------------+");
System.out.print("|   Cash               ");
System.out.printf("|%6s", "");
System.out.printf("%1$-16s|\n", String.format("%.2f", (double) Amount));

System.out.println("+----------------------+----------------------+");
System.out.print("|   Change             ");
System.out.printf("|%6s", "");
System.out.printf("%1$-16s|\n", String.format("%.2f", (double) change));

System.out.println("+----------------------+----------------------+");


		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");


int rs5000,rs2000,rs1000,rs500,rs100,rs50,rs20,rs10,rs5,rs2,rs1;

rs5000=change/5000;
change=change%5000;

rs2000=change/2000;
change=change%2000;

rs1000=change/1000;
change=change%1000;

rs500=change/500;
change=change%500;

rs100=change/100;
change=change%100;

rs50=change/50;
change=change%50;


rs20=change/20;
change=change%20;

rs10=change/10;
change=change%10;

rs5=change/5;
change=change%5;

rs2=change/2;
change=change%2;

rs1=change/1;
change=change%1;


int note=(rs5000+rs2000+rs1000+rs500+rs100+rs50+rs20+rs10);
int coins=(rs5+rs2+rs1);






System.out.println("+----------------------+----------------------+"); 
System.out.print("|    Value             |      No  ");
System.out.println("            |");

System.out.println("+----------------------+----------------------+"); 
System.out.print("|    Rs.5000           |         "+ rs5000      );
System.out.println("            |");

System.out.println("+----------------------+----------------------+");
System.out.print("|    Rs.2000           |         "+ rs2000    );
System.out.println("            |");
 
System.out.println("+----------------------+----------------------+"); 
System.out.print("|    Rs.1000           |         "+ rs1000    );
System.out.println("            |");

System.out.println("+----------------------+----------------------+");
System.out.print("|    Rs.500            |         "+ rs500  );
System.out.println("            |");

System.out.println("+----------------------+----------------------+"); 
System.out.print("|    Rs.100            |         "   + rs100 );
System.out.println("            |");

System.out.println("+----------------------+----------------------+"); 
System.out.print("|    Rs.50             |         "   + rs50 );
System.out.println("            |");

System.out.println("+----------------------+----------------------+"); 
System.out.print("|    Rs.20             |         "   + rs20 );
System.out.println("            |");

System.out.println("+----------------------+----------------------+"); 
System.out.print("|    Rs.10             |         "  +  rs10 );
System.out.println("            |");

System.out.println("+----------------------+----------------------+");
System.out.print("|    Rs.5              |         "   + rs5  );
System.out.println("            |");
 
System.out.println("+----------------------+----------------------+"); 
System.out.print("|    Rs.2              |         "   +  rs2   );
System.out.println("            |");

System.out.println("+----------------------+----------------------+"); 
System.out.print("|    Rs.1              |         "   + rs1  );
System.out.println("            |");
System.out.println("+----------------------+----------------------+");
System.out.print("|    No of Notes       |         "   + note);
System.out.println("            |");

System.out.println("+----------------------+----------------------+");
System.out.print("|    No of Coins       |         "   + coins  );
System.out.println("            |");

System.out.println("+----------------------+----------------------+"); 



		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");

System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("                                                  THANK YOU FOR SHOPPING WITH US                                                                ");
System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");





		
		}
	}