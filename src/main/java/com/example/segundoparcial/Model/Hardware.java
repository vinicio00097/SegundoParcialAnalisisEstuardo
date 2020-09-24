package com.example.segundoparcial.Model;

import org.apache.catalina.User;
import org.springframework.lang.NonNullFields;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;
import java.util.List;

@Entity(name = "TblHardware")
public class Hardware {
    private @Id @GeneratedValue
    int IdHardware;

    private int IdTipoHardware;

    @NotBlank(message = "Descripción no puede estar en blanco.")
    private String Descripcion;

    @NotBlank(message = "Fecha de creacion no puede estar en blanco.")
    private Timestamp FechaCreacion;
    private int Activo;

    @NotBlank(message = "Marca no puede estar en blanco.")
    private String Marca;
    private String NumeroDeSerie;
    private int CantidadPiezas;

    @ManyToMany(mappedBy = "detalle")
    private List<Users> Usuarios;

    public int getIdHardware() {
        return IdHardware;
    }

    public void setIdHardware(int idHardware) {
        IdHardware = idHardware;
    }

    public int getIdTipoHardware() {
        return IdTipoHardware;
    }

    public void setIdTipoHardware(int idTipoHardware) {
        IdTipoHardware = idTipoHardware;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Timestamp getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }

    public int getActivo() {
        return Activo;
    }

    public void setActivo(int activo) {
        Activo = activo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getNumeroDeSerie() {
        return NumeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        NumeroDeSerie = numeroDeSerie;
    }

    public int getCantidadPiezas() {
        return CantidadPiezas;
    }

    public void setCantidadPiezas(int cantidadPiezas) {
        CantidadPiezas = cantidadPiezas;
    }
}
