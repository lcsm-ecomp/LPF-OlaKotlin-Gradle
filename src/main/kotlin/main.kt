import java.io.*
import java.net.*
import kotlin.io.*
import kotlinx.coroutines.*

fun time(com : () -> Unit) {
   val start = System.nanoTime()
   com()
   val end = System.nanoTime()
   println("tempo : ${(end-start)/1000000.0}ms")
}

fun main() {
   time {
      runBlocking {
        //val file = File("ola.txt")
        val file = URL("https://www.uol.com.br")
        println("Vou ler URL")
        val txt =  file.readText();

        println("Arquivo Lido : " + txt.substring(1,10))
      }
   }
}
