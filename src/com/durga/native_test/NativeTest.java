package com.durga.native_test;

import java.io.File;

import com.durga.access_modifiers.Main;

public class NativeTest {
	
	public native int intMethod(int i);
	
	private static final String JAVA_IO_TMPDIR = "java.io.tmpdir";
	
	private static File getTempDir() {
	    final String tmpDirName = System.getProperty(JAVA_IO_TMPDIR);
	    final File tmpDir = new File(tmpDirName);
	    if (!tmpDir.exists()) {
	        tmpDir.mkdir();
	    }
	    return tmpDir;
	}
	static {
	    NativeLibsLoaderUtil.addLibsToJavaLibraryPath("/CoreJavaByDurga/src/com/durga/native_test");
	}

	public static void main(String[] args) {

		System.loadLibrary("Main");
        System.out.println(new Main().intMethod(2));
	}

}
