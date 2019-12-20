import com.aerospike.client.AerospikeClient;
import com.aerospike.client.Bin;
import com.aerospike.client.Key;
import com.aerospike.client.policy.WritePolicy;

public class Put extends Test {

	@Override
	boolean Run() {
		AerospikeClient client = Util.GetClient();
		WritePolicy wpolicy = Util.GetWritePolicy();

		Key key = new Key("ns1", "users", "Alice");
		Bin bin1 = new Bin("last", "Alicy");
		Bin bin2 = new Bin("userid", "aa");
		Bin bin3 = new Bin("height", "175");
		client.put(wpolicy, key, bin1, bin2, bin3);

		key = new Key("ns1", "users", "Bob");
		bin1 = new Bin("last", "Baaaaaa");
		bin2 = new Bin("type", "sheep");
		client.put(wpolicy, key, bin1, bin2);
		
		return true;
	}

}
