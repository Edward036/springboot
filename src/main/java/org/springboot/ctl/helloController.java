package org.springboot.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author meisen
 * 2017-04-18
 */
@RestController
public class helloController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
