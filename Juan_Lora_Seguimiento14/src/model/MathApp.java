package model;
import java.util.ArrayList;

public class MathApp{

	//Attributes
	int amount;

	//Relationship
	ArrayList<IntegerSet> sets;

	public MathApp(){
		sets = new ArrayList<IntegerSet>();
		amount=0;
	}

	public void addSet(String name){
		IntegerSet setX = new IntegerSet(name);
		sets.add(setX);
		amount = sets.size(); 
	}

	public void removeSet(String name){
		IntegerSet setX = search(name);
		sets.remove(setX);
		amount = sets.size(); 
	}

	public IntegerSet search(String name){
		IntegerSet setSearch= null;
		if(sets.indexOf(name)!=-1)
			setSearch = sets.get(sets.indexOf(name));	

		return setSearch;
	}
	public int stringSearch(String name){
		int x=0;																																				;
		if(sets.indexOf(name)==-1){
			x=-1;	
		}else {
			x=1;
		}
		
		return x;
	}

	public void removeElementFromSet(String name, int n){
	}

	public void addElementToSet(String name, int n){
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

	/*public String operationString(String n1, String n2, String newN, int operation){
		IntegerSet obj1 = intSets.get(intSets.search(n1));
		IntegerSet obj2 = intSets.get(intSets.search(n2));

		String message="";

		if(obj1==null)
			message="Error, No existe el 1er conjunto";
		if(obj2==null)
			message="Error, No existe el 2do conjunto";
		if(obj1!=null && obj2!=null){
			switch(operation){
				case 1: union(n1, n2, newN);
						message="Union realizada";
						break;
				case 2: difference(n1, n2, newN);
						break;
				case 3: intersection(n1, n2, newN);
						break;
				default: System.out.println("");

			}

		}

		return message;
	}*/

	public void difference(String name1, String name2, String newName){
	}

	public void intersection(String name1, String name2, String newName){
	}
	
}