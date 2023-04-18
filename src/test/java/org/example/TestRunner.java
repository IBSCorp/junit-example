package org.example;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import ru.ibsqa.qualit.utils.spring.QualITSpringExtension;

@Suite
@SuiteDisplayName("junit-example")
@SelectPackages("org.example.tests")
@ExtendWith(QualITSpringExtension.class)
@ContextConfiguration("classpath:spring.xml")
@TestExecutionListeners(inheritListeners = false, listeners = {DependencyInjectionTestExecutionListener.class})
public class TestRunner {
}