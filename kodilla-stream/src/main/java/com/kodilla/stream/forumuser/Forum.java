package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

	private final List<ForumUser> forumUserList = new ArrayList<>();

	public Forum() {
		forumUserList.add(new ForumUser(001, "UserName1", 'M', 1991,
				01, 01, 91));
		forumUserList.add(new ForumUser(002, "UserName2", 'F', 2002,
				02, 02, 2));
		forumUserList.add(new ForumUser(003, "UserName3", 'M', 1993,
				03, 03, 0));
		forumUserList.add(new ForumUser(004, "UserName4", 'F', 2004,
				04, 04, 4));
		forumUserList.add(new ForumUser(005, "UserName5", 'M', 1995,
				05, 05, 5));
		forumUserList.add(new ForumUser(006, "UserName6", 'F', 1996,
				06, 06, 0));
		forumUserList.add(new ForumUser(007, "UserName7", 'M', 2007,
				07, 07, 7));
	}

	public List<ForumUser> getUserList() {
		return new ArrayList<>(forumUserList);
	}
}
