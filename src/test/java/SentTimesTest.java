import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import sun.java2d.pipe.OutlineTextRenderer;

public class SentTimesTest {

	private static final int MAX_TRANSMISSION_TIME = 100;

	@Test
	public void sentTimes() {
		int numberOfPorts = 5;
		int transmissionTime = 3;
		List<Integer> packetIds = Arrays.asList(1, 6, 11, 16);
	}

	@Test
	public void sentTimes2() {
		int numberOfPorts = 5;
		int transmissionTime = 3;
		List<Integer> packetIds = Arrays.asList(1, 6, 11, 16);
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
		System.out.println(result);
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



	@Test
	public void test() {
		System.out.println(6 % 5);
	}
}