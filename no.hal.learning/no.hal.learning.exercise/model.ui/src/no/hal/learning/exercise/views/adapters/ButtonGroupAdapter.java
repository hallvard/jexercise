package no.hal.learning.exercise.views.adapters;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapterImpl;
import no.hal.learning.exercise.Proposal;

public abstract class ButtonGroupAdapter<P extends Proposal<?>> extends EObjectUIAdapterImpl<P, Composite> implements ProposalUIAdapter<P, Composite>, SelectionListener {

	protected List<String> labels;
	protected List<Object> values;
	
	public ButtonGroupAdapter(P proposal) {
		super(proposal);
	}

	@Override
	public P getProposal() {
		return eObject;
	}
	
	@Override
	public Composite initView(Composite parent) {
		Composite view = new Composite(parent, SWT.NONE);
		setView(view);
		view.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false));
		view.setLayout(new GridLayout(2, true));
		int buttonStyle = (isSingleSelection() ? SWT.RADIO : SWT.CHECK);
		for (int i = 0; i < labels.size(); i++) {
			Button button = createButton(labels.get(i), view, buttonStyle);
			button.addSelectionListener(this);
		}
		updateView();
		return view;
	}

	protected boolean isSingleSelection() {
		return (! (getAnswerValue() instanceof Collection<?>));
	}
	
	private Button createButton(String text, Composite parent, int style) {
		Button button = new Button(parent, style);
		button.setText(text);
		return button;
	}

	protected Object getAnswerValue() {
		return getProposal().getProposal();
	}
	
	@Override
	public void updateView() {
		updateView(getAnswerValue(), getView().getChildren());
	}

	protected void updateView(Object value, Control... buttons) {
		int buttonNum = 0;
		for (int i = 0; i < buttons.length; i++) {
			if (buttons[i] instanceof Button) {
				Object buttonValue = values.get(buttonNum);
				boolean selected = isSelected(value, buttonValue, buttonNum);
				updateButton((Button) buttons[i], selected);
				buttonNum++;
			}
		}
	}

	protected boolean isSelected(Object value, Object buttonValue, int buttonNum) {
		boolean selected = buttonValue.equals(value);
		if (value instanceof Collection<?>) {
			Collection<?> col = (Collection<?>) value;
			selected = col.contains(buttonValue) || col.contains(buttonNum);
		}
		return selected;
	}
	
	protected void updateButton(Button button, boolean value) {
		if (button.getSelection() != value) {
			button.setSelection(value);
		}
	}

	@Override
	public void updateModel() {
		updateModel(getView().getChildren());
	}

	protected abstract void setAnswerValue(Object value);

	protected void updateModel(Control... buttons) {
		Object value = getAnswerValue();
		Collection<Integer> indices = null;
		int buttonNum = 0;
		for (int i = 0; i < buttons.length; i++) {
			if (buttons[i] instanceof Button) {
				if (((Button) buttons[i]).getSelection()) {
					if (value instanceof Collection<?>) {
						if (indices == null) {
							indices = new ArrayList<Integer>(); 
						}
						indices.add(buttonNum);
					} else {
						setAnswerValue(values.get(buttonNum));
					}
				}
				buttonNum++;
			}
		}
		if (indices != null) {
			setAnswerValue(indices);
		}
	}

	//

	@Override
	public void widgetSelected(SelectionEvent e) {
		updateModel();
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
	}	
}
