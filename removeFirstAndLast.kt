fun main(){
    println(removeChar("Hello World!"))
}

fun removeChar(str: String): String {
    return str.drop(1).dropLast(1)
}