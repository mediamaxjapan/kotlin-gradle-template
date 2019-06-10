package controllers

import org.jooby.mvc.GET
import org.jooby.mvc.Path
import org.jooby.mvc.Produces
import responses.Person
import javax.inject.Singleton

@Singleton
@Path("/hello")
class HelloController {

  @GET
  fun index(): String {
    return "Hello, Jooby!"
  }

  @GET
  @Path("/kotlin")
  fun kotlin(): String {
    return "Hello, kotlin"
  }

  /**
   * ログインコンテキストを知る
   *
   * @return ログイン中のユーザー情報
   */
  @GET
  @Produces("application/json")
  @Path("/me")
  fun me(): Person {
    return Person("onda", 41)
  }

}