package tools

import groovy.transform.CompileStatic

@CompileStatic // provides a perf boost via groovyclient
class WorkersTest extends GroovyTestCase {
    void testGroovyWorker() {
        String expected = "GroovyWorker executing: ABC"
        assertToString(GroovyWorker.doStuff('ABC'), expected)
    }

    void testJavaWorker() {
        String expected = "JavaWorker executing: DEF"
        assertToString(JavaWorker.doStuff('DEF'), expected)
    }
}
