![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/ingestas/images/cover.png)

# Ingestas de ficheros JSON con Spark-Scala en IntelliJ IDEA usando Maven 🪶.

Para crear el siguiente proyecto te comparto los recursos de mi ordenador para configurar correctamente el proyecto.

- 🟦 OS: Kubuntu 24.04
- ☕ Java JDK: openjdk 11.0.26
- 🟥 Scala version: 2.13.8
- 🪶 Maven version: 3.8.7
- 🔌 sbt version: 1.10.7
- 💥 Spark version: 3.5.1
- 🟧 IntelliJ IDEA: 24.1

***

## Paso 1. Configuración del entorno

1. Verifica la instalación de Java ☕, Scala 🟥, Maven 🪶 y Spark 💥.

Asegúrate de que todos los componentes están correctamente instalados y accesibles desde la terminal:

```
$ java -version
$ scala -version
$ mvn -version
$ spark-shell --version
```

Si alguno de estos comandos no funciona, instálalo o configura su PATH correctamente.

## Paso 2: Configuración del Proyecto en IntelliJ IDEA 🟧

2.1 **Crear el proyecto Maven**

2.1.1 Abrir IntelliJ IDEA 🟧
2.1.2 Haz clic en <code>File > New > Project</code>
2.1.3 Haz clic en Maven Archetype como tipo de proyecto
2.1.4 Selecciona el JDK adecuado (<code>opendjdk-11</code>)
2.1.5 Da el nombre al proyecto, por ejemplo, <code>SparkJSONIngestion</code>.

2.2 **Configura el proyecto:**

2.2.1 Define el <code>GroupId</code> (por ejemplo <code>com.example</code>) y el <code>ArtifactId</code> (por ejemplo,<code>spark-json-ingestion</code>) en <code>Version</code> escribimos <code>1.0-SNAPSHOT</code>,
2.2.2 Haz clic en <code>Add</code> y luego en <code>Create</code>.

2.3 **Estructura del proyecto**

Una vez creado el proyecto, la estructura inicial será algo como esto:

```
SparkJsonIngestion/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
│       ├── java/
│       └── resources/
├── pom.xml
```

## Paso 3: Configurar el archivo <code>pom.xml</code>.

El archivo <code>pom.xml</code> es crucial para gestionar las dependencias del proyecto. Reemplaza el contenido de <code>pom.xml</code> con lo siguiente:

```
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>
    <artifactId>spark-json-ingestion</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <scala.version>2.13.8</scala.version>
        <spark.version>3.5.1</spark.version>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
    </properties>

    <dependencies>

        <!-- Spark Core -->
        <dependency>
            <groupId>org.apache.spark</groupId>
            <artifactId>spark-core_2.13</artifactId>
            <version>${spark.version}</version>
            <exclusions>
                <exclusion>
                    <groupId>com.fasterxml.jackson.core</groupId>
                    <artifactId>*</artifactId>
                </exclusion>
                <exclusion>
                    <groupId>com.fasterxml.jackson.module</groupId>
                    <artifactId>*</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <!-- Spark SQL -->
        <dependency>
            <groupId>org.apache.spark</groupId>
            <artifactId>spark-sql_2.13</artifactId>
            <version>${spark.version}</version>
            <exclusions>
                <exclusion>
                    <groupId>com.fasterxml.jackson.core</groupId>
                    <artifactId>*</artifactId>
                </exclusion>
                <exclusion>
                    <groupId>com.fasterxml.jackson.module</groupId>
                    <artifactId>*</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <!-- Jackson Core -->
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-core</artifactId>
            <version>2.15.2</version>
        </dependency>

        <!-- Jackson Databind -->
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.15.2</version>
        </dependency>

        <!-- Jackson Annotations -->
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-annotations</artifactId>
            <version>2.15.2</version>
        </dependency>

        <!-- Jackson Module for Scala -->
        <dependency>
            <groupId>com.fasterxml.jackson.module</groupId>
            <artifactId>jackson-module-scala_2.13</artifactId>
            <version>2.15.2</version>
        </dependency>

        <!-- Scala Library -->
        <dependency>
            <groupId>org.scala-lang</groupId>
            <artifactId>scala-library</artifactId>
            <version>${scala.version}</version>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <!-- Scala Compiler Plugin -->
            <plugin>
                <groupId>net.alchim31.maven</groupId>
                <artifactId>scala-maven-plugin</artifactId>
                <version>4.8.1</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>compile</goal>
                            <goal>testCompile</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>

            <!-- Maven Compiler Plugin -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.11.0</version>
                <configuration>
                    <source>11</source>
                    <target>11</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
```

Guarda el archivo y espera a que IntelliJ descargue todas las dependencias.

## Paso 4: Escribe el código en Scala 🟥.

4.1 **Crea un directorio para el código Scala 🟥**.

- En <code>src/main</code>, crea un nuevo directorio llamado <code>scala</code>.
- Haz clic derecho en la carpeta <code>scala</code> y selecciona <code>Mark Directory as > Sources Root</code>.

4.2 **Crea un archivo Scala 🟥**

- Dentro de <code>src/main/scala</code>, create a package, for example, <code>com.example.spark</code>.
- Dentro del paquete, crea un archivo llamado <code>JsonIngestionApp.scala</code>.

