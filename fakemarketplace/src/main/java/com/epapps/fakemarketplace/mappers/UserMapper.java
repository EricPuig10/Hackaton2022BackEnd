package com.epapps.fakemarketplace.mappers;

import com.epapps.fakemarketplace.dto.UserResDtoProduct;
import com.epapps.fakemarketplace.models.User;

public class UserMapper {

    public UserResDtoProduct mapUserToResDtoProduct(User user) {
        UserResDtoProduct res = new UserResDtoProduct();
        res.setUserName(user.getUserName());
        res.setImg(user.getImg());
        return res;

    }
}
