package commons;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2012-10-19 16:34:14 CEST
// -----( ON-HOST: uniqawm.uniqa.at

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.util.Date;
import org.apache.commons.lang.time.DateUtils;
import com.wm.data.IData;
import com.wm.data.IDataCursor;
import com.wm.data.IDataUtil;
// --- <<IS-END-IMPORTS>> ---

public final class date

{
	// ---( internal utility methods )---

	final static date _instance = new date();

	static date _newInstance() { return new date(); }

	static date _cast(Object o) { return (date)o; }

	// ---( server methods )---




	public static final void addFields (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(addFields)>> ---
		// @sigtype java 3.5
		// [i] object:0:required date
		// [i] object:0:required years
		// [i] object:0:required months
		// [i] object:0:required weeks
		// [i] object:0:required days
		// [i] object:0:required hours
		// [i] object:0:required minutes
		// [i] object:0:required seconds
		// [i] object:0:required milliseconds
		// [o] object:0:required value
		try
		{
			IDataCursor pipelineCursor = pipeline.getCursor();
			Date date = (Date) IDataUtil.get(pipelineCursor, "date");				
						
			Date value = (Date)date.clone();
			
			int	years = IDataUtil.getInt( pipelineCursor, "years" ,0);
			int	months = IDataUtil.getInt( pipelineCursor, "months" ,0);
			int	weeks = IDataUtil.getInt( pipelineCursor, "weeks" ,0);
			int	days = IDataUtil.getInt( pipelineCursor, "days" ,0);
			int	hours = IDataUtil.getInt( pipelineCursor, "hours" ,0);
			int	minutes = IDataUtil.getInt( pipelineCursor, "minutes" ,0);
			int	seconds = IDataUtil.getInt( pipelineCursor, "seconds" ,0);
			int	milliseconds = IDataUtil.getInt( pipelineCursor, "milliseconds" ,0);
			
			value = DateUtils.addYears(value, years);
			value = DateUtils.addMonths(value, months);
			value = DateUtils.addWeeks(value, weeks);
			value = DateUtils.addDays(value, days);
			value = DateUtils.addHours(value, hours);
			value = DateUtils.addMinutes(value, minutes);
			value = DateUtils.addSeconds(value, seconds);
			value = DateUtils.addMilliseconds(value, milliseconds);
						
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



	public static final void compare (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(compare)>> ---
		// @sigtype java 3.5
		// [i] object:0:optional date1
		// [i] object:0:optional date2
		// [o] object:0:required value
		IDataCursor pipelineCursor = pipeline.getCursor();
		Date date1 = (Date) IDataUtil.get(pipelineCursor, "date1");
		Date date2 = (Date) IDataUtil.get(pipelineCursor, "date2");
		int	value = date1.compareTo(date2);
		
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "value", value );
		
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void isSameDay (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isSameDay)>> ---
		// @sigtype java 3.5
		// [i] object:0:required date1
		// [i] object:0:required date2
		// [o] object:0:required value
		IDataCursor pipelineCursor = pipeline.getCursor();
		Date date1 = (Date) IDataUtil.get(pipelineCursor, "date1");
		Date date2 = (Date) IDataUtil.get(pipelineCursor, "date2");
		
		boolean value = DateUtils.isSameDay(date1, date2);
		
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "value", value );
		
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}
}

