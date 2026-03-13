package javaupf.test.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tasks")
@Data // Generates getters, setters, and toString automatically
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private boolean completed;
}