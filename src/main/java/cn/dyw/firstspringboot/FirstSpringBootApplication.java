package cn.dyw.firstspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SpringBootApplication
public class FirstSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringBootApplication.class, args);
    }

    // @GetMapping("/hello")
    // 等价于
    // @RequestMapping(value = "hello", method = RequestMethod.GET)
    @GetMapping("/hello")
    public ModelAndView hello(@RequestParam("name") String name) {
        ModelAndView modelAndView = new ModelAndView();
        // 设置视图名，对应的就是模板文件名
        modelAndView.setViewName("hello");
        // 设置模板文件需要访问的变量，对应模板文件中的 ${name}
        modelAndView.addObject("name", name);
        return modelAndView;
    }
}
