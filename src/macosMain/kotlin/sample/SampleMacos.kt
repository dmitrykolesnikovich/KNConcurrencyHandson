package sample

fun hello(): String = "Hello, Kotlin/Native!"

fun main() {
    println(hello())

    // 1) Simple State
    // Just your usual mutable state, in the main thread.
//    runSimpleState()

    // 2) Frozen State
//    freezeSomeState()
//    failChanges()

    // 3) Global State
//    cantChangeThis()
//    canChangeThreadLocal()
//    globalCounting()
//    globalCountingFail()

    // 4) Background
//    basicBackground()
//    captureState()
//    captureTooMuch()
//    captureTooMuchAgain()
//    captureArgs()
    captureTooMuchSource()


    //Leave this please...
    waitForWorker()
}