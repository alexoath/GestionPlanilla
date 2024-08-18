/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoplanilla;

import java.util.Date;

/**
 *
 * @author Walter Morales
 */
public class Planilla {
    
    private int id;
    private int empresaCodigo;
    private int empleadoCodigo;
    private Date periodo;
    private double sueldo;
    private char estado;

    
     public Planilla(int id, int empresaCodigo, int empleadoCodigo, Date periodo, double sueldo, char estado) {
        this.id = id;
        this.empresaCodigo = empresaCodigo;
        this.empleadoCodigo = empleadoCodigo;
        this.periodo = periodo;
        this.sueldo = sueldo;
        this.estado = estado;
    }
     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpresaCodigo() {
        return empresaCodigo;
    }

    public void setEmpresaCodigo(int empresaCodigo) {
        this.empresaCodigo = empresaCodigo;
    }

    public int getEmpleadoCodigo() {
        return empleadoCodigo;
    }

    public void setEmpleadoCodigo(int empleadoCodigo) {
        this.empleadoCodigo = empleadoCodigo;
    }

    public Date getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Date periodo) {
        this.periodo = periodo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public char getEstado() {
        return estado;
    }

   

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
    
    
}
