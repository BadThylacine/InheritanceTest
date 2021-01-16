package com.inheritance.test.demo.controller.MappedSuperclass;

import com.inheritance.test.demo.Model.SingleTable.Cpu;
import com.inheritance.test.demo.Repository.SingleTable.CpuRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cpu")
public class CpuController {

    CpuRepository cpuRepository;

    CpuController(CpuRepository cpuRepository) {
        this.cpuRepository = cpuRepository;
    }

    @GetMapping
    public List<Cpu> getAll() {
        return cpuRepository.findAll();
    }

    @PostMapping
    public Cpu post(@RequestBody Cpu cpu) {
        return cpuRepository.save(cpu);
    }
}
