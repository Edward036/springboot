package org.springboot.ctl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mesien
 *         17/6/11.
 */
@Controller
@RequestMapping("/qinxing")
public class HomeController {

    @RequestMapping("/home")
    public String home() {
        return "index";
    }
}
