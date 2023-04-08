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
@Table(name = "detail")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Double amount;
    private String unitPrice;
    //indica el tipo de detalle(producto, servicio,otro)
    private String type;
    // Begin Campos en el caso el type sea producto
    private String groupCategory;
    private String unitMeasure;
    // End Campos en el caso el type sea producto
}
