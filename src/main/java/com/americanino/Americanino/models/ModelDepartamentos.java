package com.americanino.Americanino.models;

import jakarta.persistence.*;

@Entity
@Table(name = "departamentos")
public class ModelDepartamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name = "departamento")
    private String departamento;

    @Column(name="pais")
    private String pais;

    public ModelDepartamentos() {
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
