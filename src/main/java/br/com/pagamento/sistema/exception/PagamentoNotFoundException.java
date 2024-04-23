package br.com.pagamento.sistema.exception;

public class PagamentoNotFoundException extends RuntimeException {

	//IDENTIFICADOR DE VERSÃO
	//CLASSE SERIALIZABLE
	//FINAL A VARIÁVEL É DEFINIDA APENAS UMA VEZ, COMO O CONST
	//LONG => UM INT COM MAIOR QUANTIDADE DE DÍGITOS                                      
	private static final long serialVersionUID = 1L;
	
	//CONSTRUTOR VAZIO
	public PagamentoNotFoundException() {
		super();
	}

	//CONSTRUTOR COM UMA MENSAGEM
	public  PagamentoNotFoundException(String mensagemCustomizada) {
		super(mensagemCustomizada);
	}
}
