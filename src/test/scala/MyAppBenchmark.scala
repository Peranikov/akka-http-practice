import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef._

class MyAppBenchmark extends Simulation {
  val baseURL = "http://localhost:2525"
  val httpConf = http.baseURL(baseURL).warmUp(baseURL)
  httpConf.warmUp()

  setUp(
    scenario("Agent Benchmark")
      .repeat(1000) {
        exec(http("GET /").get("/"))
      }
      .inject(atOnceUsers(100))
      .protocols(httpConf)
  )
}
