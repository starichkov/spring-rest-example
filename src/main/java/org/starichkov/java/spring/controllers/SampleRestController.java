package org.starichkov.java.spring.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.starichkov.java.spring.entities.SampleStructure;

/**
 * @author Vadim Starichkov
 * @since 21.10.2016 15:40
 */
@RestController
@RequestMapping("/")
public class SampleRestController {

    @RequestMapping(path = "sample", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public SampleStructure getUser() {
        return new SampleStructure();
    }
}
