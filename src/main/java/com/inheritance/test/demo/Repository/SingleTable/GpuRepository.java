package com.inheritance.test.demo.Repository.SingleTable;


import com.inheritance.test.demo.Model.SingleTable.Gpu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GpuRepository extends JpaRepository<Gpu, Integer> {
}
