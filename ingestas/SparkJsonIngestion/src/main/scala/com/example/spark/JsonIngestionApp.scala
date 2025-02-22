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