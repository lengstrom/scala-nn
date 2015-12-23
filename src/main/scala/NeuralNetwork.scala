import breeze.stats.distributions._
import breeze.linalg._
import scala.math._

class NeuralNetwork (layers: List[Int]) {
  val dist = Gaussian(0, 1)
  val biases = for ( n <- layers drop 1) yield
    new DenseVector(dist.sample(n).toArray)
  val weights = for ((r, c) <- (layers drop 1) zip (layers dropRight 1)) yield
    DenseMatrix.tabulate(r, c){(i, j) => dist.sample()}

  def sigmoid(z : Double) : Double = 1./(1 + math.exp())


  def FeedForward(inp: DenseVector[Double]) : (DenseVector[Double],
    DenseMatrix[Double]){
    zipped = weights zip biases
    zipped foldLeft ((List[DenseVector](), inp) {
      ((Zs, As), (weights, biases)) => {
        val z = weights.dot(prev_layer) + biases
        (Zs :: z, sigma(z))
    }
  }

  //  new DenseVector[Double](data: List.range(0, 10))
//Gaussian(0, 1).sample(n)
  println(biases)
}

object main {
  def main(args: Array[String]) : Unit = {
    println("Runs!" + args.foldRight("")(_ + " " + _))
    val a = new NeuralNetwork(List(2, 50, 50, 1))
  }
}
