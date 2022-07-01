package com.belet.springsecuritydemo.security;

import com.google.common.collect.Sets;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

import static com.belet.springsecuritydemo.security.ApplicationUserPermission.COURSE_READ;
import static com.belet.springsecuritydemo.security.ApplicationUserPermission.COURSE_WRITE;
import static com.belet.springsecuritydemo.security.ApplicationUserPermission.STUDENT_READ;
import static com.belet.springsecuritydemo.security.ApplicationUserPermission.STUDENT_WRITE;

@RequiredArgsConstructor
@Getter
public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_READ, STUDENT_WRITE)),
    ADMINTRAINEE(Sets.newHashSet(COURSE_READ, STUDENT_READ));

    private final Set<ApplicationUserPermission> permissions;
}
