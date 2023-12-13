#include <jni.h>
#include "react-native-test-turbo-module.h"

extern "C"
JNIEXPORT jdouble JNICALL
Java_com_testturbomodule_TestTurboModuleModule_nativeMultiply(JNIEnv *env, jclass type, jdouble a, jdouble b) {
    return testturbomodule::multiply(a, b);
}
