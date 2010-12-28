package no.hal.jex.views;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.JavaRequirement;

public interface ExerciseListener {
	public void requirementSelected(AbstractRequirement req);
	public void requirementValidationRequested(JavaRequirement req);
}