Copia y pega el siguiente código:

```
package com.example.spark

import org.apache.spark.sql.SparkSession

object JsonIngestionApp {
  def main(args: Array[String]): Unit = {
    // Inicializa SparkSession
    val spark = SparkSession.builder()
      .appName("JSON Ingestion with Spark")
      .master("local[*]") // Ejecuta Spark localmente con todos los núcleos disponibles
      .getOrCreate()

    // Lee un archivo JSON
    val inputPath = "data/sample.json" // Ruta al archivo JSON
    val df = spark.read.json(inputPath)

    // Muestra el esquema y algunos registros
    println("Schema:")
    df.printSchema()

    println("Data Preview:")
    df.show()

    // Guarda el DataFrame como un archivo Parquet
    val outputPath = "output/parquet"
    df.write.mode("overwrite").parquet(outputPath)

    println(s"Datos guardados en $outputPath")

    // Detén la sesión de Spark
    spark.stop()
  }
}
```

## Paso 5: Prepara los datos de entrada.

5.1 **Crea un fichero JSON de ejemplo**.

En la raíz del proyecto, crea una carpeta llamada <code>data</code>.
Dentro de <code>data</code>, crea un archivo llamado <code>sample.json</code> con el siguiente contenido:

```
[
  {"id": 1, "name": "Alice", "age": 25},
  {"id": 2, "name": "Bob", "age": 30},
  {"id": 3, "name": "Charlie", "age": 35}
]
```

## Paso 6. Compila el proyecto

6.1 **Compila el proyecto:**

En la terminal, navega al directorio del proyecto y ejecuta:

```
$ mvn clean compile
```

6.2 **Ejecuta la aplicación:**

- En IntelliJ IDEA, haz clic derecho en <code>JsonIngestionApp.scala</code> y selecciona Run <code>'JsonIngestionApp'</code>.
- O bien, ejecuta desde la terminal:

```
$ mvn exec:java -Dexec.mainClass="com.example.spark.JsonIngestionApp"
```

6.3 **Verificar la salida**

- Deberías ver el esquema y los datos del archivo JSON en la consola.
- Además, se creará una carpeta <code>output/parquet</code> con los datos convertidos a formato Parquet,

### ☑️ Conclusión

¡Felicidades! Has creado un proyecto de ingestas de archivos JSON usando Spark-Scala en IntelliJ IDEA con Maven. Este proyecto puede ser extendido para manejar casos más complejos, como transformaciones de datos, integración con sistemas externos o procesamiento distribuido en un clúster de Spark. 

Si tienes alguna duda o problema durante el proceso, no dudes en preguntar. ¡Buena suerte! 🚀

### 📌 Notas Adicionales

En mi caso he tenido conflictos con las dependencias JACKSON y he reescrito el <code>pom.xml</code> la version final es la que aparece en el proyecto de este repositorio.

Si en tu caso tienes problemas similares, debes recompilar el proyecto y volverlos a correr, estos son los pasos:

- **Limpia y reconstruye el proyecto**. Después de modificar el pom.xml, ejecuta los siguientes comandos para limpiar y reconstruir el proyecto:

```
$ mvn clean compile
```

- Luego, intenta ejecutar nuevamente la aplicación:

```
mvn exec:java -Dexec.mainClass="com.example.spark.JsonIngestionApp"
```

***

**Verifica la configuración de IntelliJ IDEA**

Si el problema persiste al ejecutar desde IntelliJ IDEA, verifica lo siguiente:

1. **Configuración del JDK**. 

- Ve a <code>File > Project Structure > SDKs</code> y asegúrate de que el JDK 11 esté seleccionado.
- En <code>File > Project Structure > Modules</code>, asegúrate de que el lenguaje de programación sea Scala 2.13.

2. **Rebuild del proyecto:**

- Haz clic en <code>Build > Rebuild Project</code> para asegurarte de que todas las dependencias se resuelvan correctamente.

3. **Ejecución desde IntelliJ:**

- Asegúrate de que IntelliJ esté utilizando Maven para gestionar las dependencias. Ve a <code>File > Settings > Build, Execution, Deployment > Build Tools > Maven</code> y verifica que el directorio de Maven y las opciones estén configuradas correctamente.

***

4. **Prueba Final**

Una vez realizados todos los cambios, prueba nuevamente:

1. Ejecuta el comando en la terminal:

```
mvn clean compile exec:java -Dexec.mainClass="com.example.spark.JsonIngestionApp"
```

2. Si funciona correctamente, intenta ejecutarlo directamente desde IntelliJ IDEA haciendo clic derecho en <code>JsonIngestionApp.scala</code> y seleccionando <code>Run 'JsonIngestionApp'</code>.

***

5. **Resultado esperado**

Si todo está configurado correctamente, deberías ver una salida similar a esta:

```
Schema:
root
 |-- age: long (nullable = true)
 |-- id: long (nullable = true)
 |-- name: string (nullable = true)

Data Preview:
+---+---+-------+
|age| id|   name|
+---+---+-------+
| 25|  1|  Alice|
| 30|  2|    Bob|
| 35|  3|Charlie|
+---+---+-------+

Datos guardados en output/parquet
```

Además, se creará una carpeta <code>output/parquet</code> con los datos convertidos a formato Parquet.