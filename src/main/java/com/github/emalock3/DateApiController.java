package com.github.emalock3;

import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/date")
public class DateApiController {
    
    @RequestMapping(value = "/now", method = RequestMethod.GET)
    public Date now() {
        return new Date();
    }

}
