package com.rcyh.budget.model.entity;

import com.rcyh.budget.model.enums.budget.Required;
import com.rcyh.budget.model.enums.budget.State;
import com.rcyh.budget.model.enums.budget.Type;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "budget")
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Type type;
    private Required required;
    @OneToOne
    @JoinColumn(name = "family_id")
    private Family family;
    private State state;
}
