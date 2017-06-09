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
package org.eclipse.emf.diffmerge.patterns.core.gen.corepatterns.provider;

import org.eclipse.emf.diffmerge.patterns.core.gen.corepatterns.util.CorepatternsAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CorepatternsItemProviderAdapterFactory extends CorepatternsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorepatternsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.diffmerge.patterns.core.gen.corepatterns.CompositeLocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeLocationItemProvider compositeLocationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.diffmerge.patterns.core.gen.corepatterns.CompositeLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeLocationAdapter() {
		if (compositeLocationItemProvider == null) {
			compositeLocationItemProvider = new CompositeLocationItemProvider(this);
		}

		return compositeLocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.diffmerge.patterns.core.gen.corepatterns.PatternRepository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternRepositoryItemProvider patternRepositoryItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.diffmerge.patterns.core.gen.corepatterns.PatternRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPatternRepositoryAdapter() {
		if (patternRepositoryItemProvider == null) {
			patternRepositoryItemProvider = new PatternRepositoryItemProvider(this);
		}

		return patternRepositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.diffmerge.patterns.core.gen.corepatterns.PatternRoleBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternRoleBindingItemProvider patternRoleBindingItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.diffmerge.patterns.core.gen.corepatterns.PatternRoleBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPatternRoleBindingAdapter() {
		if (patternRoleBindingItemProvider == null) {
			patternRoleBindingItemProvider = new PatternRoleBindingItemProvider(this);
		}

		return patternRoleBindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.diffmerge.patterns.core.gen.corepatterns.PatternRoleSymbol} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternRoleSymbolItemProvider patternRoleSymbolItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.diffmerge.patterns.core.gen.corepatterns.PatternRoleSymbol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPatternRoleSymbolAdapter() {
		if (patternRoleSymbolItemProvider == null) {
			patternRoleSymbolItemProvider = new PatternRoleSymbolItemProvider(this);
		}

		return patternRoleSymbolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.diffmerge.patterns.core.gen.corepatterns.PatternSymbol} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternSymbolItemProvider patternSymbolItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.diffmerge.patterns.core.gen.corepatterns.PatternSymbol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPatternSymbolAdapter() {
		if (patternSymbolItemProvider == null) {
			patternSymbolItemProvider = new PatternSymbolItemProvider(this);
		}

		return patternSymbolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.diffmerge.patterns.core.gen.corepatterns.PatternVersion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternVersionItemProvider patternVersionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.diffmerge.patterns.core.gen.corepatterns.PatternVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPatternVersionAdapter() {
		if (patternVersionItemProvider == null) {
			patternVersionItemProvider = new PatternVersionItemProvider(this);
		}

		return patternVersionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (compositeLocationItemProvider != null) compositeLocationItemProvider.dispose();
		if (patternRepositoryItemProvider != null) patternRepositoryItemProvider.dispose();
		if (patternRoleBindingItemProvider != null) patternRoleBindingItemProvider.dispose();
		if (patternRoleSymbolItemProvider != null) patternRoleSymbolItemProvider.dispose();
		if (patternSymbolItemProvider != null) patternSymbolItemProvider.dispose();
		if (patternVersionItemProvider != null) patternVersionItemProvider.dispose();
	}

}
