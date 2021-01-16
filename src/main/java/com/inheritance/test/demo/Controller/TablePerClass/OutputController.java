package com.inheritance.test.demo.controller.MappedSuperclass;

import com.inheritance.test.demo.Model.TablePerClass.Output;
import com.inheritance.test.demo.Repository.TablePerClass.OutputRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/output")
public class OutputController {

    OutputRepository outputRepository;

    OutputController(OutputRepository outputRepository) {
        this.outputRepository = outputRepository;
    }

    @GetMapping
    public List<Output> getAll() {
        return outputRepository.findAll();
    }

    @PostMapping
    public Output post(@RequestBody Output output) {
        return outputRepository.save(output);
    }
}
