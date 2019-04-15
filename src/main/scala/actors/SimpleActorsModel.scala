package main.scala.actors

import akka.actor.{Actor, ActorSystem, Props}

object SimpleActorsModel extends App {

  class SimpleActor extends Actor {
    def receive = {
      case s:String => println("String: " + s)
      case i:Int => println("Number: " + i)
    }

    def foo = println("Normal method")

  }

  val system = ActorSystem("SimpleSystem")
  val actor = system.actorOf(Props[SimpleActor], "SimpleActor")

  actor ! "Ola Jhessica"
  actor ! 81721
  actor ! true
  actor ! 898.21
}
