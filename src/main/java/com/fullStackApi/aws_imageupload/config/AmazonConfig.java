package com.fullStackApi.aws_imageupload.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Configuration
public class AmazonConfig {
	
	// Return the s3 client from Amazon Service
	@Bean
	public AmazonS3 s3() {
		// Put your access key from AWS and secret key
		AWSCredentials awsCredentials = new BasicAWSCredentials("ACCESS KEY", "SECRET KEY");
		
		return AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();
	}

}
