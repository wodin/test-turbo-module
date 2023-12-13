package com.testturbomodule;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = TestTurboModuleModule.NAME)
public class TestTurboModuleModule extends NativeTestTurboModuleSpec {
  public static final String NAME = "TestTurboModule";

  public TestTurboModuleModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }

  static {
    System.loadLibrary("react-native-test-turbo-module");
  }

  private static native double nativeMultiply(double a, double b);

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @Override
  public double multiply(double a, double b) {
    return nativeMultiply(a, b);
  }
}
