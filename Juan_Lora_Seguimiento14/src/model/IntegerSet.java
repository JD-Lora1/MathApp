package model;
import java.util.*;

public class IntegerSet{

	//Attributes
	String name;
	int cardinality;
	ArrayList <Integer> elements;

	public IntegerSet(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public int getCardinality(){
		return cardinality;
	}

	public ArrayList<Integer> getElements(){
		return elements;
	}

	public void addElement(int element){
		elements.add(element);
	}

	public void removeElement(int element){
		elements.remove(element);
	}

	public IntegerSet union(IntegerSet setX, String newName){
		
		IntegerSet objNew=null;
		/*
		for(int i=0; i<elements.size(); i++){
			if(elements.get(i) == set1.elements.get(i)){
				objNew.elements.add(set1.elements.get(i)); 
			}
		}
		*/
		return objNew;
	}

	public IntegerSet difference(IntegerSet setX, String newName){
		IntegerSet objNew=null;
		return objNew;
	}

	public IntegerSet intersection(IntegerSet setX, String newName){
		IntegerSet objNew=null;
		return objNew;
	}

	public IntegerSet symmetricDifference(IntegerSet setX, String newName){
		IntegerSet objNew=null;
		return objNew;
	}

}