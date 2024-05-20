package com.api.crud.cliente;

import jakarta.persistence.*;

import java.time.LocalDate;
@Table
@Entity

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idc;

    @Column(unique = true)
    private String nombre;

    private String Pago;
    private LocalDate FechaNacimiento;

    public Cliente() {
    }

    public Cliente(Long idc, String nombreCliente, String pago, LocalDate fechaNacimiento) {
        this.idc = idc;
        nombre = nombreCliente;
        Pago = pago;
        FechaNacimiento = fechaNacimiento;
    }

    public Long getIdc() {
        return idc;
    }

    public void setIdc(Long idc) {
        this.idc = idc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPago() {
        return Pago;
    }

    public void setPago(String pago) {
        Pago = pago;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }
}
