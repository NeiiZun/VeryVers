package me.neiizun.veryvers.user;

public enum UserRole {
    /**
     * Has same permissions as ADMIN, except that a member can't create and manage other accounts.
     */
    MEMBER,

    /**
     * Can create, remove a project and post tags.
     */
    ADMIN
}
