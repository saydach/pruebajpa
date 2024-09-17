package com.ciberfarma.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity (name ="tb_tipos")
public class Tipo {
 @Id
 private int idtipo;
 private String descripcion;
 
 @OneToMany
 @JoinColumn (name ="idtipo", insertable = false, updatable = false)
 private List<Usuario> IstUsuarios;
 
}
