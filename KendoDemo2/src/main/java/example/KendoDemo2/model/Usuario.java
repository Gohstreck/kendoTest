package example.KendoDemo2.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    
    @Column(unique = true, nullable = false)
    private String correo;
    
    int picId;

    
    private String password, nombre, apellido, telefono, grado ;




    private Date nacimiento;
    private boolean genero, sensei, uniforme, shinai, bokken, bogu, activo;


    @OneToMany(mappedBy = "usuario")
    List<GanadorTorneoCategoria> ganadorTorneoCategoria;


    public Usuario() {
    }


    public Usuario(int id, String correo, String password, String nombre, String apellido, String telefono,
            String grado, int picId, Date nacimiento, boolean genero, boolean sensei, boolean uniforme, boolean shinai,
            boolean bokken, boolean bogu, boolean activo, List<GanadorTorneoCategoria> ganadorTorneoCategoria) {
        this.id = id;
        this.correo = correo;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.grado = grado;
        this.picId = picId;
        this.nacimiento = nacimiento;
        this.genero = genero;
        this.sensei = sensei;
        this.uniforme = uniforme;
        this.shinai = shinai;
        this.bokken = bokken;
        this.bogu = bogu;
        this.activo = activo;
        this.ganadorTorneoCategoria = ganadorTorneoCategoria;
    }


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


    public int getPicId() {
        return picId;
    }


    public void setPicId(int picId) {
        this.picId = picId;
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


    public List<GanadorTorneoCategoria> getGanadorTorneoCategoria() {
        return ganadorTorneoCategoria;
    }


    public void setGanadorTorneoCategoria(List<GanadorTorneoCategoria> ganadorTorneoCategoria) {
        this.ganadorTorneoCategoria = ganadorTorneoCategoria;
    }
    
    
}
