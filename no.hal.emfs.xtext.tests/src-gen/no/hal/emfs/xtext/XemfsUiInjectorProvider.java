/*
* generated by Xtext
*/
package no.hal.emfs.xtext;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class XemfsUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return no.hal.emfs.xtext.ui.internal.XemfsActivator.getInstance().getInjector("no.hal.emfs.xtext.Xemfs");
	}
	
}
