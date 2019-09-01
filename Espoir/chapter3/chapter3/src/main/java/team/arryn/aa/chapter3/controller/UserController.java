package team.arryn.aa.chapter3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.arryn.aa.chapter3.PO.User;
import team.arryn.aa.chapter3.service.UserService;
import team.arryn.aa.chapter3.util.Result;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("add")
    public Result loginController(@RequestBody User user){
        return userService.addUser(user);
    }

    @ResponseBody
    @GetMapping("{id}")
    public Result selectUser(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @ResponseBody
    @DeleteMapping("{id}")
    public Result delUser(@PathVariable("id") Long id) {
        return userService.delUser(id);
    }

    @ResponseBody
    @PutMapping("update")
    public Result updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
}
