// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package antmenu.proxies;

public class Menu
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject menuMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AntMenu.Menu";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		IsFolder("IsFolder"),
		Icon("Icon"),
		Title("Title"),
		Menu_Menu_Parent("AntMenu.Menu_Menu_Parent");

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

	public Menu(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "AntMenu.Menu"));
	}

	protected Menu(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject menuMendixObject)
	{
		if (menuMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("AntMenu.Menu", menuMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a AntMenu.Menu");

		this.menuMendixObject = menuMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Menu.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static antmenu.proxies.Menu initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return antmenu.proxies.Menu.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static antmenu.proxies.Menu initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new antmenu.proxies.Menu(context, mendixObject);
	}

	public static antmenu.proxies.Menu load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return antmenu.proxies.Menu.initialize(context, mendixObject);
	}

	public static java.util.List<antmenu.proxies.Menu> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<antmenu.proxies.Menu> result = new java.util.ArrayList<antmenu.proxies.Menu>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//AntMenu.Menu" + xpathConstraint))
			result.add(antmenu.proxies.Menu.initialize(context, obj));
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
	 * @return value of IsFolder
	 */
	public final java.lang.Boolean getIsFolder()
	{
		return getIsFolder(getContext());
	}

	/**
	 * @param context
	 * @return value of IsFolder
	 */
	public final java.lang.Boolean getIsFolder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsFolder.toString());
	}

	/**
	 * Set value of IsFolder
	 * @param isfolder
	 */
	public final void setIsFolder(java.lang.Boolean isfolder)
	{
		setIsFolder(getContext(), isfolder);
	}

	/**
	 * Set value of IsFolder
	 * @param context
	 * @param isfolder
	 */
	public final void setIsFolder(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isfolder)
	{
		getMendixObject().setValue(context, MemberNames.IsFolder.toString(), isfolder);
	}

	/**
	 * @return value of Icon
	 */
	public final java.lang.String getIcon()
	{
		return getIcon(getContext());
	}

	/**
	 * @param context
	 * @return value of Icon
	 */
	public final java.lang.String getIcon(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Icon.toString());
	}

	/**
	 * Set value of Icon
	 * @param icon
	 */
	public final void setIcon(java.lang.String icon)
	{
		setIcon(getContext(), icon);
	}

	/**
	 * Set value of Icon
	 * @param context
	 * @param icon
	 */
	public final void setIcon(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String icon)
	{
		getMendixObject().setValue(context, MemberNames.Icon.toString(), icon);
	}

	/**
	 * @return value of Title
	 */
	public final java.lang.String getTitle()
	{
		return getTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of Title
	 */
	public final java.lang.String getTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Title.toString());
	}

	/**
	 * Set value of Title
	 * @param title
	 */
	public final void setTitle(java.lang.String title)
	{
		setTitle(getContext(), title);
	}

	/**
	 * Set value of Title
	 * @param context
	 * @param title
	 */
	public final void setTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String title)
	{
		getMendixObject().setValue(context, MemberNames.Title.toString(), title);
	}

	/**
	 * @return value of Menu_Menu_Parent
	 */
	public final antmenu.proxies.Menu getMenu_Menu_Parent() throws com.mendix.core.CoreException
	{
		return getMenu_Menu_Parent(getContext());
	}

	/**
	 * @param context
	 * @return value of Menu_Menu_Parent
	 */
	public final antmenu.proxies.Menu getMenu_Menu_Parent(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		antmenu.proxies.Menu result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Menu_Menu_Parent.toString());
		if (identifier != null)
			result = antmenu.proxies.Menu.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Menu_Menu_Parent
	 * @param menu_menu_parent
	 */
	public final void setMenu_Menu_Parent(antmenu.proxies.Menu menu_menu_parent)
	{
		setMenu_Menu_Parent(getContext(), menu_menu_parent);
	}

	/**
	 * Set value of Menu_Menu_Parent
	 * @param context
	 * @param menu_menu_parent
	 */
	public final void setMenu_Menu_Parent(com.mendix.systemwideinterfaces.core.IContext context, antmenu.proxies.Menu menu_menu_parent)
	{
		if (menu_menu_parent == null)
			getMendixObject().setValue(context, MemberNames.Menu_Menu_Parent.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Menu_Menu_Parent.toString(), menu_menu_parent.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return menuMendixObject;
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
			final antmenu.proxies.Menu that = (antmenu.proxies.Menu) obj;
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
		return "AntMenu.Menu";
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