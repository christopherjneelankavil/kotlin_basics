// basic function

fun main() {
    hello();
    var result : Int? = add(1,2,3);
    println("Sum = $result")
}

fun hello(){
    println("Hello World");
}

fun add(num1 : Int, num2 : Int, num3 : Int) : Int{
    return (num1+num2+num3);
}

