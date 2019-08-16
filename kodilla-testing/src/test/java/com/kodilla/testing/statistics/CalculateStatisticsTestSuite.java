package com.kodilla.testing.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {

	@Test //1. spr. poprawność obliczeń wartości średnich, gdy liczba postów = 0
	public void testCalculateStatisticWith0NumberPosts() { //mock zwrócił domyślną wartość 0 - dla typu zwracanego int
		//Given
		Statistics statisticsMock = mock(Statistics.class);
		CalculateStatistics calculateStatistics = new CalculateStatistics();
		//When
		calculateStatistics.calculateAdvStatistics(statisticsMock);
		// Then
		Assert.assertEquals(0, calculateStatistics.getPostsNumber());
	}

	@Test //2.spr poprawność obliczeń wartości średnich, gdy liczba postów = 1000;
	public void testCalculateStatisticWith1000NumberPosts() {
		//Given
		Statistics statisticsMock = mock(Statistics.class);
		when(statisticsMock.postsCount()).thenReturn(1000);
		CalculateStatistics calculateStatistics = new CalculateStatistics();
		//When
		calculateStatistics.calculateAdvStatistics(statisticsMock);
		// Then
		Assert.assertEquals(1000, calculateStatistics.getPostsNumber());
	}

	@Test //3.spr poprawność obliczeń wartości średnich, gdy liczba komentarzy = 0;
	public void testCalculateStatisticWith0NumberComments() {
		//Given
		Statistics statisticsMock = mock(Statistics.class);
		when(statisticsMock.commentsCount()).thenReturn(0);
		CalculateStatistics calculateStatistics = new CalculateStatistics();
		//When
		calculateStatistics.calculateAdvStatistics(statisticsMock);
		// Then
		Assert.assertEquals(0, calculateStatistics.getCommentsNumber());
	}

	@Test //4.spr poprawność obliczeń wartości średnich, gdy liczba komentarzy <liczba postów(;
	public void testCalculateStatisticWithBiggerPostsNumberThanCommentsNumber() {
		//Given
		Statistics statisticsMock = mock(Statistics.class);
		when(statisticsMock.commentsCount()).thenReturn(12);
		when(statisticsMock.postsCount()).thenReturn(20);
		CalculateStatistics calculateStatistics = new CalculateStatistics();
		//When
		calculateStatistics.calculateAdvStatistics(statisticsMock);
		double result;
		result = calculateStatistics.getAverageCommentsNumberPerPosts();
		// Then
		//System.out.println(result);
		Assert.assertTrue(result > 1.0);
	}

	@Test //5.spr poprawność obliczeń wartości średnich, gdy liczba komentarzy >liczba postów(;
	public void testCalculateStatisticWithSmallerPostsNumberThanCommentsNumber() {
		//Given
		Statistics statisticsMock = mock(Statistics.class);
		when(statisticsMock.commentsCount()).thenReturn(20);
		when(statisticsMock.postsCount()).thenReturn(12);
		CalculateStatistics calculateStatistics = new CalculateStatistics();
		//When
		calculateStatistics.calculateAdvStatistics(statisticsMock);
		double result;
		result = calculateStatistics.getAverageCommentsNumberPerPosts();
		// Then
		//System.out.println(result);
		Assert.assertTrue(result < 1.0);
	}

	@Test //6.spr poprawność obliczeń wartości średnich, gdy liczba użytkowników = 0;
	public void testCalculateStatisticWith0NumberUsers() {
		//Given
		Statistics statisticsMock = mock(Statistics.class);
		List<String> UNlist = new ArrayList<>();

		when(statisticsMock.userNames()).thenReturn(UNlist);
		CalculateStatistics calculateStatistics = new CalculateStatistics();
		//When
		calculateStatistics.calculateAdvStatistics(statisticsMock);
		// Then
		Assert.assertEquals(0, calculateStatistics.getUsersCounter());
	}

	@Test //7.spr poprawność obliczeń wartości średnich, gdy liczba użytkowników = 100;
	public void testCalculateStatisticWith100NumberUsers() {
		//Given
		Statistics statisticsMock = mock(Statistics.class);
		List<String> UNlist = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			UNlist.add("UserName" + i);
		}
		when(statisticsMock.userNames()).thenReturn(UNlist);
		CalculateStatistics calculateStatistics = new CalculateStatistics();
		//When
		calculateStatistics.calculateAdvStatistics(statisticsMock);
		// Then
		//System.out.println(UNlist);
		Assert.assertEquals(100, calculateStatistics.getUsersCounter());
	}
}
