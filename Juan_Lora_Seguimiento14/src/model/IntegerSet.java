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

	/*public IntegerSet union(IntegerSet set1, String newName){
		IntegerSet objNew;
		for(int i=0; i<elements.size(); i++){
			if(elements.get(i) == set1.elements.get(i)){
				objNew.elements.add(set1.elements.get(i)); 
			}
		}
		
	}*/

}