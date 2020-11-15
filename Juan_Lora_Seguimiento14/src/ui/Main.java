package ui;
import java.util.*;
import model.MathApp;

public class Main{
	public static Scanner sc = new Scanner(System.in);

	//Relationship
	public static MathApp math1 = new MathApp();

	public static void main(String[] args){

		int opt=-1;
		boolean ctrl= false;
		boolean validation= false;

		while(!ctrl){
			System.out.println(
					"\nSeleccione una opcion:\n" +
					"(1) Crear(agregar) un conjunto\n" +
					"(2) Eliminar un conjunto\n"+
					"(3) Agregar elemento al conjunto\n"+
					"(4) Eliminar elemento de un conjunto\n"+
					"(5) Crear la union entre dos conjuntos\n"+
					"(6) Hacer la diferencia entre dos conjuntos\n"+
					"(7) Hacer la diferencia simetrica\n"+
					"(0) Salir" );

			System.out.print(": ");
			opt = sc.nextInt();
			sc.nextLine();
	
			switch (opt){
				case 1: addSet();
					break;
				case 2: removeSet();
					break;
				case 3: addElementToSet();
					break;
				case 4: removeElementFromSet();
					break;
				case 5: union();
					break;
				case 6: difference();
					break;
				case 7: symmetricDifference();
					break;
				case 0: System.out.println("  *Fin*");
					ctrl=true;
					break;
				default:System.out.println("Digite una opcion valida");		
			}
		}
	}

	public static void addSet(){
		System.out.print("Digite el nombre del nuevo conjunto: ");
		String name = sc.nextLine();

		math1.addSet(name);
		if(math1.setsValidation()==1){
			System.out.println("* Conjunto Creado");
		}else if(math1.setsValidation()==-1){
			System.out.println("* Ya existe un conjunto con el mismo nombre");
		}
	}
	
	public static void removeSet(){
		System.out.print("Que conjunto desea eliminar?: ");
		String name = sc.nextLine();

		math1.removeSet(name);
		if(math1.setsValidation()==1){
			System.out.println("* Conjunto Creado");
		}else if(math1.setsValidation()==-1){
			System.out.println("* Ya existe un conjunto con el mismo nombre");
		}
	}

	public static void addElementToSet(){
		System.out.println("Para agregrar un elemento por favor digite:\n");
		System.out.print("El nombre del conjunto: ");
		String name = sc.nextLine();
		System.out.print("Numero a agregar: ");
		int element = sc.nextInt();  sc.nextLine();

		math1.addElementToSet(name, element);

		if(math1.setsValidation()==-1){
			System.out.println("* Conjunto Inexistente ");
		}else if(math1.setsValidation()==1){
			if(math1.elementsValidation()==1){
				System.out.println("* Elemento agregado");
			}else{
				System.out.println("* Este elemento ya existe en este conjunto");
			}
		}
	}

	public static void removeElementFromSet(){
		System.out.println("Para eliminar un elemento por favor digite:\n");
		System.out.print("El nombre del conjunto: ");
		String name = sc.nextLine();
		System.out.print("Numero a remover: ");
		int element = sc.nextInt();   sc.nextLine();

		math1.removeElementFromSet(name, element);
		if(math1.setsValidation()==-1){
			System.out.println("* Este conjunto No existe");
		}else if(math1.setsValidation()==1){
			if(math1.elementsValidation()==1){
				System.out.println("* Elemento borrado");
			}else{
				System.out.println("* Este elemento No existe");
			}	
		}
	}
	//For union, difference, intersection, symmetricDifference
	public static String[] receiveSetsNames(){
		System.out.print("El nombre del conjunto 1: ");
		String name1 = sc.nextLine();
		System.out.print("El nombre del conjunto 2: ");
		String name2 = sc.nextLine();
		System.out.print("Nombre para el nuevo conjunto: ");
		String newName = sc.nextLine();

		String[] names = {name1, name2, newName};
		
		return names;
	}

	public static void union(){
		System.out.println("Para unir 2 conjuntos por favor digite:\n");
		String[] names = receiveSetsNames();
		math1.union(names[0], names[1], names[2]);

		if(math1.setsValidation()==-1){
			System.out.println("* El conjunto n1 No existe");
		}
		if(math1.setsValidation()==-2){
			System.out.println("* El conjunto n2 No existe");
		}
		if(math1.setsValidation()==-3){
			System.out.println("* Ya existe un conjunto con este nombre");
		}
	}

	public static void difference(){
		System.out.println("Para hacer la diferencia entre 2 conjuntos, digite:\n");
		String[] names = receiveSetsNames();
		if(names!= null)
			math1.difference(names[0], names[1], names[2]);
	}

	public static void intersection(){
		System.out.println("Para intersectar 2 conjuntos por favor digite:\n");
		String[] names = receiveSetsNames();
		if(names!= null)
			math1.intersection(names[0], names[1], names[2]);
	}

	public static void symmetricDifference(){
		System.out.println("Para hacer diferencia simetrica, digite:\n");
		String[] names = receiveSetsNames();
		if(names!= null)
			math1.intersection(names[0], names[1], names[2]);
	}

}
