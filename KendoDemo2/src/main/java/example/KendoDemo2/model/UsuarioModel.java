package example.KendoDemo2.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    
    private String correo, password, picRoute, nombre, apellido, telefono, grado ;
    private Date nacimiento;
    private boolean genero, sensei, uniforme, shinai, bokken, bogu, activo;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPicRoute() {
        return picRoute;
    }
    public void setPicRoute(String picRoute) {
        this.picRoute = picRoute;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getGrado() {
        return grado;
    }
    public void setGrado(String grado) {
        this.grado = grado;
    }
    public Date getNacimiento() {
        return nacimiento;
    }
    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    public boolean isGenero() {
        return genero;
    }
    public void setGenero(boolean genero) {
        this.genero = genero;
    }
    public boolean isSensei() {
        return sensei;
    }
    public void setSensei(boolean sensei) {
        this.sensei = sensei;
    }
    public boolean isUniforme() {
        return uniforme;
    }
    public void setUniforme(boolean uniforme) {
        this.uniforme = uniforme;
    }
    public boolean isShinai() {
        return shinai;
    }
    public void setShinai(boolean shinai) {
        this.shinai = shinai;
    }
    public boolean isBokken() {
        return bokken;
    }
    public void setBokken(boolean bokken) {
        this.bokken = bokken;
    }
    public boolean isBogu() {
        return bogu;
    }
    public void setBogu(boolean bogu) {
        this.bogu = bogu;
    }
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    
}
