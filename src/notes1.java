// List is made of data (single column of data)
// Map is made of keys & values (two columns of data) *index's turn into keys*
// values are the data stored in the map
//Each value has a key

//Example: state capitals
/**
Keys			Values
Pennsylvania	Harrisburg
New Jersey		Trenton
Delaware		Dover
Maryland		Annapolis
Florida			Tallahassee
**/
// if you provide a map with a key you get the value but not vice versa

//Two types of maps

// Hash Map - 
/**
HashMap<*String,**String> capitals; (*-Key type, **-Value type)
capitals = new HashMap<String,String>();
capitals.***put***("Florida","Tallahassee");
System.out.println(capitals.***get***("*Delaware"); (prints Dover) (*-key)
capitals.***remove***("New Jersey");

if(capitals.***containsKey***("Wyoming")){
	System.out.println("Wyoming is in Remap.");
}
for(String s:capitals.***keySet***()){
	System.out.println(s); (prints all states)
}
for(String v: capitals.***values***()){
	System.out.println(v); (prints all state capitals)
}
**/

// Tree Map - 
/**

**/