import kotlin.math.sqrt

// Functions in Kotlin



fun main(){

    println(getName())
    println(square(10))
    println(square2(5))
    println(getUser("Tanishq",20,true))  // positional arguments
    println(defaultUser("Tanishq Sehgal")) // default arguments
    println(defaultUser(name="Tanishq Sehgal", age = 20, isActive = true ))  // named arguments

}

fun getName():String{
    return "Tansihq Sehgal"
}

fun square(number: Int): Int {
    return number*number
}

fun square2(number:Int):Int=number*number

/*
Types of arguments in functions
1. Positional Arguments
2. Default Arguments
3. Named Arguments
4. Variable length arguments
 */
//1.
fun getUser(name:String,age:Int,isActive:Boolean){
    println("Name: $name")
    println("Age: $age")
    println("Is Active? $isActive")
}

//2.

fun defaultUser(name:String,age: Int=18,isActive: Boolean=false){
    println("Name: $name")
    println("Age: $age")
    println("Is Active? $isActive")
}

fun VarArgFunction(vararg number: Int){
    print(number.size)
    for (num in number)  print(num)
}

fun Int.triple(): Int { return this * 3 } var result = 3.triple()

