package com.inheritance.test.demo.Repository.TablePerClass;


import com.inheritance.test.demo.Model.TablePerClass.Output;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OutputRepository extends JpaRepository<Output, Integer> {
}
