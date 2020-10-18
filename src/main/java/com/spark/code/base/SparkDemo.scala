package com.spark.code.base

//import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.SparkSession

object SparkDemo {
    def main(args : Array[String]): Unit ={

/*      val spark = SparkSession.builder()
        .master("local[*]")
        .appName("SparkByExamples.com")
        .getOrCreate();*/

      val spark = SparkSession.builder.
        master("local")
        .appName("spark session example")
        .getOrCreate()

      val data=spark.read.text("/Users/nambastha/Documents/github/test.txt");
      data.show();

    }
}
