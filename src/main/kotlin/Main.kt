fun main() {
    //quiz1
println(word("Happy"))
    //quiz4
    var currentAccount=CurrentAccount(12345556521,"Halima Moses",2000.00)
    currentAccount.deposit(590.00)
    currentAccount.withdraw(400.00)
    currentAccount.details()
    //quiz5
    var savingsAccount=SavingsAccount(5,3425666762,"Halima Moses",
        3000.00)
    println(savingsAccount.withdrawals)
    savingsAccount.deposit(234.00)
    savingsAccount.withdraw(287.00)
    savingsAccount.details()

}
//quiz1
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun word(name:String):Any {
    var vowels = arrayOf('a', 'e', 'i', 'o', 'u')
    for (n in name) {
        if (n in vowels) {
        }
    }
    return name[0]
    return "The length of the name string is"+ name.length
}
//quiz2
//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)
fun passWord(pass:String) {
    if (pass.length < 8) {
        println("valid")
    } else if (pass.length <= 16) {
        println("valid")
    }
}
//quiz3
//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun number(numbers:Int){

    }

//quiz4
//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)
open class CurrentAccount(var accountNumber:Long,var accountName:String,var balance:Double){
   open fun deposit(amount:Double){
        var deposit=balance+amount
        println(deposit)
    }
    open fun withdraw(amount:Double){
      var  withdraw=balance-amount
        println(withdraw)
    }
   open  fun details(){
        println("Account number is  $accountNumber with balance $balance is operated by  $accountName")
    }
}
//quiz5
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
class SavingsAccount(var withdrawals:Int,accountNumber: Long,accountName:
String,balance: Double):CurrentAccount(accountNumber,accountName,balance){
  override  fun withdraw(amount: Double){
      if(withdrawals<4){
          var  withdraw=balance-amount
          var new=withdrawals++
          println(withdraw)
          println(new)
      }

    }

    override fun deposit(amount: Double) {
        super.deposit(amount)
    }

    override fun details() {
        super.details()
    }

}

