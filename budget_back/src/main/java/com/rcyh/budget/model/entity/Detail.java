package com.rcyh.budget.model.entity;

import com.rcyh.budget.model.enums.detail.GroupCategory;
import com.rcyh.budget.model.enums.detail.Type;
import com.rcyh.budget.model.enums.detail.UnitMeasure;
import com.rcyh.budget.model.enums.detail.UnitPrice;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Long amount;
    private UnitPrice unitPrice;
    //indica el tipo de detalle(producto, servicio,otro)
    private Type type;
    // Begin Campos en el caso el type sea producto
    private GroupCategory groupCategory;
    private UnitMeasure unitMeasure;
    // End Campos en el caso el type sea producto
}
