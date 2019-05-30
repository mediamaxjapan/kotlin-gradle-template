import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek

object HelloTest: Spek({
  group("Hello") {
    test("show") {
      assertThat(Hello("kotlin").show(), equalTo("kotlin"))
    }
  }
})