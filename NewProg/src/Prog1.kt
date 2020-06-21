var f:String?="Tanishq Sehgal"
fun main(){
   // variables in kotlin - keywords val and var are used
    //val -> used for constant values
    //var -> used for the entities that are to be changes in a code
    val a ="Hello World!!"
    val j="Hello!"
    val b:Int=10  // this shows: the given type is redundant
    val c:Boolean=false
    val d:Float=10.0F
    // var can be re-assigned again whereas val can't be re-assigned
    // Late Initialization -  example
    println(a)
    println(b)
    println(f)
    val new=if (c) a else j
    println(new)
    val g:Int?=f?.length!! // !! used to check that the variable is not null
    // the elvis operator
    val size :Int =f?.length ?:0
    println(size)
    println(g)
    var z:Int=sum1(2,3)
    var x:Int=sum2(3,7)
    println(z)
    println(x)

}
// functions in kotlin

fun sum1(a:Int,b:Int):Int{
    return a+b
}

fun sum2(a:Int,b:Int):Int=a+b
