package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

	private final int userNumber;
	private final String userName;
	private final char sex;
	private final LocalDate birthDate;
	private final int postsNumber;

	public ForumUser(final int userNumber, final String userName, final char sex, final int yearOfBirth,
	                 final int monthOfBirth, final int dayOfBirth, final int postsNumber) {
		this.userNumber = userNumber;
		this.userName = userName;
		this.sex = sex;
		this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
		this.postsNumber = postsNumber;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public String getUserName() {
		return userName;
	}

	public char getSex() {
		return sex;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public int getPostsNumber() {
		return postsNumber;
	}

	@Override
	public String toString() {
		return "ForumUser{" +
				"userNumber=" + userNumber +
				", userName='" + userName + '\'' +
				", sex=" + sex +
				", birthOfDate=" + birthDate +
				", postsNumber=" + postsNumber +
				'}';
	}
}
