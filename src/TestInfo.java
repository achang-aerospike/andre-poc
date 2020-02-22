import com.aerospike.client.AerospikeClient;
import com.aerospike.client.Info;
import com.aerospike.client.cluster.Node;

public class TestInfo extends Test {

	@Override
	boolean Run() {
		AerospikeClient client = Util.GetClient();
		Node[] nodes = client.getNodes();
		for (Node node : nodes) {
			String val = Info.request(node, "namespace/test");
			m_console.info("Node %s: %s", node.getHost(), val);
		}
		return true;
	}

}
