// For Loops and Switch Case in Kotlin
val hashMapOfNamesandAge= mapOf<String,Int>("Tanishq" to 20,"Saksham" to 20,"Varun" to 22)
val mapofdetails= mapOf<Any,Any>( 1 to mapOf<Any,Any>("NAME" to "Tanishq","Age" to 20,"Profession" to "Student","Nationality" to "Indian","Hobby" to "Android Development")
                                  ,2 to mapOf<Any,Any>("NAME" to "Saksham","Age" to 20,"Profession" to "Student","Nationality" to "Indian","Hobby" to "Android Development")
                                  ,3 to mapOf<Any,Any>("NAME" to "Varun","Age" to 22,"Profession" to "Student","Nationality" to "Indian","Hobby" to "Coding"))

val numberList= listOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)

fun main(){
    // I : forEach loop in kotlin - iterates through all the objects in a collection
    println("Printing details through forEach loops\n")
hashMapOfNamesandAge.forEach{ Name ,  Age ->
    println(Name + ": " + Age)
}

mapofdetails.forEach{
    println(it)
    // 'it' collects the entire collection in the Hashmap and print them serially
}
    println("\nPrinting details through primitive for loops\n")


for(details in mapofdetails){
    println(details)
}


 mapofdetails.forEach{
     println("\n"+it)
 }

    for(name in hashMapOfNamesandAge){
        println(name)
    }

    for (number in numberList){
        println(number)
    }

    for (x in 0..10){
        println(x)
    }

    for(y in 0 until 5){
        println(y)
    }

    //giving increments in for loop
    for( x in 0 until 10 step 2){
        println(x)
    }

    // giving decrements in for loop

    for(x in 10 downTo 0 step 2){
        println(x)
    }

    // Special Keywords in Kotlin
    // 1. as -  it casts a variable into specific type
    val any:Any ="Tanishq Sehgal"
    val any2:Any= any as String

    // 2. in - used to specify an object in a particular range, specifies the object being iterated in a loop, used as an infix operator to check that a value belongs to a range or a collection of entities, used in when expressions
    for(x in 5 downTo 0 step 2){
        println(x)
    }
    //3. is - used in check expressions
       if(any is String){
           println(any.length)
       }

    // switch case in kotlin - when function
    when(any){
        "Sehgal"->{
            println("Partially Matched")
        }
        "Tanishq"->{
            "Partially Matched"
        }
        "Tanishq Sehgal"->{
            println("Matched")
        }
        else ->{
            println("Invalid Name")
        }
    }

    // returning a value from when statement
  val myName:Any="Tanishq"
   val name= when(myName){
        "Sehgal"-> "Tanishq $myName"
        "Tanishq"-> "$myName Sehgal"
       "Coder" -> "$myName"
        else -> "Invalid Name"
    }
    println(name)
}

