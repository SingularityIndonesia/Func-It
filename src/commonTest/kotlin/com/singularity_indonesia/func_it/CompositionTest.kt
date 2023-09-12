package com.singularity_indonesia.func_it

import arrow.core.Option
import arrow.core.some
import kotlin.test.Test

/**
 * Created by: stefanus
 * 10/09/23 22.23
 * Design by: stefanus.ayudha@gmail.com
 */
class CompositionTest {

    @JvmInline
    value class Token(val value: String)

    @JvmInline
    value class UserID(val value: String)

    @JvmInline
    value class UserName(val value: String)

    @JvmInline
    value class Email(val value: String)

    data class UserProfile(
        val id: UserID,
        val name: UserName,
        val email: Email
    )

    data class UserProfileDisplayable(
        val userProfile: UserProfile,
        val enabled: Boolean,
        val selected: Boolean
    )

    fun userIDOf(token: Token) =
        UserID(
            "Some ID"
        ).some()


    fun userProfileOf(userID: Option<UserID>) =
        userID.map {
            UserProfile(
                id = it,
                name = UserName("Some Name"),
                email = Email("Some Email")
            )
        }

    fun displayableUserProfileOf(userProfile: Option<UserProfile>) =
        userProfile.map {
            UserProfileDisplayable(
                userProfile = it,
                enabled = true,
                selected = false
            )
        }

    fun getUserProfileDisplay(token: Token) = ::displayableUserProfileOf o ::userProfileOf o ::userIDOf o token

    @Test
    fun testComposeUserDiplayableFromToken() {
        val userToken: Token = Token("some Token")

        val displayableUserProfile = ::getUserProfileDisplay o userToken

        assert(displayableUserProfile.isSome())
    }

    @Test
    fun testImperative() {}
}