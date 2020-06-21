//Lists or Collections
//declaring a list
val listOfNames= listOf<String>("Tanishq","Saksham","Varun","Srishti","Saniya")
// by default : in kotlin lists are immutable - we don't have the "add" method
// multable lists - can be edited - declaration is as follows
var mutableListOfNames= mutableListOf<String>("Tanishq","Saksham","Varun","Srishti","Saniya","Aditya")
// arrayList is also by default mutable
var mutableArrayListOfNames= arrayListOf<String>("Tanishq","Saksham","Varun","Srishti","Saniya","Aditya","Tapas")
var mapOFNames= mapOf<Int,String>(1 to "Tanishq",2 to "Saksham",3 to "Varun",
    4 to "Srishti",5 to "Saniya")
var mapOfAge= mapOf<String,Int>("Tanishq" to 20,"Saksham" to 20,"Varun" to 20)
// Creating a HashMap of details
val mapOfDetails= mapOf<String,Any>("Name" to "Tanishq","Age" to 20,
    "Occupation" to "Student","Nationality" to "Indian","Interests" to "Android Dev,Coding,Football")
// map is immutable by default and HashMap is mutable by default


fun main(){
    // getting vales from the above defined lists and maps
    //printing the simple list (immutable)
    println(listOfNames)
    println("\n"+ "Printing mutable list of names" + "\n")
    println(mutableListOfNames)
    println("\n"+ "Printing mutable array list of names" + "\n")
    println(mutableArrayListOfNames)
    mutableArrayListOfNames.add("Aryan")
    println("Adding an element to the mutable array list of names")
    println(mutableArrayListOfNames)
    println("\n"+ "Printing map of names" + "\n")
    println(mapOFNames)
    println("\n"+ "Printing mutable list of age" + "\n")
    println(mapOfAge)
    println("\n" + "Printing the map of details"+ "\n")
    println("\n" + mapOfDetails)
    //getting a single entry from a map
    println(mapOfDetails["Name"])


}