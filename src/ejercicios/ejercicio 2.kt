package `problema`
fun main(){
print "ingresa un numero entero positivo hasta 3 cifras"
val numero = readline()!!.toInt()
if (numero in 0..9)
println "tiene 1 cifra"
else if (numero in 10..99)
println "tiene 2 cifras"
else if (numero in 100..999"
println "tiene 3 cifras"
else
println "error el numero tiene mas de 3 cifras"


}