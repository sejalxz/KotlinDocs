package `02 Type Alias`

typealias EmployeeSet = Set<Employee>

fun main(){

    val emp1 = Employee("Sejal",1)
    val emp2 = Employee("Siya",2)

    val employees: EmployeeSet // Set of E

}

class Employee(var name: String, val id: Int){

}