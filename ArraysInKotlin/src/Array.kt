val num=Array(5,{ i-> i*1 }) // array constructor
// the above expression creates an array of size 5 and initializes it to i*1
// the elements in the above array are: 0,1,2,3,4
//creating a null array
val nullArray= arrayOfNulls<String>(10)

fun main(){
//works on var args
//  [vararg] : tells that we can have n number of arguemnts inside any function
val array1= arrayOf(1,2,3,4,5) //inplicit declaration
 val array2=arrayOf<String>("1","2","3","4","5") //explicit declaration
// an array can also have multiple data type elements
    val array3= arrayOf("1",false,2,3.14,true,"Hello")
    println(array1)
    println(array2)
    println(array3)
    println(array1.size)
    println(array2.size)
    println(array3.size)
    //printing the elements of array constructor
    println(num[4])
    println(num.get(2))
    println(array3.get(5))
    //



}