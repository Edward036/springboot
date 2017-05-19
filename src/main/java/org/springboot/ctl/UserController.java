package org.springboot.ctl;

import org.springboot.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author meisen
 * 2017-05-02
 */
@RestController
@RequestMapping("/users")
public class UserController {

    //创建线程安装的Map
    private static Map<Long, User> users = Collections.synchronizedMap(new HashMap<>());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getUserList() {
        // 可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        return new ArrayList<>(users.values());
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String createAUser(@ModelAttribute User user) {
        users.put(user.getId(), user);
        return "success";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateUser(@ModelAttribute User user, @PathVariable Long id) {
        User u = users.get(id);
        u.setAge(user.getAge());
        u.setId(user.getId());
        return "success";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id){
        users.remove(id);
        return "success";
    }

}



