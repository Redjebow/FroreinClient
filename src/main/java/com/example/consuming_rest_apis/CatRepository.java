package com.example.consuming_rest_apis;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<CatFact, Long> {
}
