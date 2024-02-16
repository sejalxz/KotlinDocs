package `01 Basics`.`03 Equality Operators`

fun main(){
// There are two types of eqiality operators
// 1. == --> used for structural equality i.e. it checks if the value of the properties is same
// 2. === --> used for referential equality i.e. it checks if the instances are same
    // Similarly, we also have != & !==

    // Note :
        // obj1.equals(obj2) : here .equals method internally uses ==, that is structural equality, unlike in java where .equals is referential equality


    val emp1 = Employee("Mary", 1)
    val emp2 = Employee("John", 2)
    val emp3 = Employee("John", 2)
    val emp4 = emp2

    println("Structural Equality")
    println(emp1 == emp2)
    println(emp2 == emp3)
    println(emp3 == emp4)

    println("Structural Equality using .equals()")

    println(emp1.equals(emp2))
    println(emp2.equals(emp3))
    println(emp3.equals(emp4))


    println("Referential Equality")
    println(emp1 === emp2)
    println(emp2 === emp3)
    println(emp2 === emp4)

}

class Employee(var name: String, val id: Int){
    override fun equals(obj: Any?): Boolean {
        if(obj is Employee){
            return name == obj.name && id == obj.id
        }
        return false
    }

}