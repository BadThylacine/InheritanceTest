package com.inheritance.test.demo.controller.MappedSuperclass;

import com.inheritance.test.demo.Model.JoinedTable.Pc;
import com.inheritance.test.demo.Repository.JoinedTable.PcRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pc")
public class PcController {

    PcRepository pcRepository;

    PcController(PcRepository pcRepository) {
        this.pcRepository = pcRepository;
    }

    @GetMapping
    public List<Pc> getAll() {
        return pcRepository.findAll();
    }

    @PostMapping
    public Pc post(@RequestBody Pc pc) {
        return pcRepository.save(pc);
    }
}
