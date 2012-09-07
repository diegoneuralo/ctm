package main.java.br.com.ctm.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="regulamento_de_homologacao_aeronautica", schema="ctm")
public abstract class RegulamentoDeHomologacaoAeronautica extends Regulamento {
	
}
