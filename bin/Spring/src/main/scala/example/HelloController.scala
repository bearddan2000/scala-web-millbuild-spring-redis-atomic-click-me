package example;

import org.springframework.web.bind.annotation.{RestController, RequestParam};

@RestController
class HelloController {

    val template: String = "Hello, %s!";

    /**
     * The @Timed annotation adds timing support, so we can see how long
     * it takes to execute in Prometheus
     * percentiles
     */
    def greeting(@RequestParam(value = "name", defaultValue = "World") name: String): String = {
      return String.format(template, name);
    }

}
