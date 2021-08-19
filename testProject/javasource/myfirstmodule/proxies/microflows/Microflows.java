// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the MyFirstModule module
	public static void act_Transfer_Target_Change(IContext context, myfirstmodule.proxies.TransferContext _transferContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TransferContext", _transferContext == null ? null : _transferContext.getMendixObject());
		Core.microflowCall("MyFirstModule.Act_Transfer_Target_Change").withParams(params).execute(context);
	}
	public static void aMap_Change(IContext context, myfirstmodule.proxies.AMapPageContext _aMapPageContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("AMapPageContext", _aMapPageContext == null ? null : _aMapPageContext.getMendixObject());
		Core.microflowCall("MyFirstModule.AMap_Change").withParams(params).execute(context);
	}
	public static void aMap_Change_Center(IContext context, myfirstmodule.proxies.AMapMarkerDto _aMapMarkerDto, myfirstmodule.proxies.AMapPageContext _aMapPageContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("AMapMarkerDto", _aMapMarkerDto == null ? null : _aMapMarkerDto.getMendixObject());
		params.put("AMapPageContext", _aMapPageContext == null ? null : _aMapPageContext.getMendixObject());
		Core.microflowCall("MyFirstModule.AMap_Change_Center").withParams(params).execute(context);
	}
	public static myfirstmodule.proxies.AMapPageContext aMap_Datasource(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MyFirstModule.AMap_Datasource").withParams(params).execute(context);
		return result == null ? null : myfirstmodule.proxies.AMapPageContext.initialize(context, result);
	}
	public static void aMap_Marker_Selected(IContext context, myfirstmodule.proxies.AMapMarkerDto _aMapMarkerDto)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("AMapMarkerDto", _aMapMarkerDto == null ? null : _aMapMarkerDto.getMendixObject());
		Core.microflowCall("MyFirstModule.AMap_Marker_Selected").withParams(params).execute(context);
	}
	public static myfirstmodule.proxies.TransferContext dS_Transfer(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MyFirstModule.DS_Transfer").withParams(params).execute(context);
		return result == null ? null : myfirstmodule.proxies.TransferContext.initialize(context, result);
	}
	public static void select_Show(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MyFirstModule.Select_Show").withParams(params).execute(context);
	}
	public static void x6_Change(IContext context, myfirstmodule.proxies.X6Context _x6Context, myfirstmodule.proxies.X6Node _x6Node)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("X6Context", _x6Context == null ? null : _x6Context.getMendixObject());
		params.put("X6Node", _x6Node == null ? null : _x6Node.getMendixObject());
		Core.microflowCall("MyFirstModule.X6_Change").withParams(params).execute(context);
	}
	public static myfirstmodule.proxies.X6Context x6_Context(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MyFirstModule.X6_Context").withParams(params).execute(context);
		return result == null ? null : myfirstmodule.proxies.X6Context.initialize(context, result);
	}
	public static void x6_Select(IContext context, myfirstmodule.proxies.X6Context _x6Context, myfirstmodule.proxies.X6Node _x6Node)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("X6Context", _x6Context == null ? null : _x6Context.getMendixObject());
		params.put("X6Node", _x6Node == null ? null : _x6Node.getMendixObject());
		Core.microflowCall("MyFirstModule.X6_Select").withParams(params).execute(context);
	}
}