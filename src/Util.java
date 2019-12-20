import com.aerospike.client.AerospikeClient;

public class Util {
	private static Console m_console;
	private static Parameters m_params;
	private static AerospikeClient m_client;
	
	public Util(Console console, Parameters params)
	{
		m_console = console;
		m_params = params;
	}

	public static AerospikeClient GetClient() {
		if (m_client == null) {
			m_client = new AerospikeClient(m_params.host, m_params.port);
		}
		return m_client;
	}
	public static void Close() {
		if (m_client != null) {
			m_client.close();
		}
		m_client = null;
	}
}
