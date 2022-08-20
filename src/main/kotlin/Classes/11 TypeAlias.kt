package Classes

//  typealias is only tagging, it does not create a new class.
//  There is no nested or local typealias in Kotlin.


typealias AccountReference = ProjectContractChargingPeriodTypeViewModel

fun main() {
    //  Won't compile.
    //  typealias AccountReference = ProjectContractChargingPeriodTypeViewModel

    val accountReference = AccountReference()
}

class ProjectContractChargingPeriodTypeViewModel