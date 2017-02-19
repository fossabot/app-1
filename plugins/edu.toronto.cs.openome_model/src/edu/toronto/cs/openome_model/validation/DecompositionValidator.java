/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.toronto.cs.openome_model.validation;

import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Model;

/**
 * A sample validator interface for {@link edu.toronto.cs.openome_model.Decomposition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DecompositionValidator {
	boolean validate();

	boolean validateSource(Intention value);
	boolean validateTarget(Intention value);
	boolean validateModel(Model value);
}
