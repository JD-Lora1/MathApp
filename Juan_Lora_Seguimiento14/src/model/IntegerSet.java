package model;
import java.util.*;

public class IntegerSet{

	//Attributes
	String name;
	int cardinality;
	ArrayList <Integer> elements;

	public IntegerSet(String name){
		this.name = name;
		elements = new ArrayList<Integer>();
	}

	//Gets
	public String getName(){
		return name;
	}

	public int getCardinality(){
		return cardinality;
	}

	public ArrayList<Integer> getElements(){
		return elements;
	}
	//AddELement
	public void addElement(int element){
		elements.add(element);
		cardinality=elements.size();
	}
	//remove element
	public void removeElement(int element){
		elements.remove(element);
		cardinality=elements.size();
	}
	//Union
	public IntegerSet union(IntegerSet setX, String newName){
		IntegerSet objNew = new IntegerSet(newName);
		
		for(int i=0; i<elements.size(); i++){
			objNew.getElements().add(setX.getElements().get(i));
			objNew.getElements().add(elements.get(i));
			objNew.setCardinality(1);
		}
		return objNew;
	}
	//Difference
	public IntegerSet difference(IntegerSet setX, String newName){
		IntegerSet objNew=null;

		for(int i=0; i<elements.size(); i++){
			if(!elements.contains(setX.getElements().get(i))){
				objNew.getElements().add(setX.getElements().get(i));
				objNew.setCardinality(1);
			}
		}
		return objNew;
	}
	//intersection
	public IntegerSet intersection(IntegerSet setX, String newName){
		IntegerSet objNew=null;

		for(int i=0; i<elements.size(); i++){
			if(elements.contains(setX.getElements().get(i))){
				objNew.getElements().add(setX.getElements().get(i));
				objNew.setCardinality(1);
			}
		}
		return objNew;
	}
	//symmetricDifference
	public IntegerSet symmetricDifference(IntegerSet setX, String newName){
		IntegerSet objNew=null;

		for(int i=0; i<elements.size(); i++){
			if(!elements.contains(setX.getElements().get(i))){
				objNew.getElements().add(setX.getElements().get(i));
				objNew.setCardinality(1);
			}
		}
		return objNew;
	}

	//Set
	public void setCardinality(int cardinality){
		this.cardinality+= cardinality;
	}

}