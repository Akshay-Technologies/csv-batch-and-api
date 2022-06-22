package com.example.demo.repository;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PolicyRepository extends JpaRepository<Policy,Integer> {

    List<Policy> findByPolicyId(int policyId);

    @Query("select policyId from Policy where policyCount >= 5")
    List<Integer> getPolicyIdOfPolicyCountMoreThenFive();
}