fun main(args: Array<String>) {
 val result= fizzBuzz(1)
print(result)
}

fun fizzBuzz(numbrer: Int) : String{

    return when{
        numbrer % 3 == 0 && numbrer % 5 == 0 -> "FizzBuzz!"
        numbrer % 3 == 0 -> "Fizz!"
        numbrer % 5 == 0 -> "Buzz!"
        else -> "No es multiplo"

    }

}