package topic8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FriendsMap {
    static Map<String, Set<String>> friendsMap = new HashMap<>();

    public static void main(String[] args) {

        addCrossFriends("nuraddin", "muraz");
        addCrossFriends("nuraddin", "nazim");
        addCrossFriends("nuraddin", "latifa");
        addCrossFriends("muraz", "ali");
        addCrossFriends("muraz", "nuraddin");
        addCrossFriends("muraz", "ravan");
        addCrossFriends("nazim", "ali");
        addCrossFriends("latifa", "ravan");
        addCrossFriends("ali", "aykhan");
        System.out.println(friendsMap);

        // removeCrossFriends("nuraddin", "muraz");
        // System.out.println(friendsMap);

        System.out.println(getAllFriends("nuraddin"));
    }

    static void addCrossFriends(String friend1, String friend2) {

        // nuraddine murazi elave etdik
        addFriend(friend1, friend2);
        // muraza nuraddini elave et
        addFriend(friend2, friend1);

    }

    static void addFriend(String friend1, String friend2) {
        if (friend1 == null || friend2 == null)
            return;

        if (!friendsMap.containsKey(friend1))
            friendsMap.put(friend1, new HashSet<>());

        friendsMap.get(friend1).add(friend2);
    }

    static void removeCrossFriends(String friend1, String friend2) {
        removeFriend(friend1, friend2);
        removeFriend(friend2, friend1);
    }

    static void removeFriend(String friend1, String friend2) {
        if (friend1 == null || friend2 == null)
            return;
        if (friendsMap.containsKey(friend1))
            friendsMap.get(friend1).remove(friend2);
    }

    // TODO: complete the method to add all the levels of the friends
    // add new methods if necessary
    static Set<String> getAllFriends(String person) {
        var friendSet = friendsMap.get(person);

        var secondFriendsSet = new HashSet<String>();
        for (var friend : friendSet) {
            secondFriendsSet.addAll(
                    friendsMap.get(friend));
        }

        friendSet.addAll(secondFriendsSet);
        return friendSet;
    }
}
