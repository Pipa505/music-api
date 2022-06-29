package net.camacho.api.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Albums")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private Date lanzado;
    private String genero;
    private Double precio;

    private String artista;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getLanzado() {
        return lanzado;
    }

    public void setLanzado(Date lanzado) {
        this.lanzado = lanzado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", lanzado=" + lanzado +
                ", genero='" + genero + '\'' +
                ", precio=" + precio +
                ", artista='" + artista + '\'' +
                '}';
    }
}
