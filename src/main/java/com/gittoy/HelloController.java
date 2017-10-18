package com.gittoy.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create By GaoYu
 * 2017-10-17
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    /**
     * 1, @PathVariable("id"): http://localhost:8080/hello/say/100
     * 2, @RequestParam("id"): http://localhost:8080/hello/say?id=100
     * 3, 可以设置默认值等。@RequestParam(value = "id", required = false, defaultValue = "0")
     * 4, @RequestMapping(value="/say", method = RequestMethod.GET) = @GetMapping(value="/say")
     * 5, 对应4的，还有PostMapping、PutMapping等注解，可以简化书写。推荐方式。
     *
     * @param id
     * @return
     */
    @RequestMapping(value="/{id}/say", method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer id) {
        return "id: " + id;
//        return girlProperties.getCupSize();
    }
}
