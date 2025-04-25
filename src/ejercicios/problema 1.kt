package `problema`
fun main(){
 print("Ingresa el primer numero:")
 val num1 = readline()?.toIntOrNull() ?: 0
print("Ingresa el segundo numero:")
val num2 = readline()?.toIntOrNull() ?: 0
val mayorValorAbsoluto = if (kotlin.math.abs(num1) >=kotlin.math.abs(num2)) num1 else num2

     println("El numero con mayor valor absoluto es: $mayorValorAbsoluto")
}