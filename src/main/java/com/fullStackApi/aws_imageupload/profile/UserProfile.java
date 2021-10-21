package com.fullStackApi.aws_imageupload.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserProfile {
	
	private final UUID userProfileId;
	private final String username;
	private String userProfileImageLink; // S3 key/link
	
	public UserProfile(UUID userProfilId, String username, String userProfileImageLink) {
		this.userProfileId = userProfilId;
		this.username = username;
		this.userProfileImageLink = userProfileImageLink;
	}

	public UUID getUserProfileId() {
		return userProfileId;
	}

	public String getUsername() {
		return username;
	}

	// Link of Image can be null or a return a String
	public Optional<String> getUserProfileImageLink() {
		return Optional.ofNullable(userProfileImageLink);
	}

	public void setUserProfileImageLink(String userProfileImageLink) {
		this.userProfileImageLink = userProfileImageLink;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		
		UserProfile that = (UserProfile) obj;
		
		return Objects.equals(userProfileId, that.userProfileId) && Objects.equals(username, that.username) && Objects.equals(userProfileImageLink, that.userProfileImageLink);
	}

	@Override
	public int hashCode() {
		return Objects.hash(userProfileId, username, userProfileImageLink);
	}
}
