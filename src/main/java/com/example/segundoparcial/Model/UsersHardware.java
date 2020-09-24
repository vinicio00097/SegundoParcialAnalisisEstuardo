package com.example.segundoparcial.Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;

@Entity
public class UsersHardware {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdAsignacionHardware;

   /* @ManyToOne
    @JoinColumn(name = "IdUsuario")
    private Users Usuario;

    @ManyToOne
    @JoinColumn(name = "IdHardware")
    private Hardware Hardware;*/

    private Timestamp FechaAsignacion=Timestamp.from(Instant.now());

    public int getIdAsignacionHardware() {
        return IdAsignacionHardware;
    }

    public void setIdAsignacionHardware(int idAsignacionHardware) {
        IdAsignacionHardware = idAsignacionHardware;
    }

   /* public Users getUsuario() {
        return Usuario;
    }

    public void setUsuario(Users usuario) {
        Usuario = usuario;
    }

    public com.example.segundoparcial.Model.Hardware getHardware() {
        return Hardware;
    }

    public void setHardware(com.example.segundoparcial.Model.Hardware hardware) {
        Hardware = hardware;
    }

    public Timestamp getFechaAsignacion() {
        return FechaAsignacion;
    }

    public void setFechaAsignacion(Timestamp fechaAsignacion) {
        FechaAsignacion = fechaAsignacion;
    }*/

}
