package com.pradeephv.jpa.models.embedded;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Entity
@Table(name = "_order")
public class Order implements Serializable {

    @EmbeddedId
    private  OrderId id;

    private String oderInfo;

    private String otherField;
}
