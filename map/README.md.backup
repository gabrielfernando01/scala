![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/map/image/header.png)

## El map

El tipo mapa en Scala nos permite convertir un el contenido de una lista en otro. Pensemos que tenemos una lista de números y que a partir de ella queremos obtener otra con el doble de cada elemento.

```
val numeros = list(3, 5, 12, 4)


numeros.map{ x => 2 * x}
```

![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/map/image/map.png)

Otro ejemplo con map:

```
val coches = List("BMW", "Mercedes", "Ferrari")

coches.map(coches => coches.toUpperCase())
coches.map { _.toLowerCase() }
coches.map { _.length }
```

## flatten() y flatMap()

<code>flatten</code> y <code>flatMap</code> son métodos que están pensados en listas de listas o colección de colecciones. Veamos 2 ejemplos:

```
val numeros = List(4, 8, 15, 16, 23, 42)

numeros.map {x => List(x, x * 2)}
```

Sabemos que un String es una cadena de caracteres, es decir, podemos pensar en ellos como <code>Array</code>.

```
val coches = List("BMW", "Nissan", "Toyota", "Mercedes", "Audi", "SEAT", "VW")

coches.flatMap { x => x.toUpperCase()}.distinct
```

