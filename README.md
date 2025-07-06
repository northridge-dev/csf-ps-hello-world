# Problem Set 00: Hello, World

## How To ...

### Develop Solutions

1. **Write** your Java programs:

   - in the corresponding `.java` file in the `src` directory
   - to meet the [specifications](#specs)

2. **Compile** your source code using the `javac` compiler.

   - The general pattern for the command is: `javac path/to/FileName.java`
   - For example, to compile `HelloWorld.java` from the root directory:
     `javac src/HelloWorld.java`.
   - If your program successfully compiles, a new file will be created, for
     example, `HelloWorld.class` or `HelloNames.class`.
   - If your program does not compile, use the error messages to correct your
     program and try again.
   - Note: If you first `cd` (change directory) to the `src` directory (by
     running `cd src`), you may omit the `src/` path in the example command.

3. **Run** your compiled program with the `java` runtime.

   - The general pattern for the command is: `java -cp path/to FileName <args>`.
   - For example, to run `HelloWorld.class` from the root directory:
     `java -cp src HelloWorld` (`HelloWorld does not take any command line
     arguments).
   - Second example: to run `HelloNames.class` with arguments `George` and
     `Harold` from the root directory: `java -cp src HelloNames George Harold`

4. **Test** your program.

   - Try different inputs. If you don't get the outputs you expect, debug,
     change the source code, re-compile, and test it again. Keep going until
     your meets the [specifications](#specs).
   - Often a program will work for the most obvious possible inputs but will
     produce the wrong outputs for other, less obvious inputs. A good developer
     will look for these "corner-cases" and make sure his program handles them
     properly.

### Run Graded Tests

1. Once you think your programs meet the specifications, **run the graded
   tests**:
   - Command to execute from the root directory: `./run-tests.sh`.
   - `run-tests.sh` is a Bash script that will try to compile your programs and
     run them against tests defined in the `tests` directory.
   - You'll see results in the terminal. Results will also be written to files
     in the `test-results` directory.
2. Repeat?
   - You can run graded tests as many times as you need to. Getting it right on
     the tenth try counts just as much as getting it right on the first try.
   - Use the test output to identify where your program fails to meet the
     specifications.
   - Really stuck? You can still submit a problem set with failing tests.
     Partial credit will be given.

### Submit your Problem Set

0. NOTE: when you first launched your Codespace, a script ran and (among other
   things) created a _branch_ called `solution`. That's the branch you've been
   working on.
1. **Stage** your changes: `git add .` from the root directory. (You can also
   use the VS Code source control tool.)
2. **Commit** your changes with a commit message:
   `git commit -m "completed problem set"`
3. **Push** your changes to your repository: `git push origin solution`.
4. Navigate to your assignment repository and **open a pull request**: a request
   to merge the changes in your `solution` branch into your `main` branch.
   - Opening a pull request lets me know your problem set is ready to be graded.
   - For this problem set, you're not required to write a pull request
     description, but you may use the space to leave me any notes or ask
     questions.
   - The pull request also gives me a way to leave feedback on your code.

## Specs

Complete each of the following problems. For all problems in this set:

- DO NOT use any control flow statements we have not yet covered (e.g., no `if`,
  `for`, or `while` statements).
- DO NOT use any external libraries or packages.

### HelloWorld.java

Write a Java program that prints "Hello, World" to the console.

### HelloNames.java

Write a Java program that takes two space-separated command line arguments and
prints to the console two new-line-separated greetings as follows:

Running:

```
java HelloNames George Harold
```

Should print:

```
Hello, George
Hello, Harold
```

## Acknowledgements

This problem set is drawn from Robert Sedgewick's and Kevin Wayne's excellent
Coursera course,
[Computer Science: Programming with a Purpose](https://www.coursera.org/learn/cs-programming-java).
