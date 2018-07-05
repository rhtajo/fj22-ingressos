package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

public class DescontoParaEstudante implements Desconto {

	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		// TODO Auto-generated method stub
		return precoOriginal.multiply(new BigDecimal("0.5"));
	}

}
