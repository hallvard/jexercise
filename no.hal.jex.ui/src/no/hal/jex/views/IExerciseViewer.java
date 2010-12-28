package no.hal.jex.views;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.resource.JexResource;

import org.eclipse.swt.widgets.Control;


public interface IExerciseViewer {
	
	public JexResource getExerciseResource();
	public void setExerciseResource(JexResource res);
	
	public AbstractRequirement getSelectedRequirement();
	public void setSelectedRequirement(AbstractRequirement req);
	
	public void updateViewer(AbstractRequirement req);
	
	public Control getControl();
	
	public void addExerciseListener(ExerciseListener listener);
	public void removeExerciseListener(ExerciseListener listener);
}
