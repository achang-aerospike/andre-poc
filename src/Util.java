import com.aerospike.client.AerospikeClient;
import com.aerospike.client.policy.Policy;
import com.aerospike.client.policy.WritePolicy;

public class Util {
	private static Console m_console;
	private static Parameters m_params;
	private static AerospikeClient m_client;
	private static WritePolicy m_writePolicy;
	private static Policy m_policy;
	
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

	public static Policy GetPolicy() {
		if (m_policy == null) {
			m_policy = new Policy();
		}
		return m_policy;
	}

	public static WritePolicy GetWritePolicy() {
		if (m_writePolicy == null) {
			m_writePolicy = new WritePolicy();
		}
		return m_writePolicy;
	}

	public static void Close() {
		if (m_client != null) {
			m_client.close();
		}
		m_client = null;
	}
}
