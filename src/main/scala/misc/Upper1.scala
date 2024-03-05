package misc

class Upper1 {
  def convert(strings: Seq[String]): Seq[String] =
    strings.map((s: String) => s.toUpperCase)
}


object Upper{
  def main(args: Array[String]): Unit = {
    val up = new Upper1()
    val uppers = up.convert(List("Hello", "World!"))
    println(uppers)

  }
}