fun main() {
    val res : Int? = calc(1,2,3, {num1 : Int, num2 : Int, num3 : Int -> (num1+num2+num3)});
    print("Result = $res");
}

fun calc(num1 : Int, num2 : Int, num3 : Int, calcFunction : (Int,Int,Int) -> Int) : Int {
    return calcFunction(num1,num2,num3);
}


// Output

// Result = 6
