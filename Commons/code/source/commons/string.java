package commons;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2012-10-16 14:34:19 CEST
// -----( ON-HOST: uniqawm.uniqa.at

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.StringEscapeUtils;
// --- <<IS-END-IMPORTS>> ---

public final class string

{
	// ---( internal utility methods )---

	final static string _instance = new string();

	static string _newInstance() { return new string(); }

	static string _cast(Object o) { return (string)o; }

	// ---( server methods )---




	public static final void abbreviate (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(abbreviate)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] object:0:required maxWidth
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			int	maxWidth = IDataUtil.getInt(pipelineCursor, "maxWidth", 0);
		
			String value = StringUtils.abbreviate(str, maxWidth);
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



	public static final void abreviateWithOffset (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(abreviateWithOffset)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] object:0:required offset
		// [i] object:0:required maxWidth
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			int	offset = IDataUtil.getInt(pipelineCursor, "offset", 0);
			int	maxWidth = IDataUtil.getInt(pipelineCursor, "maxWidth", 0);
		
			String value = StringUtils.abbreviate(str, offset, maxWidth);
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



	public static final void capitalize (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(capitalize)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			String value = StringUtils.capitalize(str);
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



	public static final void center (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(center)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] object:0:required size
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
			int	size = IDataUtil.getInt( pipelineCursor, "size", 0 );
		
			String value = StringUtils.center(str, size);
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



	public static final void centerWithString (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(centerWithString)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required padStr
		// [i] object:0:required size
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
			String	padStr = IDataUtil.getString( pipelineCursor, "padStr" );	
			int	size = IDataUtil.getInt( pipelineCursor, "size", 0 );
		
			String value = StringUtils.center(str, size, 	padStr);
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



	public static final void chomp (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(chomp)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
		
		
			String value = StringUtils.chomp(str);
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



	public static final void chompWithSeparator (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(chompWithSeparator)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required separator
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	separator = IDataUtil.getString( pipelineCursor, "separator" );
		
		
			String value = StringUtils.chomp(str, separator);
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



	public static final void chop (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(chop)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
		
		
			String value = StringUtils.chop(str);
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



	public static final void contains (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(contains)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required searchStr
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	searchStr = IDataUtil.getString( pipelineCursor, "searchStr" );
			
		
			boolean value = StringUtils.contains(str, searchStr);
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



	public static final void containsIgnoreCase (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(containsIgnoreCase)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required searchStr
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	searchStr = IDataUtil.getString( pipelineCursor, "searchStr" );
			
		
			boolean value = StringUtils.containsIgnoreCase(str, searchStr);
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



	public static final void containsNone (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(containsNone)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required invalidChars
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	invalidChars = IDataUtil.getString( pipelineCursor, "invalidChars" );
			
		
			boolean value = StringUtils.containsNone(str, invalidChars);
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



	public static final void containsOnly (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(containsOnly)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required validChars
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	validChars = IDataUtil.getString( pipelineCursor, "validChars" );
			
		
			boolean value = StringUtils.containsOnly(str, validChars);
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



	public static final void countMatches (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(countMatches)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required sub
		// [o] object:0:required count
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
			String	sub = IDataUtil.getString( pipelineCursor, "sub" );	
		
			int count = StringUtils.countMatches(str, sub);
			IDataCursor pipelineCursor_1 = pipeline.getCursor();
			IDataUtil.put( pipelineCursor_1, "count", count );
		
			pipelineCursor_1.destroy();
		}
		catch(Exception e)
		{
			throw new ServiceException(e);
		}
		// --- <<IS-END>> ---

                
	}



	public static final void defaultIfEmpty (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(defaultIfEmpty)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required defaultStr
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
			String	defaultStr = IDataUtil.getString( pipelineCursor, "defaultStr" );	
		
			String value = StringUtils.defaultIfEmpty(str, defaultStr);
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



	public static final void defaultString (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(defaultString)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			String value = StringUtils.defaultString(str);
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



	public static final void defaultStringWithStr (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(defaultStringWithStr)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required defaultStr
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
			String	defaultStr = IDataUtil.getString( pipelineCursor, "defaultStr" );	
		
			String value = StringUtils.defaultString(str, defaultStr);
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



	public static final void deleteWhitespace (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(deleteWhitespace)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
		
			String value = StringUtils.deleteWhitespace(str);
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



	public static final void difference (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(difference)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str1
		// [i] field:0:required str2
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str1 = IDataUtil.getString( pipelineCursor, "str1" );
			String	str2 = IDataUtil.getString( pipelineCursor, "str2" );
			
		
			String value = StringUtils.difference(str1, str2);
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



	public static final void equalStrings (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(equalStrings)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str1
		// [i] field:0:required str2
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str1 = IDataUtil.getString( pipelineCursor, "str1" );
			String	str2 = IDataUtil.getString( pipelineCursor, "str2" );
			
		
			boolean value = StringUtils.equals(str1, str2);
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



	public static final void equalsIgnoreCase (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(equalsIgnoreCase)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str1
		// [i] field:0:required str2
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str1 = IDataUtil.getString( pipelineCursor, "str1" );
			String	str2 = IDataUtil.getString( pipelineCursor, "str2" );
			
		
			boolean value = StringUtils.equalsIgnoreCase(str1, str2);
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



	public static final void escapeHtml (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(escapeHtml)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			String value = StringEscapeUtils.escapeHtml(str);
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



	public static final void escapeJava (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(escapeJava)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			String value = StringEscapeUtils.escapeJava(str);
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



	public static final void escapeJavaScript (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(escapeJavaScript)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			String value = StringEscapeUtils.escapeJavaScript(str);
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



	public static final void escapeSql (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(escapeSql)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			String value = StringEscapeUtils.escapeSql(str);
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



	public static final void escapeXml (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(escapeXml)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			String value = StringEscapeUtils.escapeXml(str);
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



	public static final void getLevenshteinDistance (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getLevenshteinDistance)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required s
		// [i] field:0:required t
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str1 = IDataUtil.getString( pipelineCursor, "s" );
			String	str2 = IDataUtil.getString( pipelineCursor, "t" );
			
		
			int value = StringUtils.getLevenshteinDistance(str1, str2);
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



	public static final void indexOf (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(indexOf)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required searchStr
		// [o] object:0:required index
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	searchStr = IDataUtil.getString( pipelineCursor, "searchStr" );
			
		
			int index = StringUtils.indexOf(str, searchStr);
			IDataCursor pipelineCursor_1 = pipeline.getCursor();
			IDataUtil.put( pipelineCursor_1, "index", index );
		
			pipelineCursor_1.destroy();
		}
		catch(Exception e)
		{
			throw new ServiceException(e);
		}
		// --- <<IS-END>> ---

                
	}



	public static final void indexOfAny (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(indexOfAny)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required searchStr
		// [o] object:0:required index
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	searchStr = IDataUtil.getString( pipelineCursor, "searchStr" );
			
		
			int index = StringUtils.indexOfAny(str, searchStr);
			IDataCursor pipelineCursor_1 = pipeline.getCursor();
			IDataUtil.put( pipelineCursor_1, "index", index );
		
			pipelineCursor_1.destroy();
		}
		catch(Exception e)
		{
			throw new ServiceException(e);
		}
		// --- <<IS-END>> ---

                
	}



	public static final void indexOfAnyBut (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(indexOfAnyBut)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required searchStr
		// [o] object:0:required index
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	searchStr = IDataUtil.getString( pipelineCursor, "searchStr" );
			
		
			int index = StringUtils.indexOfAnyBut(str, searchStr);
			IDataCursor pipelineCursor_1 = pipeline.getCursor();
			IDataUtil.put( pipelineCursor_1, "index", index );
		
			pipelineCursor_1.destroy();
		}
		catch(Exception e)
		{
			throw new ServiceException(e);
		}
		// --- <<IS-END>> ---

                
	}



	public static final void indexOfAnyStringArray (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(indexOfAnyStringArray)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:1:required searchStrs
		// [o] object:0:required index
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String[]	searchStrs = IDataUtil.getStringArray( pipelineCursor, "searchStrs" );
			
		
			int index = StringUtils.indexOfAny(str, searchStrs);
			IDataCursor pipelineCursor_1 = pipeline.getCursor();
			IDataUtil.put( pipelineCursor_1, "index", index );
		
			pipelineCursor_1.destroy();
		}
		catch(Exception e)
		{
			throw new ServiceException(e);
		}
		// --- <<IS-END>> ---

                
	}



	public static final void indexOfDifference (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(indexOfDifference)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str1
		// [i] field:0:required str2
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str1 = IDataUtil.getString( pipelineCursor, "str1" );
			String	str2 = IDataUtil.getString( pipelineCursor, "str2" );
			
		
			int value = StringUtils.indexOfDifference(str1, str2);
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



	public static final void indexOfStartPos (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(indexOfStartPos)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required searchStr
		// [i] object:0:required startPos
		// [o] object:0:required index
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	searchStr = IDataUtil.getString( pipelineCursor, "searchStr" );
			int	startPos = IDataUtil.getInt( pipelineCursor, "startPos", 0 );
			
		
			int index = StringUtils.indexOf(str, searchStr, startPos);
			IDataCursor pipelineCursor_1 = pipeline.getCursor();
			IDataUtil.put( pipelineCursor_1, "index", index );
		
			pipelineCursor_1.destroy();
		}
		catch(Exception e)
		{
			throw new ServiceException(e);
		}
		// --- <<IS-END>> ---

                
	}



	public static final void isAlpha (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isAlpha)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			boolean value = StringUtils.isAlpha(str);
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



	public static final void isAlphaSpace (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isAlphaSpace)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			boolean value = StringUtils.isAlphaSpace(str);
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



	public static final void isAlphanumeric (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isAlphanumeric)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			boolean value = StringUtils.isAlphanumeric(str);
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



	public static final void isAlphanumericSpace (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isAlphanumericSpace)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			boolean value = StringUtils.isAlphanumericSpace(str);
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



	public static final void isAsciiPrintable (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isAsciiPrintable)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			boolean value = StringUtils.isAsciiPrintable(str);
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



	public static final void isBlank (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isBlank)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
		
			boolean value = StringUtils.isBlank(str);
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



	public static final void isEmpty (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isEmpty)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
		
			boolean value = StringUtils.isEmpty(str);
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



	public static final void isNotBlank (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isNotBlank)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
		
			boolean value = StringUtils.isNotBlank(str);
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



	public static final void isNotEmpty (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isNotEmpty)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
		
			boolean value = StringUtils.isNotEmpty(str);
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



	public static final void isNumeric (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isNumeric)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			boolean value = StringUtils.isNumeric(str);
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



	public static final void isNumericSpace (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isNumericSpace)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			boolean value = StringUtils.isNumericSpace(str);
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



	public static final void isWhitespace (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isWhitespace)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			boolean value = StringUtils.isWhitespace(str);
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



	public static final void join (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(join)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:required array
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String[] array = IDataUtil.getStringArray( pipelineCursor, "array" );
		
			String value = StringUtils.join(array);
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



	public static final void joinWithSeparator (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(joinWithSeparator)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:required array
		// [i] field:0:required separator
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String[] array = IDataUtil.getStringArray( pipelineCursor, "array" );
			String separator = IDataUtil.getString( pipelineCursor, "separator" );
		
			String value = StringUtils.join(array, separator);
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



	public static final void joinWithSeparatorAndIndex (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(joinWithSeparatorAndIndex)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:required array
		// [i] field:0:required separator
		// [i] object:0:required startIndex
		// [i] object:0:required endIndex
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String[] array = IDataUtil.getStringArray( pipelineCursor, "array" );
			String separator = IDataUtil.getString( pipelineCursor, "separator" );
			int	startIndex = IDataUtil.getInt( pipelineCursor, "startIndex", 0 );
			int	endIndex = IDataUtil.getInt( pipelineCursor, "endIndex", 0 );
		
			String value = StringUtils.join(array, separator, startIndex, endIndex);
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



	public static final void lastIndexOf (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(lastIndexOf)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required searchStr
		// [o] object:0:required index
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	searchStr = IDataUtil.getString( pipelineCursor, "searchStr" );
			
		
			int index = StringUtils.lastIndexOf(str, searchStr);
			IDataCursor pipelineCursor_1 = pipeline.getCursor();
			IDataUtil.put( pipelineCursor_1, "index", index );
		
			pipelineCursor_1.destroy();
		}
		catch(Exception e)
		{
			throw new ServiceException(e);
		}
		// --- <<IS-END>> ---

                
	}



	public static final void lastIndexOfAnyStringArray (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(lastIndexOfAnyStringArray)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:1:required searchStrs
		// [o] object:0:required index
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String[]	searchStrs = IDataUtil.getStringArray( pipelineCursor, "searchStrs" );
			
		
			int index = StringUtils.lastIndexOfAny(str, searchStrs);
			IDataCursor pipelineCursor_1 = pipeline.getCursor();
			IDataUtil.put( pipelineCursor_1, "index", index );
		
			pipelineCursor_1.destroy();
		}
		catch(Exception e)
		{
			throw new ServiceException(e);
		}
		// --- <<IS-END>> ---

                
	}



	public static final void lastIndexOfStartPos (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(lastIndexOfStartPos)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required searchStr
		// [i] object:0:required startPos
		// [o] object:0:required index
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	searchStr = IDataUtil.getString( pipelineCursor, "searchStr" );
			int	startPos = IDataUtil.getInt( pipelineCursor, "startPos", 0 );
			
		
			int index = StringUtils.lastIndexOf(str, searchStr, startPos);
			IDataCursor pipelineCursor_1 = pipeline.getCursor();
			IDataUtil.put( pipelineCursor_1, "index", index );
		
			pipelineCursor_1.destroy();
		}
		catch(Exception e)
		{
			throw new ServiceException(e);
		}
		// --- <<IS-END>> ---

                
	}



	public static final void left (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(left)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] object:0:required len
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			int	len = IDataUtil.getInt( pipelineCursor, "len", 0 );
			
		
			String value = StringUtils.left(str, len);
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



	public static final void leftPad (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(leftPad)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] object:0:required size
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
			int	size = IDataUtil.getInt( pipelineCursor, "size", 0 );
		
			String value = StringUtils.leftPad(str, size);
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



	public static final void leftPadWithString (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(leftPadWithString)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required padStr
		// [i] object:0:required size
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
			String	padStr = IDataUtil.getString( pipelineCursor, "padStr" );	
			int	size = IDataUtil.getInt( pipelineCursor, "size", 0 );
		
			String value = StringUtils.leftPad(str, size, 	padStr);
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



	public static final void lowerCase (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(lowerCase)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			String value = StringUtils.lowerCase(str);
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



	public static final void mid (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(mid)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] object:0:required pos
		// [i] object:0:required len
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			int	len = IDataUtil.getInt( pipelineCursor, "len", 0 );
			int	pos = IDataUtil.getInt( pipelineCursor, "pos", 0 );
			
		
			String value = StringUtils.mid(str, pos, len);
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



	public static final void ordinalIndexOf (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(ordinalIndexOf)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required searchStr
		// [i] object:0:required ordinal
		// [o] object:0:required index
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	searchStr = IDataUtil.getString( pipelineCursor, "searchStr" );
			int	ordinal = IDataUtil.getInt( pipelineCursor, "ordinal", 0 );
			
		
			int index = StringUtils.ordinalIndexOf(str, searchStr, ordinal);
			IDataCursor pipelineCursor_1 = pipeline.getCursor();
			IDataUtil.put( pipelineCursor_1, "index", index );
		
			pipelineCursor_1.destroy();
		}
		catch(Exception e)
		{
			throw new ServiceException(e);
		}
		// --- <<IS-END>> ---

                
	}



	public static final void overlay (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(overlay)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required overlay
		// [i] object:0:required start
		// [i] object:0:required end
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	overlay = IDataUtil.getString( pipelineCursor, "overlay" );
			int	start = IDataUtil.getInt( pipelineCursor, "start", 0);
			int	end = IDataUtil.getInt( pipelineCursor, "end", 0);
		
			String value = StringUtils.overlay(str, overlay ,start, end);
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



	public static final void remove (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(remove)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required remove
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	remove = IDataUtil.getString( pipelineCursor, "remove" );
		
			String value = StringUtils.remove(str, remove);
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



	public static final void removeEnd (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(removeEnd)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required remove
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	remove = IDataUtil.getString( pipelineCursor, "remove" );
		
			String value = StringUtils.removeEnd(str, remove);
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



	public static final void removeStart (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(removeStart)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required remove
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	remove = IDataUtil.getString( pipelineCursor, "remove" );
		
			String value = StringUtils.removeStart(str, remove);
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



	public static final void repeat (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(repeat)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] object:0:required repeat
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			int	repeat = IDataUtil.getInt( pipelineCursor, "repeat", 0);
		
			String value = StringUtils.repeat(str, repeat);
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



	public static final void replace (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(replace)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required repl
		// [i] field:0:required with
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	repl = IDataUtil.getString( pipelineCursor, "repl" );
			String	with = IDataUtil.getString( pipelineCursor, "with" );
		
			String value = StringUtils.replace(str, repl, with);
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



	public static final void replaceOnce (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(replaceOnce)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required repl
		// [i] field:0:required with
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	repl = IDataUtil.getString( pipelineCursor, "repl" );
			String	with = IDataUtil.getString( pipelineCursor, "with" );
		
			String value = StringUtils.replaceOnce(str, repl, with);
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



	public static final void replaceWithMax (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(replaceWithMax)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required repl
		// [i] field:0:required with
		// [i] object:0:required max
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	repl = IDataUtil.getString( pipelineCursor, "repl" );
			String	with = IDataUtil.getString( pipelineCursor, "with" );
			int	max = IDataUtil.getInt( pipelineCursor, "max", 0);
		
			String value = StringUtils.replace(str, repl, with, max);
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



	public static final void right (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(right)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] object:0:required len
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			int	len = IDataUtil.getInt( pipelineCursor, "len", 0 );
			
		
			String value = StringUtils.right(str, len);
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



	public static final void rightPad (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(rightPad)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] object:0:required size
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
			int	size = IDataUtil.getInt( pipelineCursor, "size", 0 );
		
			String value = StringUtils.rightPad(str, size);
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



	public static final void rightPadWithString (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(rightPadWithString)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required padStr
		// [i] object:0:required size
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
			String	padStr = IDataUtil.getString( pipelineCursor, "padStr" );	
			int	size = IDataUtil.getInt( pipelineCursor, "size", 0 );
		
			String value = StringUtils.rightPad(str, size, 	padStr);
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



	public static final void split (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(split)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:1:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
		
			String[] value = StringUtils.split(str);
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



	public static final void splitByWholeSeparator (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(splitByWholeSeparator)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required separator
		// [o] field:1:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	separator = IDataUtil.getString( pipelineCursor, "separator" );
		
			String[] value = StringUtils.splitByWholeSeparator(str, separator);
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



	public static final void splitByWholeSeparatorWithMax (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(splitByWholeSeparatorWithMax)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required separator
		// [i] object:0:optional max
		// [o] field:1:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	separator = IDataUtil.getString( pipelineCursor, "separator" );
			int	max = IDataUtil.getInt( pipelineCursor, "max", 0 );
		
			String[] value = StringUtils.splitByWholeSeparator(str, separator, max);
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



	public static final void splitPreserveAllTokens (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(splitPreserveAllTokens)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:1:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
		
			String[] value = StringUtils.splitPreserveAllTokens(str);
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



	public static final void splitPreserveAllTokensWithSeparator (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(splitPreserveAllTokensWithSeparator)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required separatorChars
		// [o] field:1:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	separatorChars = IDataUtil.getString( pipelineCursor, "separatorChars" );
		
			String[] value = StringUtils.splitPreserveAllTokens(str, separatorChars);
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



	public static final void splitPreserveAllTokensWithSeparatorAndMax (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(splitPreserveAllTokensWithSeparatorAndMax)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required separatorChars
		// [i] object:0:optional max
		// [o] field:1:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	separatorChars = IDataUtil.getString( pipelineCursor, "separatorChars" );
			int	max = IDataUtil.getInt( pipelineCursor, "max", 0 );
		
			String[] value = StringUtils.splitPreserveAllTokens(str, separatorChars, max);
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



	public static final void splitWithSeparator (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(splitWithSeparator)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required separatorChars
		// [o] field:1:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	separatorChars = IDataUtil.getString( pipelineCursor, "separatorChars" );
		
			String[] value = StringUtils.split(str, separatorChars);
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



	public static final void splitWithSeparatorAndMax (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(splitWithSeparatorAndMax)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required separatorChars
		// [i] object:0:optional max
		// [o] field:1:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	separatorChars = IDataUtil.getString( pipelineCursor, "separatorChars" );
			int	max = IDataUtil.getInt( pipelineCursor, "max", 0 );
		
			String[] value = StringUtils.split(str, separatorChars, max);
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



	public static final void strip (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(strip)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
		
			String value = StringUtils.strip(str);
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



	public static final void stripAll (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(stripAll)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:required strs
		// [o] field:1:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String[] strs = IDataUtil.getStringArray( pipelineCursor, "strs" );
		
			String[] value = StringUtils.stripAll(strs);
		
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



	public static final void stripChars (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(stripChars)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required stripChars
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	stripChars = IDataUtil.getString( pipelineCursor, "stripChars" );
		
			String value = StringUtils.strip(str, stripChars);
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



	public static final void stripCharsAll (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(stripCharsAll)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:required strs
		// [i] field:0:required stripChars
		// [o] field:1:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String[] strs = IDataUtil.getStringArray( pipelineCursor, "strs" );
			String stripChars = IDataUtil.getString( pipelineCursor, "stripChars" );
		
			String[] value = StringUtils.stripAll(strs, stripChars);
		
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



	public static final void stripEnd (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(stripEnd)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required stripChars
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	stripChars = IDataUtil.getString( pipelineCursor, "stripChars" );
		
			String value = StringUtils.stripEnd(str, stripChars);
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



	public static final void stripStart (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(stripStart)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required stripChars
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	stripChars = IDataUtil.getString( pipelineCursor, "stripChars" );
		
			String value = StringUtils.stripStart(str, stripChars);
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



	public static final void stripToEmpty (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(stripToEmpty)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
		
			String value = StringUtils.stripToEmpty(str);
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



	public static final void stripToNull (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(stripToNull)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
		
			String value = StringUtils.stripToNull(str);
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



	public static final void substring (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(substring)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] object:0:required start
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			int	start = IDataUtil.getInt( pipelineCursor, "start", 0 );
			
		
			String value = StringUtils.substring(str, start);
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



	public static final void substringAfter (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(substringAfter)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required separator
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	separator = IDataUtil.getString( pipelineCursor, "separator" );
			
		
			String value = StringUtils.substringAfter(str, separator);
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



	public static final void substringAfterLast (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(substringAfterLast)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required separator
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	separator = IDataUtil.getString( pipelineCursor, "separator" );
			
		
			String value = StringUtils.substringAfterLast(str, separator);
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



	public static final void substringBefore (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(substringBefore)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required separator
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	separator = IDataUtil.getString( pipelineCursor, "separator" );
			
		
			String value = StringUtils.substringBefore(str, separator);
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



	public static final void substringBeforeLast (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(substringBeforeLast)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required separator
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	separator = IDataUtil.getString( pipelineCursor, "separator" );
			
		
			String value = StringUtils.substringBeforeLast(str, separator);
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



	public static final void substringBetween (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(substringBetween)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required open
		// [i] field:0:required close
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	open = IDataUtil.getString( pipelineCursor, "open" );
			String	close = IDataUtil.getString( pipelineCursor, "close" );
			
		
			String value = StringUtils.substringBetween(str, open, close);
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



	public static final void substringBetweenTag (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(substringBetweenTag)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required tag
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	tag = IDataUtil.getString( pipelineCursor, "tag" );
			
		
			String value = StringUtils.substringBetween(str, tag);
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



	public static final void substringEndLimit (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(substringEndLimit)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] object:0:required start
		// [i] object:0:required end
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			int	start = IDataUtil.getInt( pipelineCursor, "start", 0 );
			int	end = IDataUtil.getInt( pipelineCursor, "end", 0 );
			
		
			String value = StringUtils.substring(str, start, end);
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



	public static final void substringsBetween (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(substringsBetween)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required open
		// [i] field:0:required close
		// [o] field:1:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
			String	open = IDataUtil.getString( pipelineCursor, "open" );
			String	close = IDataUtil.getString( pipelineCursor, "close" );
			
		
			String[] value = StringUtils.substringsBetween(str, open, close);
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
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			String value = StringUtils.swapCase(str);
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



	public static final void trim (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(trim)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
		
			String value = StringUtils.trim(str);
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



	public static final void trimToEmpty (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(trimToEmpty)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
		
			String value = StringUtils.trimToEmpty(str);
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



	public static final void trimToNull (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(trimToNull)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );
		
			String value = StringUtils.trimToNull(str);
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
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			String value = StringUtils.uncapitalize(str);
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



	public static final void unescapeHtml (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(unescapeHtml)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			String value = StringEscapeUtils.unescapeHtml(str);
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



	public static final void unescapeJava (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(unescapeJava)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			String value = StringEscapeUtils.unescapeJava(str);
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



	public static final void unescapeJavaScript (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(unescapeJavaScript)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			String value = StringEscapeUtils.unescapeJavaScript(str);
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



	public static final void unescapeXml (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(unescapeXml)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			String value = StringEscapeUtils.unescapeXml(str);
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



	public static final void upperCase (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(upperCase)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			String	str = IDataUtil.getString( pipelineCursor, "str" );	
		
			String value = StringUtils.upperCase(str);
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

