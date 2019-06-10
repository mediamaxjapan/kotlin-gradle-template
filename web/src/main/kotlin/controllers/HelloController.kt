package controllers

import org.jooby.MediaType
import org.jooby.Result
import org.jooby.Results
import org.jooby.json.JacksonView
import org.jooby.mvc.GET
import org.jooby.mvc.Path
import org.jooby.mvc.Produces
import responses.Person
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

  @GET
  @Produces("application/json")
  @Path("/json")
  fun json(): JacksonView<Person> {
    return JacksonView(Person::class.java, Person("onda", 41))
  }

}