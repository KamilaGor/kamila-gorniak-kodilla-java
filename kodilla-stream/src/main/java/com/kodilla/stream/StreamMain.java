package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String [] args) {
        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> forumUser.getBirthDate().getYear()<=1999)
                .filter(forumUser -> forumUser.getPostsNumber()>=1)
                .collect(Collectors.toMap(ForumUser::getUserNumber, forumUser -> forumUser));

        System.out.println("Result Map of Users: " );
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
