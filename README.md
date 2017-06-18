### Instructions for running code:

Modify the class "MainExample.scala" writing your Spark code, then compile the project with the command:

```mvn clean package```

Inside the ```target``` folder you will find the result fat jar called ```spark-scala-maven-project-0.0.1-SNAPSHOT-jar-with-depencencies.jar```. In order to launch the Spark job use this command in a shell with a configured Spark environment:

    $SPARK_ROOT_DIRECTORY/bin/spark-submit --class com.examples.MainExample \
      --master local[2] \
      target/spark-scala-maven-project-0.0.1-SNAPSHOT-jar-with-dependencies.jar
