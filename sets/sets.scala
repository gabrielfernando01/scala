//Sets
val set = Set(1, 2, 3, 6, 2)
set.contains(3)
set contains (3)
set 3

val set = Set(1, 2, 3)
set + 4
set
set ++ Set(4, 5, 6)
set - 2
set -- Set (1, 2, 5)

val set = Set(1, 2, 3)
set intersect Set(3, 4)
set & Set(3, 4)           //es equivalente a «intersect»
set union Set(3, 4)
set diff Set(3, 4)

//Sets mutables
import scala.collection.mutable

object HolaScala{
    val mset = mutable.Set
    mset + 4
    mset += 4
    mset
}

//concatenar un par de sets
val mset = mutable.Set(1, 2, 3)
mset ++= Set(4, 5)

//operadores para quitar elementos de los sets
val mset = mutable.Set(1, 2, 3)
mset - 2
mset -= 2

//operacion retain
val mset = mutable.Set(1, 2, 3)
mset retain { x => x % 2 == 0 }
mset

//operacion filter, no cambia al original
val mset = mutable.Set(1, 2, 3)
mset filter { x => x % 2 == 0 }

//========================================================
//Sorted set
import scala.collection.immutable

val set = Set(1,2,3,4,5,6)

val sset = immutable.SortedSet(1,2,3,4,5,6)

//conjunto inversamente ordenado
import scala.collection.immutable

val set = Set(1,2,3,4,5,6)

val mayorAMenor = Ordering.fromLessThan[Int](_>_)
val sortedSetInverso = immutable.SortedSet.empty(MayorAMenor) ++ set

//=============================================================
//Creando mapas
// Claves <- A
// Claves <- B
// (CLAVES -> VALOR)

//Int -> String
//String -> Int
//String -> String
//String -> ClasePropia

//======================================================================
//mapas inmutables
val mapa = Map(1 -> "Jose", 2 -> "Raul", 3 -> "Laura", 4 -> "Monserrat", 5 -> "Rebeca")
mapa.keySet     //las claves no se pueden repetir
mapa.values     //los valores si se pueden repetir

mapa.get(2)
mapa(5)

mapa.getOrElse(9, "No existe")
mapa.getoOrElse(11, null)

mapa.contains(9)

//======================================================================
//Mapas. Parte 2
val mapa = Map(1 -> "Jose", 2 -> "Raul")

//incorporar elementos a la clase Map
mapa + (3 -> "Paola", 4 -> "Cassandre")

//eliminar duplas en Map
val map = Map(1 -> "Francisca" 2 -> "Soledad" 3 -> "Marisol")

map - 3

//concatenar en Map
val map1 = Map(1 -> "Mercedes", 2 -> "Toyota", 3 -> "Audi")
val map2 = Map(3 -> "BMW", 4 -> "VW", 5 -> "Nissan", 6 -> "Ferrari")

map1 ++ map 2

//=======================================================================
//mutable map
import scala.collection.mutable

val mapa = mutable.Map(1 -> "Renault", 2 -> "BMW")

mapa += (3 -> "Cavalier")

//también se puede escribir:
val mapa = mutable.Map(1 -> "Toyota", 2 -> "Mercedes")
mapa.put(2, "Ferrari")
mapa

//una forma economica de escribirlo
val mapa = Map(1 -> "Marisol", 2 -> "Paola")
mapa(3) = "Cassandre"
mapa

//eliminar en Mapas mutables

