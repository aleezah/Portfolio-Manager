package com.citi.hackathon.Portfolio.Manager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.concurrent.Future;

public interface FutureRepository extends JpaRepository<Future, Integer> {

    Collection<Future> findByID(Integer id);
}