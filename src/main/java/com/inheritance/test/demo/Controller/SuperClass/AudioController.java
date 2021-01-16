package com.inheritance.test.demo.controller.MappedSuperclass;


import com.inheritance.test.demo.Model.MappedSuperclass.Audio;
import com.inheritance.test.demo.Repository.MappedSuperclass.AudioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/audio")
public class AudioController {

    AudioRepository audioRepository;

    AudioController(AudioRepository audioRepository) {
        this.audioRepository = audioRepository;
    }

    @GetMapping
    public List<Audio> getAll() {
        return audioRepository.findAll();
    }

    @PostMapping
    public Audio post(@RequestBody Audio audio ){
        return audioRepository.save(audio);
    }
}
