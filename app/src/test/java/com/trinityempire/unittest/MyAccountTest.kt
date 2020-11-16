package com.trinityempire.unittest

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MyAccountTest {

    lateinit var myAccount: MyAccount;

    @Before
    fun setUp() {
        myAccount = MyAccount()
    }

    @Test
    fun GiventheUserNameWhenCreateNewAccountThenShouldReturnTrue() {
        val isAccountCreated = myAccount.createNewAccount("mdr123")
        Assert.assertTrue(isAccountCreated)
    }

    @After
    fun teardown() {}

}
