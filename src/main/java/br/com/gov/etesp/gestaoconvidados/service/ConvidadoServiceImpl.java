package br.com.gov.etesp.gestaoconvidados.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gov.etesp.gestaoconvidados.entity.ConvidadoEntity;
import br.com.gov.etesp.gestaoconvidados.model.Convidado;
import br.com.gov.etesp.gestaoconvidados.repository.ConvidadoRepository;

@Service
public class ConvidadoServiceImpl implements ConvidadoService {

	@Autowired
	ConvidadoRepository repository;
	
	@Override
	public void cadastrar(Convidado convidado) throws Exception {
		if (convidado.getAcompanhante() >= 3) {
			throw new Exception("Erro na quantidade acompanhantes");
		}
		ConvidadoEntity entity = from(convidado);
		repository.save(entity);
	}

	@Override
	public List<Convidado> listar() {
		List<ConvidadoEntity> listaConvidados = repository.findAll();
		return fromListConvidado(listaConvidados);
	}
	private ConvidadoEntity from(Convidado convidado) {
		var entity = new ConvidadoEntity();
		entity.setId(convidado.getId());
		entity.setNome(convidado.getNome());
		entity.setNumeroAcompanhante(convidado.getAcompanhante());
		return entity;	
	}
	
	private List<Convidado> fromListConvidado(List<ConvidadoEntity> convidadosEntity) {
		List<Convidado> convidados = new ArrayList<Convidado> ();
		
		for (ConvidadoEntity entity : convidadosEntity) {
			Convidado c = new Convidado();
			c.setId(entity.getId());
			c.setNome(entity.getNome());
			c.setAcompanhante(entity.getNumeroAcompanhante());
			
			convidados.add(c);
		}
		
		return convidados;	
	}
	
	@Override
	public void excluir(Long id) {
		
		repository.deleteById(id);
		
	}

	@Override
	public ConvidadoEntity editarPorId(long id) {

		return repository.findById(id).get();
		
	}

}
