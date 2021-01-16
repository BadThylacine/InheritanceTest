package com.inheritance.test.demo.Repository.JoinedTable;


import com.inheritance.test.demo.Model.JoinedTable.Pc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PcRepository extends JpaRepository<Pc, Integer> {
}
