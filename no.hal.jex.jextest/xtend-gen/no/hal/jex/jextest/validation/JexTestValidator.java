/**
 * generated by Xtext
 */
package no.hal.jex.jextest.validation;

import java.util.Collection;
import java.util.Iterator;
import no.hal.jex.jextest.jexTest.JexTestPackage.Literals;
import no.hal.jex.jextest.jexTest.Method;
import no.hal.jex.jextest.jexTest.Parameter;
import no.hal.jex.jextest.jexTest.StateFunction;
import no.hal.jex.jextest.validation.AbstractJexTestValidator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.XExpression;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class JexTestValidator extends AbstractJexTestValidator {
  public void checkInnerExpressions(final XExpression expr) {
  }
  
  public boolean checkVarargIsLast(final Collection<Parameter> parameters, final EStructuralFeature feature) {
    boolean _xblockexpression = false;
    {
      final Iterator<Parameter> iterator = parameters.iterator();
      boolean _hasNext = iterator.hasNext();
      boolean _while = _hasNext;
      while (_while) {
        boolean _and = false;
        Parameter _next = iterator.next();
        boolean _isVararg = _next.isVararg();
        if (!_isVararg) {
          _and = false;
        } else {
          boolean _hasNext_1 = iterator.hasNext();
          _and = (_isVararg && _hasNext_1);
        }
        if (_and) {
          this.error("Only the last paramter can be a vararg", feature);
        }
        boolean _hasNext_2 = iterator.hasNext();
        _while = _hasNext_2;
      }
      _xblockexpression = (true);
    }
    return _xblockexpression;
  }
  
  @Check
  public boolean checkVarargIsLast(final StateFunction method) {
    EList<Parameter> _parameters = method.getParameters();
    boolean _checkVarargIsLast = this.checkVarargIsLast(_parameters, Literals.STATE_FUNCTION__PARAMETERS);
    return _checkVarargIsLast;
  }
  
  @Check
  public boolean checkVarargIsLast(final Method method) {
    EList<Parameter> _parameters = method.getParameters();
    boolean _checkVarargIsLast = this.checkVarargIsLast(_parameters, Literals.METHOD__PARAMETERS);
    return _checkVarargIsLast;
  }
}
