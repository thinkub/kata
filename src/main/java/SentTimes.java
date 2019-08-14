import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SentTimes {
	public static List<Integer> sentTimes(int numberOfPorts, int transmissionTime, List<Integer> packetIds) {
		Map<Integer, Integer> portMap = new HashMap<>();
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < numberOfPorts; i++) {
			portMap.put(i, 0);
		}

		for (Integer tempPacketId : packetIds) {
			Integer packetId = tempPacketId % numberOfPorts;

			if (portMap.get(packetId) > 0) {
				packetId = getUseAblePortId(portMap, packetId, numberOfPorts);
				portMap.put(packetId, transmissionTime);
				result.add(packetId);
			}

			if (portMap.get(packetId) == 0) {
				portMap.put(packetId, transmissionTime);
				result.add(packetId);
			}
			setTime(portMap);
		}
		return result;
	}

	private static Integer getUseAblePortId(Map<Integer, Integer> portMap, Integer packetId, int numberOfPorts) {
		int i = packetId;
		while (true) {
			if (i > numberOfPorts) i = 0;

			if (portMap.get(i) == 0) {
				return i;
			}
			i++;
		}
	}

	private static void setTime(Map<Integer, Integer> portMap) {
		for (Integer i : portMap.keySet()) {
			if (portMap.get(i) > 0) {
				portMap.put(i, portMap.get(i) - 1);
			}
		}
	}
}
