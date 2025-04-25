package `problema`
fun main(){
print "total de preguntas"
val total = readline()!!.toInt()
print("respuestas correctas"
val correctas = readline()!!.toInt()
val porcentaje = correctas * 100.0 / total

println (when
porcentaje >= 90 –> "nivel maximo"
porcentaje >= 75 –> "nivel medio"
porcentaje >= 50 –> "nivel regular"
else "fuera de servicio"

}