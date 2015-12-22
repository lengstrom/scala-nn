import breeze.stats.distributions._
import breeze.linalg._
import scala.math._

class NeuralNetwork (layers: List[Int]) {
  val biases : Vector[DenseVector[Double]] = for ( n <- layers) yield
    new DenseVector[Double](data: Gaussian(mu: 0, sigma: 0).sample(n))
  println(biases)
}

object main {
  def main(args: Array[String]) : Unit = {
    println("Runs!" + args.foldRight("")(_ + " " + _))
  }
}
