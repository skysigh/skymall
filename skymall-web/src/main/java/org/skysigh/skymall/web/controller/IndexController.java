package org.skysigh.skymall.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
    @RequestMapping("/test")
    public String test() {

        logger.info("adfa444sdf{}", IndexController.class.getCanonicalName());
        System.err.println(11111);
        return "test";
    }
    @RequestMapping("/test2")
    public String test2() {
        System.err.println(2222);
        return "test2";
    }
}
