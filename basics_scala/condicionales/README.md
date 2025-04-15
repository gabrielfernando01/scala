![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/image/header_cond.jpeg)

## Proyectos

Ya con nuestro IDE instalado vamos empezar usarlo. Damos clic en <code>File > New Project > Scala > IDEA</code> y le damos en Project Name: HolaScala.

![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/image/holaScala.png)

En el directorio <code>src</code> damos clic derecho <code>New > Scala Class > Scala Object</code>

### «Hello world»

```
object Hola Scala{
    def main(args: Array[String]): Unit = {
        println("Welcome, hello world!")
    }
}
```

## El condicional IF en Scala

De ahora en adelante se hará uso de los ficheros worksheet por lo que cuando sea necesario se harán las respectivas capturas de pantalla o se capturara el código:

Sintaxis del condicional if:

```
if (<condicion>){
    <bloque de codigo> 
}
else{
    <bloque de codigo>
}
```

![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/condicionales/image/simple_if.png)

Ejemplo <code>condicional.scala</code>:

```
val k = 10

if (n == 10) {
	println("n es igual a diez")
} else {
	println("n no es igual a diez")
}
```

#### Un caso sencillo de MATCH

Los ejemplos los revisamos en el fichero <code>condicional.scala</code>. 

![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/condicionales/image/match.png)

### El bucle «while»

La sintaxis es la siguiente:

```
while (<condicion>){
    <bloque de codigo>
}
```

Es decir la condición por defecto es verdadera, mientras siga siendo verdadera ejecutara el bloque de código.

**Bucle «do-while»**

### El sistema de tipos

Recordemos los tipos de variable:

```
1		//Int = 1
1L		//Long = 1
4.0		//Double = 4.0
4.0f		//Float = 4.0
true		//Boolean = true
'c'		//Char = c
```

**El objeto <code>AnyVal</code>**

Tipos de <code>AnyVal</code>: <code>Int</code>, <code>Long</code>, <code>Double</code>, <code>Short</code>, <code>Char</code>, <code>Boolean</code>, <code>Unit</code>. Existe otro tipo llamado <code>AnyRef</code>.

### Colecciones

Veamos la diferencia de una clase en Java contra una en Scala:

![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/condicionales/image/versus.png)

Este tema solo se comenta por que aún no hemos formalizado la parte de Listas, ArrayList, etc. Por ahora se comparte la imagen de la jerarquía para el tipo de dato <code>Any</code>.

![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/condicionales/image/hierarchy,png)

### Funciones básicas de una colección

```
val frutas = Array("apple", "banana", "pear")

frutas.apply(0)
frutas(1)
```
