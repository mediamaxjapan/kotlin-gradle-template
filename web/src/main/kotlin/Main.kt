@file:JvmName("Main")

import controllers.App
import controllers.HelloController
import org.jooby.Kooby
import org.jooby.run

class App : Kooby({
  use(HelloController::class)
})

fun main(vararg args: String) {
  run(::App, *args)
}
