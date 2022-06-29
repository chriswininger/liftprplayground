package com.sonatype.liftprplayground


fun grr() {
  throw MyException("Squirrel why must you taunt me")
  
  println("I am unreachable")
}

class MyException(msg: String?) : RuntimeException(msg)
