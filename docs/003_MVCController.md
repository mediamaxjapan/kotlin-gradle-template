# MVCController の採用

## updates

 * 2019-06-10 onda

## pros

 * 型安全 - 引数・返り値を明示的に定義する
 * テスタブル - メソッドの形なので呼び出しやすい
 * Jooby 2.0 - AOT コンパイルされるようになる
 
## cons

 * なし - functional な書き方にメリットは特にない...
 
## example

```kotlin
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
```
