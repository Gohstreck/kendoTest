package example.KendoDemo2.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.Id;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private int id;


    int edadInicial, edadTerminal;
    /*1 mixto, 2 varonil, 3 femenil */
    short sexo;

    /*0 si es suburi, 1 si es shiai */
    boolean suburiShiai;

    /*El nombre de la categoria */
    String nombre;

    @OneToOne(mappedBy = "categoria")
    private GanadorTorneoCategoria ganadorTorneoCategoria;
    
    @ManyToOne()
    @JoinColumn(name ="torneoId", referencedColumnName = "id")
    private Torneo torneo;

    @Override
    public String toString() {
        return "Categoria [id=" + id + ", edadInicial=" + edadInicial + ", edadTerminal=" + edadTerminal + ", sexo="
                + sexo + ", suburiShiai=" + suburiShiai + ", nombre=" + nombre + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + edadInicial;
        result = prime * result + edadTerminal;
        result = prime * result + sexo;
        result = prime * result + (suburiShiai ? 1231 : 1237);
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Categoria other = (Categoria) obj;
        if (id != other.id)
            return false;
        if (edadInicial != other.edadInicial)
            return false;
        if (edadTerminal != other.edadTerminal)
            return false;
        if (sexo != other.sexo)
            return false;
        if (suburiShiai != other.suburiShiai)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    public Categoria(int id, int edadInicial, int edadTerminal, short sexo, boolean suburiShiai, String nombre) {
        this.id = id;
        this.edadInicial = edadInicial;
        this.edadTerminal = edadTerminal;
        this.sexo = sexo;
        this.suburiShiai = suburiShiai;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdadInicial() {
        return edadInicial;
    }

    public void setEdadInicial(int edadInicial) {
        this.edadInicial = edadInicial;
    }

    public int getEdadTerminal() {
        return edadTerminal;
    }

    public void setEdadTerminal(int edadTerminal) {
        this.edadTerminal = edadTerminal;
    }

    public short getSexo() {
        return sexo;
    }

    public void setSexo(short sexo) {
        this.sexo = sexo;
    }

    public boolean isSuburiShiai() {
        return suburiShiai;
    }

    public void setSuburiShiai(boolean suburiShiai) {
        this.suburiShiai = suburiShiai;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
}
