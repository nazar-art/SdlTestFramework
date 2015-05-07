package net.epam.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestLogin.class, TestFilters.class, TestHeaderFunctionality.class})
public class TestSuite {
}


