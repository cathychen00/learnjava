package com.cathy.demoRestful.controller;

import com.cathy.demoRestful.model.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 陈敬
 * @date 17/11/7
 */
public class DemoRestController {
    @RequestMapping("say/{name}")
    public Message say(@PathVariable String name) {
        Message message = new Message();
        message.setName(name);
        message.setText("hello," + name);
        return message;
    }
}
