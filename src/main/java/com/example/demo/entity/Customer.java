package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * @author gourav.mungi
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotNull(message = "First name cannot be null")
    @Size(min = 1, max = 50, message = "First name must be between 1 and 50 characters")
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NotNull(message = "Last name cannot be null")
    @Size(min = 1, max = 50, message = "Last name must be between 1 and 50 characters")
    @Column(name = "last_name", nullable = false)
    private String lastName;


    @NotNull(message = "Date of birth cannot be null")
    @Past(message = "Date of birth must be a past date")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "dob", nullable = false)
    private LocalDate dob;
}
