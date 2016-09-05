// IMusicPlayerService.aidl
package com.hope.qsee;

// Declare any non-default types here with import statements

interface IMusicPlayerService {
    boolean start(String filePath);
    boolean stop();
}
