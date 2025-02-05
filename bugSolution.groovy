```groovy
class MyClass {
    def myMethod(a, b) {
        //Explicit null checks
        a = a ?: 0 // Use 0 as default if a is null
        b = b ?: 0 //Use 0 as default if b is null
        return a + b
    }
}

assert new MyClass().myMethod(1, 2) == 3
assert new MyClass().myMethod(null, 2) == 2
assert new MyClass().myMethod(1, null) == 1
assert new MyClass().myMethod(null, null) == 0

//alternative solution with elvis operator
class MyClass2 {
    def myMethod(a, b) {
        return (a ?: 0) + (b ?: 0)
    }
}

assert new MyClass2().myMethod(1, 2) == 3
assert new MyClass2().myMethod(null, 2) == 2
assert new MyClass2().myMethod(1, null) == 1
assert new MyClass2().myMethod(null, null) == 0
```