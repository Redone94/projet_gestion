package Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Config.Context;
import model.Compte;
import model.Conge;
import model.Employe;
import model.Manager;
import model.Service;
import model.TypeC;

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
		Scanner sc = new Scanner(System.in);
        System.out.println("Choisir une marque :");
        System.out.println(Arrays.toString(TypeC.values()));
        String typec = sc.nextLine();
        TypeC t=TypeC.valueOf(typec);
        
		List<Conge> conge=new ArrayList();
		Service service= new Service("FR234");
		service=Context.getInstance().getDaoService().save(service);
		Employe employe= new Employe("red","mad","123","red@gmail.com",service,conge);
		employe=Context.getInstance().getDaoEmploye().save(employe);
		Conge c1= new Conge(t,LocalDate.parse("2021-06-15"),LocalDate.parse("2021-06-20"),"mariage",employe);
		Context.getInstance().getDaoConge().save(c1);
		
		

		
	}


}
