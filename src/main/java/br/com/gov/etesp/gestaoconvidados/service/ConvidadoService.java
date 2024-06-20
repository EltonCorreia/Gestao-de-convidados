package br.com.gov.etesp.gestaoconvidados.service;

import java.util.List;

import br.com.gov.etesp.gestaoconvidados.entity.ConvidadoEntity;
import br.com.gov.etesp.gestaoconvidados.model.Convidado;

public interface ConvidadoService {

	public void cadastrar(Convidado convidado) throws Exception;
		
	public List<Convidado> listar();
	
	public void excluir(Long id);
	
	public ConvidadoEntity editarPorId(long id);
}
