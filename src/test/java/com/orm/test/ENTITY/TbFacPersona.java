package com.orm.test.ENTITY;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "tb_fac_persona")
public class TbFacPersona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFactPersona", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "imei")
    private String imei;

    @Lob
    @Column(name = "NombrePersona")
    private String nombrePersona;

    @Column(name = "fechaRegistro")
    private Instant fechaRegistro;

    @Column(name = "zona", length = 50)
    private String zona;

    @Column(name = "estado", length = 50)
    private String estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public Instant getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Instant fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
