package team.arryn.aa.chapter3.controller;

import org.springframework.web.bind.annotation.*;;
import team.arryn.aa.chapter3.model.PO.User;
import team.arryn.aa.chapter3.service.UserService;
import team.arryn.aa.chapter3.service.impl.UserServiceImpl;
import team.arryn.aa.chapter3.util.Result;

@RestController
@RequestMapping("user")
public class UserController {

    private UserService userService=new UserServiceImpl();

    @ResponseBody
    @PostMapping("add")
    public Result loginController(@RequestBody User user){
        return userService.addUser(user);
    }

    @ResponseBody
    @GetMapping("{id}")
    public Result selectUser(@PathVariable("id") int id) throws Exception {
        return userService.getUserByUsername(id);
    }

    @DeleteMapping("{id}")
    public Result delUser(@PathVariable("id") int id) {
        return userService.delUser(id);
    }

    @ResponseBody
    @PutMapping("{id}")
    public Result updateUser(@PathVariable("id") int id, @RequestBody User user) {
        return userService.updateUser(id,user);
    }
}
