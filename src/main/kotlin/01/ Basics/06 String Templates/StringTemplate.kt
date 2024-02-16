package `01`.` Basics`.`06 String Templates`

fun main(){

    val emp = Employee("Sejal", 23)
    println(emp)

    val dollarBill = 100
    println("I have $dollarBill bill")

    // To avoid substitution
    println("I have \$dollarBill")
    println("I have $$dollarBill bill")

    println("Employee ID is : ${emp.id}")
}

class Employee(var name: String, val id: Int){
    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}