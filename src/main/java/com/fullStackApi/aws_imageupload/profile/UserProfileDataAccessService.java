package com.fullStackApi.aws_imageupload.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fullStackApi.aws_imageupload.datastore.FakeUserProfileDataStore;

@Repository
public class UserProfileDataAccessService {
	
	private final FakeUserProfileDataStore fakeUserProfileDataStore;
	
	@Autowired
	public UserProfileDataAccessService(FakeUserProfileDataStore fakeUserProfileDataStore) {
		this.fakeUserProfileDataStore = fakeUserProfileDataStore;
	}
	
	public List<UserProfile> getUserProfiles() {
		return fakeUserProfileDataStore.getUserProfiles();
	}

}
