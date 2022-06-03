val a = "Sim!"
val b = 1
val c = 3
var z = null
val d = z ?: b

fun main() {
  println("Se vitão fot cantor toca $d musica")
  loopDownTo()
  getValuie()
  loopDownTo()
  loopRange()
  loopUntil()
  loopVitao()
}

fun getValuie() =
    when {
      b < c -> {
        println("Swith 01")
      }
      b > c -> {
        println("Swith C minoria")
      }
      else -> {
        println("Não deu")
      }
    }

fun loopRange() {
  for (i in b..c) {
    println("loop in range $i")
  }
}

fun loopUntil() {
  for (i in b until c) {
    println("Loop until $i")
  }
}

val vitao = "vitão das mares"

fun loopVitao() {
  for (letter in vitao) {
    println(letter)
  }
}

fun loopDownTo() {
  for (i in 10 downTo (3)) println("$i")
}
