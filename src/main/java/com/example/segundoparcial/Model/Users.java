package com.example.segundoparcial.Model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.awt.*;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

@Entity(name = "TblUsuarios")
public class Users {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdUsuario;

    @NotBlank(message = "Usuario no puede estar en blanco.")
    private String Usuario;

    @NotBlank(message = "Nombre no puede estar en blanco.")
    private String Nombre;

    @NotBlank(message = "Número de empleado no puede estar en blanco.")
    private String NumeroDeEmpleado;

    @NotBlank(message = "Puesto no puede estar en blanco.")
    private String Puesto;

    @NotBlank(message = "Departamento de empresa no puede estar en blanco.")
    private String DepartamentoEmpresa;

    private Timestamp FechaCreacion=Timestamp.from(Instant.now());

    private int Activo;

    @ManyToMany
    @JoinTable(name = "TblAsignacionHardware",joinColumns = @JoinColumn(name = "IdUsuario",referencedColumnName = "IdUsuario"),
    inverseJoinColumns = @JoinColumn(name = "IdHardware",referencedColumnName = "IdHardware"))
    private List<Hardware> detalle;

    public List<Hardware> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<Hardware> detalle) {
        this.detalle = detalle;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNumeroDeEmpleado() {
        return NumeroDeEmpleado;
    }

    public void setNumeroDeEmpleado(String numeroDeEmpleado) {
        NumeroDeEmpleado = numeroDeEmpleado;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String puesto) {
        Puesto = puesto;
    }

    public String getDepartamentoEmpresa() {
        return DepartamentoEmpresa;
    }

    public void setDepartamentoEmpresa(String departamentoEmpresa) {
        DepartamentoEmpresa = departamentoEmpresa;
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

}
