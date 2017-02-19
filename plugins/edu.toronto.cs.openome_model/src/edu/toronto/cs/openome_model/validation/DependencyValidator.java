/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.toronto.cs.openome_model.validation;

import edu.toronto.cs.openome_model.Dependable;
import edu.toronto.cs.openome_model.Model;

/**
 * A sample validator interface for {@link edu.toronto.cs.openome_model.Dependency}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DependencyValidator {
	boolean validate();

	boolean validateDependencyFrom(Dependable value);
	boolean validateDependencyTo(Dependable value);
	boolean validateTrust(float value);
	boolean validateLabel(String value);
	boolean validateModel(Model value);
}
