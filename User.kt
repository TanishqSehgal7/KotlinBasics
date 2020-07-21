fun main(){

    // creating the object of this class
    val account:Account=Account()
    account.newAccount(77777,"Tanishq Sehgal",20000f)
    account.deposit(50000f)
    account.withDraw(20000f)
    account.withDraw(10000f)
    println(account.Amount)
    println("Account number:${account.account_no} , \n Account Holder Name:${account.Name}, Account Balance:${account.Amount}")

}


class Account {
    var account_no:Int=0
    var Name:String?=null
    var Amount:Float=0f


    fun newAccount(acc:Int,name:String,amount:Float){
        account_no=acc
        Name=name
        Amount=amount
    }

    fun deposit(money:Float){
        Amount+=money
        println(Amount)
    }

    fun withDraw(money:Float){

        if(Amount <money){
            println("Not enough money to withdraw.")
        }
        else{
            Amount-=money
            println(Amount)
        }
    }
}




