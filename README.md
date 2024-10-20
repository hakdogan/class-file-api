# Class File API

[JEP 457](https://openjdk.org/jeps/457)[^1] Class-File API is a preview API to provide a standard API for parsing, generating, and transforming Java class files. 

This repository demonstrates how to create a class that has a field, invokes a method, and prints a message, and also how to parse it with the said API.

## Generating
https://github.com/hakdogan/class-file-api/blob/d0af4de3454032762e5d1e8ef04bbfdb5d01b619/src/main/java/org/jugistanbul/GenerateClass.java#L20-L35

## Parsing

https://github.com/hakdogan/class-file-api/blob/d0af4de3454032762e5d1e8ef04bbfdb5d01b619/src/main/java/org/jugistanbul/ParseClass.java#L18-L26

## Build and run

```shell
sh run.sh
```

## Requirements

JDK 23 or later

[^1]: This proposal was refined by [JEP 466](https://openjdk.org/jeps/466) in JDK 23 and the finalized proposed version is [JEP 484](https://openjdk.org/jeps/484) targeted to JDK 24 with minor changes.

