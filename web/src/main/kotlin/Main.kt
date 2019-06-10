@file:JvmName("Main")

import com.fasterxml.jackson.databind.ObjectMapper
import controllers.HelloController
import org.jooby.apitool.ApiTool
import org.jooby.json.Jackson
import org.jooby.run

fun main(vararg args: String) {
  run(*args) {
    use(Jackson(ObjectMapper()))
    use(ApiTool().swagger("/swagger").raml("/raml"))
    use(HelloController::class)
  }
}
