package br.com.pagamento.sistema.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pagamento.sistema.exception.PagamentoNotFoundException;
import br.com.pagamento.sistema.model.Pagamento;
import br.com.pagamento.sistema.repo.PagamentoRepository;
import br.com.pagamento.sistema.service.IPagamentoService;

@Service
public class PagamentoServiceImpl implements IPagamentoService  {

	@Autowired
	private PagamentoRepository repo;
	
	@Override
	public Pagamento salvarPagamento(Pagamento pagamento) {
		return repo.save(pagamento);
	}
	
	@Override
	public List<Pagamento> buscarTodosPagamentos() {
		return repo.findAll();
	}
	@Override
	public Pagamento buscarPagamentoUnico(Long id) {
		Optional<Pagamento> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		} else {
			throw new PagamentoNotFoundException("o ID:" + id + "não foi encontrado");
		}
	}
	@Override
	public void deletarPagamento(Long id) {
		repo.delete(buscarPagamentoUnico(id));
	}
	
	@Override
	public void atualizarPagamento(Pagamento pagamento) {
		repo.save(pagamento);
	}
	
}
