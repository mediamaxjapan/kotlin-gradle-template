@file:JvmName("Main")

import com.fasterxml.jackson.databind.ObjectMapper
import controllers.HelloController
import org.jooby.Kooby
import org.jooby.json.Jackson
import org.jooby.run

class App : Kooby({
  use(Jackson(ObjectMapper()))
  use(HelloController::class)
})

fun main(vararg args: String) {
  run(::App, *args)
}
