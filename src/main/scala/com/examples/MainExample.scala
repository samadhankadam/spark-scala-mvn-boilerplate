package com.examples

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.apache.log4j.Logger

object MainExample {

  def main(arg: Array[String]) {

    var logger = Logger.getLogger(this.getClass())

    val jobName = "MainExample"

    val conf = new SparkConf().setAppName(jobName)
    val sc = new SparkContext(conf)

    logger.info("=> jobName \"" + jobName + "\"")
  }
}
