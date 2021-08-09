// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IMendixObject;
import communitycommons.Misc;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Clones the contents of one image document into another, and generates a thumbnail as well. 
 * - fileToClone : the source file
 * - cloneTarget : an initialized file document, in which the file will be stored.
 * 
 * Returns true if copied, returns file if the source had no contents, throws exception in any other case.
 * Pre condition: HasContents of the 'fileToClone' need to be set to true, otherwise the action will not copy anything.
 */
public class DuplicateImageDocument extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __fileToClone;
	private system.proxies.Image fileToClone;
	private IMendixObject __cloneTarget;
	private system.proxies.Image cloneTarget;
	private java.lang.Long thumbWidth;
	private java.lang.Long thumbHeight;

	public DuplicateImageDocument(IContext context, IMendixObject fileToClone, IMendixObject cloneTarget, java.lang.Long thumbWidth, java.lang.Long thumbHeight)
	{
		super(context);
		this.__fileToClone = fileToClone;
		this.__cloneTarget = cloneTarget;
		this.thumbWidth = thumbWidth;
		this.thumbHeight = thumbHeight;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.fileToClone = __fileToClone == null ? null : system.proxies.Image.initialize(getContext(), __fileToClone);

		this.cloneTarget = __cloneTarget == null ? null : system.proxies.Image.initialize(getContext(), __cloneTarget);

		// BEGIN USER CODE
		return Misc.duplicateImage(this.getContext(), fileToClone.getMendixObject(), cloneTarget.getMendixObject(), thumbWidth.intValue(), thumbHeight.intValue());
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "DuplicateImageDocument";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}