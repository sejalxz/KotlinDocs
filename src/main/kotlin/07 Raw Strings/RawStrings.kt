package `07 Raw Strings`

fun main(){

    // Triple Quotes / Raw Strings
    // 1. Can be used for file paths
    // 2. Can be used for strings container new lines

    val filePath1 = "C:\\Desktop\\Project"
    val filePath2 = """C:\Desktop\Project"""

    println()
    println(filePath1)
    println(filePath2)
    println()

    val nurseryRhyme = """Twinkle Twinkle Little Star
                            How I Wonder What You Are
                Up Above The World So High
                Like A Diamond In The Sky
    """
    println(nurseryRhyme)
    println()

    val star = "Twinkle"

    // | is the default character
    val nurseryRhyme3 = """$star $star Little Star
                            |How I Wonder What You Are
                |Up Above The World So High
                |Like A Diamond In The Sky
    """.trimMargin()


    println(nurseryRhyme3)
    println()

    val nurseryRhyme2 = """Twinkle Twinkle Little Star
                          *How I Wonder What You Are
                          *Up Above The World So High
                          *Like A Diamond In The Sky
    """.trimMargin("*")
    println(nurseryRhyme2)
}