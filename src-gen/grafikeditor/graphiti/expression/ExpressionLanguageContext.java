package grafikeditor.graphiti.expression;

import javax.el.BeanELResolver;
import javax.el.CompositeELResolver;
import javax.el.ELContext;
import javax.el.ELResolver;
import javax.el.FunctionMapper;
import javax.el.VariableMapper;

public class ExpressionLanguageContext extends ELContext {

	private Object o;

	public ExpressionLanguageContext(Object o) {
		this.o = o;
	}

	@Override
	public VariableMapper getVariableMapper() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FunctionMapper getFunctionMapper() {
		return null;
	}

	@Override
	public ELResolver getELResolver() {
		CompositeELResolver compELRes = new CompositeELResolver();
		compELRes.add(new BeanELResolver(true));
		compELRes.add(new ExpressionLanguageResolver(o));
		return compELRes;
	}

}