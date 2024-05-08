package com.many_to_many.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class StudentModel {

    @Id
    @Column(name = "stu_id")
    private Long stuId;
    private String stuName;
    private Double stuMarks;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "student_address",
            joinColumns = @JoinColumn(
                    name = "student_id", referencedColumnName = "stu_id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "address_id", referencedColumnName = "address_id"
            )
    )
    private Set<AddressModel>address = new HashSet<>();

}
