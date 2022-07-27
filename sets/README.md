![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/sets/image/header.png)

# Set

***  
<code>Set</code>s are <code>Iterable</code>s that contain no duplicate elements. The operations on sets are summarized in the following table for general sets and in the table after that for mutable sets. They fall into the following categories:

- **Test** <code>contains</code>, <code>apply</code>, <code>subsetOf</code>. The <code>contains</code> method asks wheter a set contains a given element. The <apply> method for a set is same as <code>contains<code>, so <code>set(elem)</code> is the same as <code>set contains elem</code>. That means sets can also be used as test function thta return tru fo the elements they contain.

For example:

```
val fruit = Set("apple", "orange", "peach", "banana")
fruit("peach")
fruit("potatoe")
```

![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/sets/image/hierarchy.png)

- **Addition** <code>+</code> and <code>++</code>, which add one or more elements to a set, yielding a new set.
- **Removals** <code>-</code>, <code>--</code>, which remove one or more elements from a set, yielding a new set.
- **Set operation** for union, intersection, and set difference. Each of these operation exits in two forms: alphabetic and symbolic. The alphabetic version are <code>intersect</code>, <code>union</code>, <code>diff</code>, whereas the symbolic version are <code>&</code>, <code>|</code>, and <code>&~</code>. Infact, the <code>++</code> that <code>Set</code> inherits from <code>Iterable</code> can be seen as yet another alias of <code>union</code> or <code>|</code>, except that <code>++</code> takes an <code>IterableOnce</code> argument whereas <code>union</code> and <code>|</code> take sets.

#### Operations in Class Set

**WHAT IT IS** 			**WHAT IT DOES**

**Test:**

<code>xs contains x</code>	//Tests wheter <code>x</code> is an element of <code>xs</code>.

<code>xs(x)</code>			//Same as <code>xs contains x</code>.

<code>xs subset ys</code>	//Test whether <code>xs</code> is a subset of <code>ys</code>.

***

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

