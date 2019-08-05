package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
	@Test
	public void testDefaultSharingStrategies() {
		//Given
		User stanislaw = new Millenials("Stanislaw A");
		User julia = new YGeneration("Julia M");
		User maja = new ZGeneration("Maja R");
		//When
		String stanislawShouldPublish = stanislaw.sharePost();
		System.out.println("Stanislaw should: " + stanislawShouldPublish);
		String juliaShouldPublish = julia.sharePost();
		System.out.println("Julia should: " + juliaShouldPublish);
		String majaShouldPublish = maja.sharePost();
		System.out.println("Maja should: " + majaShouldPublish);
		//Then
		Assert.assertEquals("(Twitter publisher) Publish on Twitter ", stanislawShouldPublish);
		Assert.assertEquals("(Facebook publisher) Publish on Facebook ", juliaShouldPublish);
		Assert.assertEquals("(Snapchat publisher) Publish on Snapchat ", majaShouldPublish);
	}
	@Test
	public void testIndividualSharingStrategy() {
		//Given
		User stanislaw = new Millenials("Stanislaw A");
		//When
		System.out.println();
		String stanislawShouldPublish = stanislaw.sharePost();
		System.out.println("Stanislaw should: " + stanislawShouldPublish);
		stanislaw.setPublishingStrategy(new FacebookPublisher());
		stanislawShouldPublish = stanislaw.sharePost();
		System.out.println("Stanislaw now should: " + stanislawShouldPublish);
		//Then
		Assert.assertEquals("(Facebook publisher) Publish on Facebook ", stanislawShouldPublish);
	}
}
