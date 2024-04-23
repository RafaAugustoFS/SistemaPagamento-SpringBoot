package br.com.pagamento.sistema.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pagamento.sistema.model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

	
}
