/**
 * Ex 2b - Pointers, arrows...
 */

class Person {
	int age;
	String name;
	Person father;
	Person mother;
}

Person john = new Person();
john.name = "John Smith";
john.age = 35;
Person mary = new Person();
mary.name = "Mary Smith";
mary.age = 32;
Person student = new Person();
student.name = "John Smith, Jr.";
student.age = 5;
student.father = john
student.mother = mary
println "TEACHER: How old are you, " + student.name + "?"
println "LITTLE JOHN: I am " + student.age + " years old, sir.";
println "TEACHER: Who is your mother?"
println "LITTLE JOHN: " + student.mother.name + ", sir.";

// Stack -------------------------------------------------------------- Heap //

// Object of type Person ----------------------------> 		String	name
// called John 			points to an object on the Heap 	"John Smith"
// 										|
// 										|					int		age
//										|						35

//--------------------------------------|------------------------------------//

// Object of type Person ---------------------------->		String	name
// called mary 												"Mary Smith"
//										|
//										|					int		age
//										|						32

//--------------------------------------|------------------------------------//

// Object of type Person ---------------------------->		String	name
// called student											"John Smitn, Jr."
//										|
//										|					int		age
//										|						5
//										|
//										|					Person	father
//										|						john
//										|
//										|					Person	mother
//										|						mary
