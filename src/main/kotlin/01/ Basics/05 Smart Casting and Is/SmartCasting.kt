package `01`.` Basics`.`05 Smart Casting and Is`

fun main(){
    // In java, we use to cast like this : emp4 = (Employee) emp1
    // or number = (String) number2

    val emp1 = Employee("Mary", 1)
    val emp2 = Employee("John", 2)

    // In Kotlin, we use 'is' keyword to check for instances. 'is' keyword is similar to instance of in Java
    val something: Any? = emp2

    // In Kotlin, we use 'as' keyword for casting.
    if(something is Employee){
        var newEmp = something as Employee

        // but here 'as Employee' is useless because Kotlin has Smart Casting, due to which whenever we compare any variable
        // using is it casts its type. Thus, we need not use newEmp and 'as' keyword anymore
        // hence, we can refer to variable ('something') directly as an instance of Employee

        println(something.name)
    }

}

class Employee(var name: String, val id: Int){
    override fun equals(obj: Any?): Boolean {
        if(obj is Employee){
            return name == obj.name && id == obj.id
        }
        return false
    }

}