package com.jarves.mh.model

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

class DevStackTest {
    @Test
    fun flutterStackIsDefined() {
        val flutter = DevStack.FLUTTER
        assertEquals("Flutter (Dart)", flutter.label)
        assertTrue(flutter.description.contains("Flutter"))
        assertTrue(flutter.installsSummary.contains("Dart"))
        assertNotNull(DevStack.valueOf("FLUTTER"))
    }

    @Test
    fun devStackEntriesIncludeAllSupportedStacks() {
        val names = DevStack.entries.map { it.name }
        assertTrue("WEB" in names)
        assertTrue("PYTHON" in names)
        assertTrue("ANDROID" in names)
        assertTrue("CPP" in names)
        assertTrue("PHP" in names)
        assertTrue("FLUTTER" in names)
    }

    @Test
    fun flutterVersionIsPinned() {
        assertEquals("3.29.0", com.jarves.mh.runtime.RuntimeInstaller.FLUTTER_VERSION)
    }
}
