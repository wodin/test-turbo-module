const TestTurboModule = require('./NativeTestTurboModule').default;

export function multiply(a: number, b: number): number {
  return TestTurboModule.multiply(a, b);
}
