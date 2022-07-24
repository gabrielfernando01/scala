![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/image/header_scala.png)

# Scala languange programming

Este repositorio trata de los primeros pasos en Scala, los ejemplos que se exponen tienen como recursos.

- Scala 2.13.4
- Itelliji IDEA
- Pluggin Scala y SBT Ejecutor
- Ubuntu 20.04

## Instalación Scala en Ubuntu

En el terminal ingresamos:

```
$ sudo apt install scala
$ scala -version
```

## Instalación de Intelliji IDEA

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
prompt:/opt/idea/bin $ sh idea.sh 
```

Para asignarle el lanzador, debes entrar a <code>setting</code> y eligen <code>Desktop entry</code>.

## Pluggin para Scala y SBT Ejecutor

Entra a <code>settings</code> posteriormente a <code>Pluggins</code> es decir, Settting > Pluggins. Ahí se instalan tanto el puggin de Scala como el interprete SBT Ejecutor.

