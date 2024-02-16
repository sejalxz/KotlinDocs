package Challenges

import java.util.*
import kotlin.coroutines.coroutineContext

fun main(){
    val hello1 = "Hello"
    val hello2 = "Hello"

    // Referential equality check
    println(hello1 === hello2) // string literals are same with same value since they are immutable// Referential equality check

    // Structural equality check
    println(hello1 == hello2) // string literals are same with same value since they are immutable

    var number = 2988
    println(number)

    val text: Any = "The any type is the root of the Kotlin class hierarchy"
    if( text is String){
        println(text.uppercase(Locale.getDefault()))
    }

    println("""   1
        |  11
        | 111
        |1111
    """.trimMargin())

    println("""1   1
1  11
1 111
11111
    """.trimMargin("1"))
}