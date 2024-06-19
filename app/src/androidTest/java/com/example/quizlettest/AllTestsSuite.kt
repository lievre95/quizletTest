package com.example.quizlettest

import org.junit.runner.RunWith
import org.junit.runners.Suite
import com.example.quizlettest.MainActivityTest
import com.example.quizlettest.MyActivityTest
import com.example.quizlettest.SecondActivityTest

@RunWith(Suite::class)
@Suite.SuiteClasses(
    MainActivityTest::class,
    MyActivityTest::class,
    SecondActivityTest::class
)
class AllTestsSuite
