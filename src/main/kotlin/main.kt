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
fun main() { runBlocking {
    val v1 = run {
      println("Estou com preguiça. Vou dormir")
      delay(10000)
      println("Acordei. Vou trabalhar")
      1+2
    }
    val v2 = run {
      println("Estou com preguiça. Vou dormir")
      delay(10000)
      println("Acordei. Vou trabalhar")
      1+2
    }
    println("Inicio da aplicação")
    //while (!v1.isCompleted) {
    //  println("Que tedio... eu preciso de uma informacao")
    //  delay(300)
    //}
    println("v1 = ${v1+v2}")
}}

fun mainLaunch() { runBlocking {
    val t1 = launch {
      for (c in 1..10) {
         println("Processo 1: Linha $c")
         delay(1)
      }

    }
    val t2 = launch {
      for (c in 1..10) {
         println("Processo 2: Linha $c")
         delay(1)
      }
    }
    println("Processo principal encerrado")

}}
