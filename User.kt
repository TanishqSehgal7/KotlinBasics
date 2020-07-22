import java.util.ArrayList

fun main(){

    // creating the object of this class
    val account:Account=Account(77777,"Tanishq Sehgal",20000f)
    val list= ArrayList<Int>(5)
    account.deposit(50000f)
    account.withDraw(20000f)
    account.withDraw(10000f)
    println(account.amount)
    println("Account number:${account.amount} , \n Account Holder Name:${account.name}, Account Balance:${account.amount}")

}

// this keyword -  points to the current receiver ie, it always points to the current class reference
/* constructors in a kotlin class-  a function that has the same name as that of the class, and is used to construct or initialize the class
 types of constructors -  1. Primary constructors ; 2. Secondary  constructors
 We can only have one Primary constructors while there can be multiple constructors*/

//primary constructors can also be written using the init blocks

/*
Secondary constructors - created using the keyword - constructor
 */

class Account  {

    var accNo:Int=1
    var name:String=""
    var amount:Float=0f

    init {
        this.accNo=accNo
        this.name=name
        this.amount=amount
    }

    constructor(accNo:Int){
       this.accNo=accNo
        name="Default"
        amount=0f
    }
    constructor(accNo:Int,name: String){
        this.accNo=accNo
        this.name="Default"
        this.amount=0f
    }
    constructor(accNo:Int,name: String,amount:Float){
        this.accNo=accNo
        this.name=name
        this.amount=amount
    }

    fun deposit(money:Float){
        amount+=money
        println(amount)
    }

    fun withDraw(money:Float){

        if(amount <money){
            println("Not enough money to withdraw.")
        }
        else{
            amount-=money
            println(amount)
        }
    }
}




