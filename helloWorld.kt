
import java.util.Scanner

fun main() {
    val myName: String = "Nathan"
    val prompt = Scanner(System.`in`)
    println("What is your name?")
    val yourName = prompt.nextLine().trim()
    println("Hello $yourName! My name is $myName.")
}
