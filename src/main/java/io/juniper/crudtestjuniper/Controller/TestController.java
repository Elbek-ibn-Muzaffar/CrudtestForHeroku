package io.juniper.crudtestjuniper.Controller;

import io.juniper.crudtestjuniper.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    @Autowired
    TestService testService;

    @PostMapping("/save/{name}/{lastName}")
    public ResponseEntity save(@PathVariable(value = "name") String name, @PathVariable(value = "lastName") String lastName)
    {
        String sa=testService.saveStudent(name,lastName);
        return ResponseEntity.ok(sa);
    }
}
