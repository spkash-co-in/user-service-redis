package com.chassis.web.rest;

import com.chassis.service.RedisService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/redis")
@Slf4j
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class RedisController {
    private RedisService service;
    @GetMapping
    public String get(@RequestParam(name = "key", required = true) String key) {
        return service.get(key);
    }
    @PostMapping
    public void put(@RequestParam(name = "key", required = true) String key
            , @RequestParam(name = "value", required = true) String value) {
        service.put(key, value);
    }
}
