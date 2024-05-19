package com.api.crud.cliente;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table
public class Cliente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long  idc;

    @Column(unique = true)
    private String nombreCliente;
    private String forma_de_pago;
    private LocalDate fecha_nacimiento;



    public Cliente(Long idc, String nombreCliente, String forma_de_pago, LocalDate fecha_nacimiento) {
        this.idc = idc;
        this.nombreCliente = nombreCliente;
        this.forma_de_pago = forma_de_pago;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Long getIdc() {
        return idc;
    }

    public void setIdc(Long idc) {
        this.idc = idc;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getForma_de_pago() {
        return forma_de_pago;
    }

    public void setForma_de_pago(String forma_de_pago) {
        this.forma_de_pago = forma_de_pago;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
