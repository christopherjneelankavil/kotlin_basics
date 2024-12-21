fun main() {
    val sum = {num1 : Int, num2 : Int, num3 : Int -> (num1+num2+num3)}
    print("The sum = ${sum(0,1,2)}");
}
