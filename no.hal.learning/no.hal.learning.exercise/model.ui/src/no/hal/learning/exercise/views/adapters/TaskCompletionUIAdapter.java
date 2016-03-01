package no.hal.learning.exercise.views.adapters;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapterImpl;
import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.TaskProposal;

public class TaskCompletionUIAdapter<A extends TaskAnswer> extends EObjectUIAdapterImpl<TaskProposal<A>, Composite> implements ProposalUIAdapter<TaskProposal<A>, Composite>, SelectionListener, MouseListener, DisposeListener {

	public TaskCompletionUIAdapter(TaskProposal<A> proposal) {
		super(proposal);
	}

	@Override
	public TaskProposal<A> getProposal() {
		return eObject;
	}
	
	private double[] levels = {0.0,	0.25, 0.5, 0.75, 1.0};
	private Color colors[], defaultColor;


	public void setLevels(double... levels) {
		this.levels = new double[levels.length];
		System.arraycopy(levels, 0, this.levels, 0, levels.length);
	}

	public void setColors(Color... colors) {
		disposeColors();
		this.colors = new Color[colors.length];
		System.arraycopy(colors, 0, this.colors, 0, colors.length);
	}

	protected static Color createColor(int red, int green, int blue, Control context) {
		return new Color(context.getDisplay(), red, green, blue);		
	}

	protected static Color createColor(int rgb, Control context) {
		return createColor((rgb >> 16) & 255, (rgb >> 8) & 255, rgb & 255, context);		
	}

	protected static Color createColor(double red, double green, double blue, Control context) {
		return createColor((int) (255 * red), (int) (255 * green), (int) (255 * blue), context);		
	}

	protected static Color createColor(double level, Control context) {
		return createColor(level, level, level, context);		
	}

	protected static Color[] createColors(double[] levels, Control context) {
		Color[] colors = new Color[levels.length];
		for (int i = 0; i < levels.length; i++) {
			colors[i] = createColor(levels[i], context);
		}
		return colors;
	}

	protected static Color[] createColors(int[] colorIds, Control context) {
		Color[] colors = new Color[colorIds.length];
		for (int i = 0; i < colorIds.length; i++) {
			Color color = context.getDisplay().getSystemColor(colorIds[i]);
			colors[i] = new Color(context.getDisplay(), color.getRed(), color.getGreen(), color.getBlue());
		}
		return colors;
	}

	private boolean editable = false;
	private String defaultLabel = " ";
	
	@Override
	public Composite initView(Composite parent) {
		colors = new Color[] {
				createColor(255, 0, 0, parent),
				createColor(255, 153, 51, parent),
				createColor(255, 255, 0, parent),
				createColor(153, 255, 51, parent),
				createColor(0, 255, 0, parent),
		};
		defaultColor = createColor(0, 0, 0, parent);
//		createColors(levels, parent);
		Composite view = new Composite(parent, SWT.NONE);
		setView(view);
		view.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false));
		view.setLayout(new GridLayout(levels.length, true));
		for (int i = 0; i < levels.length; i++) {
			Label control = new Label(view, SWT.BORDER);
			String label = defaultLabel;
			control.setText(label);
			control.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_BLACK));
			control.setEnabled(editable);
			if (editable) {
				control.addMouseListener(this);
			}
		}
		updateView();
		return view;
	}
	
	@Override
	public void widgetDisposed(DisposeEvent e) {
		disposeColors();
	}

	protected void disposeColors() {
		if (colors != null) {
			for (int i = 0; i < colors.length; i++) {
				if (colors[i] != null && (! colors[i].isDisposed())) {
					colors[i].dispose();
				}
			}
			colors = null;
		}
	}

	@Override
	public void updateView() {
		double completion = getProposal().getCompletion();
		int controlNum = 0;
		Control[] controls = getView().getChildren();
		for (int i = 0; i < controls.length; i++) {
			Control control = controls[i];
			if (isCompletionControl(control)) {
				boolean selected = completion >= levels[controlNum];
				Color color = (selected ? colors[controlNum] : defaultColor);
				control.setBackground(color);
				controlNum++;
			}
		}
	}

	protected boolean isCompletionControl(Control control) {
		return control instanceof Label;
	}
	
	@Override
	public void updateModel() {
	}
	
	protected void updateModel(int controlNum) {
		updateModel(levels[controlNum]);
	}

	protected void updateModel(double completion) {
		getProposal().setCompletion(completion);
	}
	
	protected void updateModel(Object source) {
		int controlNum = 0;
		Control[] controls = getView().getChildren();
		for (int i = 0; i < controls.length; i++) {
			Control control = controls[i];
			if (isCompletionControl(control)) {
				if (control == source) {
					updateModel(controlNum);
					break;
				}
				controlNum++;
			}
		}
	}
	
	//

	@Override
	public void widgetSelected(SelectionEvent e) {
		updateModel(e.getSource());
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
	}
	
	@Override
	public void mouseDown(MouseEvent e) {
	}
	@Override
	public void mouseUp(MouseEvent e) {
	}
	@Override
	public void mouseDoubleClick(MouseEvent e) {
		updateModel(e.getSource());
	}
}
