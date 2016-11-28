package com.naironics.forageapp.service.currentuser;

import com.naironics.forageapp.domain.CurrentUser;
import com.naironics.forageapp.domain.Role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CurrentUserServiceImpl implements CurrentUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CurrentUserDetailsService.class);

    @Override
    public boolean canAccessUser(CurrentUser currentUser, String userId) {
        LOGGER.debug("Checking if user={} has access to user={}", currentUser, userId);
        return currentUser != null
                && (currentUser.getRole().equals(Role.ADMIN.name()) || currentUser.getId().equals(userId));
    }

}