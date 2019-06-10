package controllers

import org.jooby.Kooby

class App :Kooby({

  use(HelloController::class)

//  get("**") {
//    "Hello, CatchAll!"
//  }

})
