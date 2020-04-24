import com.aerospike.client.Key;
import com.aerospike.client.Record;

import common.Console;
import common.Util;

public abstract class Test {
	public Test() {
		m_console = Util.GetConsole();
	}
	abstract boolean Run();
	Console m_console;

	void PrintRecord(Key key, Record rec) {
		if (rec != null) {
			m_console.info("Record found: %s / %s", key, rec);
		}
		else  {
			m_console.info("Record not found: %s", key);
		}
	}
}
