package commons;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2012-10-19 15:42:51 CEST
// -----( ON-HOST: uniqawm.uniqa.at

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import org.apache.commons.lang.math.NumberUtils;
// --- <<IS-END-IMPORTS>> ---

public final class number

{
	// ---( internal utility methods )---

	final static number _instance = new number();

	static number _newInstance() { return new number(); }

	static number _cast(Object o) { return (number)o; }

	// ---( server methods )---




	public static final void compareDoubles (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(compareDoubles)>> ---
		// @sigtype java 3.5
		// [i] object:0:required lhs
		// [i] object:0:required rhs
		// [o] object:0:required value
		
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			double	lhs = NumberUtils.createDouble(IDataUtil.getString( pipelineCursor, "lhs" ));				
			double	rhs = NumberUtils.createDouble(IDataUtil.getString( pipelineCursor, "rhs" ));
					
			int value = NumberUtils.compare(lhs, rhs);
			
			IDataCursor pipelineCursor_1 = pipeline.getCursor();
			IDataUtil.put( pipelineCursor_1, "value", value );
		
			pipelineCursor_1.destroy();
		}
		catch(Exception e)
		{
			throw new ServiceException(e);
		}	
		// --- <<IS-END>> ---

                
	}



	public static final void compareFloats (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(compareFloats)>> ---
		// @sigtype java 3.5
		// [i] object:0:required lhs
		// [i] object:0:required rhs
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			float	lhs = NumberUtils.createFloat(IDataUtil.getString( pipelineCursor, "lhs" ));				
			float	rhs = NumberUtils.createFloat(IDataUtil.getString( pipelineCursor, "rhs" ));
					
			int value = NumberUtils.compare(lhs, rhs);
			
			IDataCursor pipelineCursor_1 = pipeline.getCursor();
			IDataUtil.put( pipelineCursor_1, "value", value );
		
			pipelineCursor_1.destroy();
		}
		catch(Exception e)
		{
			throw new ServiceException(e);
		}	
		// --- <<IS-END>> ---

                
	}



	public static final void createDouble (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(createDouble)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] object:0:required value
		
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );				
						
			double value = NumberUtils.createDouble(str);
			IDataCursor pipelineCursor_1 = pipeline.getCursor();
			IDataUtil.put( pipelineCursor_1, "value", value );
		
			pipelineCursor_1.destroy();
		}
		catch(Exception e)
		{
			throw new ServiceException(e);
		}
		// --- <<IS-END>> ---

                
	}



	public static final void createFloat (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(createFloat)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );				
						
			float value = NumberUtils.createFloat(str);
			IDataCursor pipelineCursor_1 = pipeline.getCursor();
			IDataUtil.put( pipelineCursor_1, "value", value );
		
			pipelineCursor_1.destroy();
		}
		catch(Exception e)
		{
			throw new ServiceException(e);
		}
		// --- <<IS-END>> ---

                
	}



	public static final void createInteger (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(createInteger)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );				
						
			int value = NumberUtils.createInteger(str);
			IDataCursor pipelineCursor_1 = pipeline.getCursor();
			IDataUtil.put( pipelineCursor_1, "value", value );
		
			pipelineCursor_1.destroy();
		}
		catch(Exception e)
		{
			throw new ServiceException(e);
		}
		// --- <<IS-END>> ---

                
	}



	public static final void isDigits (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isDigits)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );				
						
			boolean value = NumberUtils.isDigits(str);
			IDataCursor pipelineCursor_1 = pipeline.getCursor();
			IDataUtil.put( pipelineCursor_1, "value", value );
		
			pipelineCursor_1.destroy();
		}
		catch(Exception e)
		{
			throw new ServiceException(e);
		}
			
		// --- <<IS-END>> ---

                
	}



	public static final void isNumber (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isNumber)>> ---
		// @sigtype java 3.5
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );				
						
			boolean value = NumberUtils.isNumber(str);
			IDataCursor pipelineCursor_1 = pipeline.getCursor();
			IDataUtil.put( pipelineCursor_1, "value", value );
		
			pipelineCursor_1.destroy();
		}
		catch(Exception e)
		{
			throw new ServiceException(e);
		}
			
		// --- <<IS-END>> ---

                
	}
}

