package io.htfeeds.mapper;

import java.util.ArrayList;
import java.util.List;

import io.htfeeds.entity.User;
import io.htfeeds.json.model.UserDetailModel;

/**
 * @author HTFeeds
 *
 * Oct 24, 2018
 */
final public class UserMapper {

    public static List<User> mapJsonModelIntoEntities(Iterable<UserDetailModel> src) {
        List<User> Users = new ArrayList<>();

        src.forEach(e -> Users.add(UserMapper.mapJsonModelIntoEntity(e)));

        return Users;
    }

    public static User mapJsonModelIntoEntity(UserDetailModel src) {
        User user = new User();

        user.setId(src.getId());
        user.setUrl(src.getUrl());
        user.setName(src.getName());
        user.setUsername(src.getUsername());
        user.setSmallAvatar(src.getAvatar().get(0));
        user.setBigAvatar(src.getAvatar().get(1));

        return user;
    }

}
