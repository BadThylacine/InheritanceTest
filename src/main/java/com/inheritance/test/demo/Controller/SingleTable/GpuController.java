package com.inheritance.test.demo.controller.MappedSuperclass;


import com.inheritance.test.demo.Model.SingleTable.Gpu;
import com.inheritance.test.demo.Repository.SingleTable.GpuRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gpu")
public class GpuController {

    GpuRepository gpuRepository;

    GpuController(GpuRepository gpuRepository) {
        this.gpuRepository = gpuRepository;
    }

    @GetMapping
    public List<Gpu> getAll() {
        return gpuRepository.findAll();
    }

    @PostMapping
    public Gpu post(@RequestBody Gpu gpu) {
        return gpuRepository.save(gpu);
    }
}
