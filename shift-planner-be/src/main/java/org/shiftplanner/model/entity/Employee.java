package org.shiftplanner.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.shiftplanner.model.enums.Qualification;
import org.shiftplanner.model.enums.Role;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "employees")
@Entity
public class Employee extends BaseEntity {

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotNull
    @Column(unique = true)
    private Integer personalNumber;

    @NotNull
    private Set<Qualification> qualifications;

    private Set<Role> roles;

    private String contact;



}

