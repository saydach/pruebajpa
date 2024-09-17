package com.ciberfarma.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table (name = "tb_usuarios")
public class Usuario {
	@Id
	private int cod_usuario;
	private String nom_usua;
	private String ape_usua;
	@Column(name = "usr_usua")
	private String correo;
	@Column(name = "usr_usua")
	private String clave;
	private String fina_usua;
	private int idtipo;
	private int estu_usua;

	@ManyToOne
	@JoinColumn(name = "idtipo", insertable = false, updatable = false)
	private Tipo obtTipo;

}
