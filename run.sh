#!/bin/bash

javac -d output --release 23 --enable-preview --source-path "./*/src" \
$(find . -name "*.java")

cd output

java -cp . --enable-preview org/jugistanbul/GenerateClass
java HelloJEP457

echo
java -cp . --enable-preview org/jugistanbul/ParseClass




