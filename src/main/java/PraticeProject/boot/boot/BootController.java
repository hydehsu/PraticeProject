package PraticeProject.boot.boot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * spring boot test
 * @author wistronits
 *
 */
@Controller
@EnableAutoConfiguration
public class BootController {
	@RequestMapping("/boot")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}
