package model;
import java.util.*;

public class MathApp{

	//Attributes
	int amount;
	int number=0;  // Validate of sets for print a message
	int numberE=0;  // Validate of elements' set for print a message

	//Relationship
	ArrayList<IntegerSet> sets;

	//Constructor
	public MathApp(){
		sets = new ArrayList<IntegerSet>();
		amount=0;
	}
	// Validate of sets for print a message 
	public int setsValidation(){
		return number;
	}
	// Validate of elements' set for print a message
	public int elementsValidation(){
		return numberE;
	}

	//AddSet
	public void addSet(String name){
		IntegerSet setX = search(name);
		if(setX==null){
			setX = new IntegerSet(name);
			sets.add(setX);
			number=1;	
		}else{
			number=-1;
		}
		amount = sets.size();
		System.out.println("A:"+amount);
	}

	//RemoveSet
	public void removeSet(String name){
		IntegerSet setX = search(name);
		if(setX!=null){
			sets.remove(setX);
			number=1;
		}else{
			number=-1;
		}
		amount = sets.size(); 
		System.out.println("A:"+amount);
	}

	//AddElementsToSet
	public void addElementToSet(String name, int n){
		IntegerSet setX = search(name);
		if(setX.getElements()!=null){
			if(!setX.getElements().contains(n)){
				setX.addElement(n);
				numberE=1;
			}else{
				numberE=-1;
			}
			number=1;
		}else{
			number=-1;
		}
		
	}

	public void removeElementFromSet(String name, int n){
		IntegerSet setX = search(name);

		if(setX.getElements()!=null){
			if(setX.getElements().contains(n)){
				setX.removeElement(n);
				numberE=1;
			}else{
				numberE=-1;
			}
			number=1;
		}else{
			number=-1;
		}
	}

	public String operationString(String n1, String n2, String newN, int operation){
		IntegerSet obj1 = search(n1);
		IntegerSet obj2 = search(n2);

		String message="";

		if(obj1==null)
			message="No existe el 1er conjunto. ";
		if(obj2==null)
			message+="No existe el 2do conjunto. ";
		IntegerSet objNew= search(newN);
		if(objNew!=null)
			message+="Ya hay otro conjunto nombrado igual";
		if(obj1!=null && obj2!=null){
			switch(operation){
				case 1: union(n1, n2, newN);
						message="Union realizada";
						break;
				case 2: difference(n1, n2, newN);
						message="Diferencia realizada";
						break;
				case 3: intersection(n1, n2, newN);
						break;
				case 4: symmetricDifference(n1, n2, newN);
				default: System.out.println("");
			}
		}
		return message;
	}

	//(obj n1!=null)
	public void union(String name1, String name2, String newName){
		/*
		IntegerSet obj1 = intSets.get(intSets.search(name1));
		IntegerSet obj2 = intSets.get(intSets.search(name2));

		IntegerSet objNew = obj1.union(obj2, newName);
		intSets.add(objNew);
		amount = intSets.size();*/
	}

	public void difference(String name1, String name2, String newName){
	}

	public void intersection(String name1, String name2, String newName){
	}

	public void symmetricDifference(String name1, String name2, String newName){
	}

	//Search of an IntegerSet object
	public IntegerSet search(String name){
		IntegerSet setSearch= null;

		for(int i=0; i<sets.size(); i++){
			if(sets.get(i).getName().indexOf(name)!=-1)
				setSearch = sets.get(sets.get(i).getName().indexOf(name));	
		}	
		return setSearch;
	}

}