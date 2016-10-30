package org.jayanth.database;

import java.util.HashMap;
import java.util.Map;

import org.jayanth.messenger.model.Message;
import org.jayanth.messenger.model.Profile;

public class MessengerDatabase {
	
	private static Map<Integer, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();
	
	public static Map<Integer, Message> getMessages() {
		return messages;
	}
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
	
}
