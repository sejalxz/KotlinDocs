package `01 Variables Declarations`

fun main(args: Array<String>){
//    Two types of variables :
//    1. val : immutable
//    2. var : mutable

    val pie: Double = 3.1421
    val radius = 10
    var area : Double = pie * radius * radius

    println("Area : $area")

    val emp1 = Employee("Sejal", 23) // this is a val hence we cannot do emp1 = Employee('siya', 10)
    // but we can do this
    emp1.name = "Sejal Dahake" // since name property is var, we can update it

    val emp2: Employee
    val age = 18
    if(age < 20){
        emp2  = Employee("Intern: Siya", 21)
    }
    else{
        emp2 = Employee("Permanent: Siya", 32)
    }

}

class Employee(var name: String, val id: Int){

}