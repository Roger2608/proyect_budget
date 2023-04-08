package com.rcyh.budget.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @OneToOne
    @JoinColumn(name = "login_id")
    private Login login;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
    @Column(name = "group_family_id")
    private Long groupFamilyId;
}
