package com.github.emalock3;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test_entities")
public class TestEntityApiController {
    
    private final TestRepository testRepo;

    @Autowired
    public TestEntityApiController(TestRepository testRepo) {
        this.testRepo = testRepo;
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TestEntity find(@PathVariable String id) {
        return testRepo.find(id).orElse(null);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<TestEntity> findAll() {
        return testRepo.findAll();
    }
    
}
