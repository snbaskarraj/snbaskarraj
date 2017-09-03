import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object SparkWordContext {
def main(args: Array[String]) {
		val sc = new SparkContext(new SparkConf().setAppName("Spark Count"))
		val threshold = 50
		val logFile = "hdfs://localhost:9000/inputs/spark_ip/words_ip"
		// split each document into words
		val tokenized = sc.textFile(logFile).flatMap(_.split(" "))
		val mappedop =  tokenized.map(word => (word, 1))
		val reducedop = mappedop.reduceByKey((a, b) => a + b)
		val filteredop = reducedop.filter(_._2 > threshold)
		//reducedop.foreach(println)
		filteredop.foreach(println)
	}  
}