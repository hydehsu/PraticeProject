package PraticeProject.boot.restful;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class RestfulController {

	 private static final String template = "Hello, %s!";
	    private final AtomicLong counter = new AtomicLong();

	    @RequestMapping("/restful")
	    public Restful restful(@RequestParam(value="name", defaultValue="World") String name) {
	        return new Restful(counter.incrementAndGet(),
	                            String.format(template, name));
	    }
}
