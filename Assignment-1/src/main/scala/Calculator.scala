class Calculator {
    def add(a: Int, b: Int): Int=a+b
    def subtract(a: Int, b: Int): Int=a-b
    def multiply(a: Int, b: Int): Int=a*b
    def divide(a: Double, b: Double): Option[Double]={
        if(b!=0)
            Some(a/b)
        else
            None
    }
}
