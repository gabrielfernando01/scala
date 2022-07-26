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



