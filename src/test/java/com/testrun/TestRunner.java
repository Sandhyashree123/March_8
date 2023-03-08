package com.testrun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features="C:\\Users\\Admin\\Desktop\\cucumberpom\\src\\test\\resources\\Feature\\Signin.feature",glue="com.stepdefiniation")
@RunWith(Cucumber.class)
public class TestRunner {

}
