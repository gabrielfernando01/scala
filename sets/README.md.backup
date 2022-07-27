![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/sets/image/header.png)

# Set
## Sets. Parte 1.

Los set son otro tipo de contenedores que aceptan operadores lógicos:

```
val set = Set(1, 2, 3)
set intersect Set(3, 4)
set & Set(3, 4)           //es equivalente a «intersect»
set union Set(3, 4)
set diff Set(3, 4)
```

## Sets mutables. Parte 2.

Los conjuntos anteriores son inmutables, para hacerlos mutables importamos la librería:

```
import scala.collection.mutable

object HolaScala{
    val mset=mutable.Set(1,2,3)
    mset + 4
    mset += 4
    mset
}
```

Concatenar un par de sets:

```
val mset = mutable.Set(1, 2, 3)
mset ++= Set(4, 5)

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
```

## Sorted Set. Parte 3.

Cuando instanciamos un objeto de tipo <code>Set</code> Scala lo define en manera desordenada por defecto, para ordenar importamos la librerŕia <code>import scala.collection.immutable</code>.

Por ejemplo para pedirle a Scala un Set ordenado inverso:

```
import scala.collection.immutable

val set = Set(1,2,3,4,5,6)

val mayorAMenor = Ordering.fromLessThan[Int]( _>_)
val sortedSetInverso = immutable.SortedSet.empty(mayorAMenor) ++ set
```

# Creando Mapas

<code>HashMap</code> en Scala:

- Java: HashMap, Map
- Python: Diccionarios
- Ruby: Hashes

Vamos a tener:

```
// Claves <- A
// Valores <- B
// (CLAVE -> VALOR)
```

Los ejemplos sobre la clase <code>Map</code> se ve en el fichero <code>sets.scala</code>.

## Mapas operaciones

Agregar elementos a <code>Map</code>:

```
val mapa = Map(1 -> "Luis", 2 -> "Marisol")
map + (3 -> "Andrés", 4 -> "Cassandre")
```

Eliminar elementos:

```
val mapa = Map(1 -> "Marisol", 2 -> "Karla", 3 -> "Paola")
mapa - 3
```

Concatenar dos mapas:

```
val map1 = Map(1 -> "Mercedes", 2 -> "Toyota", 3 -> "Audi")
val map2 = Map(3 -> "BMW", 4 -> "VW", 5 -> "Nissan", 6 -> "Ferrari")

map1 ++ map 2
```

