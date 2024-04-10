# hil-test-repository

The repository is to help initiate a partial transformation of a Java application due to a first party (1p) dependency.

#### [java-8-test-application](./java-8-test-application/)

This is the main application.

#### [java-8-test-1p-dependency](./java-8-test-1p-dependency/)

This is the main 1p dependency definition

## Usage

When submitting this repository for a transformation upgrade using [Amazon Q Transform](https://docs.aws.amazon.com/amazonq/latest/qdeveloper-ug/code-transformation.html), you should not need to compile or do anything. You should:

1. Open the IDE in the [java-8-test-application](./java-8-test-application/) and submit a job for this root pom.xml module
2. TBD 

### IntelliJ

To use in Jetbrains IntelliJ to run a transformation, its simple:
1. Open the workspace root under [java-8-test-application](./java-8-test-application/)
2. Open Q Chat and run the `/transform` command
3. There is only one module and one upgrade path to Java version 17 so select that
4. Once transformation is started see the "expected output" section below 👍

#### Expected Output

**Expected build progress output**
![](./media/intellij-step-progress-output.png)

**Expected final build output**
![](./media/intellij-final-build-output.png)

**Expected pom diff output**
![](./media/intellij-pom-diff-output.png)

### VSCode

To use in VSCode, its requires more setup.

#### Pre-requisites
1. Java 8 installed on your machine
2. Maven installed on your machine

#### Expected Output
