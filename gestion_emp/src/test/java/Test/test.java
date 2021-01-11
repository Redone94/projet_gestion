package Test;

import java.util.Scanner;

import Config.Context;
import model.Compte;
import model.Employe;
import model.Manager;
import model.Service;

public class test {


	private static Compte connected =null;
	
	public static int saisieInt(String msg) 
	{
		System.out.println(msg);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public static double saisieDouble(String msg) 
	{
		System.out.println(msg);
		Scanner sc = new Scanner(System.in);
		return sc.nextDouble();
	}

	public static String saisieString(String msg) 
	{
		System.out.println(msg);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	
	
	private static void menuPrincipal() {
		System.out.println("\nBienvenue dans votre service informatique");
		System.out.println("1 - Connection");
		System.out.println("2 - Sortir");

		int choix = saisieInt("");
		switch(choix) 
		{
		case 1:menuLogin();break;
		case 2:System.exit(0);break;
		default: menuPrincipal(); break;
		}

		menuPrincipal();
	}
	private static void menuLogin() {

		String login=saisieString("Saisir votre login");
		String password=saisieString("Saisir votre password");

		connected=Context.getInstance().getDaoCompte().connect(login, password);

		if(connected==null) 
		{
			System.out.println("Mauvais identifiants veuillez réssayer");
			menuPrincipal();
		}
		else if(connected instanceof Employe) 
		{
			
			
		}
		else if(connected instanceof Manager)
		{
		

		}
	}
	public static void main(String[] args) {
		
		Service service= new Service("FR234");
		Employe employe= new Employe("red","mad","123","red@gmail.com");
		Context.getInstance().getDaoCompte().save(employe);
		Context.getInstance().getDaoService().save(service);
		

		
	}


}
