//usando un Scala workshet veamos los condicionales
val n = 3

if (n == 7)
  println("n no vale 5")
else if (n == 6)
  println("El numero no es 5, el númerro es 6")
else if (n == 2)
  println("El número n es: "+n+" de tipo entero")
else
  println("El valor de n es : "+n +" de tipo entero")

//===================================================================
val k = 10

println(if (k == 10) "k vale 10" else "k no vale 10")

//===================================================================
val k = 0

def kVal10(): String = if (k == 10) "k vale 10" else "k no vale 10"

kVal10()

//=====================================================================
//Un caso sencillo de Match
val mes = 6

mes match{
  case 1 => "Enero"
  case 2 =>  "Febrero"
  case 3 => "Marzo"
  case 4 => "Abril"
  case 5 => "Mayo"
  case 6 => "June"
  case 7 => "July"
  case 8 => "Agost"
  case 9 => "September"
  case 10 => "October"
  case 11 => "November"
  case 12 => "Dicember"
  case _=> "None"
}

//========================================================================
//Bucle while
var k = 0
while (k < 12){
  println(s"k vale : ${k}, el siguiente es ${k + 1}" )
  k=k+1
}

//==========================================================================
//Bucle do-while
var k = 20

do{
  println(s"k vale ${k}")
  k = k + 1 
} while(k < 20)

//============================================================================
//El sistema de tipos
/*
 * ANY
 * AnyVal: Int, Long, Double, Float, Byte, Short, Char, Boolean, Unit
 * AnyRef: 
 * */
/*
 *Null
 *Nothing
 */

//===============================================================================
//Colecciones
//Inmutables
//Mutables
//Importar paquetes para objetos mutables
import scala.collection.mutable

/*
 *        Traversable
 *            |
 *          Iterable
 *    ---------------------------
 *    Set         Map        Seq
 *                            |
 *                  -------------------------
 *                  IndexSeq        LinearSeq
 */

//================================================================================
//Funciones básicas de una colección
val frutas = Array("melon", "sandia", "naranja", "pera", "apple")
val frutas = Array(true, 4)

frutas.apply(0)
frutas(1)
