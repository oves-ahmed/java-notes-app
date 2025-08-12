// src/main/java/com/example/demo/NoteRepository.java
// The Spring Data JPA repository for CRUD operations.

package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}