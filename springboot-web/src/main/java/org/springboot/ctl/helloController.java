package org.springboot.ctl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author meisen
 * 2017-04-18
 */
@Controller
public class helloController {

    @RequestMapping("/index")
    public String index(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @RequestMapping("/test")
    public String test(ModelMap map){
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://127.0.0.1:8080");
        // return模板文件的名称，对应src/main/resources/templates/test.html
        return "test";
    }
}