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
		
		for(int i=0; i<elements.size() || i<setX.getElements().size(); i++){
			if(elements!=null && setX.getElements()!=null){
				if(i>=setX.getElements().size()){
					objNew.getElements().add(elements.get(i));
				}else if(i>=elements.size()){
					objNew.getElements().add(setX.getElements().get(i));
				}else if(elements.get(i)==setX.getElements().get(i) ){
					objNew.getElements().add(elements.get(i));
				}
				if(i<setX.getElements().size() && i<elements.size() && elements.get(i)!=setX.getElements().get(i) ){
					objNew.getElements().add(elements.get(i));
					objNew.getElements().add(setX.getElements().get(i));
				}
			}
		}
		for(int j=0; j<objNew.getElements().size(); j++){
			if(objNew.getElements().indexOf(objNew.getElements().get(j))!=objNew.getElements().lastIndexOf(objNew.getElements().get(j)))
				objNew.getElements().remove(objNew.getElements().get(j));
		}
		objNew.setCardinality(1);
		return objNew;
	}
	//Difference
	public IntegerSet difference(IntegerSet setX, String newName){
		IntegerSet objNew=  new IntegerSet(newName);
		objNew.setElements(elements);

		for(int i=0; i<elements.size() || i<setX.getElements().size(); i++){
			if(elements!=null && setX.getElements()!=null){

				if(i>=elements.size()){
					if(objNew.getElements().contains(setX.getElements().get(i)) ){
						objNew.getElements().remove(setX.getElements().get(i));
					}

				}
				else if(i>=setX.getElements().size() && elements.get(i)==setX.getElements().get(i) ){
					objNew.getElements().remove(elements.get(i));
				}
			}
		}
		for(int j=0; j<objNew.getElements().size(); j++){
			if(objNew.getElements().indexOf(objNew.getElements().get(j))!=objNew.getElements().lastIndexOf(objNew.getElements().get(j)))
				objNew.getElements().remove(objNew.getElements().get(j));
		}
		objNew.setCardinality(1);

		return objNew;
	}
	//intersection
	public IntegerSet intersection(IntegerSet setX, String newName){
		IntegerSet objNew=new IntegerSet(newName);

		for(int i=0; i<elements.size() || i<setX.getElements().size(); i++){
			if(elements!=null && setX.getElements()!=null){
				if(i<setX.getElements().size() && i<elements.size() && elements.get(i)==setX.getElements().get(i) ){
					objNew.getElements().add(elements.get(i));
					objNew.getElements().add(setX.getElements().get(i));
				}
			}
		}
		for(int j=0; j<objNew.getElements().size(); j++){
			if(objNew.getElements().indexOf(objNew.getElements().get(j))!=objNew.getElements().lastIndexOf(objNew.getElements().get(j)))
				objNew.getElements().remove(objNew.getElements().get(j));
		}
		objNew.setCardinality(1);
		return objNew;
	}
	//symmetricDifference
	public IntegerSet symmetricDifference(IntegerSet setX, String newName){
		IntegerSet objNew=new IntegerSet(newName);

		for(int i=0; i<elements.size() || i<setX.getElements().size(); i++){
			if(elements!=null && setX.getElements()!=null){
				if(i>=setX.getElements().size()){
					objNew.getElements().add(elements.get(i));
				}else if(i>=elements.size()){
					objNew.getElements().add(setX.getElements().get(i));
				}	
				if(i<setX.getElements().size() && i<elements.size() && elements.get(i)!=setX.getElements().get(i) ){
					objNew.getElements().add(elements.get(i));
					objNew.getElements().add(setX.getElements().get(i));
				}
			}
		}
		for(int j=0; j<objNew.getElements().size(); j++){
			if(objNew.getElements().indexOf(objNew.getElements().get(j))!=objNew.getElements().lastIndexOf(objNew.getElements().get(j)))
				objNew.getElements().remove(objNew.getElements().get(j));
		}
		objNew.setCardinality(1);
		return objNew;
	}
	//Set
	public void setCardinality(int cardinality){
		this.cardinality+= cardinality;
	}
	public void setElements(ArrayList<Integer> elements){
		this.elements=elements;
	}

}