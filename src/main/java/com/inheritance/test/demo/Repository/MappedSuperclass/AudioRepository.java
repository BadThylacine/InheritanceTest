package com.inheritance.test.demo.Repository.MappedSuperclass;

import com.inheritance.test.demo.Model.MappedSuperclass.Audio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudioRepository extends JpaRepository<Audio, Integer> {
}