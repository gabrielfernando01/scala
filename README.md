![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/image/cover.png)

# Scala languange programming

En este repositorio trata de los primeros pasos en Scala, los ejemplos que se exponen tienen como recursos.

- 🟥 Scala 2.13.4
- 🟧 Itellij IDEA
- 🔌 Pluggin Scala y SBT Ejecutor
- 🐧 Kubuntu 24.04.2

## Instalación Scala 🟥 en Ubuntu 🐧.

En el terminal ingresamos:

```
$ sudo apt install scala
$ scala -version
```

## Instalación de Intellij IDEA 🟧.

En el terminal ingresamos:

```
$ wget https://download.jetbrains.com/idea/ideaIC-2021.2.3.tar.gz
$ tar -zxvf ideaIC-*.tar.gz
$ sudo mkdir /opt/idea/
$ sudo chmod 777 /opt/idea/
$ mv ideaIC-*/* /opt/idea/
```

Cambiamos de directorio para ejecutar el script:

```
$ cd /opt/idea/ideIC-*/bin
prompt:/opt/idea/bin$ sh idea.sh 
```

Para asignarle el lanzador, debes entrar a <code>setting</code> y eligen <code>Desktop entry</code>.

## Pluggin para Scala 🟥 y SBT Ejecutor 🔌,

Entra a <code>settings</code> posteriormente a <code>Pluggins</code>, es decir, Settting > Pluggins. Ahí se instalan tanto el puggin de Scala como el interprete SBT Ejecutor.

### Configurar y hacer nuestro primer «Hello world!».

Abrimos Intelliji IDEA damos clic a <code>File > New Project > Scala > SBT</code>:

![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/image/sbt.png)

En el directorio <code>src</code> damos clic derecho y elegimos <code>Scala Class</code>, y le damos de tipo <code>object</code>

![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/image/object.png)

Como mi Clase objeto es <code>HelloWorld</code> en la Configuración elijo como Main Class: HelloWorld

![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/image/main.png)

### Worksheet

El pluggin de Scala nos ofrece los Scala Worksheets, para mostrar su funcionalidad en el directorio <code>src</code> damos clic derecho y elegimos <code>New > Scala Worksheet</code> en Name Worksheet encribimos el nombre de nuestro <code>fichero.sc</code>

![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/image/worksheet.png)

***
### Introduction

**Example:** Here's one line of code that demostrates many of the advantages of Scala's collections.

```
val (miniors, adults) = people partition (_.age < 18)
```

It's immediately clear what this operation does: It partitions a collection of <code>people</code> into <code>miniors</code> and <code>adults</code> depending on their age. Because the <code>partition</code> method is defined in the root collection tye <code>TraversableLike</code>, this code works for any kind of collection, including arrays. The resulting <code>miniors</code> and <code>adults</code> collection will be of the same type as the <code>people</code> collection.