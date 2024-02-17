package tech.waxc

fun main() {
    println("Hello World123!")
    add(1, 3)
    sub(2, 3)
    multiply(2, 3)
    squareroot(2)
}

fun add(a: Int, b: Int) {
    println("not implement")
}

fun sub(a: Int, b: Int) {
    println("not impl")
}

/**
 * Multiplies two integers.
 *
 * @param a The first integer.
 * @param b The second integer.
 * @return The result of multiplying a and b.
 */

/**
 * Multiplies two integers.
 *
 * @param a The first integer.
 * @param b The second integer.
 * @return The result of multiplying a and b.
 */
fun multiply(a: Int, b: Int): Int {
    val result = a * b
    println("Multiplying $a and $b to get $result")
    return result
}

/**
 * Function to divide two numbers
 * @param a the numerator
 * @param b the denominator
 * @return the result of the division
 * @throws IllegalArgumentException if b is zero
 */
fun divide(a: Int, b: Int): Int {
    require(b != 0) { "Cannot divide by zero" }
    val result = a / b
    println("Dividing $a and $b to get $result")
    return result
}

fun squareroot(a: Int): Int {
    val result = Math.sqrt(a.toDouble())
    println("Square root of $a is $result")
    return result.toInt()
}

fun  calculateSquareRootBynewtonsMethod(a: Int): Int {
    val result = Math.sqrt(a.toDouble())
    println("Square root of $a is $result")
    return result.toInt()
}


fun calculatepowerof(a: Int, b: Int): Int {
    val result = Math.pow(a.toDouble(), b.toDouble())
    println("Power of $a and $b is $result")
    return result.toInt()

}