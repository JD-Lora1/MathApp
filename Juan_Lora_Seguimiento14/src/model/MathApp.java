package model;
import java.util.*;

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
		IntegerSet setX = search(name);
		if(setX==null){
			setX = new IntegerSet(name);
			sets.add(setX);	
		}
		amount = sets.size();
		System.out.println("A:"+amount);
	}

	public boolean validateAddSet(String name){
		IntegerSet setX = search(name);
		boolean ctrl=false;
		if(setX==null){
			ctrl=true;
		}
		return ctrl;
	}

	public void removeSet(String name){
		IntegerSet setX = search(name);
		sets.remove(setX);
		amount = sets.size(); 
		System.out.println("A:"+amount);
	}

	public void addElementToSet(String name, int n){
		IntegerSet setX = search(name);

		if(!setX.getElements().contains(n)){
			setX.addElement(n);
			System.out.println(setX.getElements().size());
		}
	}

	public void removeElementFromSet(String name, int n){
		IntegerSet setX = search(name);

		if(setX.getElements()!=null && setX.getElements().contains(n))
			setX.removeElement(n);

		/*for(int i=0; i<setX.getElements().size() && !ctrl; i++){
			if(setX.getElements().get(i)==n){
				setX.removeElement(n);
				ctrl=true;
			}
		}*/
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

	//Search of an IntegerSet object
	public IntegerSet search(String name){
		IntegerSet setSearch= null;

		for(int i=0; i<sets.size(); i++){
			if(sets.get(i).getName().indexOf(name)!=-1)
				setSearch = sets.get(sets.get(i).getName().indexOf(name));	
		}	
		return setSearch;
	}

	public int stringSearch(String name){
		int x=-1;
		IntegerSet objX = new IntegerSet(name);																																				;
		for(int i=0; i<sets.size(); i++){
			if(sets.get(i).getName().indexOf(name)==-1){
				x=-1;	
			}else{
				x=1;
			}
		}
		return x;
	}

	//Search for an element in the IntegerSet
	public boolean validateElement(String name, int n){	
		IntegerSet setX = search(name);
		boolean ctrl=false;
		if(!setX.getElements().contains(n)){
			ctrl=true;
		}
		return ctrl;
	}

}