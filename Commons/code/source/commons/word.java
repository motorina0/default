package commons;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2012-10-16 15:44:51 CEST
// -----( ON-HOST: uniqawm.uniqa.at

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import org.apache.commons.lang.WordUtils;
// --- <<IS-END-IMPORTS>> ---

public final class word

{
	// ---( internal utility methods )---

	final static word _instance = new word();

	static word _newInstance() { return new word(); }

	static word _cast(Object o) { return (word)o; }

	// ---( server methods )---




	public static final void capitalize (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(capitalize)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );				
			
			String value = WordUtils.capitalize(str);
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



	public static final void capitalizeFully (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(capitalizeFully)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );				
			
			String value = WordUtils.capitalizeFully(str);
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



	public static final void capitalizeFullyWithDelimiters (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(capitalizeFullyWithDelimiters)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:1:required delimiters
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String[] delimiters = IDataUtil.getStringArray(pipelineCursor, "delimiters");
		
			char[] delimitersChar = new char[delimiters.length];
			for (int i=0; i<delimiters.length; i++){
				delimitersChar[i] = delimiters[i].charAt(0);
			}
			String value = WordUtils.capitalizeFully(str, delimitersChar);
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



	public static final void capitalizeWithDelimiters (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(capitalizeWithDelimiters)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:1:required delimiters
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String[] delimiters = IDataUtil.getStringArray(pipelineCursor, "delimiters");
		
			char[] delimitersChar = new char[delimiters.length];
			for (int i=0; i<delimiters.length; i++){
				delimitersChar[i] = delimiters[i].charAt(0);
			}
			String value = WordUtils.capitalize(str, delimitersChar);
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



	public static final void initials (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(initials)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );				
			
			String value = WordUtils.initials(str);
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



	public static final void initialsWithDelimiters (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(initialsWithDelimiters)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:1:required delimiters
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String[] delimiters = IDataUtil.getStringArray(pipelineCursor, "delimiters");
		
			char[] delimitersChar = new char[delimiters.length];
			for (int i=0; i<delimiters.length; i++){
				delimitersChar[i] = delimiters[i].charAt(0);
			}
			String value = WordUtils.initials(str, delimitersChar);
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



	public static final void swapCase (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(swapCase)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );				
			
			String value = WordUtils.swapCase(str);
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



	public static final void uncapitalize (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(uncapitalize)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );				
			
			String value = WordUtils.uncapitalize(str);
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



	public static final void uncapitalizeWithDelimiters (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(uncapitalizeWithDelimiters)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:1:required delimiters
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String[] delimiters = IDataUtil.getStringArray(pipelineCursor, "delimiters");
		
			char[] delimitersChar = new char[delimiters.length];
			for (int i=0; i<delimiters.length; i++){
				delimitersChar[i] = delimiters[i].charAt(0);
			}
			String value = WordUtils.uncapitalize(str, delimitersChar);
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



	public static final void wrap (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(wrap)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] object:0:required wrapLength
		
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );				
			int wrapLength = IDataUtil.getInt(pipelineCursor, "wrapLength", 0);			
			String value = WordUtils.wrap(str, wrapLength);
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



	public static final void wrapMultipleLines (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(wrapMultipleLines)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] object:0:required wrapLength
		// [i] field:0:required newLineStr
		// [i] object:0:required wrapLongWords
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );		
			String	newLineStr = IDataUtil.getString( pipelineCursor, "newLineStr" );
			int wrapLength = IDataUtil.getInt(pipelineCursor, "wrapLength", 0);		
			boolean wrapLongWords = IDataUtil.getBoolean(pipelineCursor, "wrapLongWords");
			
			String value = WordUtils.wrap(str,wrapLength, newLineStr, wrapLongWords);
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

