package com.fullStackApi.aws_imageupload.profile;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("api/v1/user-profile")
@CrossOrigin("*") // Accept all petitions for all URL/USERS
public class UserProfileController {
	
	private final UserProfileService userProfileService;
	
	@Autowired
	public UserProfileController(UserProfileService userProfileService) {
		this.userProfileService = userProfileService;
	}
	
	// Return all user in a Store
	@GetMapping
	public List<UserProfile> getUserProfiles() {
		return userProfileService.getUserProfiles();
	}
	
	// We will pass User id to change Profile Image
	@PostMapping(
			path = "{userProfileId}/image/upload",
			consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE
	)
	public void uploadUserProfileImage(@PathVariable("userProfileId") UUID userProfileId, @RequestParam("file") MultipartFile file) {
		userProfileService.uploadUserProfileImage(userProfileId, file);
	}

	 @GetMapping("{userProfileId}/image/upload")
	 public byte[] downloadUserProfileImage(@PathVariable("userProfileId") UUID userProfileId) {
		 return userProfileService.downloadUserProfileImage(userProfileId);
	 }
	
}
