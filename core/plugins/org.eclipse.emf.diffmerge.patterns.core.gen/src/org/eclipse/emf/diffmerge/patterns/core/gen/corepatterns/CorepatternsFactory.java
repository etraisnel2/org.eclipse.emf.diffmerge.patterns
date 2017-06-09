/**
 * <copyright>
 * 
 * Copyright (c) 2010-2017 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S. - initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.emf.diffmerge.patterns.core.gen.corepatterns;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.diffmerge.patterns.core.gen.corepatterns.CorepatternsPackage
 * @generated
 */
public interface CorepatternsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorepatternsFactory eINSTANCE = org.eclipse.emf.diffmerge.patterns.core.gen.corepatterns.impl.CorepatternsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pattern Role Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Role Binding</em>'.
	 * @generated
	 */
	PatternRoleBinding createPatternRoleBinding();

	/**
	 * Returns a new object of class '<em>Pattern Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Symbol</em>'.
	 * @generated
	 */
	PatternSymbol createPatternSymbol();

	/**
	 * Returns a new object of class '<em>Pattern Role Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Role Symbol</em>'.
	 * @generated
	 */
	PatternRoleSymbol createPatternRoleSymbol();

	/**
	 * Returns a new object of class '<em>Pattern Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Version</em>'.
	 * @generated
	 */
	PatternVersion createPatternVersion();

	/**
	 * Returns a new object of class '<em>Composite Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Location</em>'.
	 * @generated
	 */
	CompositeLocation createCompositeLocation();

	/**
	 * Returns a new object of class '<em>Pattern Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Repository</em>'.
	 * @generated
	 */
	PatternRepository createPatternRepository();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CorepatternsPackage getCorepatternsPackage();

} //CorepatternsFactory
