package com.hoard.api.user.service.cucumber.stepdefs;

import com.hoard.api.user.service.UserServiceApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = UserServiceApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
