package machine

enum class CoffeeTypes(val water: Long, val milk: Long, val coffee: Long, val money: Long) {
    ESPRESSO(250, 0, 16, 4),
    LATTE(350, 75, 20, 7),
    CAPPUCCINO(200,100, 12, 6)
}

enum class CoffeeMachineActions(val actionName: String) {
    BUY("buy"), FILL("fill"), TAKE("take"), REMAINING("remaining"), EXIT("exit")
}

class CoffeeMachine(var water: Long, var milk: Long, var coffee: Long, var money: Long, var disposableCups: Long) {



    fun prepareCoffee(type: CoffeeTypes) {
        val haveEnoughResources = ((disposableCups > 0) and (water - type.water >= 0)
                and (milk - type.milk >= 0) and (coffee - type.coffee >=0))
        if (haveEnoughResources) {
            money += type.money
            disposableCups -= 1
            water -= type.water
            milk -= type.milk
            coffee -= type.coffee
        }
    }

    fun take(): Long {
        val takenMoney = this.money
        this.money = 0
        return takenMoney
    }

    fun addWater(moreWater: Long) {
        this.water += moreWater
    }

    fun addMilk(moreMilk: Long) {
        this.milk += moreMilk
    }

    fun addCoffee(moreCoffee: Long) {
        this.coffee += moreCoffee
    }

    fun addCups(moreCups: Long) {
        this.disposableCups += moreCups
    }

    fun printState() {
        println("")
        println("The coffee machine has:")
        println("$water ml of water")
        println("$milk ml of milk")
        println("$coffee g of coffee beans")
        println("$disposableCups of disposable cups")
        println("$money of money")
        println("")
    }
}

fun main() {

    val coffeeMachine = CoffeeMachine(water = 400L, milk = 540L, coffee = 120L, money = 550L, disposableCups = 9L)

    fun fill() {
        // Resources
        print("Write how many ml of water the coffee machine has: ")
        coffeeMachine.addWater(readLine()?.toLongOrNull() ?: 0)
        print("Write how many ml of milk the coffee machine has: ")
        coffeeMachine.addMilk(readLine()?.toLongOrNull() ?: 0)
        print("Write how many grams of coffee beans the coffee machine has: ")
        coffeeMachine.addCoffee(readLine()?.toLongOrNull() ?: 0)
        print("Write how many disposable cups of coffee do you want to add: ")
        coffeeMachine.addCups(readLine()?.toLongOrNull() ?: 0)
    }

    fun buy() {
        print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
        when(readLine()?.toIntOrNull()) {
            1 -> coffeeMachine.prepareCoffee(CoffeeTypes.ESPRESSO)
            2 -> coffeeMachine.prepareCoffee(CoffeeTypes.LATTE)
            3 -> coffeeMachine.prepareCoffee(CoffeeTypes.CAPPUCCINO)
            else -> println("Invalid option, try again")
        }
    }

    fun take() {
        println("I gave you $${coffeeMachine.take()}")
    }

    fun printCommandInstructions(): String {
        print("Write action (buy, fill, take, remaining, exit): ")
        return readLine().orEmpty()
    }

    // Main functionality
    var keepGoing = true
    while (keepGoing) {
        when (printCommandInstructions()) {
            "fill" -> fill()
            "buy" -> buy()
            "take" -> take()
            "remaining" -> coffeeMachine.printState()
            "exit" -> keepGoing = false
            else -> println("Invalid option")
        }
    }

}
