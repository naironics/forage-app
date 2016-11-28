package com.naironics.forageapp.service.currentuser;

import com.naironics.forageapp.domain.CurrentUser;

public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, String userId);

}