package com.ciberfarma.app;

import java.util.List;

import javax.sound.midi.SysexMessage;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class demo07 {
 public static void main (String [] arg) {
	 
	 EntityManagerFactory conexion = Persistence.createEntityManagerFactory("jpa_sesion01");
	 EntityManager en = conexion.createEntityManager();
	 
	 List<Tipo>lisTipo=en.createNativeQuery("select * fron tb_tipos", Tipo.class).getResultList();
	  for (Tipo t :lsTipos) {
		  
		  System.out.println("Tipo de usuarios:" + t.getDescripcion());
		  System.out.println("----------------:");
		 
		 for (Usauario u : t.getListUsuarios()) {
			 System.out.println("Nombre" + u.getNom_usa()+ "" + u.getApe_usua());
			 
			  System.out.println("Email" + u.getCorreo());
			  System.out.println("----------------:");
		 }
	  }
	
  }
}
