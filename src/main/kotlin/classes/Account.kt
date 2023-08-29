package classes

class Account(val accountNumber: String = "", val accountOwner: String = "") {

    private var balance: Double = 0.0

    constructor() : this("", "") {
        println("constructor()")
    }

    constructor(accountNumber: String, accountOwner: String, balance: Double) : this(accountNumber, accountOwner) {
        this.balance = balance
    }

    fun deposit(amount: Double) {
        balance += amount
    }

    fun deposit(amount: Int) {
        balance += amount
    }

    fun print() {
        println("Number: $accountNumber; Owner: $accountOwner; Balance: $balance")
    }

    fun m1(a: Int): Int {
        return 10
    }

    fun m2(a: Int, b: Int): Int {
        return 10
    }
}