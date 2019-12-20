import com.aerospike.client.AerospikeClient;
import com.aerospike.client.Bin;
import com.aerospike.client.Key;
import com.aerospike.client.Record;
import com.aerospike.client.policy.Policy;

public class Get extends Test {

	@Override
	boolean Run() {
		AerospikeClient client = Util.GetClient();
		Policy policy = Util.GetPolicy();

		Key key = new Key("ns1", "users", "Alice");
		m_console.info("Get %s", key);
		Record rec = client.get(policy, key);
		PrintRecord(key, rec);

		key = new Key("ns1", "users", "Bob");
		m_console.info("Get %s", key);
		rec = client.get(policy, key);
		PrintRecord(key, rec);

		key = new Key("ns1", "users", "Eve");
		m_console.info("Get %s", key);
		rec = client.get(policy, key);
		PrintRecord(key, rec);

		return false;
	}

}
