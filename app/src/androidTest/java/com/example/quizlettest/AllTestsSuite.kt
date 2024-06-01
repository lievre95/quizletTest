package com.example.quizlettest

import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses

// Specify the classes to be included in the test suite
@RunWith(Suite::class)
@SuiteClasses(
    MainActivityTest::class,
    MyActivityTest::class,
    SecondActivityTest::class
)
class AllTestsSuite
