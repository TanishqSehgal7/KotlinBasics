import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker
fun main(){
    println(getname("- Android Development Enthusiast"){

    })
}
// higher order functions - they take up a function as an argument
fun getname(name:String, doNothing:(isActive:Boolean)-> Unit): String {
    if (name=="Sehgal") {
        doNothing(true)
    } else{
        doNothing(false)
    }
    return "Tanishq Sehgal $name"
}