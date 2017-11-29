package br.inatel.pos.mobile.dm110.impl;

import br.inatel.pos.mobile.dm110.api.CalculadoraService;
import br.inatel.pos.mobile.dm110.api.Result;

public class CalculadoraServiceImpl implements CalculadoraService {

	@Override
	public Result sum(Integer first, Integer second) {
		Integer sumResult = first + second;

		Result result = new Result();
		result.setFirst(first);
		result.setSecond(second);
		result.setResult(sumResult);
		return result;
	}

	@Override
	public Result subtract(Integer first, Integer second) {
		Integer subtractResult = first - second;

		Result result = new Result();
		result.setFirst(first);
		result.setSecond(second);
		result.setResult(subtractResult);
		return result;
	}

}
