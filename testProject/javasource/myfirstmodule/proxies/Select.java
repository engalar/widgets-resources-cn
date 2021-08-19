// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Select
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject selectMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Select";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Valeu("Valeu"),
		Label("Label");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Select(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Select"));
	}

	protected Select(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject selectMendixObject)
	{
		if (selectMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Select", selectMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Select");

		this.selectMendixObject = selectMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Select.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Select initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Select.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Select initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Select(context, mendixObject);
	}

	public static myfirstmodule.proxies.Select load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Select.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Select> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Select> result = new java.util.ArrayList<myfirstmodule.proxies.Select>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Select" + xpathConstraint))
			result.add(myfirstmodule.proxies.Select.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Valeu
	 */
	public final java.lang.String getValeu()
	{
		return getValeu(getContext());
	}

	/**
	 * @param context
	 * @return value of Valeu
	 */
	public final java.lang.String getValeu(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Valeu.toString());
	}

	/**
	 * Set value of Valeu
	 * @param valeu
	 */
	public final void setValeu(java.lang.String valeu)
	{
		setValeu(getContext(), valeu);
	}

	/**
	 * Set value of Valeu
	 * @param context
	 * @param valeu
	 */
	public final void setValeu(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String valeu)
	{
		getMendixObject().setValue(context, MemberNames.Valeu.toString(), valeu);
	}

	/**
	 * @return value of Label
	 */
	public final java.lang.String getLabel()
	{
		return getLabel(getContext());
	}

	/**
	 * @param context
	 * @return value of Label
	 */
	public final java.lang.String getLabel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Label.toString());
	}

	/**
	 * Set value of Label
	 * @param label
	 */
	public final void setLabel(java.lang.String label)
	{
		setLabel(getContext(), label);
	}

	/**
	 * Set value of Label
	 * @param context
	 * @param label
	 */
	public final void setLabel(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String label)
	{
		getMendixObject().setValue(context, MemberNames.Label.toString(), label);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return selectMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Select that = (myfirstmodule.proxies.Select) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.Select";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
