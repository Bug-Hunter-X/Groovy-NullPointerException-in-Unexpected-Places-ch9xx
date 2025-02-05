```groovy
class MyClass {
    def myMethod(a, b) {
        if (a == null || b == null) {
            return null
        }
        return a + b
    }
}

assert new MyClass().myMethod(1, 2) == 3
assert new MyClass().myMethod(null, 2) == null
assert new MyClass().myMethod(1, null) == null
assert new MyClass().myMethod(null, null) == null
```