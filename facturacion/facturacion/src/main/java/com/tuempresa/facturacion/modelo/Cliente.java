package com.tuempresa.facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.hibernate.validator.constraints.Length;
import org.openxava.annotations.NoFrame;
import org.openxava.annotations.View;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter

@View(name="Simple", // Esta vista solo se usará cuando se especifique ?Simple?
        members="numero, nombre" // Muestra únicamente numero y nombre en la misma línea
)
public class Cliente {
    @Id
    @Column(length = 6)
    int numero;

    @Column(length = 50)
    @Required
    String name;

    @Embedded @NoFrame
    Direccion direccion;
}
