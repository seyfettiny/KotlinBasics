package Classes

//  All abstract properties or functions must be implemented in the concrete class.
//  If an abstract class extends another abstract class, it does not have to implement
//  all the abstract properties or functions of the parent class.
//  If there are optional properties or functions, they can use open keyword.
//  Abstract functions do not have bodies.
//  Abstract properties do not have default values.
//  Abstract classes can not be instantiated. Due to this, abstract classes are can be used for singleton pattern.

abstract class McDonalds {
    abstract val fridge: Fridge
    abstract val supervisor: Supervisor
    abstract val employeeOne: Employee
    abstract val employeeTwo: Employee
    abstract val menu: List<Burger>

    abstract fun clean(clock: Int)

    //  Optional
    open val employeeCount: Int = 2
}

abstract class McDonaldsExpress : McDonalds() {
    abstract fun sellCoffee(): Coffee

    //  With that override, child classes that extends McDonaldsExpress does not have to
    //  implement clean() function.
    //  But if we do not want this function to be implemented in child classes, we can use final keyword.
    //  Such as: final override fun clean(clock: Int) {}
    override fun clean(clock: Int) {
        println("Clean time $clock")
    }
}

class McDonaldsFranchise : McDonaldsExpress() {
    override val fridge: Fridge = Fridge()
    override val supervisor: Supervisor
        get() = Supervisor()
    override val employeeOne: Employee = Employee()
    override val employeeTwo: Employee = Employee()
    override val menu: List<Burger> = listOf(Burger(), Burger())
    override fun sellCoffee(): Coffee = Coffee()
}

fun main() {
    val franchise = McDonaldsFranchise()
    franchise.clean(10)
}

class Fridge
class Coffee
class Supervisor
class Employee
class Burger
