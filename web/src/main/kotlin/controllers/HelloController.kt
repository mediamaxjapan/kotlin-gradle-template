package controllers

import org.jooby.MediaType
import org.jooby.Result
import org.jooby.Results
import org.jooby.mvc.GET
import org.jooby.mvc.Path
import javax.inject.Singleton

@Singleton
@Path("/hello")
class HelloController {

  @GET
  fun index(): Result {
    return Results.ok("Hello, index").type(MediaType.plain)
  }

  @GET
  @Path("/kotlin")
  fun kotlin(): Result {
    return Results.ok("Hello, Kotlin!").type(MediaType.plain)
  }

}