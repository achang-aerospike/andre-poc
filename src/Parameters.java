import com.aerospike.client.async.EventLoopType;
import com.aerospike.client.policy.AuthMode;
import com.aerospike.client.policy.Policy;
import com.aerospike.client.policy.TlsPolicy;
import com.aerospike.client.policy.WritePolicy;

public class Parameters {
	String host;
	int port;
	String user;
	String password;
	/*
	String namespace;
	String set;
	AuthMode authMode;
	TlsPolicy tlsPolicy;
	WritePolicy writePolicy;
	Policy policy;
	EventLoopType eventLoopType = EventLoopType.DIRECT_NIO;
	int maxCommandsInProcess;
	int maxCommandsInQueue;
	boolean singleBin;
	boolean hasGeo;
	boolean hasUdf;
	boolean hasCDTList;
	boolean hasCDTMap;
	*/
}
