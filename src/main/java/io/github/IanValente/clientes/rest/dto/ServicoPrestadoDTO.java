package io.github.IanValente.clientes.rest.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ServicoPrestadoDTO {
	
	@NotEmpty(message = "{campo.descricao.obrigatorio}")
	private String descricao;
	
	@NotEmpty(message = "{campo.preco.obrigatorio}")
	private String preco;
	
	@NotEmpty(message = "{campo.data.obrigatorio}")
	private String data;
	
	
	@NotNull(message = "{campo.cliente.obrigatorio}")
	private Integer idCliente;
	

}
