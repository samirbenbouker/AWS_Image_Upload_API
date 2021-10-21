package com.fullStackApi.aws_imageupload.bucket;

public enum BucketName {
	
	PROFILE_IMAGE("BUCKET NAME FROM AMAZAON SERVICE");
	
	private final String bucketName;
	
	BucketName(String bucketName) {
		this.bucketName = bucketName;
	}
	
	public String getBucketName() {
		return this.bucketName;
	}
}
