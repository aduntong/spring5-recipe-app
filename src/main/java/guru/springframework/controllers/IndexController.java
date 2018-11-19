package guru.springframework.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jt on 6/1/17.
 */
@Controller
@Slf4j
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage( ModelAndView modelAndView ){

        return "index";
    }
}
