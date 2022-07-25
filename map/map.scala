//Encontrar el doble de los elementos de una lista
val numeros = list(2, 3, 5, 7)

numeros.map{x => x * 2}

numeros.map{x => x * x}

val coches => list("BMW", "Nissan", "Toyota")

coches.map(coches => coches.toUpperCase())

//============================================================
val coches => list("Seat", "VW", "Mercedes")

coches.map{ _.toUpperCase }
coche.map { _.toLowerCase }
coches.map{ _.length }

//==============================================================
//flatten y flatMap
val lista = List(List(1,3,4), List(4,2,5), List(3,2,4))

lista.flatten 

val lista = List(List(1,3,4), List(4,2,5), List(3,2,4))

lista.map {(x: List[Int]) => x.map {n => n * 2}} 

val lista = List(List(1,3,4), List(4,2,5), List(3,2,4))

lista.flatmap {(x: List[Int]) => x.map {n => n * 2}} 

//==============================================================
val numeros = List(4, 8, 15, 15, 23, 42)

numeros.map { x => List(x, x * 2)}

//Dado que los Strings son cadena de cadenas, se les considera arrays
val coche = List("BMW", "Mercedes", "Toyota", "Renault", "SEAT")

coches.flatMap { c => c.toUpperCase() }
coches.flatMap { c => c.toUpperCase() }.distict
