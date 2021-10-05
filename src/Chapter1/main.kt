package Chapter1

data class Person(val name:String, val age:Int?=null)

fun main() {
    val persons = listOf(Person("A"), Person("B", 12))
    val oldest = persons.maxByOrNull { it.age ?: 0 }
    println(oldest)
}
