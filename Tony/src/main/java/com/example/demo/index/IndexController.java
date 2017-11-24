package com.example.demo.index;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Tony
 * @author Tony
 * @date 2017/11/24
 * com.example.demo.UtilsMyObject
 * 描述：
 */
@Controller
public class IndexController {

    @Value("${rand}")
    private String rand;

    @RequestMapping(value = "/")
    private void index(){
        System.out.println(rand);
    }
}
