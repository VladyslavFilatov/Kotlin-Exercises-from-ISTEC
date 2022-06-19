package topics

fun main() {
    val  child = Person ("Child", "Child", 1)
    val  p1 = Person ("Tom", "Jones", 35, child)
    print(p1.firstName)

    val rectangle1 = Rectangle(5.0, 2.0)
    println(" The perimeter is ${rectangle1.perimeter}")

    val  rectangle2 = Rectangle(5.0, 2.0)
    println(rectangle1 == rectangle2) // true
}

// Primary Constructor
class Person(val  firstName: String, val  lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf() // ArrayList

    init {
        println("Person is created $firstName")
    }

    constructor(firstName: String, lastName: String, age: Int, child: Person):
            this(firstName, lastName, age) {
                children.add(child)
            }

    // constructor without arguments
    constructor(): this("", "", -1)
}

data class Rectangle(var height: Double, var lenght: Double) {
    var  perimeter = (height + lenght) * 2

    var  test = 1
        get() = field + 1 // field = this
    set(value) {
        if (value < 0) println("Negative value")
    }

    fun  area() = height * lenght
}