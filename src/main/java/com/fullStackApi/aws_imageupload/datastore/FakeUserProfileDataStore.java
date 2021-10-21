package com.fullStackApi.aws_imageupload.datastore;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.fullStackApi.aws_imageupload.profile.UserProfile;

@Repository
public class FakeUserProfileDataStore {
	
	private static final List<UserProfile> USER_PROFILES = new ArrayList<>();
	
	// Insert of static users in a data store
	static {
		// We set the UserProfileId that we need a fixed UserProfileId to obtain the user's image
		// Since we are working with a fake database and not a real one
		USER_PROFILES.add(new UserProfile(UUID.fromString("a684b59a-9a78-45c3-a6cf-2e291c41d63d"), "JoanFernandez", null));
		USER_PROFILES.add(new UserProfile(UUID.fromString("fd18c61c-4cc0-4b32-aef4-8de16aded583"), "AntonioJunior", null));
	}
	
	public List<UserProfile> getUserProfiles() {
		return USER_PROFILES;
	}
}
